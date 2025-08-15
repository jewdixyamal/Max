package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: rg2  reason: default package */
public final class rg2 extends p04 {
    public final uu3 w0;
    public final String x0 = "chatMediaViewer";
    public final iv y0;

    public rg2(uu3 uu3, ExecutorService executorService) {
        super(uu3, 0);
        this.w0 = uu3;
        this.y0 = new iv(new y8((Object) this), new qz7((Object) executorService, 4, (Object) new y34(4)));
    }

    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r0v9, types: [one.me.chatmedia.viewer.video.VideoViewerWidget] */
    /* JADX WARNING: type inference failed for: r0v10, types: [one.me.chatmedia.viewer.photo.PhotoViewerWidget] */
    /* JADX WARNING: type inference failed for: r0v11, types: [one.me.chatmedia.viewer.photo.GifViewerWidget] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r14 = r14.a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(defpackage.znc r14, int r15) {
        /*
            r13 = this;
            boolean r0 = r14.n()
            if (r0 == 0) goto L_0x0042
            java.lang.Class<rg2> r13 = defpackage.rg2.class
            java.lang.String r13 = r13.getName()
            ir6 r15 = defpackage.hm9.m
            if (r15 != 0) goto L_0x0011
            goto L_0x0041
        L_0x0011:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x0041
            us7 r0 = defpackage.us7.X
            java.util.ArrayList r14 = r14.e()
            java.lang.Object r14 = defpackage.x53.q0(r14)
            coc r14 = (defpackage.coc) r14
            r1 = 0
            if (r14 == 0) goto L_0x002f
            uu3 r14 = r14.a
            if (r14 == 0) goto L_0x002f
            uu3 r14 = r14.getTargetController()
            goto L_0x0030
        L_0x002f:
            r14 = r1
        L_0x0030:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Media viewer. Configure router | root exist | target exist:"
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r15.d(r0, r13, r14, r1)
        L_0x0041:
            return
        L_0x0042:
            iv r0 = r13.y0
            java.util.List r0 = r0.f
            java.lang.Object r15 = defpackage.x53.j0(r15, r0)
            sb8 r15 = (defpackage.sb8) r15
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            long r1 = r15.j()
            java.lang.String r3 = r15.x()
            boolean r0 = r15 instanceof defpackage.jb8
            if (r0 == 0) goto L_0x0076
            jb8 r15 = (defpackage.jb8) r15
            boolean r15 = r15.X
            if (r15 == 0) goto L_0x006c
            one.me.chatmedia.viewer.photo.GifViewerWidget r15 = new one.me.chatmedia.viewer.photo.GifViewerWidget
            java.lang.String r4 = r13.x0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
        L_0x006a:
            r7 = r15
            goto L_0x0084
        L_0x006c:
            one.me.chatmedia.viewer.photo.PhotoViewerWidget r15 = new one.me.chatmedia.viewer.photo.PhotoViewerWidget
            java.lang.String r4 = r13.x0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
            goto L_0x006a
        L_0x0076:
            boolean r15 = r15 instanceof defpackage.qb8
            if (r15 == 0) goto L_0x009d
            one.me.chatmedia.viewer.video.VideoViewerWidget r15 = new one.me.chatmedia.viewer.video.VideoViewerWidget
            java.lang.String r4 = r13.x0
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r4, r5)
            goto L_0x006a
        L_0x0084:
            uu3 r13 = r13.w0
            r7.setTargetController(r13)
            tu3 r13 = defpackage.tu3.b
            r7.setRetainViewMode(r13)
            coc r13 = new coc
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.R(r13)
            return
        L_0x009d:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg2.E(znc, int):void");
    }

    public final int j() {
        return this.y0.f.size();
    }

    public final long k(int i) {
        sb8 sb8 = (sb8) x53.j0(i, this.y0.f);
        if (sb8 != null) {
            return sb8.getItemId();
        }
        return 0;
    }
}
