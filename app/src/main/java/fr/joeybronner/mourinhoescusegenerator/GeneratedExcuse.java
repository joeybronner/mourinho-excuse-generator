package fr.joeybronner.mourinhoescusegenerator;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class GeneratedExcuse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated_excuse);

        getSupportActionBar().hide();

        View view = this.getWindow().getDecorView();
        view.setBackground(getResources().getDrawable(R.drawable.back5));
    }

}
