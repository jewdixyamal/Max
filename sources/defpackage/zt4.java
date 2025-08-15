package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: zt4  reason: default package */
public final class zt4 implements cw4, dw4 {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public Object g;

    public zt4(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.g = new yze[list.size()];
                this.f = -9223372036854775807L;
                return;
            default:
                this.b = list;
                this.g = new xze[list.size()];
                this.f = -9223372036854775807L;
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            case 1:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            case 2:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
            default:
                this.c = false;
                this.f = -9223372036854775807L;
                return;
        }
    }

    public void d(wpa wpa) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 1:
                if (this.c) {
                    if (this.d == 2) {
                        if (wpa.a() == 0) {
                            z2 = false;
                        } else {
                            if (wpa.u() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (wpa.a() == 0) {
                            z = false;
                        } else {
                            if (wpa.u() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = wpa.b;
                    int a2 = wpa.a();
                    for (yze b2 : (yze[]) this.g) {
                        wpa.G(i);
                        b2.b(wpa, a2, 0);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                fm9.l((yze) this.g);
                if (this.c) {
                    int a3 = wpa.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(a3, 10 - i2);
                        byte[] bArr = wpa.a;
                        int i3 = wpa.b;
                        wpa wpa2 = (wpa) this.b;
                        System.arraycopy(bArr, i3, wpa2.a, this.e, min);
                        if (this.e + min == 10) {
                            wpa2.G(0);
                            if (73 == wpa2.u() && 68 == wpa2.u() && 51 == wpa2.u()) {
                                wpa2.H(3);
                                this.d = wpa2.t() + 10;
                            } else {
                                z04.c0("Discarding invalid ID3 tag");
                                this.c = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a3, this.d - this.e);
                    ((yze) this.g).b(wpa, min2, 0);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    public void e(boolean z) {
        int i;
        switch (this.a) {
            case 1:
                if (this.c) {
                    fm9.k(this.f != -9223372036854775807L);
                    for (yze a2 : (yze[]) this.g) {
                        a2.a(this.f, 1, this.e, 0, (wze) null);
                    }
                    this.c = false;
                    return;
                }
                return;
            default:
                fm9.l((yze) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    fm9.k(this.f != -9223372036854775807L);
                    ((yze) this.g).a(this.f, 1, this.d, 0, (wze) null);
                    this.c = false;
                    return;
                }
                return;
        }
    }

    public void f(yaf yaf) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.d == 2) {
                        if (yaf.c() == 0) {
                            z2 = false;
                        } else {
                            if (yaf.v() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (yaf.c() == 0) {
                            z = false;
                        } else {
                            if (yaf.v() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    int i = yaf.b;
                    int c2 = yaf.c();
                    for (xze c3 : (xze[]) this.g) {
                        yaf.H(i);
                        c3.c(c2, yaf);
                    }
                    this.e += c2;
                    return;
                }
                return;
            default:
                np8.g((xze) this.g);
                if (this.c) {
                    int c4 = yaf.c();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int min = Math.min(c4, 10 - i2);
                        byte[] bArr = yaf.a;
                        int i3 = yaf.b;
                        yaf yaf2 = (yaf) this.b;
                        System.arraycopy(bArr, i3, yaf2.a, this.e, min);
                        if (this.e + min == 10) {
                            yaf2.H(0);
                            if (73 == yaf2.v() && 68 == yaf2.v() && 51 == yaf2.v()) {
                                yaf2.I(3);
                                this.d = yaf2.u() + 10;
                            } else {
                                this.c = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(c4, this.d - this.e);
                    ((xze) this.g).c(min2, yaf);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            case 1:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            case 2:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
            default:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public void h() {
        int i;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.f != -9223372036854775807L) {
                        for (xze b2 : (xze[]) this.g) {
                            b2.b(this.f, 1, this.e, 0, (vze) null);
                        }
                    }
                    this.c = false;
                    return;
                }
                return;
            default:
                np8.g((xze) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    long j = this.f;
                    if (j != -9223372036854775807L) {
                        ((xze) this.g).b(j, 1, i, 0, (vze) null);
                    }
                    this.c = false;
                    return;
                }
                return;
        }
    }

    public void i(pa5 pa5, l3f l3f) {
        switch (this.a) {
            case 1:
                int i = 0;
                while (true) {
                    yze[] yzeArr = (yze[]) this.g;
                    if (i < yzeArr.length) {
                        k3f k3f = (k3f) ((List) this.b).get(i);
                        l3f.a();
                        l3f.b();
                        yze B = pa5.B(l3f.e, 3);
                        ny5 ny5 = new ny5();
                        l3f.b();
                        ny5.a = l3f.f;
                        ny5.m = ia9.l("application/dvbsubs");
                        ny5.p = Collections.singletonList(k3f.b);
                        ny5.d = k3f.a;
                        B.e(new qy5(ny5));
                        yzeArr[i] = B;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                l3f.a();
                l3f.b();
                yze B2 = pa5.B(l3f.e, 5);
                this.g = B2;
                ny5 ny52 = new ny5();
                l3f.b();
                ny52.a = l3f.f;
                ny52.m = ia9.l("application/id3");
                B2.e(new qy5(ny52));
                return;
        }
    }

    public void j(oa5 oa5, l3f l3f) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    xze[] xzeArr = (xze[]) this.g;
                    if (i < xzeArr.length) {
                        j3f j3f = (j3f) ((List) this.b).get(i);
                        l3f.a();
                        l3f.b();
                        xze B = oa5.B(l3f.e, 3);
                        my5 my5 = new my5();
                        l3f.b();
                        my5.a = l3f.f;
                        my5.k = "application/dvbsubs";
                        my5.m = Collections.singletonList(j3f.b);
                        my5.c = j3f.a;
                        B.d(new oy5(my5));
                        xzeArr[i] = B;
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                l3f.a();
                l3f.b();
                xze B2 = oa5.B(l3f.e, 5);
                this.g = B2;
                my5 my52 = new my5();
                l3f.b();
                my52.a = l3f.f;
                my52.k = "application/id3";
                B2.d(new oy5(my52));
                return;
        }
    }

    public zt4(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new wpa(10);
                this.f = -9223372036854775807L;
                return;
            default:
                this.b = new yaf(10);
                this.f = -9223372036854775807L;
                return;
        }
    }
}
