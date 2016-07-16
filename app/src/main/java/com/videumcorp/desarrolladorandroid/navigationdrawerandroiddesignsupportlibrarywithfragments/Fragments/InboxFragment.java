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


public class InboxFragment extends BaseFragment {

    @BindView(R.id.textViewInboxFragment) TextView textViewInboxFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Inbox");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentInbox);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInboxFragment.setText("This is the Inbox Fragment");
                textViewInboxFragment.setTextColor(ContextCompat.getColor(getContext(), R.color.md_yellow_800));
            }
        });

        return view;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.fragment_inbox;
    }

}
