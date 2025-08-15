package defpackage;

import java.util.Iterator;

/* renamed from: r2f  reason: default package */
public final class r2f extends p2f {
    public final Iterator b;

    public r2f(jj5 jj5, Object obj) {
        super(obj);
        c6d c6d = (c6d) ((v2f) jj5.X).b.invoke(obj);
        this.b = c6d != null ? c6d.iterator() : null;
    }

    public final Object a() {
        Iterator it = this.b;
        if (it == null || !it.hasNext()) {
            return null;
        }
        return it.next();
    }
}
