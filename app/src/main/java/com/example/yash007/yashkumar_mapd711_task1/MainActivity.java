package com.example.yash007.yashkumar_mapd711_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //create private EditText variables here
    private EditText fullName;
    private EditText qualification;
    private EditText profession;
    private EditText hobby;
    private EditText dreamJob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //event triggered when button will click by user
    public void sendData(View v)  {

        //type casting of variables with layout file
        fullName = (EditText)findViewById(R.id.editText2);
        qualification = (EditText)findViewById(R.id.editText3);
        profession = (EditText)findViewById(R.id.editText4);
        hobby = (EditText)findViewById(R.id.editText5);
        dreamJob = (EditText)findViewById(R.id.editText6);

        //create Intent object and pass the second activity for navigation
        Intent i = new Intent(MainActivity.this,secondActivity.class);

        //sending extra data with content so it will display data to next activity
        i.putExtra("fullName",fullName.getText().toString());
        i.putExtra("qualification",qualification.getText().toString());
        i.putExtra("profession",profession.getText().toString());
        i.putExtra("hobby",hobby.getText().toString());
        i.putExtra("dreamJob",dreamJob.getText().toString());

        //Activity triggered
        startActivity(i);
    }
}
