package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {

    Button Plan;
    Button Mobi;
    Button Mato;
    ImageView imgUm;
    ImageView imgDois;
    ImageView imgTres;

    BottomAppBar botzadaBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);


        imgUm = findViewById(R.id.img1);
        imgDois = findViewById(R.id.img2);
        imgTres = findViewById(R.id.img3);
        Plan = findViewById(R.id.buttonPlan);
        Mobi = findViewById(R.id.buttonMobi);
        Mato = findViewById(R.id.buttonMato);

        Plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        NewsPlanActivity.class));
                finish();
            }
        });
        Mato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        NewsMatoActivity.class));
                finish();
            }
        });
        Mobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        NewsActivity.class));
                finish();
            }
        });

        imgUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        SobreActivity.class));
                finish();
            }
        });
        imgDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        });
        imgTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        });



    }

}
