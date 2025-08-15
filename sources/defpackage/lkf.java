package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lkf  reason: default package */
public final class lkf implements ep1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void r(y8 y8Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ep1) it.next()).r(y8Var);
        }
    }
}
