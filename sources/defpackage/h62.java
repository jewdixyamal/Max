package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: h62  reason: default package */
public final class h62 extends gle {
    public List c;
    public HashMap o;

    public h62(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [df9, java.lang.Object] */
    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("commands")) {
            this.c = lz7.W(gy8, new Object());
        } else if (!str.equals("contacts")) {
            gy8.z();
        } else {
            this.o = new HashMap();
            int N = lz7.N(gy8);
            for (int i = 0; i < N; i++) {
                long w0 = gy8.w0();
                this.o.put(Long.valueOf(w0), wm3.e(gy8));
            }
        }
    }

    public final String toString() {
        return wg0.h("{commands=", s5c.o(this.c), ", contacts=", s5c.S(this.o), "}");
    }
}
