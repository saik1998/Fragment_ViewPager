package com.firstapp.fragment_to_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Two_Fragment#} factory method to
 * create an instance of this fragment.
 */
public class Two_Fragment extends Fragment {
    View view;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root=inflater.inflate(R.layout.fragment_two_,container,false);

        textView=root.findViewById(R.id.fragment_name);

        Bundle bundle=this.getArguments();
        String data= bundle.getString("key");
        textView.setText(data);

        return root;



//        textView = v.findViewById(R.id.displayItem);
//        Bundle bundle = this.getArguments();
//        String data = bundle.getString("key");
//        textView.setText(data);
//        return v
//        Bundle res=getArguments();
//        String name=res.getString("Name");
//        String mail=res.getString("Mail");
//
//        TextView first=root.findViewById(R.id.fragment_name);
//        TextView second=root.findViewById(R.id.fragment_mail);
//
//
//        first.setText(name);
//        second.setText(mail);











    }
}