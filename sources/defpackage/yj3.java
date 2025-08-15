package defpackage;

import java.util.Collections;

/* renamed from: yj3  reason: default package */
public final class yj3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public yj3(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final void a(long j) {
        String name = yj3.class.getName();
        hm9.m(name, "add, id = " + j, new Object[0]);
        el3 el3 = (el3) this.a.getValue();
        ol3 ol3 = ol3.a;
        el3.getClass();
        el3.c(j, new f9(ol3, 22, (Object) null));
        k4a k4a = (k4a) ((pk) this.c.getValue());
        k4a.w(k4a, new sq3(4, ((p7b) k4a.y()).a.o(), j, (String) null, (String) null, (String) null, (String) null));
        ((ike) this.b.getValue()).f(Collections.singletonList(new Long(j)));
        ((av0) this.d.getValue()).c(new ps3(j));
    }
}
