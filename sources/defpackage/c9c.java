package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: c9c  reason: default package */
public final class c9c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ d9c c;

    public /* synthetic */ c9c(d9c d9c, List list, int i) {
        this.a = i;
        this.c = d9c;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                d9c d9c = this.c;
                ilc ilc = d9c.a;
                ilc.c();
                try {
                    d9c.b.B(this.b);
                    ilc.r();
                    ilc.l();
                    return null;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
            default:
                d9c d9c2 = this.c;
                ilc ilc2 = d9c2.a;
                ilc2.c();
                try {
                    d9c2.c.C(this.b);
                    ilc2.r();
                    ilc2.l();
                    return null;
                } catch (Throwable th2) {
                    ilc2.l();
                    throw th2;
                }
        }
    }
}
