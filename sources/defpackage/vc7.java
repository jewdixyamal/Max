package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: vc7  reason: default package */
public final class vc7 {
    public static final int a = tu0.G(((float) 100) * fk4.d().getDisplayMetrics().density);
    public static final ki9 b = new ki9(6);
    public static int c;
    public static SharedPreferences d;
    public static final q0e e;
    public static final q0e f;

    static {
        q0e a2 = r0e.a(Boolean.FALSE);
        e = a2;
        f = a2;
    }

    public static int a(Context context) {
        ki9 ki9 = b;
        String str = "pref_keyboard_height_landscape";
        if (ki9.e == 0) {
            SharedPreferences sharedPreferences = d;
            if (sharedPreferences == null) {
                sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
            }
            if (d == null) {
                d = sharedPreferences;
            }
            int max = Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
            ki9.d(sharedPreferences.getInt("pref_keyboard_height_portrait", max), "pref_keyboard_height_portrait");
            ki9.d(sharedPreferences.getInt("pref_keyboard_height_portrait", max), str);
        }
        if (1 == context.getResources().getConfiguration().orientation) {
            str = "pref_keyboard_height_portrait";
        }
        int b2 = ki9.b(str);
        return b2 >= 0 ? ki9.c[b2] : Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
    }

    public static boolean b(int i) {
        return i > a;
    }
}
