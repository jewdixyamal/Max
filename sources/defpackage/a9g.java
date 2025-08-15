package defpackage;

import android.content.Context;

/* renamed from: a9g  reason: default package */
public final class a9g {
    public static final a9g b;
    public bkg a;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, a9g] */
    static {
        ? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static bkg a(Context context) {
        bkg bkg;
        a9g a9g = b;
        synchronized (a9g) {
            try {
                if (a9g.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    a9g.a = new bkg(20, context);
                }
                bkg = a9g.a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return bkg;
    }
}
