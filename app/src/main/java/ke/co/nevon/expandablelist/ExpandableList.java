package ke.co.nevon.expandablelist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableList {



    public   static HashMap<String,List<String>> getData()
    {
        HashMap<String,List<String>>listHashMap=new HashMap<>();
        //
       List<String> nougat=new ArrayList<>();
        nougat.add("api level 25");
        nougat.add("api level 24");
        nougat.add("api level 23");
        nougat.add("api level 22");

        //
        List<String> marshmallow=new ArrayList<>();
        marshmallow.add("api level 21");
        marshmallow.add("api level 20");
        //
        List<String>lollipop=new ArrayList<>();
        lollipop.add("api level 19");
        lollipop.add("api level 18");
        //
        List<String> kitkat=new ArrayList<>();
        kitkat.add("api level 17");
        kitkat.add("api level 16");
        //
        List<String>jerrybean=new ArrayList<>();
        jerrybean.add("api level 15");
        jerrybean.add("api level 14");
        //
        List<String> icecream=new ArrayList<>();
        icecream.add("api level 13");
        icecream.add("api level 12");
        //
        List<String>honeycomb=new ArrayList<>();
        honeycomb.add("api level 11");
        honeycomb.add("api level 10");
        //
        listHashMap.put("nougat",nougat);
        listHashMap.put("marshmallow",marshmallow);
        listHashMap.put("lollipop",lollipop);
        listHashMap.put("kitkat",kitkat);
        listHashMap.put("jerrybean",jerrybean);
        listHashMap.put("icecream",icecream);
        listHashMap.put("honeycomb",honeycomb);

        ///
        return listHashMap;
    }
}
