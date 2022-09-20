package com.firstapp.fragment_viewlist;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
// * Use the {@link ListFragment#} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {

    ListView listView;
    String[] names={"Android","Java","Python","Kotlin","c++","Android","Java","Python","Kotlin","c++","Android","Java","Python","Kotlin","c++"};
    ArrayAdapter<String> arrayAdapter;
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView=view.findViewById(R.id.simple_list);
        arrayAdapter=new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,names);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                fragment=new View_List_Fragment();
                Bundle bundle=new Bundle();


                String templist= arrayAdapter.getItem(position).toString();
                bundle.putString("key",templist);
                View_List_Fragment view_list_fragment=new View_List_Fragment();
                view_list_fragment.setArguments(bundle);


                getFragmentManager().beginTransaction().replace(R.id.main_container,view_list_fragment).commit();


                fragmentManager=getActivity().getSupportFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container,fragment);
                fragmentTransaction.commit();
            }
        });

    }
}