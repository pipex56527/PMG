package com.castano.erwin.pmg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Activity_1_1_1_4 extends AppCompatActivity {

    Spinner selecTipo;
    Spinner selecConcepto;
    Spinner selecMovimiento;
    String [] tipos = {"Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado"};
    String [] conceptos = {"Seleccionar Concepto","Mercado 1", "Mercado 2", "Arriendo", "Servicios"};
    String [] movimientos =  {"Seleccionar Movimiento", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_1_4);

        selecTipo = (Spinner)findViewById(R.id.spinnerSelecTipopmg1_1_1_4tipo);
        ArrayAdapter<String> adaptadorTipo = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,tipos);
        selecTipo.setAdapter(adaptadorTipo);

        selecConcepto = (Spinner)findViewById(R.id.spinnerSelecConceptopmg1_1_1_4concepto);
        ArrayAdapter<String> adaptadorConcepto = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,conceptos);
        selecConcepto.setAdapter(adaptadorConcepto);

        selecMovimiento = (Spinner)findViewById(R.id.spinnerSelecFormPagopmg1_1_1_4movimiento);
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

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
}
