package defpackage;

import java.util.Iterator;

/* renamed from: sha  reason: default package */
public final /* synthetic */ class sha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tha b;

    public /* synthetic */ sha(tha tha, int i) {
        this.a = i;
        this.b = tha;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                tha tha = this.b;
                Iterator it = tha.B0.iterator();
                while (it.hasNext()) {
                    ((qq) it.next()).a(tha.c.d);
                }
                return;
            default:
                tha tha2 = this.b;
                Iterator it2 = tha2.B0.iterator();
                while (it2.hasNext()) {
                    ((qq) it2.next()).a(tha2.c.d);
                }
                return;
        }
    }
}
