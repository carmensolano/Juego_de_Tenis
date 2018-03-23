package com.example.carme.tenis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterA;
    private TextView counterB;
    private Integer teamCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterA = findViewById(R.id.counterA);
        counterB = findViewById(R.id.counterB);
    }

    public void primerPuntoA(View v){
        teamCounter = Integer.parseInt(counterA.getText(). toString());
        teamCounter += 15;

        counterA.setText(String.valueOf(teamCounter));
    }

    public void primerPuntoB(View v){
        teamCounter = Integer.parseInt(counterB.getText(). toString());
        teamCounter += 15;

        counterB.setText(String.valueOf(teamCounter));
    }

    public void segundoPuntoA(View v){
        teamCounter = Integer.parseInt(counterA.getText(). toString());
        teamCounter += 30;

        counterA.setText(String.valueOf(teamCounter));
    }

    public void segundoPuntoB(View v){
        teamCounter = Integer.parseInt(counterB.getText(). toString());
        teamCounter += 30;

        counterB.setText(String.valueOf(teamCounter));
    }

    public void tercerPuntoA(View v){
        teamCounter = Integer.parseInt(counterA.getText(). toString());
        teamCounter += 40;

        counterA.setText(String.valueOf(teamCounter));
    }

    public void tercerPuntoB(View v){
        teamCounter = Integer.parseInt(counterB.getText(). toString());
        teamCounter += 40;

        counterB.setText(String.valueOf(teamCounter));
    }

    public void cuartoPuntoA(View v){
        teamCounter = Integer.parseInt(counterA.getText(). toString());
        teamCounter += 60;

        counterA.setText(String.valueOf(teamCounter));
    }

    public void cuartoPuntoB(View v){
        teamCounter = Integer.parseInt(counterB.getText(). toString());
        teamCounter += 60;

        counterB.setText(String.valueOf(teamCounter));
    }

    public void newGame(View v){
        counterA.setText("0");
        counterB.setText("0");

    }

}
