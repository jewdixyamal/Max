package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wec  reason: default package */
public final class wec extends sg8 implements uec {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int j = -1;
    public int k;
    public tec l;
    public int m = -1;
    public final /* synthetic */ yec n;

    public wec(yec yec, String str) {
        this.n = yec;
        this.f = str;
    }

    public final int a() {
        return this.m;
    }

    public final void b(tec tec) {
        vec vec = new vec(this);
        this.l = tec;
        int i2 = tec.e;
        tec.e = i2 + 1;
        int i3 = tec.d;
        tec.d = i3 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        tec.b(11, i3, i2, (Bundle) null, bundle);
        tec.h.put(i3, vec);
        this.m = i2;
        if (this.i) {
            tec.a(i2);
            int i4 = this.j;
            if (i4 >= 0) {
                tec.c(this.m, i4);
                this.j = -1;
            }
            int i5 = this.k;
            if (i5 != 0) {
                tec.d(this.m, i5);
                this.k = 0;
            }
        }
    }

    public final void c() {
        tec tec = this.l;
        if (tec != null) {
            int i2 = this.m;
            int i3 = tec.d;
            tec.d = i3 + 1;
            tec.b(4, i3, i2, (Bundle) null, (Bundle) null);
            this.l = null;
            this.m = 0;
        }
    }

    public final void d() {
        yec yec = this.n;
        yec.v0.remove(this);
        c();
        yec.m();
    }

    public final void e() {
        this.i = true;
        tec tec = this.l;
        if (tec != null) {
            tec.a(this.m);
        }
    }

    public final void f(int i2) {
        tec tec = this.l;
        if (tec != null) {
            tec.c(this.m, i2);
            return;
        }
        this.j = i2;
        this.k = 0;
    }

    public final void g() {
        h(0);
    }

    public final void h(int i2) {
        this.i = false;
        tec tec = this.l;
        if (tec != null) {
            int i3 = this.m;
            Bundle g2 = zr6.g(i2, "unselectReason");
            int i4 = tec.d;
            tec.d = i4 + 1;
            tec.b(6, i4, i3, (Bundle) null, g2);
        }
    }

    public final void i(int i2) {
        tec tec = this.l;
        if (tec != null) {
            tec.d(this.m, i2);
        } else {
            this.k += i2;
        }
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.h;
    }

    public final void m(String str) {
        tec tec = this.l;
        if (tec != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = tec.d;
            tec.d = i3 + 1;
            tec.b(12, i3, i2, (Bundle) null, bundle);
        }
    }

    public final void n(String str) {
        tec tec = this.l;
        if (tec != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = tec.d;
            tec.d = i3 + 1;
            tec.b(13, i3, i2, (Bundle) null, bundle);
        }
    }

    public final void o(List list) {
        tec tec = this.l;
        if (tec != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList(list));
            int i3 = tec.d;
            tec.d = i3 + 1;
            tec.b(14, i3, i2, (Bundle) null, bundle);
        }
    }
}
