package com.castano.erwin.pmg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
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
        EditText textViewUsuario = (EditText) findViewById(R.id.editTextUsuario);
        EditText textViewContrasenia = (EditText) findViewById(R.id.editTextContrasenia);
        Button botonAceptar = (Button) findViewById(R.id.buttonIniciarSesion);
        TextView textViewInformacion = (TextView) findViewById(R.id.textViewInformacion);

        usuario = textViewUsuario.getText().toString();
        contrasenia = textViewContrasenia.getText().toString();

        if (usuario.equals("a") && contrasenia.equals("b")) {
            Intent intencion = new Intent(this, Activity_1_1.class);
            startActivity(intencion);
            overridePendingTransition(R.anim.right_in, R.anim.right_out);
            limpiarInformacion(vista);
        } else if(usuario.equals("nuevo") && contrasenia.equals("b")){
            Intent intencion = new Intent(this, Activity_1_0_1.class);
            startActivity(intencion);
            overridePendingTransition(R.anim.right_in, R.anim.right_out);
            limpiarInformacion(vista);
        }else{

            textViewInformacion.setText("Credenciales Inválidas.");
            textViewInformacion.setTextColor(Color.RED);
            //System.out.println("Credenciales Inválidas");
        }


    }

    public void limpiarInformacion(View vista){
        EditText textViewUsuario = (EditText) findViewById(R.id.editTextUsuario);
        EditText textViewContrasenia = (EditText) findViewById(R.id.editTextContrasenia);
        TextView textViewInformacion = (TextView) findViewById(R.id.textViewInformacion);
        textViewUsuario.setFocusable(true);
        textViewUsuario.requestFocus();
        textViewUsuario.setText("");
        textViewContrasenia.setText("");
        textViewInformacion.setText("");
    }

    public void limpiarInformacion(){
        EditText textViewUsuario = (EditText) findViewById(R.id.editTextUsuario);
        textViewUsuario.setFocusable(true);
        textViewUsuario.requestFocus();
        EditText textViewContrasenia = (EditText) findViewById(R.id.editTextContrasenia);
        TextView textViewInformacion = (TextView) findViewById(R.id.textViewInformacion);
        textViewUsuario.setText("");
        textViewContrasenia.setText("");
        textViewInformacion.setText("");
    }
}
