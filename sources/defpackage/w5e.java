package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: w5e  reason: default package */
public final class w5e implements t5e, w78, uq8, qj3, tlf, im7 {
    public final Object a;

    public /* synthetic */ w5e(Object obj) {
        this.a = obj;
    }

    public void G(Surface surface) {
        dkf B0;
        String str = ((VideoViewerWidget) this.a).a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Media viewer. Video viewer, set surface " + surface, (Throwable) null);
        }
        dmf o0 = ((VideoViewerWidget) this.a).o0();
        if (o0 != null && (B0 = ((ChatMediaViewerScreen) o0).B0()) != null) {
            B0.M0(surface);
        }
    }

    public int M0() {
        gef gef = ((VideoViewerWidget) this.a).s0;
        if (gef != null) {
            return gef.getHeight();
        }
        return 0;
    }

    public void Q(wq8 wq8) {
        mwe mwe = (mwe) this.a;
        boolean p = mwe.o.a.p();
        Window.Callback callback = mwe.X;
        if (p) {
            callback.onPanelClosed(108, wq8);
        } else if (callback.onPreparePanel(0, (View) null, wq8)) {
            callback.onMenuOpened(108, wq8);
        }
    }

    public int R() {
        gef gef = ((VideoViewerWidget) this.a).s0;
        if (gef != null) {
            return gef.getWidth();
        }
        return 0;
    }

    public void a(long j, int i, int i2, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0146, code lost:
        r10 = (r10 = r10.b).f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            ly8 r0 = (defpackage.ly8) r0
            r1 = r17
            java.lang.Object r1 = r1.a
            ru.ok.tamtam.upload.workers.UploadDraftMediaWorker r1 = (ru.ok.tamtam.upload.workers.UploadDraftMediaWorker) r1
            r1.getClass()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r3 = "onUploadUpdate %s"
            java.lang.String r4 = "UploadDraftMediaWorker"
            defpackage.hm9.m(r4, r3, r2)
            v6f r2 = r0.a
            boolean r2 = r2.a()
            r3 = 0
            r5 = 0
            java.lang.String r7 = "onUploadSuccess: attaches is null"
            java.lang.String r8 = "onUploadSuccess: draft is null"
            java.lang.String r9 = "onUploadSuccess: chat is null"
            java.lang.String r10 = ", messageUploadState = "
            if (r2 == 0) goto L_0x010b
            lp4 r2 = r1.d()
            ep4 r2 = r2.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onUploadSuccess: key = "
            r11.<init>(r12)
            r11.append(r2)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r2 = r11.toString()
            defpackage.hm9.m(r4, r2, new java.lang.Object[0])
            p82 r2 = r1.c()
            lp4 r10 = r1.d()
            ep4 r10 = r10.a
            long r10 = r10.a
            e52 r2 = r2.C(r10)
            if (r2 != 0) goto L_0x005f
            defpackage.hm9.p(r4, r9, r3)
            goto L_0x0242
        L_0x005f:
            k92 r9 = r2.b
            uaa r15 = r9.f0
            if (r15 != 0) goto L_0x0070
            defpackage.hm9.p(r4, r8, r3)
            cm7 r0 = defpackage.fm7.a()
            r1.y0 = r0
            goto L_0x0242
        L_0x0070:
            k8g r8 = r15.a()
            if (r8 != 0) goto L_0x0081
            defpackage.hm9.p(r4, r7, r3)
            cm7 r0 = defpackage.fm7.a()
            r1.y0 = r0
            goto L_0x0242
        L_0x0081:
            m20 r3 = r8.C()
            lp4 r4 = r1.d()
            ep4 r4 = r4.a
            java.lang.String r4 = r4.b
            g7f r7 = new g7f
            r8 = 0
            r7.<init>(r0, r8)
            defpackage.tpa.K(r3, r4, r7)
            r3.c()
            khe r0 = r1.X
            java.lang.Object r0 = r0.getValue()
            jp4 r0 = (defpackage.jp4) r0
            r0.c(r15)
            p82 r10 = r1.c()
            long r11 = r2.a
            java.lang.Long r0 = r15.b()
            if (r0 == 0) goto L_0x00b4
            long r5 = r0.longValue()
        L_0x00b4:
            r13 = r5
            r10.k(r11, r13, r15)
            khe r0 = r1.Y
            java.lang.Object r0 = r0.getValue()
            eoe r0 = (defpackage.eoe) r0
            iua r3 = defpackage.iua.TYPE_DRAFT_SAVE
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.util.List r0 = r0.i(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ce:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00f8
            java.lang.Object r3 = r0.next()
            une r3 = (defpackage.une) r3
            hua r4 = r3.f
            boolean r5 = r4 instanceof defpackage.hp4
            if (r5 == 0) goto L_0x00ce
            hp4 r4 = (defpackage.hp4) r4
            long r4 = r4.o
            long r6 = r2.a
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00ce
            khe r4 = r1.Y
            java.lang.Object r4 = r4.getValue()
            eoe r4 = (defpackage.eoe) r4
            long r5 = r3.a
            r4.d(r5)
            goto L_0x00ce
        L_0x00f8:
            khe r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            s8g r0 = (defpackage.s8g) r0
            defpackage.r9d.y(r0)
            em7 r0 = defpackage.fm7.b()
            r1.y0 = r0
            goto L_0x0242
        L_0x010b:
            v6f r2 = r0.a
            q8f r2 = r2.g
            q8f r11 = defpackage.q8f.UPLOADING
            if (r2 != r11) goto L_0x0219
            lp4 r2 = r1.d()
            ep4 r2 = r2.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "onUploadProgress: key = "
            r11.<init>(r12)
            r11.append(r2)
            r11.append(r10)
            r11.append(r0)
            java.lang.String r10 = r11.toString()
            defpackage.hm9.m(r4, r10, new java.lang.Object[0])
            p82 r10 = r1.c()
            lp4 r11 = r1.d()
            ep4 r11 = r11.a
            long r11 = r11.a
            e52 r10 = r10.C(r11)
            if (r10 == 0) goto L_0x014f
            k92 r10 = r10.b
            if (r10 == 0) goto L_0x014f
            uaa r10 = r10.f0
            if (r10 == 0) goto L_0x014f
            k8g r10 = r10.a()
            goto L_0x0150
        L_0x014f:
            r10 = r3
        L_0x0150:
            lp4 r11 = r1.d()
            ep4 r11 = r11.a
            java.lang.String r11 = r11.b
            if (r10 == 0) goto L_0x01f8
            int r12 = r10.i()
            if (r12 > 0) goto L_0x0162
            goto L_0x01f8
        L_0x0162:
            java.lang.Object r10 = r10.a
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x016a:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0180
            java.lang.Object r12 = r10.next()
            r13 = r12
            l20 r13 = (defpackage.l20) r13
            java.lang.String r13 = r13.r
            boolean r13 = defpackage.tpa.f(r13, r11)
            if (r13 == 0) goto L_0x016a
            goto L_0x0181
        L_0x0180:
            r12 = r3
        L_0x0181:
            if (r12 != 0) goto L_0x0185
            goto L_0x01f8
        L_0x0185:
            v6f r10 = r0.a
            float r10 = r10.e
            r1.x0 = r10
            p82 r10 = r1.c()
            long r11 = r2.a
            e52 r10 = r10.C(r11)
            if (r10 != 0) goto L_0x01a2
            defpackage.hm9.p(r4, r9, r3)
            cm7 r0 = defpackage.fm7.a()
            r1.y0 = r0
            goto L_0x0242
        L_0x01a2:
            k92 r9 = r10.b
            uaa r9 = r9.f0
            if (r9 != 0) goto L_0x01b3
            defpackage.hm9.p(r4, r8, r3)
            cm7 r0 = defpackage.fm7.a()
            r1.y0 = r0
            goto L_0x0242
        L_0x01b3:
            k8g r8 = r9.a()
            if (r8 != 0) goto L_0x01c4
            defpackage.hm9.p(r4, r7, r3)
            cm7 r0 = defpackage.fm7.a()
            r1.y0 = r0
            goto L_0x0242
        L_0x01c4:
            m20 r3 = r8.C()
            java.lang.String r2 = r2.b
            g7f r4 = new g7f
            r7 = 1
            r4.<init>(r0, r7)
            defpackage.tpa.K(r3, r2, r4)
            r3.c()
            khe r0 = r1.X
            java.lang.Object r0 = r0.getValue()
            jp4 r0 = (defpackage.jp4) r0
            r0.c(r9)
            p82 r11 = r1.c()
            long r12 = r10.a
            java.lang.Long r0 = r9.b()
            if (r0 == 0) goto L_0x01f1
            long r5 = r0.longValue()
        L_0x01f1:
            r14 = r5
            r16 = r9
            r11.k(r12, r14, r16)
            goto L_0x0242
        L_0x01f8:
            lp4 r0 = r1.d()
            ep4 r0 = r0.a
            java.lang.String r0 = r0.b
            lp4 r2 = r1.d()
            ep4 r2 = r2.a
            long r2 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "cancelUploadIfAttachIsDeleted: chat or attach is deleted: attachLocalId =%s, chatId = %s"
            defpackage.hm9.m(r4, r2, r0)
            r1.i()
            goto L_0x0242
        L_0x0219:
            lp4 r2 = r1.d()
            ep4 r2 = r2.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onUploadUpdate: failed. Unknown upload state. key = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = ", state = "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            defpackage.hm9.p(r4, r0, r3)
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r2 = "Internal error. Unknown upload state"
            r0.<init>(r2)
            r1.e(r0)
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5e.accept(java.lang.Object):void");
    }

    public void b() {
    }

    public void c(w3e w3e) {
        wd6 wd6 = (wd6) ((p71) this.a).s0;
        wd6.getClass();
        bc7[] bc7Arr = StickersShowcaseScreen.v0;
        i7e n0 = ((StickersShowcaseScreen) wd6.b).n0();
        n0.getClass();
        long j = w3e.a;
        Long valueOf = Long.valueOf(j);
        us usVar = n0.x0;
        x77 x77 = (x77) usVar.get(valueOf);
        if (x77 == null || !x77.isActive()) {
            usVar.put(Long.valueOf(j), pnf.n(n0, ((w9a) n0.o).b(), (vx3) null, new h7e(n0, w3e, (Continuation) null), 2));
        }
    }

    public void f(Object obj) {
        hm7 hm7;
        le6 le6 = (le6) obj;
        td tdVar = ((ahg) this.a).d;
        synchronized (tdVar) {
            tdVar.b = false;
            hm7 = (hm7) ((rw4) tdVar.c).c;
        }
        if (hm7 != null) {
            ((reg) tdVar.o).b(hm7, 2441);
        }
    }

    public void flush() {
    }

    public void g(z2e z2e) {
        wd6 wd6 = (wd6) ((p71) this.a).s0;
        wd6.getClass();
        y6e y6e = y6e.c;
        bc7[] bc7Arr = StickersShowcaseScreen.v0;
        StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) wd6.b;
        stickersShowcaseScreen.getClass();
        bc7 bc7 = StickersShowcaseScreen.v0[0];
        long longValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
        f64 P1 = y6e.P1();
        P1.b(":stickers/preview?sticker_id=" + z2e.a + "&chat_id=" + longValue, (Bundle) null);
    }

    public void i(int i, rz3 rz3, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) rz3.i, j, i2);
    }

    public int j() {
        gef gef = ((VideoViewerWidget) this.a).s0;
        return 2;
    }

    public void k(z2e z2e) {
        wd6 wd6 = (wd6) ((p71) this.a).s0;
        wd6.getClass();
        bc7[] bc7Arr = StickersShowcaseScreen.v0;
        i7e n0 = ((StickersShowcaseScreen) wd6.b).n0();
        long j = n0.b;
        if (j > 0) {
            ((s8g) n0.Z.getValue()).a(new v8d(new u8d(j, z2e.a, 1)));
            pnf.o(n0.u0, g43.b);
        }
        xx6 xx6 = (xx6) x6e.a.getAccessor().e();
        if (xx6 != null) {
            xx6.f(bcd.a0(new wx6(ux6.SEND_5_MESSAGES, 1), new wx6(ux6.SEND_3_STICKERS, 1)), wuc.CHAT);
        }
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((VideoViewerWidget) this.a).a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, (Throwable) null);
        }
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public void shutdown() {
    }

    public void start() {
    }

    public boolean z(wq8 wq8, MenuItem menuItem) {
        return false;
    }
}
