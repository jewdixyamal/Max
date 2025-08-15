package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bbd  reason: default package */
public final class bbd implements ml1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(qz7 qz7) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ml1) it.next()).a(qz7);
        }
    }
}
