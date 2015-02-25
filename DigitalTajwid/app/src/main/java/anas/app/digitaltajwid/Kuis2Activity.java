package anas.app.digitaltajwid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class Kuis2Activity extends ActionBarActivity implements View.OnClickListener{

    int nilaipost, nilai, hasil;
    Button jawab2;
    private MediaPlayer mediaPlayer;
    RadioButton benar2, salah2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis2);

        Intent intent = getIntent();
        nilaipost = intent.getIntExtra("nilaidata", 0);
        benar2 = (RadioButton)findViewById(R.id.benar2);
        salah2 = (RadioButton)findViewById(R.id.salah2);
        jawab2 = (Button)findViewById(R.id.jawab);
        jawab2.setOnClickListener(this);
    }

    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg){
        try{
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }catch(Exception e){
            Log.e("error", "blablabla");
        }
        if (arg == 0){

            mediaPlayer = MediaPlayer.create(this, R.raw.benar);
        }

        else if(arg == 1){
            mediaPlayer = MediaPlayer.create(this, R.raw.salah);
        }
        mediaPlayer.setLooping(false); // Set looping
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kuis2, menu);
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
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.jawab:
                String data = benar2.getText().toString();

                if(benar2.isChecked())
                {
                    nilai = 20;
                    hasil = nilaipost + nilai;
                    playSound(0);                    Toast.makeText(getApplicationContext(), "Alhamdulillah Benar!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Kuis3Activity.class);
                    intent.putExtra("nilaidata", hasil);
                    startActivity(intent);
                    Kuis2Activity.this.finish();
                }
                else if(salah2.isChecked())
                {
                    nilai = 0;
                    playSound(1);
                    hasil = nilaipost + nilai;
                    Toast.makeText(getApplicationContext(), "Salah :D", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Kuis3Activity.class);
                    intent.putExtra("nilaidata", nilaipost);
                    startActivity(intent);
                    Kuis2Activity.this.finish();
                }
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.layout.right_slide_in, R.layout.right_slide_out);
    }
}
