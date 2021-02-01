package com.example.epics.ui.profile;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.epics.R;

public class ProfileFragment extends Fragment {

    private ProfileViewModel profileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View myInflatedView = inflater.inflate(R.layout.fragment_profile, container,false);
        final TextView fb = myInflatedView.findViewById(R.id.feedback);
        fb.setPaintFlags(fb.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText editText = myInflatedView.findViewById(R.id.fb_edittext);
                final Button button = myInflatedView.findViewById(R.id.submit_fb);
                if (editText.getVisibility() == View.GONE) {
                    editText.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                } else {
                    editText.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                }
            }
        });

        return myInflatedView;
    }
}