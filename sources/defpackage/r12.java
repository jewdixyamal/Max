package defpackage;

import java.util.Collections;

/* renamed from: r12  reason: default package */
public final class r12 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public r12(je7 je7, je7 je72, je7 je73) {
        this.a = je73;
        this.b = je7;
        this.c = je72;
    }

    public final Long a(long j, String str, a20 a20) {
        je7 je7 = this.a;
        ((jz2) ((iy2) je7.getValue())).l().c(j, v82.b);
        if (((jz2) ((iy2) je7.getValue())).f(j, new q12()) == null) {
            return new Long(0);
        }
        ((av0) this.c.getValue()).c(new vz2(Collections.singletonList(new Long(j)), false, false, (mg4) null, (h9b) null, 124));
        k4a k4a = (k4a) ((pk) this.b.getValue());
        return new Long(((s8g) k4a.e.getValue()).b(new s12(((p7b) k4a.y()).a.o(), str, j, a20, pag.u(str))));
    }
}
