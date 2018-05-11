package com.blixdesarrollo.loginconclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView tv = findViewById(R.id.txtBienvenido);
       User user = getIntent().getParcelableExtra("user_extra");
       tv.setText("Bienvenido: " + user.usuario + "! Podés enviar correos desde tu mail: " + user.email);
    }

}
