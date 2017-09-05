package com.csit.ramesh.csit;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Ramesh on 2/26/2017.
 */

public class fragment1 extends Fragment {
ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
View view=inflater.inflate(R.layout.fragment1,container,false);
        Resources res=getActivity().getResources();
        String[] name=res.getStringArray(R.array.check);


listView= (ListView) view.findViewById(R.id.list1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,name);
        listView.setAdapter(arrayAdapter);
        return  view;
    }
}
