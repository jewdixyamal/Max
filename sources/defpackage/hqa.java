package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: hqa  reason: default package */
public final class hqa implements jg1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onStateChanged(bg1 bg1, dg1 dg1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jg1) it.next()).onStateChanged(bg1, dg1);
        }
    }
}
