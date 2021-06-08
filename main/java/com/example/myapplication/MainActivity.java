import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class MainActivity extends Activity {

    Button s1, s2, s3, s4;
    MediaPlayer ss1, ss2, ss3, ss4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = (Button) findViewById(R.id.s1);
        s2 = (Button) findViewById(R.id.s2);
        s3 = (Button) findViewById(R.id.s3);
        s4 = (Button) findViewById(R.id.s4);

        s1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                ss1 = MediaPlayer.create(MainActivity.this, R.raw.suono);
                ss1.start();
            }
        });

        s2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                ss2 = MediaPlayer.create(MainActivity.this, R.raw.suono);
                ss2.start();
            }
        });

        s3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                ss3 = MediaPlayer.create(MainActivity.this, R.raw.suono);
                ss3.start();
            }
        });

        s4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                ss4 = MediaPlayer.create(MainActivity.this, R.raw.suono);
                ss4.start();
            }
        });



    }


    }

