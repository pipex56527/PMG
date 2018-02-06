package com.castano.erwin.pmg;

import android.app.Activity;
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
    }

    public void iniciarSesion(View vista){

        EditText textViewUsuario = (EditText)findViewById(R.id.editTextUsuario);
        EditText textViewContrasenia = (EditText)findViewById(R.id.editTextContrasenia);
        Button botonAceptar = (Button)findViewById(R.id.buttonIniciarSesion);

        usuario=textViewUsuario.getText().toString();
        contrasenia=textViewContrasenia.getText().toString();

        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + contrasenia);

    }
}
