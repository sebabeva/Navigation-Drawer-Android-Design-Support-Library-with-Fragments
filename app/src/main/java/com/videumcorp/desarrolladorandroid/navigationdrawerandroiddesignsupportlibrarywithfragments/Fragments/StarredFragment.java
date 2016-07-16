package com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.fragments;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.R;
import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.activities.MainActivity;

import butterknife.BindView;


public class StarredFragment extends BaseFragment {

    @BindView(R.id.textViewStarredFragment) TextView textViewStarredFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Starred");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentStarred);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStarredFragment.setTextSize(40);
                textViewStarredFragment.setText("This is the Starred Fragment");
                textViewStarredFragment.setTextColor(ContextCompat.getColor(getContext(), R.color.md_green_800));
            }
        });

        return view;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_starred;
    }

}
