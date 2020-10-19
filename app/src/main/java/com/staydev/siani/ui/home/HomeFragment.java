package com.staydev.siani.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.staydev.siani.Chat;
import com.staydev.siani.Kritik;
import com.staydev.siani.MainActivity;
import com.staydev.siani.Profil;
import com.staydev.siani.R;
import com.staydev.siani.Sewa;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button firstButton,chat,sewa;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        firstButton = (Button) root.findViewById(R.id.kritik);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // display a message by using a Toast
                Intent myIntent = new Intent(HomeFragment.this.getActivity(), Kritik.class);
                startActivity(myIntent);

            }
        });

        chat = (Button) root.findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast
                Intent myIntent = new Intent(HomeFragment.this.getActivity(), Chat.class);
                startActivity(myIntent);

            }
        });

        sewa = (Button) root.findViewById(R.id.sewa);
        sewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display a message by using a Toast
                Intent myIntent = new Intent(HomeFragment.this.getActivity(), Sewa.class);
                startActivity(myIntent);

            }
        });
        return root;



    }
}