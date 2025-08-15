package defpackage;

import java.util.Iterator;

/* renamed from: q2f  reason: default package */
public final class q2f extends p2f {
    public boolean b;
    public Iterator c;
    public boolean d;
    public final /* synthetic */ jj5 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q2f(jj5 jj5, Object obj) {
        super(obj);
        this.e = jj5;
        c6d c6d = jj5.X;
    }

    public final Object a() {
        boolean z = this.d;
        jj5 jj5 = this.e;
        Object obj = this.a;
        if (!z && this.c == null) {
            m56 m56 = ((v2f) jj5.X).d;
            if (m56 != null && !((Boolean) m56.invoke(obj)).booleanValue()) {
                return null;
            }
            c6d c6d = (c6d) ((v2f) jj5.X).b.invoke(obj);
            Iterator it = c6d != null ? c6d.iterator() : null;
            this.c = it;
            if (it == null) {
                a66 a66 = ((v2f) jj5.X).f;
                if (a66 != null) {
                    a66.invoke(obj, new IllegalStateException("Cannot list leafs of " + obj));
                }
                this.d = true;
            }
        }
        Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            return this.c.next();
        }
        if (!this.b) {
            this.b = true;
            return obj;
        }
        m56 m562 = ((v2f) jj5.X).e;
        if (m562 == null) {
            return null;
        }
        m562.invoke(obj);
        return null;
    }
}
