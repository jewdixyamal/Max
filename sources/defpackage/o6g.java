package defpackage;

/* renamed from: o6g  reason: default package */
public abstract class o6g {
    public final x6g a;
    public v27[] b;

    public o6g() {
        this(new x6g());
    }

    public final void a() {
        v27[] v27Arr = this.b;
        if (v27Arr != null) {
            v27 v27 = v27Arr[0];
            v27 v272 = v27Arr[1];
            x6g x6g = this.a;
            if (v272 == null) {
                v272 = x6g.a.f(2);
            }
            if (v27 == null) {
                v27 = x6g.a.f(1);
            }
            f(v27.a(v27, v272));
            v27 v273 = this.b[4];
            if (v273 != null) {
                e(v273);
            }
            v27 v274 = this.b[5];
            if (v274 != null) {
                d(v274);
            }
            v27 v275 = this.b[6];
            if (v275 != null) {
                g(v275);
            }
        }
    }

    public abstract x6g b();

    public void c(int i, v27 v27) {
        char c;
        if (this.b == null) {
            this.b = new v27[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                v27[] v27Arr = this.b;
                if (i2 != 1) {
                    c = 2;
                    if (i2 == 2) {
                        c = 1;
                    } else if (i2 != 4) {
                        c = 8;
                        if (i2 == 8) {
                            c = 3;
                        } else if (i2 == 16) {
                            c = 4;
                        } else if (i2 == 32) {
                            c = 5;
                        } else if (i2 == 64) {
                            c = 6;
                        } else if (i2 == 128) {
                            c = 7;
                        } else if (i2 != 256) {
                            throw new IllegalArgumentException(zr6.h(i2, "type needs to be >= FIRST and <= LAST, type="));
                        }
                    }
                } else {
                    c = 0;
                }
                v27Arr[c] = v27;
            }
        }
    }

    public abstract void d(v27 v27);

    public abstract void e(v27 v27);

    public abstract void f(v27 v27);

    public abstract void g(v27 v27);

    public void h(int i, boolean z) {
    }

    public o6g(x6g x6g) {
        this.a = x6g;
    }
}
