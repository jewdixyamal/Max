package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: nqa  reason: default package */
public final class nqa implements pg1 {
    public final /* synthetic */ int a;
    public final Object b;

    public nqa() {
        this.a = 0;
        this.b = new CopyOnWriteArraySet();
    }

    private final void a(mg1 mg1) {
    }

    private final void b(ng1 ng1) {
    }

    private final void c(og1 og1) {
    }

    public final void onCallParticipantsAdded(lg1 lg1) {
        switch (this.a) {
            case 0:
                if (!lg1.b.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsAdded(lg1);
                    }
                    return;
                }
                return;
            default:
                h7b h7b = (h7b) this.b;
                if (!((py0) h7b.b).s() && !((py0) h7b.b).p1.i().isEmpty()) {
                    py0 py0 = (py0) h7b.b;
                    py0.B(py0.y1.f);
                    return;
                }
                return;
        }
    }

    public final void onCallParticipantsChanged(mg1 mg1) {
        switch (this.a) {
            case 0:
                if (!mg1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsChanged(mg1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onCallParticipantsDeAnonimized(ng1 ng1) {
        switch (this.a) {
            case 0:
                if (!ng1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsDeAnonimized(ng1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onCallParticipantsRemoved(og1 og1) {
        switch (this.a) {
            case 0:
                if (!og1.a.isEmpty()) {
                    Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
                    while (it.hasNext()) {
                        ((pg1) it.next()).onCallParticipantsRemoved(og1);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public nqa(h7b h7b) {
        this.a = 1;
        this.b = h7b;
    }
}
