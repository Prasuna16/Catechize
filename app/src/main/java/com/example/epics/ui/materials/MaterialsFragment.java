package com.example.epics.ui.materials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.epics.R;

public class MaterialsFragment extends Fragment {

    private MaterialsViewModel materialsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        materialsViewModel =
//                ViewModelProviders.of(this).get(MaterialsViewModel.class);
        return inflater.inflate(R.layout.fragment_materials, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        materialsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }
}