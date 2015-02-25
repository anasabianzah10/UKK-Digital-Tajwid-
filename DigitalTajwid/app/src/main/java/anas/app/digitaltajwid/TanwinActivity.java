package anas.app.digitaltajwid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TanwinActivity extends Activity {

    Button idzharhalqi, idghambgnh, idghamblgnh, iqlab, ikhfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin);

        idzharhalqi = (Button)findViewById(R.id.idzharhalqi);

        idzharhalqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIdzhar = new Intent(TanwinActivity.this, IdzharhalqiActivity.class);
                startActivity(masukIdzhar);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        idghambgnh = (Button)findViewById(R.id.idhgambigunah);

        idghambgnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIdghambgnh = new Intent(TanwinActivity.this, IdgmbigunahActivity.class);
                startActivity(masukIdghambgnh);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        idghamblgnh = (Button)findViewById(R.id.idhgambilagunnah);

        idghamblgnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIdghamblgnh = new Intent(TanwinActivity.this, IdghambillagunnahActivity.class);
                startActivity(masukIdghamblgnh);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        iqlab = (Button)findViewById(R.id.iqlab);

        iqlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIqlab = new Intent(TanwinActivity.this, IqlabActivity.class);
                startActivity(masukIqlab);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ikhfa = (Button)findViewById(R.id.ikhfa);

        ikhfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIkhfa = new Intent(TanwinActivity.this, IkhfaActivity.class);
                startActivity(masukIkhfa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tanwin, menu);
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
