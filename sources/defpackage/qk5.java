package defpackage;

import java.util.Iterator;

/* renamed from: qk5  reason: default package */
public final class qk5 implements c6d {
    public final c6d a;
    public final boolean b;
    public final m56 c;

    public qk5(c6d c6d, boolean z, m56 m56) {
        this.a = c6d;
        this.b = z;
        this.c = m56;
    }

    public final Iterator iterator() {
        return new pk5(this);
    }
}
