package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: xd3  reason: default package */
public final class xd3 extends t2 {
    public final a66 a;
    public final /* synthetic */ yd3 b;

    public xd3(yd3 yd3, a66 a66) {
        this.b = yd3;
        this.a = a66;
    }

    public final boolean add(Object obj) {
        Symbol symbol = zd3.a;
        throw new UnsupportedOperationException("not implemented");
    }

    public final int getSize() {
        return this.b.size();
    }

    public final Iterator iterator() {
        vd3 vd3 = (vd3) yd3.c.get(this.b);
        vd3.getClass();
        return new ud3(vd3, this.a);
    }
}
