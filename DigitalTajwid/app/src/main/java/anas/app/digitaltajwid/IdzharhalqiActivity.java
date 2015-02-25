package anas.app.digitaltajwid;



import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;




public class IdzharhalqiActivity extends ActionBarActivity implements View.OnClickListener {

    private MediaPlayer mediaPlayer;

    private Button playidzhar, playidzhar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idzharhalqi);
        playidzhar2 = (Button)findViewById(R.id.playidzhar2);
        playidzhar2.setOnClickListener(this);
        playidzhar = (Button)findViewById(R.id.play_idzhar);
        playidzhar.setOnClickListener(this);

    }

    public void onPause(){
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
        }catch (Exception e){
            Log.e("error", "blablabla");
        }
        if (arg == 1){
            mediaPlayer = MediaPlayer.create(this, R.raw.idzharhalqi);
        }else if (arg == 19){
            mediaPlayer = MediaPlayer.create(this, R.raw.idzharhalqi2);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_idzharhalqi, menu);
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
            case R.id.play_idzhar :
                playSound(1);
                break;
            case R.id.playidzhar2 :
                playSound(19);
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
