package com.baqynra.withbaqyand.a3layoutpwpb.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.baqynra.withbaqyand.a3layoutpwpb.ProfileActivity;
import com.baqynra.withbaqyand.a3layoutpwpb.R;

import org.jetbrains.annotations.Nullable;

public class Tab1Fragment extends Fragment{
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1fragment,container,false);
        btnTEST = (Button) view.findViewById(R.id.btn_dial);


        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), ProfileActivity.class);
//                startActivity(intent);
//
                call();
            }
        });


        return view;
    }
    private void call() {

        Intent call = new Intent(Intent.ACTION_DIAL);
        call.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        call.setData(Uri.parse("tel:" + "085708339519"));
        getActivity().startActivity(call);
    }

}
