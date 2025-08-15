package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: m2a  reason: default package */
public final class m2a {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public final Object e;
    public final Object f;

    public m2a(vbg vbg, xag xag) {
        this.a = 2;
        this.f = vbg;
        this.b = xag.c;
        this.d |= (xag.a & 4) != 0;
        if ((xag.a & 4) != 0) {
            this.e = new ByteArrayOutputStream(600000);
        } else {
            this.e = new ByteArrayOutputStream(34000);
        }
        while (true) {
            ByteBuffer byteBuffer = xag.e;
            int min = Math.min(byteBuffer.remaining(), ((vbg) this.f).c.length);
            if (min == 0) {
                this.c = 1;
                return;
            } else {
                byteBuffer.get(((vbg) this.f).c, 0, min);
                ((ByteArrayOutputStream) this.e).write(((vbg) this.f).c, 0, min);
            }
        }
    }

    public int a(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                int i4 = 0;
                this.c = 0;
                do {
                    int i5 = this.c;
                    int i6 = i + i5;
                    n2a n2a = (n2a) this.e;
                    if (i6 < n2a.c) {
                        int[] iArr = n2a.f;
                        this.c = i5 + 1;
                        i2 = iArr[i5 + i];
                        i4 += i2;
                    }
                    return i4;
                } while (i2 == 255);
                return i4;
            default:
                int i7 = 0;
                this.c = 0;
                do {
                    int i8 = this.c;
                    int i9 = i + i8;
                    n2a n2a2 = (n2a) this.e;
                    if (i9 < n2a2.c) {
                        int[] iArr2 = n2a2.f;
                        this.c = i8 + 1;
                        i3 = iArr2[i8 + i];
                        i7 += i3;
                    }
                    return i7;
                } while (i3 == 255);
                return i7;
        }
    }

    public boolean b(ra4 ra4) {
        int i;
        np8.f(ra4 != null);
        boolean z = this.d;
        yaf yaf = (yaf) this.f;
        if (z) {
            this.d = false;
            yaf.E(0);
        }
        while (!this.d) {
            int i2 = this.b;
            n2a n2a = (n2a) this.e;
            if (i2 < 0) {
                if (n2a.c(ra4, -1) && n2a.a(ra4, true)) {
                    int i3 = n2a.d;
                    if ((n2a.a & 1) == 1 && yaf.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        ra4.z(i3);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.b);
            int i4 = this.b + this.c;
            if (a2 > 0) {
                yaf.d(yaf.c + a2);
                try {
                    ra4.h(yaf.a, yaf.c, a2, false);
                    yaf.G(yaf.c + a2);
                    this.d = n2a.f[i4 + -1] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == n2a.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public boolean c(sa4 sa4) {
        int i;
        fm9.k(sa4 != null);
        boolean z = this.d;
        wpa wpa = (wpa) this.f;
        if (z) {
            this.d = false;
            wpa.D(0);
        }
        while (!this.d) {
            int i2 = this.b;
            n2a n2a = (n2a) this.e;
            if (i2 < 0) {
                if (n2a.d(sa4, -1) && n2a.b(sa4, true)) {
                    int i3 = n2a.d;
                    if ((n2a.a & 1) == 1 && wpa.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        sa4.z(i3);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.b);
            int i4 = this.b + this.c;
            if (a2 > 0) {
                wpa.b(wpa.c + a2);
                try {
                    sa4.h(wpa.a, wpa.c, a2, false);
                    wpa.F(wpa.c + a2);
                    this.d = n2a.f[i4 + -1] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == n2a.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public m2a(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new n2a(1);
                this.f = new wpa(0, new byte[65025]);
                this.b = -1;
                return;
            default:
                this.e = new n2a(0);
                this.f = new yaf(0, new byte[65025]);
                this.b = -1;
                return;
        }
    }
}
