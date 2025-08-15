package defpackage;

import android.content.Context;

/* renamed from: lud  reason: default package */
public final class lud extends mud {
    /* JADX WARNING: type inference failed for: r4v1, types: [lud, mud] */
    public static lud a(String str, Context context, nud[] nudArr) {
        StringBuilder m = au1.m("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < nudArr.length; i++) {
            m.append("\n\t\tSoSource ");
            m.append(i);
            m.append(": ");
            m.append(nudArr[i].toString());
        }
        if (context != null) {
            m.append("\n\tNative lib dir: ");
            m.append(context.getApplicationInfo().nativeLibraryDir);
            m.append("\n");
        }
        return new mud(str, m.toString());
    }
}
