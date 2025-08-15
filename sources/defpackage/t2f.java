package defpackage;

import java.util.Iterator;

/* renamed from: t2f  reason: default package */
public final class t2f extends p2f {
    public boolean b;
    public Iterator c;
    public final /* synthetic */ jj5 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t2f(jj5 jj5, Object obj) {
        super(obj);
        this.d = jj5;
        c6d c6d = jj5.X;
    }

    public final Object a() {
        a66 a66;
        boolean z = this.b;
        jj5 jj5 = this.d;
        Object obj = this.a;
        if (!z) {
            m56 m56 = ((v2f) jj5.X).d;
            if (m56 != null && !((Boolean) m56.invoke(obj)).booleanValue()) {
                return null;
            }
            this.b = true;
            return obj;
        }
        Iterator it = this.c;
        if (it == null || it.hasNext()) {
            if (this.c == null) {
                c6d c6d = (c6d) ((v2f) jj5.X).b.invoke(obj);
                Iterator it2 = c6d != null ? c6d.iterator() : null;
                this.c = it2;
                if (it2 == null && (a66 = ((v2f) jj5.X).f) != null) {
                    a66.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
                }
                Iterator it3 = this.c;
                if (it3 == null || !it3.hasNext()) {
                    m56 m562 = ((v2f) jj5.X).e;
                    if (m562 != null) {
                        m562.invoke(obj);
                    }
                    return null;
                }
            }
            return this.c.next();
        }
        m56 m563 = ((v2f) jj5.X).e;
        if (m563 == null) {
            return null;
        }
        m563.invoke(obj);
        return null;
    }
}
