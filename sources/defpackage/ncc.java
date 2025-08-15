package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ncc  reason: default package */
public final class ncc implements qh1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onRecordStarted(oh1 oh1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qh1) it.next()).onRecordStarted(oh1);
        }
    }

    public final void onRecordStopped(ph1 ph1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qh1) it.next()).onRecordStopped(ph1);
        }
    }
}
