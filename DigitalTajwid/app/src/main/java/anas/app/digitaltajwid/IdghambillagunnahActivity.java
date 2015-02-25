package anas.app.digitaltajwid;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class IdghambillagunnahActivity extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;

    private Button playiblgnh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idghambillagunnah);

        playiblgnh = (Button)findViewById(R.id.playiblgnh);
        playiblgnh.setOnClickListener((View.OnClickListener) this);
    }

    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg){
        try {
            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }catch (Exception e){
            Log.e("error", "balbala");
        }
        if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.idghambillagunnah);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_idghambillagunnah, menu);
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

            case R.id.playiblgnh :
                playSound(2);
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


