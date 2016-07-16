package com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.MainActivity;
import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrarywithfragments.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class InboxFragment extends Fragment {

    @BindView(R.id.textViewInboxFragment) TextView textViewInboxFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inbox, container, false);
        ButterKnife.bind(this, view);

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

}
