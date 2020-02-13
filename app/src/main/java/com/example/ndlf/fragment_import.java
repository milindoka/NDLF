package com.example.ndlf;


import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;

    /**
     * Created by Milind on 13/02/20
     */

    public class fragment_import  extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            //returning our layout file
            //change R.layout.yourlayoutfilename for each of your fragments
            return inflater.inflate(R.layout.fragment_import, container, false);
        }


        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            //you can set the title for your toolbar here for different fragments different titles
            getActivity().setTitle("Fragment_1_Camera Import ");
        }

    }



