package anas.app.digitaltajwid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MadActivity extends Activity {
   Button mjmunfasil, mwmutasil, malissukun, madlin, madlazim, madbadal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad);

        mjmunfasil = (Button)findViewById(R.id.mjmunfasil);
        mjmunfasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMjm = new Intent(MadActivity.this, MjmunfasilActivity.class);
                startActivity(masukMjm);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        mwmutasil = (Button)findViewById(R.id.mwmutasil);
        mwmutasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMwm = new Intent(MadActivity.this, MwmuttashilActivity.class);
                startActivity(masukMwm);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        malissukun = (Button)findViewById(R.id.malissukun);
        malissukun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMalissukun = new Intent(MadActivity.this, MalissukunActivity.class);
                startActivity(masukMalissukun);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        madlin = (Button)findViewById(R.id.madlin);
        madlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMadlin = new Intent(MadActivity.this, MadlinActivity.class);
                startActivity(masukMadlin);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        madlazim = (Button)findViewById(R.id.madlazim);
        madlazim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMadlazim = new Intent(MadActivity.this, MadlazimActivty.class);
                startActivity(masukMadlazim);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        madbadal = (Button)findViewById(R.id.madbadal);
        madbadal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMadbadal = new Intent(MadActivity.this, MadbadalActivity.class);
                startActivity(masukMadbadal);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mad, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.layout.right_slide_in, R.layout.right_slide_out);
    }
}
