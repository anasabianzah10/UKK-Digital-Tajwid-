package anas.app.digitaltajwid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MakhrajActivity extends ActionBarActivity {
    private Button alif,ba,ta, tsa, jim, kha, kho, dal, dzal, ro, zaa, sin, syin, shod, dhod, tho, dhlo, ain, ghoin, fa, qof, kaf, lam, mim, nun, wawu, hamzah, ya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makhraj);

        alif = (Button)findViewById(R.id.alif);
        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukAlif = new Intent(MakhrajActivity.this, VideoalifActivity.class);
                startActivity(masukAlif);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ba = (Button)findViewById(R.id.ba);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukBa = new Intent(MakhrajActivity.this, VideobaActivity.class);
                startActivity(masukBa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ta = (Button)findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukTa = new Intent(MakhrajActivity.this, VideotaActivity.class);
                startActivity(masukTa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        tsa = (Button)findViewById(R.id.tsa);
        tsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukTsa = new Intent(MakhrajActivity.this, VideotsaActivity.class);
                startActivity(masukTsa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        jim = (Button)findViewById(R.id.jim);
        jim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukJim = new Intent(MakhrajActivity.this, VideojimActivity.class);
                startActivity(masukJim);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        kha = (Button)findViewById(R.id.kha);
        kha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukHa = new Intent(MakhrajActivity.this, VideohaActivity.class);
                startActivity(masukHa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        kho = (Button)findViewById(R.id.kho);
        kho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukKho = new Intent(MakhrajActivity.this, VideokhoActivity.class);
                startActivity(masukKho);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        dal = (Button)findViewById(R.id.dal);
        dal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukDal = new Intent(MakhrajActivity.this, VideodalActivity.class);
                startActivity(masukDal);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        dzal = (Button)findViewById(R.id.dzal);
        dzal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukDzal = new Intent(MakhrajActivity.this, VideodzalActivity.class);
                startActivity(masukDzal);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ro = (Button)findViewById(R.id.ro);
        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukRo = new Intent(MakhrajActivity.this, VideoroActivity.class);
                startActivity(masukRo);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        zaa = (Button)findViewById(R.id.zaa);
        zaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukZaa = new Intent(MakhrajActivity.this, VideozaaActivity.class);
                startActivity(masukZaa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        sin = (Button)findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukSin = new Intent(MakhrajActivity.this, VideosinActivity.class);
                startActivity(masukSin);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        syin = (Button)findViewById(R.id.syin);
        syin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukSyin = new Intent(MakhrajActivity.this, VideosyinActivity.class);
                startActivity(masukSyin);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        shod = (Button)findViewById(R.id.shod);
        shod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukShod = new Intent(MakhrajActivity.this, VideoshodActivity.class);
                startActivity(masukShod);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        dhod = (Button)findViewById(R.id.dhod);
        dhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukDhod = new Intent(MakhrajActivity.this, VideodhodActivity.class);
                startActivity(masukDhod);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        dhlo = (Button)findViewById(R.id.dhlo);
        dhlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukDhlo = new Intent(MakhrajActivity.this, VideodhloActivity.class);
                startActivity(masukDhlo);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        tho = (Button)findViewById(R.id.tho);
        tho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukTho = new Intent(MakhrajActivity.this, VideothoActivity.class);
                startActivity(masukTho);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ain = (Button)findViewById(R.id.ain);
        ain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukAin = new Intent(MakhrajActivity.this, VideoainActivity.class);
                startActivity(masukAin);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ghoin = (Button)findViewById(R.id.ghoin);
        ghoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukGhoin = new Intent(MakhrajActivity.this, VideoghoinActivity.class);
                startActivity(masukGhoin);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        fa = (Button)findViewById(R.id.fa);
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukFa = new Intent(MakhrajActivity.this, VideofaActivity.class);
                startActivity(masukFa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        qof = (Button)findViewById(R.id.qof);
        qof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukQof = new Intent(MakhrajActivity.this, VideoqofActivity.class);
                startActivity(masukQof);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        kaf =(Button)findViewById(R.id.kaf);
        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukKaf = new Intent(MakhrajActivity.this, VideokafActivity.class);
                startActivity(masukKaf);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        lam = (Button)findViewById(R.id.lam_makhraj);
        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukLammakhraj = new Intent(MakhrajActivity.this, VideolamActivity.class);
                startActivity(masukLammakhraj);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        mim = (Button)findViewById(R.id.mim_makhraj);
        mim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukMimmakhraj = new Intent(MakhrajActivity.this, VideomimActivity.class);
                startActivity(masukMimmakhraj);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        nun = (Button)findViewById(R.id.nun);
        nun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukNun = new Intent(MakhrajActivity.this, VideonunActivity.class);
                startActivity(masukNun);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        wawu = (Button)findViewById(R.id.wawu);
        wawu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukWawu = new Intent(MakhrajActivity.this, VideowawuActivity.class);
                startActivity(masukWawu);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        hamzah = (Button)findViewById(R.id.hamzah);
        hamzah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukHamzah = new Intent(MakhrajActivity.this, VideohamzahActivity.class);
                startActivity(masukHamzah);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });

        ya = (Button)findViewById(R.id.ya);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukYa = new Intent(MakhrajActivity.this, VideoyaACtivity.class);
                startActivity(masukYa);
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_makhraj, menu);
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
