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

import androidx.annotation.Nullable;

import com.baqynra.withbaqyand.a3layoutpwpb.ProfileActivity;
import com.baqynra.withbaqyand.a3layoutpwpb.R;

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2fragment,container,false);
        btnTEST = (Button) view.findViewById(R.id.btn_ig);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast.makeText(getActivity(), "Ignya @baqyand Guys", Toast.LENGTH_SHORT).show();
                    call();
//                Uri uri = Uri.parse("http://instagram.com/baqyand");
//                Intent insta = new Intent(Intent.ACTION_VIEW, uri);
//                insta.setPackage("com.instagram.android");
//                Intent intent = new Intent(getActivity(), ProfileActivity.class);
//              startActivity(intent);
//
            }
        });

        return view;
    }
    private void call() {

        Intent call = new Intent(Intent.ACTION_VIEW);
        call.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        call.setData(Uri.parse("http://instagram.com/baqyand"));
        getActivity().startActivity(call);
    }

}

