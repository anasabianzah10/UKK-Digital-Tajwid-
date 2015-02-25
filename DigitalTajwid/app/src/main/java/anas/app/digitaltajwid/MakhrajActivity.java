package anas.app.digitaltajwid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MakhrajActivity extends ActionBarActivity {
    private Button alif,ba,ta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makhraj);

        alif = (Button)findViewById(R.id.alif);
        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukAlif = new Intent(MakhrajActivity.this, VideoalifActivity.class);
                startActivity(masukAlif);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ba = (Button)findViewById(R.id.ba);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukBa = new Intent(MakhrajActivity.this, VideobaActivity.class);
                startActivity(masukBa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ta = (Button)findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukTa = new Intent(MakhrajActivity.this, VideotaActivity.class);
                startActivity(masukTa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_makhraj, menu);
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
}
