package com.castano.erwin.pmg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_1_1_3_CM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_3__cm);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
}
