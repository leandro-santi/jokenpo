package com.leosanti.jokenpo;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view) {
        opcaoSelecionada("Pedra");
    }

    public void papel(View view) {
        opcaoSelecionada("Papel");
    }

    public void tesoura(View view) {
        opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String op) {
        String opApp = "";
        Random random = new Random();
        String[] opAppList = {"Pedra", "Papel", "Tesoura"}; // 0 1 2
        opApp = opAppList[random.nextInt(3)];

        ImageView imagemOp;
        imagemOp = findViewById(R.id.ImageOpApp);

        switch(opApp) {
            case "Pedra":
                imagemOp.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imagemOp.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imagemOp.setImageResource(R.drawable.tesoura);
                break;
        }

        TextView textoResultado = findViewById(R.id.textoResult);

        if(op == "Pedra") {
            if(opApp == "Tesoura") textoResultado.setText("Você Venceu! =)");
            else if(opApp == "Pedra") textoResultado.setText("Empate! =|");
            else textoResultado.setText("Você Perdeu! =(");
        }

        else if(op == "Papel") {
            if(opApp == "Pedra") textoResultado.setText("Você Venceu! =)");
            else if(opApp == "Papel") textoResultado.setText("Empate! =|");
            else textoResultado.setText("Você Perdeu! =(");
        }

        else if(op == "Tesoura") {
            if(opApp == "Papel") textoResultado.setText("Você Venceu! =)");
            else if(opApp == "Tesoura") textoResultado.setText("Empate! =|");
            else textoResultado.setText("Você Perdeu! =(");
        }
    }

}