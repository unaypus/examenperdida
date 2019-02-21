package com.example.juaponabr.examenperdidaevaluacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
            }
        });
    }

    private void enviar() {
        Intent intento = new Intent(getApplicationContext(), InsuranceActivity.class);

        EditText edittexto =  findViewById( R.id.edTextNombre );
        String elnombre = edittexto.getText().toString();
        intento.putExtra(   "elCliente" , elnombre) ;

        EditText edad =  findViewById( R.id.edTextEdad );
        String laEdad = edad.getText().toString();
        intento.putExtra(   "suEdad" , laEdad) ;

        EditText fecha =  findViewById( R.id.edTextFecha);
        String laFecha = fecha.getText().toString();
        intento.putExtra(   "laFecha" , laFecha) ;

        EditText marca =  findViewById( R.id.edTextMarca);
        String lamarca = marca.getText().toString();
        intento.putExtra(   "lamarca" , lamarca) ;



        startActivity(intento);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
