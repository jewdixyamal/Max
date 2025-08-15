package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: w65  reason: default package */
public final class w65 {
    public final Context a;
    public final rhe b;
    public final jde c;
    public final jde d;
    public jde e;
    public jde f;
    public final jde g;
    public final w56 h;
    public final Looper i;
    public final g30 j;
    public final int k;
    public final boolean l;
    public final w1d m;
    public final cc4 n;
    public final long o;
    public boolean p;

    public w65(Context context, cle cle) {
        lc4 lc4 = new lc4(5, cle);
        v65 v65 = new v65(context, 2);
        v65 v652 = new v65(context, 3);
        xc3 xc3 = new xc3(3);
        v65 v653 = new v65(context, 6);
        ta4 ta4 = new ta4(15);
        this.a = context;
        this.c = lc4;
        this.d = v65;
        this.e = v652;
        this.f = xc3;
        this.g = v653;
        this.h = ta4;
        int i2 = maf.a;
        Looper myLooper = Looper.myLooper();
        this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = g30.Z;
        this.k = 1;
        this.l = true;
        this.m = w1d.c;
        this.n = new cc4(0, maf.D(20), 0.999f, maf.D(500));
        this.b = rhe.a;
        this.o = 2000;
    }
}
