package anas.app.digitaltajwid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MimsukunActivity extends Activity {

    private Button ikhfasya, idghammimi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mimsukun);

        ikhfasya = (Button)findViewById(R.id.ikhfasya);

        ikhfasya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIkhfasya = new Intent(MimsukunActivity.this, IkhfasyafawiActivity.class);
                startActivity(masukIkhfasya);

            }
        });

        idghammimi = (Button)findViewById(R.id.idghammimi);
        idghammimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukIdghammimi = new Intent(MimsukunActivity.this, IdghammimiActivity.class);
                startActivity(masukIdghammimi);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mimsukun, menu);
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
