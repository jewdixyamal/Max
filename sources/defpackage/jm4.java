package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: jm4  reason: default package */
public final class jm4 extends q1 {
    public final HashSet X = new HashSet();
    public final Iterator c;
    public final m56 o;

    public jm4(Iterator it, pz2 pz2) {
        this.c = it;
        this.o = pz2;
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.a = 2;
                return;
            }
        } while (!this.X.add(this.o.invoke(next)));
        this.b = next;
        this.a = 1;
    }
}
