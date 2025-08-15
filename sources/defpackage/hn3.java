package defpackage;

import java.util.List;

/* renamed from: hn3  reason: default package */
public final class hn3 extends gle {
    public List c;

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (!str.equals("contacts")) {
            gy8.z();
        } else {
            this.c = wz.c(gy8);
        }
    }

    public final String toString() {
        return wg0.g(s5c.o(this.c), "{contactInfos=", "}");
    }
}
