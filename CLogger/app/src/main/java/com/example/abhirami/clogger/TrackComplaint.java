package com.example.abhirami.clogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackComplaint extends AppCompatActivity {
    ArrayList<String> complaints=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_complaint);


        complaints.add("Complaint1:");
        complaints.add("Complaint2:");
        complaints.add("Complaints3:");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, complaints);
        ListView listView=(ListView)findViewById(R.id.complaintlist);
        listView.setAdapter(adapter);

    }
}
