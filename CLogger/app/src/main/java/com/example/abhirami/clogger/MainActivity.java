package com.example.abhirami.clogger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void userpageactivity(View view)
    {
        Intent userpageintent=new Intent(this,UserPage.class);
        startActivity(userpageintent);
    }

    public void supervisorpageactivity(View view)
    {
        Intent supervisorpageintent=new Intent(this, SupervisorPage.class);
        startActivity(supervisorpageintent);
    }

    public void workerpageactivity(View view)
    {
        Intent workerpageintent=new Intent(this, WorkerPage.class);
        startActivity(workerpageintent);
    }
}
