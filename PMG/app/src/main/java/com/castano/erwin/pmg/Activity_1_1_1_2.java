package com.castano.erwin.pmg;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Activity_1_1_1_2 extends AppCompatActivity{

    Spinner selecTipo;
    Spinner selecConcepto;
    Spinner selecFormaPago;
    Spinner selecMovimiento;
    String [] tipos = {"Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado"};
    String [] conceptos = {"Seleccionar Concepto","Mercado 1", "Mercado 2", "Arriendo", "Servicios"};
    String [] formasPago = {"Seleccionar Forma de Pago","Tarjeta de Credito 1", "Tarjeta de Credito 2","Tarjeta de Credito 3","Tarjeta Debito 1",};
    String [] movimientos =  {"Seleccionar Movimiento", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,"};


    Context context = this;
    EditText editDate, editTime;
    Calendar myCalendar = Calendar.getInstance();
    Calendar myCalendar2 = Calendar.getInstance();
    //String dateFormat = "dd.MM.yyyy";
    DatePickerDialog.OnDateSetListener date;
    TimePickerDialog.OnTimeSetListener time;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm a");


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_1_2);

        selecTipo = (Spinner)findViewById(R.id.spinnerSelecTipopmg1_1_1_2tipo);
        ArrayAdapter<String> adaptadorTipo = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,tipos);
        selecTipo.setAdapter(adaptadorTipo);

        selecConcepto = (Spinner)findViewById(R.id.spinnerSelecConceptopmg1_1_1_2concepto);
        ArrayAdapter<String> adaptadorConcepto = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,conceptos);
        selecConcepto.setAdapter(adaptadorConcepto);

        selecFormaPago = (Spinner)findViewById(R.id.spinnerSelecpmg1_1_1_2formaPago);
        ArrayAdapter<String> adaptadorFormaPago = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,formasPago);
        selecFormaPago.setAdapter(adaptadorFormaPago);

        selecMovimiento = (Spinner)findViewById(R.id.spinnerSelecpmg1_1_1_2modifMovimiento);
        ArrayAdapter<String> adaptadorMovmiento = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,movimientos);
        selecMovimiento.setAdapter(adaptadorMovmiento);


        selecTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("Se ha seleccionado el tipo: " + tipos[i] + " en la posicion: " + i);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


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

        editTime = (EditText) findViewById(R.id.editTextpmg1_1_1_2hora);

        editTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;

                mTimePicker = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        myCalendar2.set(Calendar.HOUR_OF_DAY, selectedHour);
                        myCalendar2.set(Calendar.MINUTE, selectedMinute);
                        editTime.setText(formatoHora.format(myCalendar2.getTime()));
                    }
                }, hour, minute, false);//No 24 hour time
                mTimePicker.setTitle("Seleccione la hora del movimiento");
                mTimePicker.show();

            }
        });



    }

    public void confirmacion(View vista){
        new AlertDialog.Builder(this)
                .setTitle("Modificar movimiento")
                .setMessage("¿Está seguro? El movimiento procederá a ser modificado.")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Toast.makeText(getApplicationContext(), "El movimiento ha sido modificado.", Toast.LENGTH_SHORT).show();
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
}


