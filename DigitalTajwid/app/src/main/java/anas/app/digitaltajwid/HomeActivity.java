package anas.app.digitaltajwid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class HomeActivity extends Activity implements View.OnClickListener {
    private Button belajar, latihan, keluar;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        belajar = (Button)findViewById(R.id.belajar);
        belajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(masukMain);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                  }
        });

        latihan = (Button)findViewById(R.id.latihan);
        latihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent masukSoal = new Intent(HomeActivity.this, Kuis1Activity.class);
                startActivity(masukSoal);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        keluar=(Button)findViewById(R.id.keluar);
        keluar.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.keluar:
                exit();
                break;

            default:
                break;
        }
    }

    private void exit(){
        AlertDialog.Builder keluar=new AlertDialog.Builder(this);
        keluar.setMessage("Anda Yakin Ingin Keluar?");
        keluar.setCancelable(false);
        keluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              HomeActivity.this.finish();
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
        keluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();

        }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
        AlertDialog.Builder keluar=new AlertDialog.Builder(this);
        keluar.setMessage("Anda Yakin Ingin Keluar?");
        keluar.setCancelable(false);
        keluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                HomeActivity.this.finish();
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
        keluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();
    }
}
