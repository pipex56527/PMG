package com.castano.erwin.pmg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Activity_1_1_4 extends AppCompatActivity {

    Spinner anio;
    Spinner mes;
    String [] anios = {"Seleccionar Año","2017","2018","2019"};
    String [] meses = {"Seleccionar Mes","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_4);

        anio = (Spinner)findViewById(R.id.spinnerpmg1_1_4anio);
        ArrayAdapter<String> adaptadorTipo = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, anios);
        anio.setAdapter(adaptadorTipo);

        mes = (Spinner)findViewById(R.id.spinnerpmg1_1_4mes);
        ArrayAdapter<String> adaptadorConcepto = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, meses);
        mes.setAdapter(adaptadorConcepto);

        anio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("Se ha seleccionado el año: " + anios[i] + " en la posicion: " + i);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
}
