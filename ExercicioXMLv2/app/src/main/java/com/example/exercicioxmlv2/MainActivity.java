package com.example.exercicioxmlv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView texViewTopo;
    private TextView texViewNome;
    private TextView texViewEmail;
    private TextView texViewEndereco;
    private TextView texViewProfissao;
    private EditText editTextNome;
    private EditText editTextEmail;
    private EditText editTextEndereco;
    private EditText editTextProfissao;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texViewTopo = findViewById(R.id.text_view_topo);
        texViewNome = findViewById(R.id.text_view_nome);
        texViewEmail = findViewById(R.id.text_view_email);
        texViewEndereco = findViewById(R.id.text_view_endereco);
        texViewProfissao = findViewById(R.id.text_view_profissao);
        editTextNome = findViewById(R.id.edit_text_nome);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextEndereco = findViewById(R.id.edit_text_endereco);
        editTextProfissao = findViewById(R.id.edit_text_profissao);
        buttonEnviar = findViewById(R.id.botao);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editTextNome.getText().toString();
                String email = editTextEmail.getText().toString();
                String endereco = editTextEndereco.getText().toString();
                String profissao = editTextProfissao.getText().toString();

                if (nome.equals("")){
                    Toast.makeText(getApplicationContext(), "Preencha o campo nome", Toast.LENGTH_SHORT).show();
                } else if (email.equals("")){
                    Toast.makeText(getApplicationContext(), "Preencha o campo e-mail", Toast.LENGTH_SHORT).show();
                } else if (endereco.equals("")){
                    Toast.makeText(getApplicationContext(), "Preencha o campo endereço", Toast.LENGTH_SHORT).show();
                } else if (profissao.equals("")){
                    Toast.makeText(getApplicationContext(), "Preencha o campo profissão", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Dados OK", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
