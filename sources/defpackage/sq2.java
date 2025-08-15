package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: sq2  reason: default package */
public final class sq2 extends gle {
    public String X;
    public List c;
    public int o;

    public sq2(gy8 gy8) {
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
                this.X = lz7.P(gy8);
                return;
            case 1:
                this.c = wz.f(gy8);
                return;
            case 2:
                this.o = gy8.v0();
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        int o2 = s5c.o(this.c);
        int i = this.o;
        return zr6.l(wg0.j("{result=", o2, ", total=", i, ", marker='"), this.X, "'}");
    }
}
