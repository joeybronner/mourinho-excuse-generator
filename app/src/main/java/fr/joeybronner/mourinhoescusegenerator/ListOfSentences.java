package fr.joeybronner.mourinhoescusegenerator;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import fr.joeybronner.mourinhoescusegenerator.utils.Constants;
import fr.joeybronner.mourinhoescusegenerator.utils.Utils;

public class ListOfSentences extends AppCompatActivity {

    ListView listLine;
    ArrayAdapter<String> adapter;
    int screenNumber = 1;
    String[] allLines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_sentences);

        // Action Bar color
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.ColorPrimary)));

        if (Constants.str1.equals("")) {
            screenNumber = 1;
            allLines = Constants.SENTENCE_1;
            getSupportActionBar().setTitle("Pick a responsible");
        } else if (Constants.str2.equals("")) {
            screenNumber = 2;
            allLines = Constants.SENTENCE_2;
            getSupportActionBar().setTitle("Pick a situation");
        } else {
            screenNumber = 3;
            allLines = Constants.SENTENCE_3;
            getSupportActionBar().setTitle("Pick a partner");
        }

        // Load lines
        listLine = (ListView) findViewById(R.id.listLine);

        // Assign adapter to ListView
        adapter = new ArrayAdapter<String>(this, R.layout.textview_style, allLines);
        listLine.setAdapter(adapter);
        listLine.setTextFilterEnabled(true);

        // ListView Item Click Listener
        listLine.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (screenNumber == 1) {
                    Constants.str1 = listLine.getItemAtPosition(position).toString();
                    Utils.openView(getBaseContext(), ListOfSentences.class);
                } else if (screenNumber == 2) {
                    Constants.str2 = listLine.getItemAtPosition(position).toString();
                    Utils.openView(getBaseContext(), ListOfSentences.class);
                } else if (screenNumber == 3) {
                    Constants.str3 = listLine.getItemAtPosition(position).toString();
                    Utils.openView(getBaseContext(), GeneratedExcuse.class);
                }
            }
        });
    }
}