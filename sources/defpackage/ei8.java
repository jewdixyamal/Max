package defpackage;

import android.content.Context;

/* renamed from: ei8  reason: default package */
public abstract class ei8 {
    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.leanback");
    }
}
