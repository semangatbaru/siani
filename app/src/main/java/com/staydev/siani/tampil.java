package com.staydev.siani;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class tampil extends AppCompatActivity {
    ImageView imageView;
    TextView name, email, id ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        imageView = findViewById(R.id.imageView);
        //name = findViewById(R.id.name);
        email = findViewById(R.id.email);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if (acct != null) {
            String personName = "";
            personName=acct.getDisplayName();
            String personEmail ="";
            personEmail= acct.getEmail();
            String personId = "";
            personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();
            Log.d("info", personEmail);
            Log.d("info", personName);

//            name=(TextView)findViewById(R.id.name);
//
            name.setText(personName);
            email.setText(personEmail);
            Glide.with(this).load(String.valueOf(personPhoto)).into(imageView);



        }
    }
}