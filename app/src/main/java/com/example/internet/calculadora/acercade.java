package com.example.internet.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class acercade extends Activity {

    private Button salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);

        salir = (Button) findViewById(R.id.salir);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.exit(0);
            }
        });
    }

}
