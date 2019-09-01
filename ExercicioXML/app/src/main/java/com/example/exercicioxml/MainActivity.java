package com.example.exercicioxml;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textViewNome;
    private EditText editTextNome;
    private TextView textViewEmail;
    private EditText editTextEmail;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNome = findViewById(R.id.text_view_nome);
        editTextNome = findViewById(R.id.edit_text_nome);
        textViewEmail = findViewById(R.id.text_view_email);
        editTextEmail = findViewById(R.id.edit_text_email);
        buttonEnviar = findViewById(R.id.botao_enviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editTextNome.getText().toString();
                String email = editTextEmail.getText().toString();

                if (nome.equals("")){
                    Toast.makeText(getApplicationContext(), "Preencha o campo nome", Toast.LENGTH_SHORT).show();
                } else if (email.equals("")) {
                    Toast.makeText(getApplicationContext(), "Preencha o campo e-mail", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Dados OK", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
