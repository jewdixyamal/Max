package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: soc  reason: default package */
public final class soc implements yh1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onRtcStats(c4c c4c) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yh1) it.next()).onRtcStats(c4c);
        }
    }
}
