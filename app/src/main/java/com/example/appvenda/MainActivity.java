package com.example.appvenda;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appvenda.controller.AppController;
import com.example.appvenda.model.AppModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText valorUnitário = (EditText)findViewById(R.id.valorUnitário);
        EditText quantidade = (EditText)findViewById(R.id.quantidade);
        EditText desconto = (EditText)findViewById(R.id.desconto);
        Button venda = (Button)findViewById(R.id.venda);
        EditText resultado = (EditText)findViewById(R.id.resultado);

        venda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AppModel appModel = new AppModel(
                        Double.parseDouble(valorUnitário.getText().toString()),
                        Double.parseDouble(quantidade.getText().toString()),
                        Double.parseDouble(desconto.getText().toString())
                );

                AppController appController = new AppController();
                resultado.setText(String.valueOf(appController.valor(appModel)));

            }
        });
    }
}