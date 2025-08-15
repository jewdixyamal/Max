package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: u0b  reason: default package */
public final class u0b {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public volatile zl4 f;

    public u0b(je7 je7, je7 je72, je7 je73, je7 je74, khe khe) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = khe;
    }

    public final void a() {
        zl4 zl4;
        hm9.m("u0b", "schedulePing", new Object[0]);
        zl4 zl42 = this.f;
        if (!(zl42 == null || zl42.h() || (zl4 = this.f) == null)) {
            zl4.g();
        }
        this.f = ((ztc) this.e.getValue()).a().c(new nn6(26, this), 29000, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        hm9.m("u0b", "startInteractivePings", new Object[0]);
        if (((f5a) this.c.getValue()).d()) {
            ((k4a) ((pk) this.a.getValue())).G(true);
        }
        a();
    }
}
