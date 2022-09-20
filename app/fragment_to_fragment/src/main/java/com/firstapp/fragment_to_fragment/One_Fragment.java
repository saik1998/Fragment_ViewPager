package com.firstapp.fragment_to_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link One_Fragment#} factory method to
 * create an instance of this fragment.
 */
public class One_Fragment extends Fragment {
    View view;
    ListView listView;
    String[] names = {"Android", "Java", "Python", "Kotlin", "c++", "Android", "Java", "Python", "Kotlin", "c++", "Android", "Java", "Python", "Kotlin", "c++"};
    ArrayAdapter<String> arrayAdapter;

    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_one_, container, false);

        listView = root.findViewById(R.id.list_fragment1);

        arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, names);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                fragment = new Two_Fragment();
                Bundle bundle = new Bundle();
                String templist= arrayAdapter.getItem(position).toString();
                bundle.putString("key",templist);
                Two_Fragment two_fragment=new Two_Fragment();
                two_fragment.setArguments(bundle);


                getFragmentManager().beginTransaction().replace(R.id.fragment_container,two_fragment).commit();

//                fragmentManager = getActivity().getSupportFragmentManager();
//                fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_container, fragment);
//                fragmentTransaction.commit();
////                Bundle bundle = new Bundle();
//                bundle.putString("listview", listView.getTransitionName().toString());
//
//                Two_Fragment two_fragment = new Two_Fragment();
//                two_fragment.setArguments(bundle);
//                getFragmentManager().beginTransaction().replace(R.id.framelayout2, two_fragment).commit();
            }
        });
        return root;



//
//        Button button=view.findViewById(R.id.sendFragment1);
//        edittext1=view.findViewById(R.id.UserName);
//        edittext2=view.findViewById(R.id.UserMail);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               String username=edittext1.getText().toString();
//                String usermail=edittext2.getText().toString();
//
//                Bundle result=new Bundle();
//                result.putString("Name",username);
//                result.putString("Mail",usermail);
//
//                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//
//
//                Two_Fragment two_fragment=new Two_Fragment();
//                two_fragment.setArguments(result);
//                fragmentTransaction.replace(R.id.framelayout,two_fragment);
//                fragmentTransaction.commit();
//
//            }
//        });
//
//
//        return root;
//    }
    }
}
