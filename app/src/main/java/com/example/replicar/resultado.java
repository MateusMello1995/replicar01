package com.example.replicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    //declara atributos que vão receber os campos
    public TextView nomeCampo;
    public TextView emailCampo;
    public TextView dataCampo;
    public TextView telefoneCampo;
    public TextView mensagemCampo;
    public TextView senhaCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //verifica se foram passados os parametros na tela
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            //pega os valores passados na tela
            String nome = bundle.getString("nome");
            String email = bundle.getString("email");
            String data = bundle.getString("data");
            String telefone = bundle.getString("telefone");
            String mensagem = bundle.getString("mensagem");
            String senha = bundle.getString("senha");

            //busca o campo na activity e adiciona o texto vindo de outra tela a ele
            nomeCampo = findViewById(R.id.textViewNome);
            nomeCampo.setText(nome);

            emailCampo = findViewById(R.id.textViewEmail);
            emailCampo.setText(email);

            dataCampo = findViewById(R.id.textViewData);
            dataCampo.setText(data);

            telefoneCampo = findViewById(R.id.textViewTelefone);
            telefoneCampo.setText(telefone);

            mensagemCampo = findViewById(R.id.textViewMensagem);
            mensagemCampo.setText(mensagem);

            senhaCampo = findViewById(R.id.textViewSenha);
            senhaCampo.setText(senha);

        }

    }
}
