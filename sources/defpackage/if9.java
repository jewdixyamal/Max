package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: if9  reason: default package */
public final class if9 extends gle {
    public int X;
    public List c;
    public long o;

    public if9(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1081306054:
                if (str.equals("marker")) {
                    c2 = 0;
                    break;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    c2 = 1;
                    break;
                }
                break;
            case 110549828:
                if (str.equals("total")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = lz7.M(gy8, 0);
                return;
            case 1:
                this.c = wz.f(gy8);
                return;
            case 2:
                this.X = lz7.L(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        int o2 = s5c.o(this.c);
        long j = this.o;
        int i = this.X;
        return "{result=" + o2 + ", marker=" + j + ", total=" + i + "}";
    }
}
