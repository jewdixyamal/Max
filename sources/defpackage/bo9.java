package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bo9  reason: default package */
public final class bo9 implements ke1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCallParticipantNetworkStatusChanged(List list) {
        if (!((ArrayList) list).isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ke1) it.next()).onCallParticipantNetworkStatusChanged(list);
            }
        }
    }
}
