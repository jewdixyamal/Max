package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: nf0  reason: default package */
public final class nf0 implements Iterable, qb7 {
    public final ArrayDeque a = new ArrayDeque();
    public ync b;

    public final coc a() {
        return (coc) this.a.peek();
    }

    public final coc b() {
        coc coc = (coc) this.a.pop();
        ync ync = this.b;
        if (ync != null) {
            ync.d();
        }
        coc.a.destroy();
        return coc;
    }

    public final Iterator c() {
        return x53.v0(this.a).iterator();
    }

    public final int getSize() {
        return this.a.size();
    }

    public final Iterator iterator() {
        return new u1(2, this.a.toArray(new coc[0]));
    }
}
