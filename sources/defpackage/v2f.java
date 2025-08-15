package defpackage;

import java.util.Iterator;

/* renamed from: v2f  reason: default package */
public final class v2f implements c6d {
    public final Object a;
    public final m56 b;
    public final int c = 1;
    public final m56 d;
    public final m56 e;
    public final a66 f;
    public final int g;

    public v2f(Object obj, m56 m56, m56 m562) {
        this.a = obj;
        this.b = m56;
        this.d = m562;
        this.e = null;
        this.f = null;
        this.g = Integer.MAX_VALUE;
    }

    public final Iterator iterator() {
        return new jj5(this);
    }
}
