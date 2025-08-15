package defpackage;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.List;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: oq6  reason: default package */
public final class oq6 extends t1 {
    public static final byte[] t0 = {110, 117, 108, 108};
    public final MessageDigest X;
    public final xna Y;
    public int Z;
    public final OutputStream a;
    public final List b;
    public final String c;
    public final sh0 o = new sh0(18, (byte) 0);
    public boolean s0;

    /* JADX WARNING: type inference failed for: r5v1, types: [ju8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public oq6(java.io.OutputStream r3, java.util.ArrayList r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            sh0 r4 = new sh0
            r0 = 18
            r1 = 0
            r4.<init>((int) r0, (byte) r1)
            r2.o = r4
            g9f r4 = new g9f
            r4.<init>(r3)
            if (r5 == 0) goto L_0x0030
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0029 }
            r2.X = r3
            ju8 r5 = new ju8
            r5.<init>(r4, r3)
            r4 = r5
            goto L_0x0034
        L_0x0029:
            r2 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
        L_0x0030:
            hr9 r3 = defpackage.hr9.a
            r2.X = r3
        L_0x0034:
            xna r3 = new xna
            r3.<init>(r4)
            r2.Y = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq6.<init>(java.io.OutputStream, java.util.ArrayList, java.lang.String):void");
    }

    public final void a(String str) {
        m();
        xna xna = this.Y;
        xna.getClass();
        xna.write(str, 0, str.length());
    }

    public final void c0() {
        m();
        if (this.o.t() == 2) {
            this.X.update(t0);
            return;
        }
        xna xna = this.Y;
        xna.getClass();
        xna.write("null", 0, 4);
    }

    public final void close() {
        this.Y.close();
        int t = this.o.t();
        if (t != 0 && t != 2) {
            throw new IllegalStateException("Unfinished document");
        }
    }

    public final void flush() {
        this.Y.flush();
    }

    public final kb7 g0(String str) {
        int i;
        int t = this.o.t();
        if ((t == 0 || t == 2) && (i = this.Z) >= 0) {
            this.Z = -1;
            while (true) {
                List list = this.b;
                if (i >= list.size()) {
                    break;
                }
                o9e o9e = (o9e) list.get(i);
                int compareTo = str.compareTo(o9e.a);
                if (compareTo < 0) {
                    break;
                }
                if (compareTo > 0) {
                    o9e.a(this);
                }
                i++;
            }
            this.Z = i;
        }
        n(str);
        return this;
    }

    public final void i(String str) {
        m();
        int t = this.o.t();
        xna xna = this.Y;
        if (t == 2) {
            if (str.length() == 0) {
                this.X.update(t0);
            }
            xna.getClass();
            xna.write(str, 0, str.length());
            return;
        }
        ngg.L(str, xna);
    }

    public final void l(InputStreamReader inputStreamReader) {
        m();
        sh0 sh0 = this.o;
        int t = sh0.t();
        xna xna = this.Y;
        if (t == 2 || t == 5) {
            va7 va7 = new va7(inputStreamReader);
            kp.B(va7, xna);
            if (va7.S() != 0) {
                throw JsonSyntaxException.b((long) va7.o, va7.m(), va7.S());
            }
        } else if (t == 6 || t == 7) {
            va7 va72 = new va7(inputStreamReader);
            kp.B(va72, xna);
            while (va72.S() != 0) {
                va72.d(44);
                va72.a(xna);
                kp.B(va72, xna);
            }
        } else {
            throw new IllegalStateException("Nesting problem: ".concat(hx9.l(sh0)));
        }
    }

    public final void m() {
        sh0 sh0 = this.o;
        int t = sh0.t();
        if (t != 1) {
            xna xna = this.Y;
            if (t == 4) {
                sh0.v(5);
                xna.write(58);
            } else if (t == 6) {
                sh0.v(7);
            } else if (t == 7) {
                xna.write(44);
            } else {
                throw new IllegalStateException("Nesting problem: ".concat(hx9.l(sh0)));
            }
        } else {
            sh0.v(2);
            this.a.write(61);
            this.X.update((byte) 61);
        }
    }

    public final void n(String str) {
        sh0 sh0 = this.o;
        int t = sh0.t();
        xna xna = this.Y;
        if (t == 0) {
            sh0.v(1);
            xna.write(str);
        } else if (t == 5) {
            xna.write(44);
            sh0.v(4);
            ngg.L(str, xna);
        } else if (t == 2) {
            this.a.write(38);
            sh0.v(1);
            xna.write(str);
        } else if (t == 3) {
            sh0.v(4);
            ngg.L(str, xna);
        } else {
            throw new IllegalStateException("Nesting problem: ".concat(hx9.l(sh0)));
        }
    }

    public final void q() {
        sh0 sh0 = this.o;
        int t = sh0.t();
        if (t == 3 || t == 5) {
            sh0.u();
            this.Y.write(125);
            return;
        }
        throw new IllegalStateException("Nesting problem: ".concat(hx9.l(sh0)));
    }

    public final void s() {
        m();
        this.o.w(3);
        this.Y.write(123);
    }

    public final void t() {
        sh0 sh0 = this.o;
        int t = sh0.t();
        if (t == 6 || t == 7) {
            sh0.u();
            this.Y.write(93);
            return;
        }
        throw new IllegalStateException("Nesting problem: ".concat(hx9.l(sh0)));
    }

    public final void u() {
        m();
        this.o.w(6);
        this.Y.write(91);
    }
}
