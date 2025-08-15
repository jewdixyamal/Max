package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ahe  reason: default package */
public final class ahe extends gle {
    public List c;
    public Map o;

    public ahe(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyMap();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("phones")) {
            this.o = new HashMap();
            int N = lz7.N(gy8);
            for (int i = 0; i < N; i++) {
                this.o.put(gy8.z0(), Long.valueOf(gy8.w0()));
            }
        } else if (!str.equals("contacts")) {
            gy8.z();
        } else {
            this.c = wz.c(gy8);
        }
    }

    public final String toString() {
        return wg0.h("{contacts=", s5c.o(this.c), ", phones=", s5c.S(this.o), "}");
    }
}
