package com.example.lamoo.unibus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
    }

    public void buYanbu(View view) {



            Intent myItent1=new Intent(this,StudentMainActivity.class);

            startActivity(myItent1);

    }


    public void buda(View view) {

        Intent myItent2=new Intent(this,StudentMainActivity.class);

        startActivity(myItent2);


    }
}
