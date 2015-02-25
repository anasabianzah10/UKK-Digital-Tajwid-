package anas.app.digitaltajwid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HasilActivity extends ActionBarActivity {

    TextView hasil;
    int nilaipost;
    Button ulang, beranda;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Intent intent = getIntent();
        nilaipost = intent.getIntExtra("nilaidata", nilaipost);
        hasil =(TextView)findViewById(R.id.hasil);

        hasil.setText(String.valueOf(nilaipost));

        ulang = (Button)findViewById(R.id.ulang);
        beranda = (Button)findViewById(R.id.beranda);
        ulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilActivity.this.finish();
                Intent show = new Intent(getApplicationContext(), Kuis1Activity.class);
                startActivity(show);


            }
        });

        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent show = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(show);

                HasilActivity.this.finish();
            }
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.applause);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hasil, menu);
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
