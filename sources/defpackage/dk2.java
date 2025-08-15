package defpackage;

import java.io.Serializable;

/* renamed from: dk2  reason: default package */
public final class dk2 implements Serializable {
    public final wm3 a;
    public final s7b b;
    public final long c;

    public dk2(wm3 wm3, s7b s7b, long j) {
        this.a = wm3;
        this.b = s7b;
        this.c = j;
    }

    public static dk2 a(gy8 gy8) {
        int N = lz7.N(gy8);
        wm3 wm3 = null;
        if (N == 0) {
            return null;
        }
        s7b s7b = null;
        long j = 0;
        for (int i = 0; i < N; i++) {
            String z0 = gy8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -1276666629:
                    if (z0.equals("presence")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -867755645:
                    if (z0.equals("readMark")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 951526432:
                    if (z0.equals("contact")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    s7b = s7b.a(gy8);
                    break;
                case 1:
                    j = lz7.M(gy8, 0);
                    break;
                case 2:
                    wm3 = wm3.e(gy8);
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        return new dk2(wm3, s7b, j);
    }
}
