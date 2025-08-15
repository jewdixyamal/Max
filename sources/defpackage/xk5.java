package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: xk5  reason: default package */
public final class xk5 implements c71 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCallParticipantFingerprint(fg1 fg1, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c71) it.next()).onCallParticipantFingerprint(fg1, j);
        }
    }
}
