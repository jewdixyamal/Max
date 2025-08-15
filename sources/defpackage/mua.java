package defpackage;

/* renamed from: mua  reason: default package */
public final class mua implements n3f {
    public final dw4 a;
    public final s02 b = new s02(new byte[10], 10, 2, (byte) 0);
    public int c = 0;
    public int d;
    public tue e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public mua(dw4 dw4) {
        this.a = dw4;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void b(tue tue, pa5 pa5, l3f l3f) {
        this.e = tue;
        this.a.i(pa5, l3f);
    }

    public final void c(int i2, wpa wpa) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        wpa wpa2 = wpa;
        fm9.l(this.e);
        int i7 = i2 & 1;
        dw4 dw4 = this.a;
        int i8 = -1;
        int i9 = 3;
        int i10 = 2;
        boolean z2 = false;
        if (i7 != 0) {
            int i11 = this.c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    z04.c0("Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.j != -1) {
                        z04.c0("Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    dw4.e(wpa2.c == 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i12 = i2;
        while (wpa.a() > 0) {
            int i13 = this.c;
            if (i13 != 0) {
                s02 s02 = this.b;
                if (i13 == 1) {
                    i5 = i9;
                    boolean z3 = z2;
                    if (d(wpa2, s02.b, 9)) {
                        s02.q(z3 ? 1 : 0);
                        int i14 = s02.i(24);
                        if (i14 != 1) {
                            ey8.k(i14, "Unexpected start code prefix: ");
                            this.j = -1;
                            i4 = -1;
                            i6 = 0;
                            i3 = 2;
                        } else {
                            s02.t(8);
                            int i15 = s02.i(16);
                            s02.t(5);
                            this.k = s02.h();
                            i3 = 2;
                            s02.t(2);
                            this.f = s02.h();
                            this.g = s02.h();
                            s02.t(6);
                            int i16 = s02.i(8);
                            this.i = i16;
                            if (i15 == 0) {
                                this.j = -1;
                                i4 = -1;
                            } else {
                                int i17 = (i15 - 3) - i16;
                                this.j = i17;
                                if (i17 < 0) {
                                    z04.c0("Found negative packet payload size: " + this.j);
                                    i4 = -1;
                                    this.j = -1;
                                } else {
                                    i4 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.c = i6;
                        z = false;
                        this.d = 0;
                    } else {
                        z = z3;
                        i4 = -1;
                        i3 = 2;
                    }
                } else if (i13 == i10) {
                    if (!d(wpa2, s02.b, Math.min(10, this.i)) || !d(wpa2, (byte[]) null, this.i)) {
                        i5 = i9;
                        i4 = -1;
                        boolean z4 = z2;
                        i3 = i10;
                        z = z4;
                    } else {
                        s02.q(z2 ? 1 : 0);
                        this.l = -9223372036854775807L;
                        int i18 = 4;
                        if (this.f) {
                            s02.t(4);
                            s02.t(1);
                            long i19 = (long) (s02.i(15) << 15);
                            s02.t(1);
                            long i20 = i19 | (((long) s02.i(i9)) << 30) | ((long) s02.i(15));
                            s02.t(1);
                            if (!this.h && this.g) {
                                s02.t(4);
                                s02.t(1);
                                long i21 = (long) (s02.i(15) << 15);
                                s02.t(1);
                                s02.t(1);
                                this.e.b(i21 | (((long) s02.i(i9)) << 30) | ((long) s02.i(15)));
                                this.h = true;
                            }
                            this.l = this.e.b(i20);
                        }
                        if (!this.k) {
                            i18 = 0;
                        }
                        i12 |= i18;
                        dw4.g(i12, this.l);
                        this.c = 3;
                        this.d = 0;
                        z2 = false;
                        i10 = 2;
                        i9 = 3;
                        i8 = -1;
                    }
                } else if (i13 == i9) {
                    int a2 = wpa.a();
                    int i22 = this.j;
                    int i23 = i22 == i8 ? z2 : a2 - i22;
                    if (i23 > 0) {
                        a2 -= i23;
                        wpa2.F(wpa2.b + a2);
                    }
                    dw4.d(wpa2);
                    int i24 = this.j;
                    if (i24 != i8) {
                        int i25 = i24 - a2;
                        this.j = i25;
                        if (i25 == 0) {
                            dw4.e(z2);
                            this.c = 1;
                            this.d = z2;
                        }
                    }
                    int i26 = i9;
                    i4 = i8;
                    i5 = i26;
                    boolean z5 = z2;
                    i3 = i10;
                    z = z5;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int i27 = i9;
                i4 = i8;
                i5 = i27;
                boolean z6 = z2;
                i3 = i10;
                z = z6;
                wpa2.H(wpa.a());
            }
            int i28 = i4;
            i9 = i5;
            i8 = i28;
            int i29 = i3;
            z2 = z;
            i10 = i29;
        }
    }

    public final boolean d(wpa wpa, byte[] bArr, int i2) {
        int min = Math.min(wpa.a(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wpa.H(min);
        } else {
            wpa.e(this.d, bArr, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }
}
