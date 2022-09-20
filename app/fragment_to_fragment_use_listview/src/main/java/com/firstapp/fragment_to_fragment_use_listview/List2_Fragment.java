package com.firstapp.fragment_to_fragment_use_listview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link List2_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class List2_Fragment extends Fragment {
    View rootview;
    TextView recevername,recevermail;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public List2_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment List2_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static List2_Fragment newInstance(String param1, String param2) {
        List2_Fragment fragment = new List2_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview= inflater.inflate(R.layout.fragment_list2_, container, false);


        recevername=rootview.findViewById(R.id.fragment_textview_name);
//        recevermail=rootview.findViewById(R.id.fragment_textview_mail);
        Bundle bundle=this.getArguments();
        String myrecever=bundle.getString("username");

//        String myrecevermail=bundle.getString("mail");

        recevername.setText(myrecever);
//        recevermail.setText(myrecevermail);


        return rootview;

    }
}