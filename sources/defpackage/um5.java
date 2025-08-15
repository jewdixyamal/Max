package defpackage;

import java.util.Iterator;

/* renamed from: um5  reason: default package */
public final class um5 implements c6d {
    public final c6d a;
    public final m56 b;
    public final m56 c;

    public um5(c6d c6d, m56 m56, m56 m562) {
        this.a = c6d;
        this.b = m56;
        this.c = m562;
    }

    public final Iterator iterator() {
        return new pk5(this);
    }
}
