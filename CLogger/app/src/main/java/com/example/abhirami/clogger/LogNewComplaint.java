package com.example.abhirami.clogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LogNewComplaint extends AppCompatActivity {
    public class Complaint {
        public String phoneNo;
        public String department;
        public String location;
        public String additionalinformation;
    }
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_new_complaint);

        mDatabase = FirebaseDatabase.getInstance().getReference();

    }
    public void submitnewcomplaint(View view)
    {
        Complaint newComplaint = new Complaint();
        EditText editText1=(EditText)findViewById(R.id.getphone);
        newComplaint.phoneNo=editText1.getText().toString();

        EditText editText2=(EditText)findViewById(R.id.getdepartment);
        newComplaint.department=editText2.getText().toString();

        EditText editText3=(EditText)findViewById(R.id.getLocation);
        newComplaint.location=editText3.getText().toString();

        EditText editText4=(EditText)findViewById(R.id.getinformation);
        newComplaint.additionalinformation=editText4.getText().toString();

        Log.v("Fiiind",newComplaint.phoneNo);
        Log.v("Fiiind",newComplaint.department);
        Log.v("Fiiind",newComplaint.location);
        Log.v("Fiiind",newComplaint.additionalinformation);
        String userId = "devanks";
        mDatabase.child("complaints").child(userId).setValue(newComplaint)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
                        // Write was successful!
                        //                        // ...
                    }
                });
        //PLEASE NOTE: NONE OF THE ADDITIONS I ADDED WORKS. BUT IT IS SUPPOSED TO WORK SIMILAR TO THIS, THATS ALL I KNOW
    }
}
