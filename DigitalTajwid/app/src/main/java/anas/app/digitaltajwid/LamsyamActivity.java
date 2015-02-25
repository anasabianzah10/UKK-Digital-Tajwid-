package anas.app.digitaltajwid;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class LamsyamActivity extends ActionBarActivity implements View.OnClickListener{
    private MediaPlayer mediaPlayer;
    private Button playlamsyam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamsyam);
        playlamsyam = (Button)findViewById(R.id.playlamsyam);
        playlamsyam.setOnClickListener(this);
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
            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }catch(Exception e){
            Log.e("error", "blablabla");
        }
        if (arg == 15){
            mediaPlayer = MediaPlayer.create(this, R.raw.lamsyamsiah);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lamsyam, menu);
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
        mediaPlayer.stop();
    }

    @Override
     public void onClick(View view) {
        switch (view.getId()){
            case R.id.playlamsyam :
                playSound(15);
                break;

            default:
                break;
        }
    }
}
