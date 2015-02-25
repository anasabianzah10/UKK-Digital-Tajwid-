package anas.app.digitaltajwid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class LamActivity extends Activity {
    private Button lamsyam, lamqam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lam);

        lamsyam=(Button)findViewById(R.id.lamsyam);
        lamsyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukLamsyam = new Intent(LamActivity.this, LamsyamActivity.class);
                startActivity(masukLamsyam);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        lamqam = (Button)findViewById(R.id.lamqam);
        lamqam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukLamqam = new Intent(LamActivity.this, LamqamarActivity.class);
                startActivity(masukLamqam);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lam, menu);
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
