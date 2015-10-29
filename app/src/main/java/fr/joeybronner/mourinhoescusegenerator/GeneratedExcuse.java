package fr.joeybronner.mourinhoescusegenerator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.LinearLayout;

import java.util.Random;

import fr.joeybronner.mourinhoescusegenerator.utils.Constants;

public class GeneratedExcuse extends AppCompatActivity {



    Random rgenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated_excuse);
        LinearLayout rootView=(LinearLayout) findViewById(R.id.layoutContainer);
        WebView wv = (WebView) findViewById(R.id.webView);

        // Hide Action Bar
        getSupportActionBar().hide();

        // Random is sentences are empty
        if (Constants.str1.equals("")) {
            Constants.str1 = (Constants.SENTENCE_1[new Random().nextInt(Constants.SENTENCE_1.length)]);
            Constants.str2 = (Constants.SENTENCE_2[new Random().nextInt(Constants.SENTENCE_2.length)]);
            Constants.str3 = (Constants.SENTENCE_3[new Random().nextInt(Constants.SENTENCE_3.length)]);
        }

        // Apply text
        String youtContentStr = String.valueOf(Html
                .fromHtml("<![CDATA[<body style=\"text-align:justify;color:#ffffff;font-size:23pt;font-weight:bold; \">"
                        + Constants.str1.toUpperCase() + " "
                        + Constants.str2.toUpperCase() + " "
                        + Constants.str3.toUpperCase() + "."
                        + "</body>]]>"));

        wv.setBackgroundColor(Color.TRANSPARENT);
        wv.loadData(youtContentStr, "text/html", "utf-8");
        wv.setScrollContainer(false);

        // Set randomly a background image
        rootView.setBackgroundResource(Constants.mbgIds[rgenerator.nextInt(Constants.mbgIds.length)]);
    }
}
