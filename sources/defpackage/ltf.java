package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ltf  reason: default package */
public final class ltf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ puf b;
    public final /* synthetic */ mtf c;

    public /* synthetic */ ltf(mtf mtf, puf puf, int i) {
        this.a = i;
        this.c = mtf;
        this.b = puf;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                mtf mtf = this.c;
                ilc ilc = mtf.a;
                ilc.c();
                try {
                    mtf.b.C(this.b);
                    ilc.r();
                    ilc.l();
                    return e5f.a;
                } catch (Throwable th) {
                    ilc.l();
                    throw th;
                }
            default:
                mtf mtf2 = this.c;
                ilc ilc2 = mtf2.a;
                ilc2.c();
                try {
                    mtf2.c.B(this.b);
                    ilc2.r();
                    ilc2.l();
                    return e5f.a;
                } catch (Throwable th2) {
                    ilc2.l();
                    throw th2;
                }
        }
    }
}
