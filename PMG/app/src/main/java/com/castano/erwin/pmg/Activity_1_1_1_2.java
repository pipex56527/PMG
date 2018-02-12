package com.castano.erwin.pmg;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class Activity_1_1_1_2 extends AppCompatActivity {

    Context context = this;
    EditText editDate, editTime;
    Calendar myCalendar = Calendar.getInstance();
    //String dateFormat = "dd.MM.yyyy";
    DatePickerDialog.OnDateSetListener date;
    TimePickerDialog.OnTimeSetListener time;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_1_2);



        //CALENDARIO NUEVA FECHA
        editDate = (EditText) findViewById(R.id.editTextpmg1_1_1_2fecha);

        // init - set date to current date
        //long currentdate = System.currentTimeMillis();
        //String dateString = sdf.format(currentdate);
        //editDate.setText(dateString);

        // set calendar date and update editDate
        date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                editDate.setText(sdf.format(myCalendar.getTime()));
            }
        };

        // onclick - popup datepicker
        editDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(context, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        //TIMEPICKER NUEVA HORA
        editTime = (EditText) findViewById(R.id.editTextpmg1_1_1_2hora);
        time = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {

            }
        };
    }






    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
}


