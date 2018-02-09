package com.castano.erwin.pmg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {
    String usuario;
    String contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        limpiarInformacion();
    }

    public void iniciarSesion(View vista) {
        EditText textViewUsuario = (EditText) findViewById(R.id.editTextpmg1_0_usuario);
        EditText textViewContrasenia = (EditText) findViewById(R.id.editTextpmg1_0_contrasenia);
        Button botonAceptar = (Button) findViewById(R.id.buttonpmg1_0_iniciarSesion);
        TextView textViewInformacion = (TextView) findViewById(R.id.textViewpmg1_0_informacion);

        usuario = textViewUsuario.getText().toString();
        contrasenia = textViewContrasenia.getText().toString();

        if (usuario.equals("a") && contrasenia.equals("b")) {
            limpiarInformacion(vista);
            Intent intencion = new Intent(this, Activity_1_1.class);
            startActivity(intencion);
            overridePendingTransition(R.anim.right_in, R.anim.right_out);

        } else if(usuario.equals("nuevo") && contrasenia.equals("b")){
            limpiarInformacion(vista);
            Intent intencion = new Intent(this, Activity_1_0_1.class);
            startActivity(intencion);
            overridePendingTransition(R.anim.right_in, R.anim.right_out);
        }else{

            textViewInformacion.setText("Credenciales Inválidas.");
            textViewInformacion.setTextColor(Color.RED);
            //System.out.println("Credenciales Inválidas");
        }


    }

    public void limpiarInformacion(View vista){
        EditText textViewUsuario = (EditText) findViewById(R.id.editTextpmg1_0_usuario);
        EditText textViewContrasenia = (EditText) findViewById(R.id.editTextpmg1_0_contrasenia);
        TextView textViewInformacion = (TextView) findViewById(R.id.textViewpmg1_0_informacion);
        textViewUsuario.setFocusable(true);
        textViewUsuario.requestFocus();
        textViewUsuario.setText("");
        textViewContrasenia.setText("");
        textViewInformacion.setText("");
    }

    public void limpiarInformacion(){
        EditText textViewUsuario = (EditText) findViewById(R.id.editTextpmg1_0_usuario);
        textViewUsuario.setFocusable(true);
        textViewUsuario.requestFocus();
        EditText textViewContrasenia = (EditText) findViewById(R.id.editTextpmg1_0_contrasenia);
        TextView textViewInformacion = (TextView) findViewById(R.id.textViewpmg1_0_informacion);
        textViewUsuario.setText("");
        textViewContrasenia.setText("");
        textViewInformacion.setText("");
    }
}
