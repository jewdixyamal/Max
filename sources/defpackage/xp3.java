package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: xp3  reason: default package */
public final class xp3 extends gle {
    public Map c;
    public long o;

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("presence")) {
            this.c = new HashMap();
            int N = lz7.N(gy8);
            for (int i = 0; i < N; i++) {
                this.c.put(Long.valueOf(gy8.w0()), s7b.a(gy8));
            }
        } else if (!str.equals("time")) {
            gy8.z();
        } else {
            this.o = gy8.w0();
        }
    }

    public final String toString() {
        int S = s5c.S(this.c);
        long j = this.o;
        return "{presence=" + S + ", time=" + j + "}";
    }
}
