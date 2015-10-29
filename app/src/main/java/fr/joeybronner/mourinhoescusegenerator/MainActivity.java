package fr.joeybronner.mourinhoescusegenerator;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import fr.joeybronner.mourinhoescusegenerator.utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Action Bar color
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blueChelsea)));

        Utils.resetSentenceValues();

        ImageButton btRandom = (ImageButton) findViewById(R.id.imageButton);
        btRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.openView(getBaseContext(), ListOfSentences.class);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Utils.resetSentenceValues();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Utils.resetSentenceValues();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Utils.openView(getBaseContext(), GeneratedExcuse.class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
