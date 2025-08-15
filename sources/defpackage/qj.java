package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: qj  reason: default package */
public final class qj extends e0 implements ox3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.rj r2) {
        /*
            r1 = this;
            r0 = 0
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(rj):void");
    }

    public final void g(lx3 lx3, Throwable th) {
        switch (this.a) {
            case 0:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((rj) this.b).a, "Can't invalidate chats and messages cache", th);
                    return;
                }
                return;
            case 1:
                bx bxVar = (bx) this.b;
                yx4 yx4 = bxVar.c;
                if (yx4 != null) {
                    int identityHashCode = System.identityHashCode(bxVar);
                    yx4.b("failed " + lx3 + " with " + th + " @" + identityHashCode);
                }
                bxVar.g.g(lx3, th);
                return;
            case 2:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((gw2) this.b).J0, "Exception when search chats/messages", th);
                    return;
                }
                return;
            case 3:
                ((cba) ((o45) ((je7) this.b).getValue())).c(th, true);
                return;
            case 4:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((gy4) this.b).c, "Exception while loading emoji sprite", th);
                    return;
                }
                return;
            case 5:
                ((cba) ((o45) this.b)).c(th, false);
                return;
            case 6:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((pp7) this.b).b, "Can't load frames", th);
                    return;
                }
                return;
            case 7:
                if (!(th instanceof CancellationException)) {
                    ((cba) ((jva) this.b).c).c(th, false);
                    return;
                }
                return;
            default:
                if (!(th instanceof CancellationException)) {
                    hm9.p(((rff) this.b).f, "Fetch video. Exception", th);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.bx r2) {
        /*
            r1 = this;
            r0 = 1
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(bx):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.gw2 r2) {
        /*
            r1 = this;
            r0 = 2
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(gw2):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.gy4 r2) {
        /*
            r1 = this;
            r0 = 4
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(gy4):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.o45 r2) {
        /*
            r1 = this;
            r0 = 5
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(o45):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.pp7 r2) {
        /*
            r1 = this;
            r0 = 6
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(pp7):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.jva r2) {
        /*
            r1 = this;
            r0 = 7
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(jva):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.khe r2) {
        /*
            r1 = this;
            r0 = 3
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(khe):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.rff r2) {
        /*
            r1 = this;
            r0 = 8
            r1.a = r0
            qx7 r0 = defpackage.qx7.c
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(rff):void");
    }
}
