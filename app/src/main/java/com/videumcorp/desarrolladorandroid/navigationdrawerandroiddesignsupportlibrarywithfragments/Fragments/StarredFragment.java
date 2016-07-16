package com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.R;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.OnClick;


public class StarredFragment extends BaseFragment {

    @BindView(R.id.textViewStarredFragment)
    TextView textViewStarredFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        return view;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_starred;
    }

    @BindColor(R.color.md_green_800)
    int colorGreen;

    @OnClick(R.id.buttonFragmentStarred)
    public void onFragmentStarredButtonClick(Button button) {
        textViewStarredFragment.setTextSize(40);
        textViewStarredFragment.setText("This is the Starred Fragment");
        textViewStarredFragment.setTextColor(colorGreen);
    }

    @Override
    protected String getToolbarTitle() {
        return "Starred";
    }

}
