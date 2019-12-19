package com.example.replicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class formulario extends AppCompatActivity {
    //declara atributo que vai receber o id do campo
    public EditText nome;
    public EditText email;
    public EditText data;
    public EditText telefone;
    public EditText mensagem;
    public EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }
    public void proximaTela(View view){
        //declara variaveis que vão pegar os campos
        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);
        data = findViewById(R.id.data);
        telefone = findViewById(R.id.telefone);
        mensagem = findViewById(R.id.mensagem);
        senha = findViewById(R.id.senha);

        String nomeTexto = nome.getText().toString();
        String emailTexto = email.getText().toString();
        String dataTexto = data.getText().toString();
        String telefoneTexto = telefone.getText().toString();
        String mensagemTexto = mensagem.getText().toString();
        String senhaTexto = senha.getText().toString();

        Intent intent = new Intent(this, resultado.class);

        //envia campos para proxima tela
        intent.putExtra("nome", nomeTexto);
        intent.putExtra("email", emailTexto);
        intent.putExtra("data", dataTexto);
        intent.putExtra("telefone", telefoneTexto);
        intent.putExtra("mensagem", mensagemTexto);
        intent.putExtra("senha", senhaTexto);

        startActivity(intent);
    }

}
