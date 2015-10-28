package fr.joeybronner.mourinhoescusegenerator;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Action Bar color
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.ColorPrimary)));

        /*Button btRandom = (Button) findViewById(R.id.btRandom);
        btRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openView(getBaseContext(), GeneratedExcuse.class);
            }
        });*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            openView(getBaseContext(), GeneratedExcuse.class);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void openView(Context c, Class<?> cla) {
        Intent intent = new Intent(c, cla);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        c.startActivity(intent);
    }
}
