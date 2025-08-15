package defpackage;

import java.util.UUID;

/* renamed from: w99  reason: default package */
public final class w99 implements o9f {
    public final mi9 a;

    public w99() {
        mi9 b = mi9.b();
        b.j(o9f.i0, new Object());
        b.j(tu6.z, 34);
        Class<x99> cls = x99.class;
        b.j(cne.e0, cls);
        b.j(cne.d0, cls.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = b;
    }

    public final q9f N() {
        return q9f.Y;
    }

    public final ce3 getConfig() {
        return this.a;
    }
}
