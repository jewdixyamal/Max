package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: u5  reason: default package */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActLocalMedias b;

    public /* synthetic */ u5(ActLocalMedias actLocalMedias, int i) {
        this.a = i;
        this.b = actLocalMedias;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r3 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = r3.b
            int r3 = r3.a
            switch(r3) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0032;
                case 2: goto L_0x002b;
                case 3: goto L_0x001d;
                case 4: goto L_0x0017;
                case 5: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            android.view.View r3 = r0.e1
            java.util.WeakHashMap r0 = defpackage.zmf.a
            defpackage.mmf.c(r3)
            return
        L_0x000f:
            ru.ok.messages.media.mediabar.MediaBarPreviewLayout r3 = r0.f1
            java.util.WeakHashMap r0 = defpackage.zmf.a
            defpackage.mmf.c(r3)
            return
        L_0x0017:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.s1
            r0.b0(r0)
            return
        L_0x001d:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.s1
            android.view.Window r3 = r0.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.invalidate()
            return
        L_0x002b:
            int r3 = ru.ok.messages.media.mediabar.ActLocalMedias.s1
            r3 = 0
            r0.v0(r3)
            return
        L_0x0032:
            r0.startPostponedEnterTransition()
            return
        L_0x0036:
            we8 r3 = r0.k1
            if (r3 == 0) goto L_0x004b
            y7g r3 = r0.K0
            java.lang.Object r3 = r3.b
            ed3 r3 = (defpackage.ed3) r3
            y8a r3 = (defpackage.y8a) r3
            ye8 r3 = r3.k()
            we8 r1 = r0.k1
            r3.l(r1)
        L_0x004b:
            we8 r3 = r0.l1
            if (r3 == 0) goto L_0x0060
            y7g r3 = r0.K0
            java.lang.Object r3 = r3.b
            ed3 r3 = (defpackage.ed3) r3
            y8a r3 = (defpackage.y8a) r3
            ye8 r3 = r3.k()
            we8 r1 = r0.l1
            r3.l(r1)
        L_0x0060:
            vd8 r3 = r0.Z0
            if (r3 == 0) goto L_0x00a8
            java.util.ArrayList r3 = r0.V0
            int r1 = r3.size()
            if (r1 != 0) goto L_0x006d
            goto L_0x00a8
        L_0x006d:
            int r1 = r0.W0
            java.lang.Object r3 = r3.get(r1)
            up7 r3 = (defpackage.up7) r3
            if (r3 != 0) goto L_0x0078
            goto L_0x00a8
        L_0x0078:
            vd8 r0 = r0.Z0
            long r1 = r3.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r3 = r0.F(r1)
            boolean r0 = r3 instanceof ru.ok.messages.media.mediabar.FrgLocalVideo
            if (r0 == 0) goto L_0x00a8
            ru.ok.messages.media.mediabar.FrgLocalVideo r3 = (ru.ok.messages.media.mediabar.FrgLocalVideo) r3
            bk9 r0 = r3.K1
            if (r0 != 0) goto L_0x008b
            goto L_0x00a8
        L_0x008b:
            we8 r3 = r3.I1
            bq7 r3 = (defpackage.bq7) r3
            r3.g = r0
            fef r0 = r3.f
            if (r0 == 0) goto L_0x00a8
            int r0 = r3.j()
            int r1 = r3.h()
            int r2 = r3.i()
            ve8 r3 = r3.e
            if (r3 == 0) goto L_0x00a8
            r3.P(r0, r1, r2)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5.run():void");
    }
}
