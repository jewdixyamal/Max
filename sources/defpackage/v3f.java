package defpackage;

import android.text.Layout;

/* renamed from: v3f  reason: default package */
public final class v3f {
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
    public fpe r;
    public float s = Float.MAX_VALUE;

    public final void a(v3f v3f) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (v3f != null) {
            if (!this.c && v3f.c) {
                this.b = v3f.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = v3f.h;
            }
            if (this.i == -1) {
                this.i = v3f.i;
            }
            if (this.a == null && (str = v3f.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = v3f.f;
            }
            if (this.g == -1) {
                this.g = v3f.g;
            }
            if (this.n == -1) {
                this.n = v3f.n;
            }
            if (this.o == null && (alignment2 = v3f.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = v3f.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = v3f.q;
            }
            if (this.j == -1) {
                this.j = v3f.j;
                this.k = v3f.k;
            }
            if (this.r == null) {
                this.r = v3f.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = v3f.s;
            }
            if (!this.e && v3f.e) {
                this.d = v3f.d;
                this.e = true;
            }
            if (this.m == -1 && (i2 = v3f.m) != -1) {
                this.m = i2;
            }
        }
    }
}
