package defpackage;

import android.graphics.Bitmap;

/* renamed from: y26  reason: default package */
public final class y26 implements wn0 {
    public int a;
    public o43 b;

    public y26(int i, o43 o43) {
        this.b = o43;
        this.a = i;
    }

    public synchronized boolean a(int i) {
        return i == this.a && o43.n0(this.b);
    }

    public synchronized o43 b() {
        return o43.o(this.b);
    }

    public synchronized void c(int i, o43 o43) {
        try {
            if (this.b != null) {
                Object e0 = o43.e0();
                o43 o432 = this.b;
                if (e0.equals(o432 != null ? (Bitmap) o432.e0() : null)) {
                    return;
                }
            }
            o43.S(this.b);
            this.b = o43.o(o43);
            this.a = i;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void clear() {
        g();
    }

    public void d(int i, o43 o43) {
    }

    public synchronized o43 e() {
        o43 o;
        try {
            o = o43.o(this.b);
            g();
        } catch (Throwable th) {
            g();
            throw th;
        }
        return o;
    }

    public synchronized o43 f(int i) {
        return this.a == i ? o43.o(this.b) : null;
    }

    public synchronized void g() {
        o43.S(this.b);
        this.b = null;
        this.a = -1;
    }
}
