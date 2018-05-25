package com.example.nusrat.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=(TextView)findViewById(R.id.textView2);
        SharedPreferences preferences=getSharedPreferences("MySavedData", Context.MODE_PRIVATE);
        String string=preferences.getString("myValue","Data not found");
        tv.setText(string);

    }
}
