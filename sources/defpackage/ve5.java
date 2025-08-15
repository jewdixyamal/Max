package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ve5  reason: default package */
public final class ve5 implements b71 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onFeedback(a71 a71) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b71) it.next()).onFeedback(a71);
        }
    }
}
