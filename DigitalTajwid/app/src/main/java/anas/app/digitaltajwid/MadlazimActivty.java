package anas.app.digitaltajwid;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MadlazimActivty extends ActionBarActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    private Button playmadlazim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlazim_activty);

        playmadlazim = (Button)findViewById(R.id.playmadlazim);
        playmadlazim.setOnClickListener((android.view.View.OnClickListener) this);
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
        if (arg == 7){

            mediaPlayer = MediaPlayer.create(this, R.raw.madlazim);
        }
        mediaPlayer.setLooping(false); // Set looping
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_madlazim_activty, menu);
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

    public  void onClick(View view){
        switch (view.getId()){
            case R.id.playmadlazim :
                playSound(7);
                break;

            default:
                break;
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(R.layout.right_slide_in, R.layout.right_slide_out);
    }
}
