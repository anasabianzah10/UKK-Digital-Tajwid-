package anas.app.digitaltajwid;

import android.content.Intent;
import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    ImageView tanwin;
    ImageView qalqalah;
    ImageView mimsukun;
    ImageView ra;
    ImageView mad;
    ImageView tasydid, makhraj;
    ImageView lam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanwin = (ImageView)findViewById(R.id.tanwin);

        tanwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukTanwin = new Intent(MainActivity.this, TanwinActivity.class);
                startActivity(masukTanwin);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        qalqalah = (ImageView)findViewById(R.id.qalqalah);

        qalqalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukQalqalah = new Intent(MainActivity.this, QalqalahActivity.class);
                startActivity(masukQalqalah);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        mimsukun=(ImageView)findViewById(R.id.mimsukun);

        mimsukun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMimsukun = new Intent(MainActivity.this, MimsukunActivity.class);
                startActivity(masukMimsukun);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ra = (ImageView)findViewById(R.id.ra);

        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukRa = new Intent(MainActivity.this, RaActivity.class);
                startActivity(masukRa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        mad = (ImageView)findViewById(R.id.mad);

        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMad = new Intent(MainActivity.this, MadActivity.class);
                startActivity(masukMad);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        lam = (ImageView)findViewById(R.id.lam);

        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukLam = new Intent(MainActivity.this, LamActivity.class);
                startActivity(masukLam);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        tasydid = (ImageView)findViewById(R.id.tasydid);

        tasydid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukTasydid = new Intent(MainActivity.this, TasydidActivity.class);
                startActivity(masukTasydid);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        makhraj = (ImageView)findViewById(R.id.makhraj);
        makhraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMakhraj = new Intent(MainActivity.this, MakhrajActivity.class);
                startActivity(masukMakhraj);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
