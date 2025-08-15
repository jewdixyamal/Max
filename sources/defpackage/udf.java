package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: udf  reason: default package */
public final class udf extends gle {
    public long X;
    public boolean Y;
    public List c;
    public long o;

    public udf(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [df9, java.lang.Object] */
    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -582276257:
                if (str.equals("forwardMarker")) {
                    c2 = 0;
                    break;
                }
                break;
            case 696739087:
                if (str.equals("hasMore")) {
                    c2 = 1;
                    break;
                }
                break;
            case 926934164:
                if (str.equals("history")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1024366077:
                if (str.equals("backwardMarker")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = lz7.M(gy8, 0);
                return;
            case 1:
                this.Y = lz7.H(gy8);
                return;
            case 2:
                this.c = lz7.W(gy8, new Object());
                return;
            case 3:
                this.X = lz7.M(gy8, 0);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        int o2 = s5c.o(this.c);
        long j = this.o;
        long j2 = this.X;
        boolean z = this.Y;
        StringBuilder sb = new StringBuilder("{calls=");
        sb.append(o2);
        sb.append(", forwardMarker=");
        sb.append(j);
        au1.q(j2, ", backwardMarker=", ", hasMore=", sb);
        return au1.j(sb, z, "}");
    }
}
