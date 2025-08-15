package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: j9f  reason: default package */
public final class j9f implements ao1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onUrlSharingInfoUpdated(zn1 zn1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ao1) it.next()).onUrlSharingInfoUpdated(zn1);
        }
    }
}
