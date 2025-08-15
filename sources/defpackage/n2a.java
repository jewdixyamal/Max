package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* renamed from: n2a  reason: default package */
public final class n2a {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final Object g;

    public n2a(int i) {
        switch (i) {
            case 1:
                this.f = new int[255];
                this.g = new wpa(255);
                return;
            default:
                this.f = new int[255];
                this.g = new yaf(255);
                return;
        }
    }

    public boolean a(ra4 ra4, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        yaf yaf = (yaf) this.g;
        yaf.E(27);
        try {
            z2 = ra4.q(yaf.a, 0, 27, z);
        } catch (EOFException e2) {
            if (z) {
                z2 = false;
            } else {
                throw e2;
            }
        }
        if (!z2 || yaf.w() != 1332176723) {
            return false;
        }
        if (yaf.v() == 0) {
            this.a = yaf.v();
            this.b = yaf.k();
            yaf.m();
            yaf.m();
            yaf.m();
            int v = yaf.v();
            this.c = v;
            this.d = v + 27;
            yaf.E(v);
            try {
                z3 = ra4.q(yaf.a, 0, this.c, z);
            } catch (EOFException e3) {
                if (z) {
                    z3 = false;
                } else {
                    throw e3;
                }
            }
            if (!z3) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                int v2 = yaf.v();
                this.f[i] = v2;
                this.e += v2;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw ParserException.c("unsupported bit stream revision");
        }
    }

    public boolean b(sa4 sa4, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        wpa wpa = (wpa) this.g;
        wpa.D(27);
        try {
            z2 = sa4.q(wpa.a, 0, 27, z);
        } catch (EOFException e2) {
            if (z) {
                z2 = false;
            } else {
                throw e2;
            }
        }
        if (!z2 || wpa.w() != 1332176723) {
            return false;
        }
        if (wpa.u() == 0) {
            this.a = wpa.u();
            this.b = wpa.j();
            wpa.l();
            wpa.l();
            wpa.l();
            int u = wpa.u();
            this.c = u;
            this.d = u + 27;
            wpa.D(u);
            try {
                z3 = sa4.q(wpa.a, 0, this.c, z);
            } catch (EOFException e3) {
                if (z) {
                    z3 = false;
                } else {
                    throw e3;
                }
            }
            if (!z3) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                int u2 = wpa.u();
                this.f[i] = u2;
                this.e += u2;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw androidx.media3.common.ParserException.c("unsupported bit stream revision");
        }
    }

    public boolean c(ra4 ra4, long j) {
        int i;
        boolean z;
        np8.d(ra4.o == ra4.r());
        yaf yaf = (yaf) this.g;
        yaf.E(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && ra4.o + 4 >= j) {
                break;
            }
            try {
                z = ra4.q(yaf.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            yaf.H(0);
            if (yaf.w() == 1332176723) {
                ra4.Y = 0;
                return true;
            }
            ra4.z(1);
        }
        do {
            if ((i != 0 && ra4.o >= j) || ra4.g() == -1) {
                return false;
            }
            break;
        } while (ra4.g() == -1);
        return false;
    }

    public boolean d(sa4 sa4, long j) {
        int i;
        boolean z;
        fm9.f(sa4.o == sa4.r());
        wpa wpa = (wpa) this.g;
        wpa.D(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && sa4.o + 4 >= j) {
                break;
            }
            try {
                z = sa4.q(wpa.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            wpa.G(0);
            if (wpa.w() == 1332176723) {
                sa4.Y = 0;
                return true;
            }
            sa4.z(1);
        }
        do {
            if ((i != 0 && sa4.o >= j) || sa4.g(1) == -1) {
                return false;
            }
            break;
        } while (sa4.g(1) == -1);
        return false;
    }
}
