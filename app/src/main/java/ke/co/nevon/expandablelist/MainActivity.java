package ke.co.nevon.expandablelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ke.co.nevon.expandablelist.ExpandableList;

public class MainActivity extends AppCompatActivity implements ExpandableListView.OnGroupCollapseListener ,ExpandableListView.OnChildClickListener {
    ExpandableListView expandableListView;
    ExpandableAdapter expandableAdapter;
    List<String> titles;
    HashMap<String, List<String>> expandableListDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = findViewById(R.id.elv);
        expandableListDetails = ExpandableList.getData();
        titles=new ArrayList<String>(expandableListDetails.keySet());
        expandableAdapter=new ExpandableAdapter(getApplicationContext(),titles,expandableListDetails);
        expandableListView.setAdapter(expandableAdapter);
        expandableListView.setOnGroupCollapseListener(this);


    }


    @Override
    public void onGroupCollapse(int groupPosition) {
        Toast.makeText(this, titles.get(groupPosition), Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        Toast.makeText(this,
                titles.get(groupPosition)+
                        expandableListDetails.get(titles.get(groupPosition)).get(childPosition)
                , Toast.LENGTH_SHORT).show();

        final String selected=(String)expandableAdapter.getChild(groupPosition,childPosition);
        Intent intent;
        /*switch (selected)
        {
            case "api level 21":
                //intent=new Intent(getApplicationContext(),)
        }*/
        return false;
    }
}
