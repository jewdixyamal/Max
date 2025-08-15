package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ot  reason: default package */
public final class ot implements r01 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAsrRecordStarted(p01 p01) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r01) it.next()).onAsrRecordStarted(p01);
        }
    }

    public final void onAsrRecordStopped(q01 q01) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r01) it.next()).onAsrRecordStopped(q01);
        }
    }
}
