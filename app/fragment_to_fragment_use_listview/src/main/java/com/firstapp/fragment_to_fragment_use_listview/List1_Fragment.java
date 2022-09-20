package com.firstapp.fragment_to_fragment_use_listview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link List1_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class List1_Fragment extends Fragment implements View.OnClickListener {
    View rootview;

    EditText username,mail;

    Button submit;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public List1_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment List1_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static List1_Fragment newInstance(String param1, String param2) {
        List1_Fragment fragment = new List1_Fragment();
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
        rootview= inflater.inflate(R.layout.fragment_list1_, container, false);



        initData();
        return rootview;
    }

    private void initData() {
        username=rootview.findViewById(R.id.edit_textview_name);
//        mail=rootview.findViewById(R.id.edit_textview_mobile);
        submit=rootview.findViewById(R.id.edit_textview_submit);
        submit.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        if(getId()==R.id.edit_textview_submit)
        {

            Bundle bundle=new Bundle();
            String my_username=username.getText().toString();
            String my_mailid=mail.getText().toString();
            bundle.putString("username",my_username);
//            bundle.putString("mail",my_mailid);

            List2_Fragment list2_fragment=new List2_Fragment();
            list2_fragment.setArguments(bundle);

            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container1,list2_fragment).commit();
        }


    }
}
