package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: h0f  reason: default package */
public class h0f {
    public HashMap A;
    public HashSet B;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public zw6 l;
    public int m;
    public zw6 n;
    public int o;
    public int p;
    public int q;
    public zw6 r;
    public f0f s;
    public zw6 t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public h0f() {
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        this.l = ffc;
        this.m = 0;
        this.n = ffc;
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = ffc;
        this.s = f0f.d;
        this.t = ffc;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = new HashMap();
        this.B = new HashSet();
    }

    public static ffc e(String[] strArr) {
        ww6 i2 = zw6.i();
        for (String str : strArr) {
            str.getClass();
            i2.a(oaf.T(str));
        }
        return i2.j();
    }

    public void a(c0f c0f) {
        this.A.put(c0f.a, c0f);
    }

    public j0f b() {
        return new j0f(this);
    }

    public h0f c() {
        this.A.clear();
        return this;
    }

    public final void d(j0f j0f) {
        this.a = j0f.a;
        this.b = j0f.b;
        this.c = j0f.c;
        this.d = j0f.d;
        this.e = j0f.e;
        this.f = j0f.f;
        this.g = j0f.g;
        this.h = j0f.h;
        this.i = j0f.i;
        this.j = j0f.j;
        this.k = j0f.k;
        this.l = j0f.l;
        this.m = j0f.m;
        this.n = j0f.n;
        this.o = j0f.o;
        this.p = j0f.p;
        this.q = j0f.q;
        this.r = j0f.r;
        this.s = j0f.s;
        this.t = j0f.t;
        this.u = j0f.u;
        this.v = j0f.v;
        this.w = j0f.w;
        this.x = j0f.x;
        this.y = j0f.y;
        this.z = j0f.z;
        this.B = new HashSet(j0f.B);
        this.A = new HashMap(j0f.A);
    }

    public h0f f(int i2, int i3) {
        this.i = i2;
        this.j = i3;
        this.k = true;
        return this;
    }
}
