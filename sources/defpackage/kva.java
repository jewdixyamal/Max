package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: kva  reason: default package */
public final /* synthetic */ class kva implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lva b;

    public /* synthetic */ kva(lva lva, int i) {
        this.a = i;
        this.b = lva;
    }

    public final void run() {
        lva lva = this.b;
        switch (this.a) {
            case 0:
                lva.d();
                return;
            default:
                lva.getClass();
                try {
                    lva.d();
                    return;
                } catch (Exception e) {
                    hm9.p("lva", "syncInternal: exception", e);
                    ((cba) lva.h).c(new HandledException(e), true);
                    return;
                }
        }
    }
}
