package com.example.spleatch;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nom = findViewById(R.id.nom);
        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);
        TextView ville = findViewById(R.id.ville);



        String txtNom = getIntent().getStringExtra("nom");
        String txtMail = getIntent().getStringExtra("email");
        String txtNum = getIntent().getStringExtra("phone");
        String txtVille = getIntent().getStringExtra("ville");





        nom.setText(txtNom);
        email.setText(txtMail);
        phone.setText(txtNum);
        ville.setText(txtVille);







    }
}