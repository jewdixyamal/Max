package defpackage;

/* renamed from: lua  reason: default package */
public final class lua implements m3f {
    public final cw4 a;
    public final s02 b = new s02(new byte[10], 10, 1, (byte) 0);
    public int c = 0;
    public int d;
    public sue e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public lua(cw4 cw4) {
        this.a = cw4;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void b(int i2, yaf yaf) {
        int i3;
        int i4;
        yaf yaf2 = yaf;
        np8.g(this.e);
        int i5 = i2 & 1;
        cw4 cw4 = this.a;
        int i6 = 2;
        if (i5 != 0) {
            int i7 = this.c;
            if (!(i7 == 0 || i7 == 1 || i7 == 2)) {
                if (i7 == 3) {
                    cw4.h();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i2;
        while (yaf.c() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                s02 s02 = this.b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (c(yaf2, s02.b, Math.min(10, this.i)) && c(yaf2, (byte[]) null, this.i)) {
                            s02.q(0);
                            this.l = -9223372036854775807L;
                            int i10 = 4;
                            if (this.f) {
                                s02.t(4);
                                s02.t(1);
                                s02.t(1);
                                long i11 = (((long) s02.i(3)) << 30) | ((long) (s02.i(15) << 15)) | ((long) s02.i(15));
                                s02.t(1);
                                if (!this.h && this.g) {
                                    s02.t(4);
                                    s02.t(1);
                                    long i12 = (long) (s02.i(15) << 15);
                                    s02.t(1);
                                    s02.t(1);
                                    this.e.b(i12 | (((long) s02.i(3)) << 30) | ((long) s02.i(15)));
                                    this.h = true;
                                }
                                this.l = this.e.b(i11);
                            }
                            if (!this.k) {
                                i10 = 0;
                            }
                            i8 |= i10;
                            cw4.g(i8, this.l);
                            this.c = 3;
                            this.d = 0;
                            i6 = 2;
                        }
                    } else if (i9 == 3) {
                        int c2 = yaf.c();
                        int i13 = this.j;
                        int i14 = i13 == -1 ? 0 : c2 - i13;
                        if (i14 > 0) {
                            c2 -= i14;
                            yaf2.G(yaf2.b + c2);
                        }
                        cw4.f(yaf2);
                        int i15 = this.j;
                        if (i15 != -1) {
                            int i16 = i15 - c2;
                            this.j = i16;
                            if (i16 == 0) {
                                cw4.h();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                    i3 = i6;
                } else if (c(yaf2, s02.b, 9)) {
                    s02.q(0);
                    if (s02.i(24) != 1) {
                        this.j = -1;
                        i4 = 0;
                        i3 = 2;
                    } else {
                        s02.t(8);
                        int i17 = s02.i(16);
                        s02.t(5);
                        this.k = s02.h();
                        i3 = 2;
                        s02.t(2);
                        this.f = s02.h();
                        this.g = s02.h();
                        s02.t(6);
                        int i18 = s02.i(8);
                        this.i = i18;
                        if (i17 == 0) {
                            this.j = -1;
                        } else {
                            int i19 = (i17 - 3) - i18;
                            this.j = i19;
                            if (i19 < 0) {
                                this.j = -1;
                            }
                        }
                        i4 = 2;
                    }
                    this.c = i4;
                    this.d = 0;
                } else {
                    i3 = 2;
                }
            } else {
                i3 = i6;
                yaf2.I(yaf.c());
            }
            i6 = i3;
        }
    }

    public final boolean c(yaf yaf, byte[] bArr, int i2) {
        int min = Math.min(yaf.c(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yaf.I(min);
        } else {
            yaf.g(this.d, bArr, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }

    public final void e(sue sue, oa5 oa5, l3f l3f) {
        this.e = sue;
        this.a.j(oa5, l3f);
    }
}
