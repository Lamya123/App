package com.example.lamoo.unibus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UniBusMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni_bus_main);
    }

   // public void buClick(View view) {


       // Intent myItent=new Intent(this,driverMainActivity.class);

       /// startActivity(myItent);


   // }
   public void buClick(View view) {


       Intent myItent=new Intent(this,MainActivity.class);

       startActivity(myItent);


   }

}
