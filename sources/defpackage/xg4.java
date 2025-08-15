package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: xg4  reason: default package */
public final /* synthetic */ class xg4 implements bh4, grd {
    public final /* synthetic */ long X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long o;

    public /* synthetic */ xg4(Object obj, Object obj2, long j, long j2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = j;
        this.X = j2;
        this.Y = obj3;
    }

    public ScheduledFuture b(bkg bkg) {
        switch (this.a) {
            case 0:
                ah4 ah4 = (ah4) this.b;
                ah4.getClass();
                return ah4.b.scheduleAtFixedRate(new yg4(ah4, (Runnable) this.c, bkg, 0), this.o, this.X, (TimeUnit) this.Y);
            default:
                ah4 ah42 = (ah4) this.b;
                ah42.getClass();
                return ah42.b.scheduleWithFixedDelay(new yg4(ah42, (Runnable) this.c, bkg, 2), this.o, this.X, (TimeUnit) this.Y);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r8v3, types: [hk5] */
    /* JADX WARNING: type inference failed for: r10v2, types: [d47] */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(defpackage.nqd r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.Object r2 = r0.b
            dlf r2 = (defpackage.dlf) r2
            r2.getClass()
            java.lang.Object r3 = r0.c
            l20 r3 = (defpackage.l20) r3
            boolean r4 = r3.i()
            boolean r5 = defpackage.s5c.P(r3)
            java.lang.String r6 = r2.b(r3)
            boolean r7 = defpackage.oag.t(r6)
            android.content.Context r8 = r2.b
            if (r7 != 0) goto L_0x002a
            uq7 r4 = new uq7
            r4.<init>(r8, r6)
            goto L_0x00d5
        L_0x002a:
            r6 = 0
            if (r4 != 0) goto L_0x0032
            if (r5 != 0) goto L_0x0032
        L_0x002f:
            r4 = r6
            goto L_0x00d5
        L_0x0032:
            java.lang.String r7 = "VideoRipper"
            k20 r9 = r3.d
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = r9.h
            boolean r4 = defpackage.oag.t(r4)
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = "buildFetcher: video from ok"
            defpackage.hm9.m(r7, r4, new java.lang.Object[0])
            d47 r4 = new d47
            long r5 = r0.X
            java.lang.String r7 = r9.m
            ch3 r11 = r2.j
            fme r12 = r2.i
            jle r13 = r2.e
            av0 r14 = r2.k
            pk r15 = r2.h
            long r8 = r9.a
            r23 = r2
            long r1 = r0.o
            r10 = r4
            r16 = r8
            r18 = r1
            r20 = r5
            r22 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r20, r22)
            r2 = r23
            goto L_0x00d5
        L_0x006b:
            r23 = r2
            if (r5 == 0) goto L_0x0087
            java.lang.String r1 = "buildFetcher: video file"
            defpackage.hm9.m(r7, r1, new java.lang.Object[0])
            hk5 r4 = new hk5
            s10 r1 = r3.j
            long r12 = r1.a
            r2 = r23
            ztc r10 = r2.f
            fme r11 = r2.i
            pk r9 = r2.h
            r8 = r4
            r8.<init>(r9, r10, r11, r12)
            goto L_0x00d5
        L_0x0087:
            r2 = r23
            java.lang.String r1 = r9.h
            boolean r4 = defpackage.x9g.b(r1)
            if (r4 == 0) goto L_0x009c
            java.lang.String r4 = "buildFetcher: youtube video"
            defpackage.hm9.m(r7, r4, new java.lang.Object[0])
            x9g r4 = new x9g
            r4.<init>(r8, r1)
            goto L_0x00d5
        L_0x009c:
            java.lang.String r4 = defpackage.ypf.b(r1)
            boolean r5 = defpackage.oag.t(r4)
            if (r5 != 0) goto L_0x00b2
            java.lang.String r1 = "buildFetcher: vimeo"
            defpackage.hm9.m(r7, r1, new java.lang.Object[0])
            ypf r1 = new ypf
            r1.<init>(r4)
            r4 = r1
            goto L_0x00d5
        L_0x00b2:
            java.lang.String r1 = defpackage.a37.b(r1)
            boolean r4 = defpackage.oag.t(r1)
            if (r4 != 0) goto L_0x00c7
            java.lang.String r4 = "buildFetcher: instagram"
            defpackage.hm9.m(r7, r4, new java.lang.Object[0])
            a37 r4 = new a37
            r4.<init>(r1)
            goto L_0x00d5
        L_0x00c7:
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r4 = "buildFetcher: unknown type! null"
            defpackage.hm9.k0(r7, r6, r4, r1)
            goto L_0x002f
        L_0x00d5:
            if (r4 != 0) goto L_0x011b
            z10 r1 = defpackage.z10.b
            z10 r3 = r3.x
            if (r3 != r1) goto L_0x00f2
            boolean r0 = r25.h()
            if (r0 != 0) goto L_0x0126
            ru.ok.messages.video.fetcher.FetcherException r0 = new ru.ok.messages.video.fetcher.FetcherException
            r1 = 9
            java.lang.String r2 = "video is processing"
            r0.<init>(r1, r2)
            r1 = r25
            r1.onError(r0)
            goto L_0x0126
        L_0x00f2:
            r1 = r25
            ef7 r2 = r2.c
            java.lang.Object r2 = r2.get()
            ad r2 = (defpackage.ad) r2
            if (r2 == 0) goto L_0x0109
            java.lang.Object r0 = r0.Y
            k20 r0 = (defpackage.k20) r0
            java.lang.String r0 = r0.h
            java.lang.String r3 = "ACTION_VIDEO_FETCH_UNSUPPORTED"
            r2.g(r3, r0)
        L_0x0109:
            boolean r0 = r25.h()
            if (r0 != 0) goto L_0x0126
            ru.ok.messages.video.fetcher.FetcherException r0 = new ru.ok.messages.video.fetcher.FetcherException
            r2 = 3
            java.lang.String r3 = "Unsupported video hosting"
            r0.<init>(r2, r3)
            r1.onError(r0)
            goto L_0x0126
        L_0x011b:
            r1 = r25
            boolean r0 = r25.h()
            if (r0 != 0) goto L_0x0126
            r1.a(r4)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg4.j(nqd):void");
    }
}
