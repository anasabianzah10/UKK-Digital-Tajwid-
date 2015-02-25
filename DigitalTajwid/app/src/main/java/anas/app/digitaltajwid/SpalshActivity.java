package anas.app.digitaltajwid;

/**import android.support.v7.app.ActionBarActivity;**/
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Handler;


public class SpalshActivity extends Activity {

    /* kode untuk menampilkan splash screen salama 3 detik */
    private final int SPLASH_DISPLAY_LENGHT = 3000;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
		/* layout splashscreen dengan background gambar */
        setContentView(R.layout.activity_spalsh);
	/* handler untuk menjalankan splashscreen selama 5 detik lalu
	 * membuat HomeActivity
	 */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = null;

                mainIntent = new Intent(SpalshActivity.this,
                        HomeActivity.class);

                SpalshActivity.this.startActivity(mainIntent);
                SpalshActivity.this.finish();
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);


            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}