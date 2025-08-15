package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: x1e  reason: default package */
public final class x1e implements wm1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onMediaDataReceived(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wm1) it.next()).onMediaDataReceived(j);
        }
    }
}
