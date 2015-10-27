package fr.joeybronner.mourinhoescusegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    /* splash screen timer */
    private static int SPLASH_TIME_OUT = 3500; // 3.5 secs

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                /* closing this activity */
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
