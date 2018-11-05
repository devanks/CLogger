package com.example.abhirami.clogger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);
    }
    public void lognewcomplaint(View view)
    {
        Intent lognewcomplaintintent=new Intent(this,LogNewComplaint.class);
        startActivity(lognewcomplaintintent);
    }

    public void trackcomplaint(View view)
    {
        Intent trackcomplaintsintent=new Intent(this,TrackComplaint.class);
        startActivity(trackcomplaintsintent);
    }
}

