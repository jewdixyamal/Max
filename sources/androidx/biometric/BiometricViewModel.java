package androidx.biometric;

import android.os.Looper;

public class BiometricViewModel extends qnf {
    public fp3 b;
    public ay c;
    public a8g d;
    public imc e;
    public y7g f;
    public gn0 g;
    public CharSequence h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ci9 n;
    public ci9 o;
    public ci9 p;
    public ci9 q;
    public ci9 r;
    public ci9 s;
    public int t = 0;
    public ci9 u;
    public ci9 v;

    public static void j(ci9 ci9, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ci9.k(obj);
        } else {
            ci9.i(obj);
        }
    }

    public final CharSequence e() {
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            return charSequence;
        }
        ay ayVar = this.c;
        if (ayVar == null) {
            return null;
        }
        CharSequence charSequence2 = (CharSequence) ayVar.Y;
        return charSequence2 != null ? charSequence2 : "";
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ci9, xm7] */
    public final void f(rm0 rm0) {
        if (this.o == null) {
            this.o = new xm7();
        }
        j(this.o, rm0);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ci9, xm7] */
    public final void g(CharSequence charSequence) {
        if (this.v == null) {
            this.v = new xm7();
        }
        j(this.v, charSequence);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ci9, xm7] */
    public final void h(int i2) {
        if (this.u == null) {
            this.u = new xm7();
        }
        j(this.u, Integer.valueOf(i2));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ci9, xm7] */
    public final void i(boolean z) {
        if (this.r == null) {
            this.r = new xm7();
        }
        j(this.r, Boolean.valueOf(z));
    }
}
