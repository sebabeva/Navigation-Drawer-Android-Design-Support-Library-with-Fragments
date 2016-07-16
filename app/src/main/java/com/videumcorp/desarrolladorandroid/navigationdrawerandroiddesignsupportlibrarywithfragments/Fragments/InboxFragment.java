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


public class InboxFragment extends BaseFragment {

    @BindView(R.id.textViewInboxFragment)
    TextView textViewInboxFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        return view;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_inbox;
    }

    @BindColor(R.color.md_yellow_800)
    int colorYellow;

    @OnClick(R.id.buttonFragmentInbox)
    public void onFragmentInboxButtonClick(Button button) {
        textViewInboxFragment.setText("This is the Inbox Fragment");
        textViewInboxFragment.setTextColor(colorYellow);
    }

    @Override
    protected String getToolbarTitle() {
        return "Inbox";
    }

}
