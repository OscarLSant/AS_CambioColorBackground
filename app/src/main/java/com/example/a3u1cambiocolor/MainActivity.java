package com.example.a3u1cambiocolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(R.id.fondo);
        Button button = (Button)findViewById(R.id.button);

        //se hace la llamada al setOnclickListener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fondo f = new Fondo();
                int v = f.cambiaColor();
                constraintLayout.setBackgroundColor(v);
            }
        });
    }


}