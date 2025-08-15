package defpackage;

import java.util.Collections;

/* renamed from: gq3  reason: default package */
public final class gq3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public gq3(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
    }

    public final void a(long j) {
        String name = gq3.class.getName();
        hm9.m(name, "remove, id = " + j, new Object[0]);
        je7 je7 = this.a;
        el3 el3 = (el3) je7.getValue();
        ol3 ol3 = ol3.b;
        nl3 nl3 = nl3.b;
        el3.getClass();
        el3.c(j, new f9(ol3, 22, nl3));
        ((el3) je7.getValue()).r(j, true);
        int i = ft4.o;
        w7b w7b = (w7b) this.d.getValue();
        r7b r7b = new r7b(0, (int) ft4.i(z7.S(((hyc) ((q33) this.c.getValue())).n(), kt4.MILLISECONDS), kt4.SECONDS));
        w7b.getClass();
        w7b.k(Collections.singletonMap(Long.valueOf(j), r7b));
        k4a k4a = (k4a) ((pk) this.e.getValue());
        k4a.w(k4a, new sq3(3, ((p7b) k4a.y()).a.o(), j, (String) null, (String) null, (String) null, (String) null));
        ((ike) this.b.getValue()).f(Collections.singletonList(new Long(j)));
        el3 el32 = (el3) je7.getValue();
        el32.getClass();
        cqc.a(new dl3(0, j, 0, el32), el32.m, (f6) null, new un0(27), (ztc) null);
        ((av0) this.f.getValue()).c(new ps3(j));
    }
}
