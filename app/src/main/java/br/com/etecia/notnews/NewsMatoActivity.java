package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NewsMatoActivity extends AppCompatActivity {
    Toolbar idToolbar;


    TextView textRec;
    TextView textLixo;
    TextView textRecu;
    TextView textEco;
    TextView textEne;
    LinearLayout layRec;
    LinearLayout layLixo;
    LinearLayout layRecu;
    LinearLayout layEco;
    LinearLayout layEne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news_mato);

        textRec = findViewById(R.id.idTextRec);
        layRec = findViewById(R.id.idLayRec);

        textLixo = findViewById(R.id.idTextLixo);
        layLixo = findViewById(R.id.idLayLixo);

        textRecu = findViewById(R.id.idTextRecu);
        layRecu = findViewById(R.id.idLayRecu);

        textEco = findViewById(R.id.idTextEco);
        layEco = findViewById(R.id.idLayEco);

        textEne = findViewById(R.id.idTextEne);
        layEne = findViewById(R.id.idLayEne);

        idToolbar = findViewById(R.id.idToolBarMeioAmbiente);

        setSupportActionBar(idToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void expand10(View view) {
        int v = (textRec.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layRec, new AutoTransition());
        textRec.setVisibility(v);

    }

    public void expand11(View view) {
        int v = (textLixo.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layLixo, new AutoTransition());
        textLixo.setVisibility(v);

    }

    public void expand12(View view) {
        int v = (textRecu.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layRecu, new AutoTransition());
        textRecu.setVisibility(v);

    }

    public void expand13(View view) {
        int v = (textEco.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layEco, new AutoTransition());
        textEco.setVisibility(v);

    }

    public void expand14(View view) {
        int v = (textEne.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layEne, new AutoTransition());
        textEne.setVisibility(v);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed(){
        Intent a = new Intent(this, MenuActivity.class);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }
}