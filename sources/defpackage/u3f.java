package defpackage;

import android.text.Layout;

/* renamed from: u3f  reason: default package */
public final class u3f {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public int m = -1;
    public int n = -1;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public int q = -1;
    public epe r;
    public float s = Float.MAX_VALUE;

    public final void a(u3f u3f) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (u3f != null) {
            if (!this.c && u3f.c) {
                this.b = u3f.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = u3f.h;
            }
            if (this.i == -1) {
                this.i = u3f.i;
            }
            if (this.a == null && (str = u3f.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = u3f.f;
            }
            if (this.g == -1) {
                this.g = u3f.g;
            }
            if (this.n == -1) {
                this.n = u3f.n;
            }
            if (this.o == null && (alignment2 = u3f.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = u3f.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = u3f.q;
            }
            if (this.j == -1) {
                this.j = u3f.j;
                this.k = u3f.k;
            }
            if (this.r == null) {
                this.r = u3f.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = u3f.s;
            }
            if (!this.e && u3f.e) {
                this.d = u3f.d;
                this.e = true;
            }
            if (this.m == -1 && (i2 = u3f.m) != -1) {
                this.m = i2;
            }
        }
    }
}
