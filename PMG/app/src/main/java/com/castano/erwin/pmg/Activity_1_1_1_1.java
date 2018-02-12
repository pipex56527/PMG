package com.castano.erwin.pmg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Activity_1_1_1_1 extends AppCompatActivity {

    Spinner selecTipo;
    Spinner selecConcepto;
    Spinner selecFormaPago;
    String [] tipos = {"Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado"};
    String [] conceptos = {"Seleccionar Concepto","Mercado 1", "Mercado 2", "Arriendo", "Servicios"};
    String [] formasPago = {"Seleccionar Forma de Pago","Tarjeta de Credito 1", "Tarjeta de Credito 2","Tarjeta de Credito 3","Tarjeta Debito 1",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_1_1);


        selecTipo = (Spinner)findViewById(R.id.spinnerSelecTipopmg1_1_1_1tipo);
        ArrayAdapter<String> adaptadorTipo = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,tipos);
        selecTipo.setAdapter(adaptadorTipo);

        selecConcepto = (Spinner)findViewById(R.id.spinnerSelecConceptopmg1_1_1_1concepto);
        ArrayAdapter<String> adaptadorConcepto = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,conceptos);
        selecConcepto.setAdapter(adaptadorConcepto);

        selecFormaPago = (Spinner)findViewById(R.id.spinnerSelecFormPagopmg1_1_1_1formaPago);
        ArrayAdapter<String> adaptadorFormaPago = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,formasPago);
        selecFormaPago.setAdapter(adaptadorFormaPago);

        selecTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    System.out.println("Se ha seleccionado el tipo: " + tipos[i] + " en la posicion: " + i);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        selecConcepto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("Se ha seleccionado el concepto: " + conceptos[i] + " en la posicion: " + i);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        selecFormaPago.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("Se ha seleccionado la forma de pago: " + formasPago[i] + " en la posicion: " + i);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


    }


}
