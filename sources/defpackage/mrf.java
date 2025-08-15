package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: mrf  reason: default package */
public final class mrf implements bq1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAttendee(mp1 mp1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onAttendee(mp1);
        }
    }

    public final void onFeedback(np1 np1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onFeedback(np1);
        }
    }

    public final void onHandUp(op1 op1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onHandUp(op1);
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    public final void onPromotionUpdated(pp1 pp1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bq1) it.next()).onPromotionUpdated(pp1);
        }
    }
}
