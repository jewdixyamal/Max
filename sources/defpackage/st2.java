package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: st2  reason: default package */
public final class st2 extends gle {
    public List c;
    public long o;

    public st2(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = gy8.w0();
        } else if (!str.equals("chats")) {
            gy8.z();
        } else {
            this.c = wz.b(gy8);
        }
    }

    public final String toString() {
        long j = this.o;
        int o2 = s5c.o(this.c);
        return "marker=" + j + ", chats=" + o2;
    }
}
