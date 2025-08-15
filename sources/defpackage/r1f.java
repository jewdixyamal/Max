package defpackage;

import java.util.Iterator;

/* renamed from: r1f  reason: default package */
public final class r1f implements c6d {
    public final c6d a;
    public final m56 b;

    public r1f(c6d c6d, m56 m56) {
        this.a = c6d;
        this.b = m56;
    }

    public final Iterator iterator() {
        return new q1f(this);
    }
}
