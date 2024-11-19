package com.example.harrypotterquiz;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculando os TextViews do layout
        TextView ultimaPontuacaoValor = findViewById(R.id.tv_ultima_pontuacao_valor);
        TextView pontosHojeValor = findViewById(R.id.tv_pontos_hoje_valor);
        TextView pontosMesValor = findViewById(R.id.tv_pontos_mes_valor);
        TextView pontosSempreValor = findViewById(R.id.tv_pontos_sempre_valor);

        // Alimentando os dados (você pode carregar isso de um banco de dados ou API)
        int ultimaPontuacao = 75;
        int pontosHoje = 570;
        int pontosMes = 1540;
        int pontosSempre = 8565;

        // Definindo os valores nos TextViews
        ultimaPontuacaoValor.setText(String.valueOf(ultimaPontuacao));
        pontosHojeValor.setText(String.valueOf(pontosHoje));
        pontosMesValor.setText(String.valueOf(pontosMes));
        pontosSempreValor.setText(String.valueOf(pontosSempre));
    }
}
