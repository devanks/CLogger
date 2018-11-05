package com.example.abhirami.clogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LogNewComplaint extends AppCompatActivity {
    String phoneNo;
    String department;
    String location;
    String additionalinformation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_new_complaint);

    }
    public void submitnewcomplaint(View view)
    {
        EditText editText1=(EditText)findViewById(R.id.getphone);
        phoneNo=editText1.getText().toString();

        EditText editText2=(EditText)findViewById(R.id.getdepartment);
        department=editText2.getText().toString();

        EditText editText3=(EditText)findViewById(R.id.getLocation);
        location=editText3.getText().toString();

        EditText editText4=(EditText)findViewById(R.id.getinformation);
        additionalinformation=editText4.getText().toString();

        Log.v("Fiiind",phoneNo);
        Log.v("Fiiind",department);
        Log.v("Fiiind",location);
        Log.v("Fiiind",additionalinformation);


    }
}
