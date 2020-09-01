package com.baqynra.withbaqyand.a3layoutpwpb.fragment;


import android.content.Intent;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.baqynra.withbaqyand.a3layoutpwpb.ProfileActivity;
import com.baqynra.withbaqyand.a3layoutpwpb.R;
import com.baqynra.withbaqyand.a3layoutpwpb.ScheduleActivity;

public class Tab3Fragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "Tab3Fragment";

    private Button btnTEST,btnTESTa;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3fragment,container,false);
        btnTEST = (Button) view.findViewById(R.id.btnreal);
        btnTESTa = (Button) view.findViewById(R.id.btnrelative);

        btnTEST.setOnClickListener(this);
        btnTESTa.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnreal:
                startActivity(new Intent(getActivity(), ProfileActivity.class));
                break;
            case R.id.btnrelative:
                startActivity(new Intent(getActivity(), ScheduleActivity.class));
                break;
        }
    }
}
