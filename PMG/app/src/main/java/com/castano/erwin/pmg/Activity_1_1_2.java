package com.castano.erwin.pmg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_1_1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_2);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }

    public void ingresarConcepto(View vista){
        Intent intencion = new Intent(this, Activity_1_1_2_1.class);
        startActivity(intencion);
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }

    public void modificarConcepto(View vista){
        Intent intencion = new Intent(this, Activity_1_1_2_2.class);
        startActivity(intencion);
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
/*
    public void elminarConcepto(View vista){
        Intent intencion = new Intent(this, Activity_1_1_2_3.class);
        startActivity(intencion);
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }

    public void consultarConcepto(View vista){
        Intent intencion = new Intent(this, Activity_1_1_2_4.class);
        startActivity(intencion);
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }

   */
}
