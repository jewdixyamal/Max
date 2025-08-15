package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ebd  reason: default package */
public final class ebd implements rl1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCurrentParticipantActiveRoomChanged(nl1 nl1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onCurrentParticipantActiveRoomChanged(nl1);
        }
    }

    public final void onCurrentParticipantInvitedToRoom(ol1 ol1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onCurrentParticipantInvitedToRoom(ol1);
        }
    }

    public final void onRoomRemoved(pl1 pl1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onRoomRemoved(pl1);
        }
    }

    public final void onRoomUpdated(ql1 ql1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rl1) it.next()).onRoomUpdated(ql1);
        }
    }
}
