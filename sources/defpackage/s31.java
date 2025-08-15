package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: s31  reason: default package */
public final class s31 implements r31 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onDecorativeParticipantIdChanged(q31 q31) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r31) it.next()).onDecorativeParticipantIdChanged(q31);
        }
    }
}
