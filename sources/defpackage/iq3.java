package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iq3  reason: default package */
public final class iq3 extends gle {
    public List c;
    public int o;

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("result")) {
            int i = wz.a;
            int G = lz7.G(gy8);
            ArrayList arrayList = new ArrayList(G);
            for (int i2 = 0; i2 < G; i2++) {
                arrayList.add(kq3.a(gy8));
            }
            this.c = arrayList;
        } else if (!str.equals("total")) {
            gy8.z();
        } else {
            this.o = gy8.v0();
        }
    }

    public final String toString() {
        return wg0.h("{contacts=", s5c.o(this.c), ", total=", this.o, "}");
    }
}
