package com.firstapp.fragment_view_pager.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firstapp.fragment_view_pager.R;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link Page1_Fragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class Page1_Fragment extends Fragment implements View.OnClickListener {

    ListView listView;
    String[] names={"Android Java","Android Kotlin","Android Compose","IOS","Web Front End","Web Back End"};
    ArrayAdapter<String> arrayAdapter;

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public Page1_Fragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment Page1_Fragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static Page1_Fragment newInstance(String param1, String param2) {
//        Page1_Fragment fragment = new Page1_Fragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }


        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View root=inflater.inflate(R.layout.fragment_page1_, container, false);

            listView=root.findViewById(R.id.fragment_1);
            arrayAdapter=new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,names);
            listView.setAdapter(arrayAdapter);




            return root;
        }

    @Override
    public void onClick(View v) {
            if(v.getId()==R.id.fragment_1)
            {
                Bundle bundle=new Bundle();
                String list_view1=listView.getAdapter().toString();
                bundle.putString("listview",list_view1);
                Page_2Fragment page_2Fragment=new Page_2Fragment();
                page_2Fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().commit();
            }

    }



    }


