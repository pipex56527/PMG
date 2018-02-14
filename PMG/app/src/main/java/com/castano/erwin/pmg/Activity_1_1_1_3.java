package com.castano.erwin.pmg;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity_1_1_1_3 extends AppCompatActivity {

    Spinner selecTipo;
    Spinner selecConcepto;
    Spinner selecMovimiento;
    String [] tipos = {"Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado","Seleccionar Tipo","Gastos Fijos", "Gastos Variables", "Crédito Otorgado"};
    String [] conceptos = {"Seleccionar Concepto","Mercado 1", "Mercado 2", "Arriendo", "Servicios"};
    String [] movimientos =  {"Seleccionar Movimiento", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Arturo Calle Feb 3", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,", "Compra en Media Naranja Mar 5,"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_1_3);

        selecTipo = (Spinner)findViewById(R.id.spinnerSelecTipopmg1_1_1_3tipo);
        ArrayAdapter<String> adaptadorTipo = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,tipos);
        selecTipo.setAdapter(adaptadorTipo);

        selecConcepto = (Spinner)findViewById(R.id.spinnerSelecConceptopmg1_1_1_3concepto);
        ArrayAdapter<String> adaptadorConcepto = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,conceptos);
        selecConcepto.setAdapter(adaptadorConcepto);

        selecMovimiento = (Spinner)findViewById(R.id.spinnerSelecFormPagopmg1_1_1_3movimiento);
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

    public void confirmacion(View vista){
        new AlertDialog.Builder(this)
                .setTitle("Eliminar movimiento")
                .setMessage("¿Está seguro? El movimiento será eliminado permanentemente.")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Toast.makeText(getApplicationContext(), "El movimiento ha sido eliminado", Toast.LENGTH_SHORT).show();
                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }
}
