package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: vad  reason: default package */
public final class vad implements ll1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(ph4 ph4) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ll1) it.next()).a(ph4);
        }
    }
}
