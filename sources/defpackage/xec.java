package defpackage;

import android.os.Bundle;

/* renamed from: xec  reason: default package */
public final class xec extends tg8 implements uec {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public tec f;
    public int g;
    public final /* synthetic */ yec h;

    public xec(yec yec, String str, String str2) {
        this.h = yec;
        this.a = str;
        this.b = str2;
    }

    public final int a() {
        return this.g;
    }

    public final void b(tec tec) {
        this.f = tec;
        int i = tec.e;
        tec.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = tec.d;
        tec.d = i2 + 1;
        tec.b(3, i2, i, (Bundle) null, bundle);
        this.g = i;
        if (this.c) {
            tec.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                tec.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                tec.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    public final void c() {
        tec tec = this.f;
        if (tec != null) {
            int i = this.g;
            int i2 = tec.d;
            tec.d = i2 + 1;
            tec.b(4, i2, i, (Bundle) null, (Bundle) null);
            this.f = null;
            this.g = 0;
        }
    }

    public final void d() {
        yec yec = this.h;
        yec.v0.remove(this);
        c();
        yec.m();
    }

    public final void e() {
        this.c = true;
        tec tec = this.f;
        if (tec != null) {
            tec.a(this.g);
        }
    }

    public final void f(int i) {
        tec tec = this.f;
        if (tec != null) {
            tec.c(this.g, i);
            return;
        }
        this.d = i;
        this.e = 0;
    }

    public final void g() {
        h(0);
    }

    public final void h(int i) {
        this.c = false;
        tec tec = this.f;
        if (tec != null) {
            int i2 = this.g;
            Bundle g2 = zr6.g(i, "unselectReason");
            int i3 = tec.d;
            tec.d = i3 + 1;
            tec.b(6, i3, i2, (Bundle) null, g2);
        }
    }

    public final void i(int i) {
        tec tec = this.f;
        if (tec != null) {
            tec.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
