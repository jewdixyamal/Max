package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: r7  reason: default package */
public final class r7 implements zy0 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onActiveParticipantUpdated(yy0 yy0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zy0) it.next()).onActiveParticipantUpdated(yy0);
        }
    }

    public final void onActiveParticipantsAdded(uy0 uy0) {
        if (!uy0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zy0) it.next()).onActiveParticipantsAdded(uy0);
            }
        }
    }

    public final void onActiveParticipantsChanged(vy0 vy0) {
        if (!vy0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zy0) it.next()).onActiveParticipantsChanged(vy0);
            }
        }
    }

    public final void onActiveParticipantsDeAnonimized(wy0 wy0) {
        if (!wy0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zy0) it.next()).onActiveParticipantsDeAnonimized(wy0);
            }
        }
    }

    public final void onActiveParticipantsRemoved(xy0 xy0) {
        if (!xy0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zy0) it.next()).onActiveParticipantsRemoved(xy0);
            }
        }
    }
}
