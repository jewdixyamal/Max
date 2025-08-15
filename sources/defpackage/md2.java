package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: md2  reason: default package */
public final class md2 implements a31 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onNewMessage(jz6 jz6) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a31) it.next()).onNewMessage(jz6);
        }
    }
}
