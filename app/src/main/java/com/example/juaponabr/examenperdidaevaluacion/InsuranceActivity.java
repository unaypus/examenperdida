package com.example.juaponabr.examenperdidaevaluacion;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;

public class InsuranceActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Array marcas = { "opel", "reno","mercedes"};


        int rangos[] ;

        rangos = new int[4];
        rangos[0] = 18;
        rangos[1] = 25;
        rangos[2] = 50;
        rangos[3] = 65;


        int preciosO[][] = new int[3][4];

        preciosO[0][0]= 120;
        preciosO[0][1]= 200;
        preciosO[0][2]= 250;
        preciosO[0][3]= 300;

        preciosO[1][0]= 125;
        preciosO[1][1]= 205;
        preciosO[1][2]= 255;
        preciosO[1][3]= 305;

        preciosO[2][0]= 130;
        preciosO[2][1]= 230;
        preciosO[2][2]= 280;
        preciosO[2][3]= 330;





        TextView cliente = findViewById(R.id.cliente);
        cliente.setText(this.getIntent().getExtras().getString( "elCliente"));

        TextView laedad = findViewById(R.id.edad);
        laedad.setText(this.getIntent().getExtras().getString( "suEdad"));
        int intEdad = Integer.parseInt(laedad.getText().toString());

        TextView lafecha = findViewById(R.id.fecha);
        lafecha.setText(this.getIntent().getExtras().getString( "laFecha"));

        TextView lamarca = findViewById(R.id.marca);
        lamarca.setText(this.getIntent().getExtras().getString( "lamarca"));

        TextView unprecio = findViewById(R.id.elprecio);

        int demarca= -1;

        if( lamarca.getText().toString().equals("Opel")){
            demarca=0;
        }else if(lamarca.getText().toString().equals("Fiat")){
            demarca=1;
        }else if(lamarca.getText().toString().equals("Mercedes")){
            demarca=2;
        }

        if(demarca<0){
            unprecio.setText( " NO TRABAJAMOS ESTA MARCA ");
        }else{


            for(int cont = 3; cont > -1; cont--){
               if(intEdad > ( rangos[cont] - 1)){
                  unprecio.setText( " " + preciosO[demarca][cont]);

                 break;
             }
            }
        }







                //= this.getIntent().getExtras().getString( "elCliente");



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
