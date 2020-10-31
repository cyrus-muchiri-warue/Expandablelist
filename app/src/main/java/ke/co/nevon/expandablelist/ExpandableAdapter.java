package ke.co.nevon.expandablelist;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class ExpandableAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String>listTitles;
    private HashMap<String,List<String>> hashMapListMenu;

    public ExpandableAdapter(Context context, List<String> listTitles, HashMap<String, List<String>> hashMapListMenu) {
        this.context = context;
        this.listTitles = listTitles;
        this.hashMapListMenu = hashMapListMenu;
    }

    @Override
    public int getGroupCount() {
        return this.listTitles.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.hashMapListMenu.get(this.listTitles.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.listTitles.size();
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.hashMapListMenu.get(this.listTitles.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title=listTitles.get(groupPosition);
        if(convertView==null)
        {
            LayoutInflater layoutInflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.expandablelist_title_items,null);
        }
        TextView  textView=(TextView)convertView.findViewById(R.id.list_title);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String items=hashMapListMenu.get(listTitles.get(groupPosition)).get(childPosition);

        if(convertView==null)
        {
            LayoutInflater layoutInflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.expandaple_list_item,null);
        }
        TextView  item=(TextView)convertView.findViewById(R.id.list_item);
        item.setTypeface(null, Typeface.BOLD);
        item.setText(items);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
