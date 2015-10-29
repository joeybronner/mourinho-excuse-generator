package fr.joeybronner.mourinhoescusegenerator.utils;

import android.content.Context;
import android.content.Intent;

public class Utils {
    public static void openView(Context c, Class<?> cla) {
        Intent intent = new Intent(c, cla);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        c.startActivity(intent);
    }

    public static void resetSentenceValues() {
        Constants.str1 = "";
        Constants.str2 = "";
        Constants.str3 = "";
    }
}
