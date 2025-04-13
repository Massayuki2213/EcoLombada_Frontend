package com.example.ecolombada.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.ecolombada.R;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsuario, editTextSenha;
    private Button buttonLogin;
    private TextView textEsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsuario = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
        buttonLogin = findViewById(R.id.buttonLogin);
        textEsqueciSenha = findViewById(R.id.textEsqueciSenha);

        buttonLogin.setOnClickListener(v -> {
            String usuario = editTextUsuario.getText().toString();
            String senha = editTextSenha.getText().toString();

            if (usuario.isEmpty() || senha.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            } else {
                // Apenas simula login
                Toast.makeText(LoginActivity.this, "Login efetuado (mock)", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, HomeActivity.class)); // Vai para Home depois
                finish();
            }
        });

        textEsqueciSenha.setOnClickListener(v ->
                Toast.makeText(LoginActivity.this, "Função de recuperação de senha ainda não implementada", Toast.LENGTH_SHORT).show()
        );
    }
}