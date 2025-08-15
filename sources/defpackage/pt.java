package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: pt  reason: default package */
public final class pt implements s01 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAsrDataPackage(st stVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s01) it.next()).onAsrDataPackage(stVar);
        }
    }
}
