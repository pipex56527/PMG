package com.castano.erwin.pmg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Activity_1_1_2_1 extends AppCompatActivity {
    Spinner selecTipo;
    String [] tipos = {"Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_2_1);

        selecTipo = (Spinner)findViewById(R.id.spinnerSelecTipopmg1_1_2_1tipo);
        ArrayAdapter<String> adaptadorTipo = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,tipos);
        selecTipo.setAdapter(adaptadorTipo);

        selecTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("Se ha seleccionado el tipo: " + tipos[i] + " en la posicion: " + i);
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
