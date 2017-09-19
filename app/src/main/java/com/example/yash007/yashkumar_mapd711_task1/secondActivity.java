package com.example.yash007.yashkumar_mapd711_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {
    //declare public textview variables here
    public TextView fullName2;
    public TextView qualification2;
    public TextView profession2;
    public TextView hobby2;
    public TextView dreamJob2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Received the Intent Data through getIntent() method
        Intent i = getIntent();

        //typecasting of textview with layout files
        fullName2 = (TextView)findViewById(R.id.textView12);
        qualification2 = (TextView)findViewById(R.id.textView13);
        profession2 = (TextView)findViewById(R.id.textView14);
        hobby2 = (TextView)findViewById(R.id.textView15);
        dreamJob2 = (TextView)findViewById(R.id.textView16);


        //temporary strings used to create values from intent
        String fullName1 = getIntent().getExtras().getString("fullName");
        String qualification1 = getIntent().getExtras().getString("qualification");
        String profession1 = getIntent().getExtras().getString("profession");
        String hobby1 = getIntent().getExtras().getString("hobby");
        String dreamJob1 = getIntent().getExtras().getString("dreamJob");


        //Assigning the values to the textview variables
        fullName2.setText(fullName1);
        qualification2.setText(qualification1);
        profession2.setText(profession1);
        hobby2.setText(hobby1);
        dreamJob2.setText(dreamJob1);
    }
}
