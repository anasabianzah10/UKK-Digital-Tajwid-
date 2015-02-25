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


public class Kuis1Activity extends ActionBarActivity implements View.OnClickListener{
    Button jawab1;
    int nilaipost;
    RadioButton benar1, salah1;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis1);

        benar1 = (RadioButton)findViewById(R.id.benar1);
        salah1 = (RadioButton)findViewById(R.id.salah1);
        jawab1 = (Button)findViewById(R.id.jawab);
        jawab1.setOnClickListener(this);
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
        getMenuInflater().inflate(R.menu.menu_kuis1, menu);
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

    public void onClick(View view){
        switch (view.getId()){
            case R.id.jawab:
                String data = benar1.getText().toString();

                if(benar1.isChecked())
                {
                    nilaipost = 20;
                    Toast.makeText(getApplicationContext(), "Alhamdulillah Benar!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Kuis2Activity.class);
                    intent.putExtra("nilaidata", nilaipost);
                    playSound(0);
                    startActivity(intent);
                    Kuis1Activity.this.finish();
                }
                else if(salah1.isChecked())
                {
                    nilaipost = 0;
                    playSound(1);
                    Toast.makeText(getApplicationContext(), "Salah :D", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Kuis2Activity.class);
                    intent.putExtra("nilaidata", nilaipost);
                    startActivity(intent);
                    Kuis1Activity.this.finish();
                }
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.layout.right_slide_in, R.layout.right_slide_out);
    }
}
