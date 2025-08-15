package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zjf  reason: default package */
public final class zjf extends gle {
    public long X;
    public Map c;
    public boolean o;

    public zjf(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyMap();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("startTime")) {
            this.X = lz7.M(gy8, 0);
        } else if (!str.equals("live")) {
            String P = lz7.P(gy8);
            if (!oag.t(P)) {
                if (this.c == null) {
                    this.c = new HashMap();
                }
                this.c.put(str, P);
            }
        } else {
            this.o = lz7.H(gy8);
        }
    }

    public final String toString() {
        int S = s5c.S(this.c);
        boolean z = this.o;
        long j = this.X;
        StringBuilder sb = new StringBuilder("{urls=");
        sb.append(S);
        sb.append(", live=");
        sb.append(z);
        sb.append(", startTime=");
        return zr6.k(sb, j, "}");
    }
}
