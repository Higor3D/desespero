package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceControl;
import android.view.View;


import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewsPlanActivity extends AppCompatActivity {

    Toolbar idToolbar;
    TextView textNor;
    TextView textReg;
    TextView textArv;
    TextView textSan;
    TextView textEdu;
    LinearLayout layNor;
    LinearLayout layReg;
    LinearLayout layArv;
    LinearLayout laySan;
    LinearLayout layEdu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news_plan);

        textNor = findViewById(R.id.idTextNor);
        layNor = findViewById(R.id.idLayNor);

        textReg = findViewById(R.id.idTextReg);
        layReg = findViewById(R.id.idLayReg);

        textArv = findViewById(R.id.idTextArv);
        layArv = findViewById(R.id.idLayArv);

        textSan = findViewById(R.id.idTextSan);
        laySan = findViewById(R.id.idLaySan);

        textEdu = findViewById(R.id.idTextEdu);
        layEdu = findViewById(R.id.idLayEdu);

        idToolbar = findViewById(R.id.idToolBarMeioAmbiente);

        setSupportActionBar(idToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void expand5(View view) {
        int v = (textNor.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layNor, new AutoTransition());
        textNor.setVisibility(v);

    }

    public void expand6(View view) {
        int v = (textReg.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layReg, new AutoTransition());
        textReg.setVisibility(v);

    }

    public void expand7(View view) {
        int v = (textArv.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layArv, new AutoTransition());
        textArv.setVisibility(v);

    }

    public void expand8(View view) {
        int v = (textSan.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(laySan, new AutoTransition());
        textSan.setVisibility(v);

    }

    public void expand9(View view) {
        int v = (textEdu.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        TransitionManager.beginDelayedTransition(layEdu, new AutoTransition());
        textEdu.setVisibility(v);

    }


    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        Intent a = new Intent(this, MenuActivity.class);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }
}