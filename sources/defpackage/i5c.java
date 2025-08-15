package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* renamed from: i5c  reason: default package */
public final class i5c implements ka5 {
    public final oy5 a;
    public final yaf b = new yaf(9);
    public xze c;
    public int d = 0;
    public int e;
    public long f;
    public int g;
    public int h;

    public i5c(oy5 oy5) {
        this.a = oy5;
    }

    public final void d(long j, long j2) {
        this.d = 0;
    }

    public final void g(oa5 oa5) {
        oa5.M(new pm5(-9223372036854775807L));
        xze B = oa5.B(0, 3);
        this.c = B;
        B.d(this.a);
        oa5.w();
    }

    public final boolean h(ma5 ma5) {
        yaf yaf = this.b;
        yaf.E(8);
        ((ra4) ma5).q(yaf.a, 0, 8, false);
        return yaf.h() == 1380139777;
    }

    public final int i(ma5 ma5, lh4 lh4) {
        np8.g(this.c);
        while (true) {
            int i = this.d;
            yaf yaf = this.b;
            if (i == 0) {
                yaf.E(8);
                if (!((ra4) ma5).h(yaf.a, 0, 8, true)) {
                    return -1;
                }
                if (yaf.h() == 1380139777) {
                    this.e = yaf.v();
                    this.d = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i == 1) {
                int i2 = this.e;
                if (i2 == 0) {
                    yaf.E(5);
                    if (!((ra4) ma5).h(yaf.a, 0, 5, true)) {
                        break;
                    }
                    this.f = (yaf.w() * 1000) / 45;
                    this.g = yaf.v();
                    this.h = 0;
                    this.d = 2;
                } else if (i2 == 1) {
                    yaf.E(9);
                    if (!((ra4) ma5).h(yaf.a, 0, 9, true)) {
                        break;
                    }
                    this.f = yaf.p();
                    this.g = yaf.v();
                    this.h = 0;
                    this.d = 2;
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported version number: ");
                    sb.append(i2);
                    throw ParserException.a((RuntimeException) null, sb.toString());
                }
            } else if (i == 2) {
                while (this.g > 0) {
                    yaf.E(3);
                    ((ra4) ma5).h(yaf.a, 0, 3, false);
                    this.c.c(3, yaf);
                    this.h += 3;
                    this.g--;
                }
                int i3 = this.h;
                if (i3 > 0) {
                    this.c.b(this.f, 1, i3, 0, (vze) null);
                }
                this.d = 1;
                return 0;
            } else {
                throw new IllegalStateException();
            }
        }
        this.d = 0;
        return -1;
    }

    public final void release() {
    }
}
