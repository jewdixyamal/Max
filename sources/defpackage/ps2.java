package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ps2  reason: default package */
public final class ps2 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ps2(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    public final void a(long j, long j2, Continuation continuation) {
        ((ad) this.a.getValue()).f("ACTION_MSG_UNPIN");
        k4a k4a = (k4a) ((pk) this.b.getValue());
        if (k4a.o(j)) {
            rs2 rs2 = r1;
            rs2 rs22 = new rs2(((p7b) k4a.y()).a.o(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, (String) null, (String) null, (a20) null, -1L, false, 0);
            k4a.w(k4a, rs2);
        }
        p82 l = ((jz2) ((iy2) this.c.getValue())).l();
        Long l2 = new Long(j);
        l.getClass();
        l.c(l2.longValue(), v82.o);
        l.h(l2.longValue(), false, new un0(17));
    }
}
