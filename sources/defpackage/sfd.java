package defpackage;

/* renamed from: sfd  reason: default package */
public final class sfd extends u2 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ ufd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sfd(xed xed, ufd ufd) {
        super(9, (Object) xed);
        this.o = ufd;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                kfd kfd = (kfd) obj2;
                if (!tpa.f((kfd) obj, kfd)) {
                    ufd ufd = this.o;
                    ufd.E(ufd, kfd);
                    ufd.onThemeChanged(qp4.u0.j(ufd));
                    return;
                }
                return;
            default:
                if (((pfd) obj) != ((pfd) obj2)) {
                    ufd ufd2 = this.o;
                    ufd2.onThemeChanged(ufd2.getCurrentTheme());
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sfd(defpackage.ufd r2) {
        /*
            r1 = this;
            r0 = 1
            r1.c = r0
            pfd r0 = defpackage.pfd.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfd.<init>(ufd):void");
    }
}
