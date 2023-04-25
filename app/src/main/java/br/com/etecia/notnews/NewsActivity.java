package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.SurfaceControl;
import android.view.View;


import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class NewsActivity extends AppCompatActivity {

    Toolbar idToolbar;

    TextView textMob;
    TextView textFar;
    TextView textMoto;
    TextView textPub;
    TextView textEst;

    LinearLayout layMob;
    LinearLayout layFar;
    LinearLayout layMoto;
    LinearLayout layPub;
    LinearLayout layEst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news);

        textMob = findViewById(R.id.idTextMob);
        layMob = findViewById(R.id.idLayMob);

        textFar = findViewById(R.id.idTextFar);
        layFar = findViewById(R.id.idLayFar);

        textMoto = findViewById(R.id.idTextMoto);
        layMoto = findViewById(R.id.idLayMoto);

        textPub = findViewById(R.id.idTextPub);
        layPub = findViewById(R.id.idLayPub);

        textEst = findViewById(R.id.idTextEst);
        layEst = findViewById(R.id.idLayEst);

        idToolbar = findViewById(R.id.idToolBarMeioAmbiente);

        setSupportActionBar(idToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void expand(View view) {
        int v = (textMob.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layMob, new AutoTransition());
        textMob.setVisibility(v);

    }

    public void expand1(View view) {
        int v = (textFar.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layFar, new AutoTransition());
        textFar.setVisibility(v);
    }

    public void expand2(View view) {
        int v = (textMoto.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layMoto, new AutoTransition());
        textMoto.setVisibility(v);
    }

    public void expand3(View view) {
        int v = (textPub.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layPub, new AutoTransition());
        textPub.setVisibility(v);
    }

    public void expand4(View view) {
        int v = (textEst.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layEst, new AutoTransition());
        textEst.setVisibility(v);
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