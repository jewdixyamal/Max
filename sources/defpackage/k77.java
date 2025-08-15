package defpackage;

import java.util.Iterator;

/* renamed from: k77  reason: default package */
public final class k77 extends ns5 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ a7b b;

    public k77(Iterable iterable, a7b a7b) {
        this.a = iterable;
        this.b = a7b;
    }

    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        a7b a7b = this.b;
        a7b.getClass();
        return new l77(it, a7b);
    }
}
