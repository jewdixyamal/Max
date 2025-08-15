package defpackage;

import java.util.Arrays;
import org.webrtc.EglBase;

/* renamed from: m07  reason: default package */
public final class m07 extends qw8 {
    public static volatile m07[] u;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public long l = 0;
    public long m = 0;
    public String n = "";
    public byte[] o = nd7.g;
    public String p = "";
    public q07[] q = q07.a();
    public long r = 0;
    public String s = "";
    public boolean t = false;

    public m07() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long j2 = this.a;
        int i2 = 0;
        int h2 = j2 != 0 ? y43.h(1, j2) : 0;
        if (!this.b.equals("")) {
            h2 += y43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += y43.l(3, this.c);
        }
        if (!this.d.equals("")) {
            h2 += y43.l(4, this.d);
        }
        if (!this.e.equals("")) {
            h2 += y43.l(5, this.e);
        }
        long j3 = this.f;
        if (j3 != 0) {
            h2 += y43.k(j3) + y43.m(6);
        }
        int i3 = this.g;
        if (i3 != 0) {
            h2 += y43.f(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            h2 += y43.f(8, i4);
        }
        if (this.i) {
            h2 += y43.a(9);
        }
        if (this.j) {
            h2 += y43.a(10);
        }
        if (this.k) {
            h2 += y43.a(11);
        }
        long j4 = this.l;
        if (j4 != 0) {
            h2 += y43.k(j4) + y43.m(12);
        }
        long j5 = this.m;
        if (j5 != 0) {
            h2 += y43.h(13, j5);
        }
        if (!this.n.equals("")) {
            h2 += y43.l(14, this.n);
        }
        if (!Arrays.equals(this.o, nd7.g)) {
            h2 += y43.b(15, this.o);
        }
        if (!this.p.equals("")) {
            h2 += y43.l(16, this.p);
        }
        q07[] q07Arr = this.q;
        if (q07Arr != null && q07Arr.length > 0) {
            while (true) {
                q07[] q07Arr2 = this.q;
                if (i2 >= q07Arr2.length) {
                    break;
                }
                q07 q07 = q07Arr2[i2];
                if (q07 != null) {
                    h2 = y43.i(17, q07) + h2;
                }
                i2++;
            }
        }
        long j6 = this.r;
        if (j6 != 0) {
            h2 += y43.h(18, j6);
        }
        if (!this.s.equals("")) {
            h2 += y43.l(19, this.s);
        }
        return this.t ? h2 + y43.a(20) : h2;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s2 = x43.s();
            switch (s2) {
                case 0:
                    break;
                case 8:
                    this.a = x43.q();
                    continue;
                case 18:
                    this.b = x43.r();
                    continue;
                case 26:
                    this.c = x43.r();
                    continue;
                case 34:
                    this.d = x43.r();
                    continue;
                case 42:
                    this.e = x43.r();
                    continue;
                case 48:
                    this.f = x43.q();
                    continue;
                case 56:
                    this.g = x43.p();
                    continue;
                case EglBase.EGL_OPENGL_ES3_BIT /*64*/:
                    this.h = x43.p();
                    continue;
                case 72:
                    this.i = x43.f();
                    continue;
                case 80:
                    this.j = x43.f();
                    continue;
                case 88:
                    this.k = x43.f();
                    continue;
                case 96:
                    this.l = x43.q();
                    continue;
                case 104:
                    this.m = x43.q();
                    continue;
                case 114:
                    this.n = x43.r();
                    continue;
                case 122:
                    this.o = x43.g();
                    continue;
                case 130:
                    this.p = x43.r();
                    continue;
                case 138:
                    int w = nd7.w(x43, 138);
                    q07[] q07Arr = this.q;
                    int length = q07Arr == null ? 0 : q07Arr.length;
                    int i2 = w + length;
                    q07[] q07Arr2 = new q07[i2];
                    if (length != 0) {
                        System.arraycopy(q07Arr, 0, q07Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        q07 q07 = new q07();
                        q07Arr2[length] = q07;
                        x43.j(q07);
                        x43.s();
                        length++;
                    }
                    q07 q072 = new q07();
                    q07Arr2[length] = q072;
                    x43.j(q072);
                    this.q = q07Arr2;
                    continue;
                case 144:
                    this.r = x43.q();
                    continue;
                case 154:
                    this.s = x43.r();
                    continue;
                case 160:
                    this.t = x43.f();
                    continue;
                default:
                    if (!x43.u(s2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        long j2 = this.a;
        if (j2 != 0) {
            y43.x(1, j2);
        }
        if (!this.b.equals("")) {
            y43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            y43.E(3, this.c);
        }
        if (!this.d.equals("")) {
            y43.E(4, this.d);
        }
        if (!this.e.equals("")) {
            y43.E(5, this.e);
        }
        long j3 = this.f;
        int i2 = 0;
        if (j3 != 0) {
            y43.F(6, 0);
            y43.D(j3);
        }
        int i3 = this.g;
        if (i3 != 0) {
            y43.w(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            y43.w(8, i4);
        }
        boolean z = this.i;
        if (z) {
            y43.r(9, z);
        }
        boolean z2 = this.j;
        if (z2) {
            y43.r(10, z2);
        }
        boolean z3 = this.k;
        if (z3) {
            y43.r(11, z3);
        }
        long j4 = this.l;
        if (j4 != 0) {
            y43.F(12, 0);
            y43.D(j4);
        }
        long j5 = this.m;
        if (j5 != 0) {
            y43.x(13, j5);
        }
        if (!this.n.equals("")) {
            y43.E(14, this.n);
        }
        if (!Arrays.equals(this.o, nd7.g)) {
            y43.s(15, this.o);
        }
        if (!this.p.equals("")) {
            y43.E(16, this.p);
        }
        q07[] q07Arr = this.q;
        if (q07Arr != null && q07Arr.length > 0) {
            while (true) {
                q07[] q07Arr2 = this.q;
                if (i2 >= q07Arr2.length) {
                    break;
                }
                q07 q07 = q07Arr2[i2];
                if (q07 != null) {
                    y43.y(17, q07);
                }
                i2++;
            }
        }
        long j6 = this.r;
        if (j6 != 0) {
            y43.x(18, j6);
        }
        if (!this.s.equals("")) {
            y43.E(19, this.s);
        }
        boolean z4 = this.t;
        if (z4) {
            y43.r(20, z4);
        }
    }
}
