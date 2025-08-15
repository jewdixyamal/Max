package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: hp7  reason: default package */
public final class hp7 implements pi4 {
    public final jqe a;
    public final k56 b;
    public final m56 c;
    public final int d;
    public final m56 e;
    public final long f;
    public final q0e g;
    public final w7c h;

    public hp7(jqe jqe, k56 k56, m56 m56, int i, int i2) {
        i = (i2 & 8) != 0 ? 0 : i;
        this.a = jqe;
        this.b = k56;
        this.c = m56;
        this.d = i;
        this.e = null;
        this.f = ei4.b.incrementAndGet();
        q0e a2 = r0e.a(e());
        this.g = a2;
        this.h = new w7c(a2);
    }

    public final j0e c() {
        return this.h;
    }

    public final void d(b54 b54) {
        if (ei4.a(b54.a, this.f)) {
            k56 k56 = this.b;
            this.c.invoke(Boolean.valueOf(!((Boolean) k56.invoke()).booleanValue()));
            this.g.m((Object) null, e());
            m56 m56 = this.e;
            if (m56 != null) {
                m56.invoke(k56.invoke());
            }
        }
    }

    public final List e() {
        a54 a54 = new a54(((Boolean) this.b.invoke()).booleanValue());
        return Collections.singletonList(new b54(this.f, this.a, this.d, (jqe) null, a54, 8));
    }
}
