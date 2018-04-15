package com.example.lamoo.unibus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StudentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main);
    }


    public void buClickAddnew(View view) {



        Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);
    }

    public void buEdit(View view) {
        Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);

    }

    public void buedit2(View view) { Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);
    }

    public void buedit3(View view) { Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);
    }

    public void buedit4(View view) { Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);
    }

    public void buedit5(View view) { Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);
    }

    public void buedit6(View view) { Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);
    }

    public void buedit7(View view) { Intent myintent2 = new Intent(this, RegisterActivity.class);


        startActivity(myintent2);
    }
}



