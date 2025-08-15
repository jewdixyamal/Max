package defpackage;

import android.media.MediaCodec;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;

/* renamed from: flf  reason: default package */
public final class flf extends yqc {
    public final bkb e;
    public final elf f;
    public final p54 g;
    public final long h;
    public volatile long i = -9223372036854775807L;
    public boolean j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public flf(android.content.Context r14, defpackage.qy5 r15, defpackage.f1f r16, defpackage.crd r17, java.util.List r18, defpackage.zff r19, defpackage.v43 r20, defpackage.hj9 r21, defpackage.gte r22, defpackage.x99 r23, defpackage.xw0 r24, long r25, boolean r27) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r21
            r13.<init>(r15, r2)
            r3 = r25
            r0.h = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.i = r3
            i63 r3 = r1.A
            r3.getClass()
            int r4 = r3.c
            r5 = 2
            if (r4 != r5) goto L_0x0036
            java.lang.String r4 = r1.n
            java.lang.String r6 = "image/jpeg_r"
            boolean r4 = java.util.Objects.equals(r4, r6)
            if (r4 == 0) goto L_0x0033
            i63 r4 = new i63
            r12 = 0
            r11 = -1
            r7 = 6
            r8 = 1
            r9 = 7
            r6 = r4
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x0033:
            i63 r4 = defpackage.i63.h
            goto L_0x0037
        L_0x0036:
            r4 = r3
        L_0x0037:
            elf r12 = new elf
            ny5 r1 = r15.a()
            r1.z = r4
            qy5 r8 = new qy5
            r8.<init>(r1)
            cj9 r1 = r2.b
            zw6 r9 = r1.w(r5)
            r6 = r12
            r7 = r20
            r10 = r16
            r11 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f = r12
            p54 r1 = new p54
            r2 = 0
            r1.<init>(r2)
            r0.g = r1
            int r1 = r12.g
            if (r1 != r5) goto L_0x006c
            boolean r1 = defpackage.i63.g(r3)
            if (r1 == 0) goto L_0x006c
            i63 r1 = defpackage.i63.h
            r5 = r1
            goto L_0x006d
        L_0x006c:
            r5 = r4
        L_0x006d:
            bkb r10 = new bkb     // Catch:{ VideoFrameProcessingException -> 0x007a }
            if (r27 == 0) goto L_0x007c
            o84 r1 = new o84     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r2 = 18
            r1.<init>((int) r2)     // Catch:{ VideoFrameProcessingException -> 0x007a }
        L_0x0078:
            r4 = r1
            goto L_0x0086
        L_0x007a:
            r0 = move-exception
            goto L_0x009a
        L_0x007c:
            o9g r1 = new o9g     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r2 = 29
            r3 = r19
            r1.<init>((int) r2, (java.lang.Object) r3)     // Catch:{ VideoFrameProcessingException -> 0x007a }
            goto L_0x0078
        L_0x0086:
            r1 = r10
            r2 = r13
            r3 = r14
            r6 = r22
            r7 = r24
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r0.e = r10     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r10.a()     // Catch:{ VideoFrameProcessingException -> 0x007a }
            return
        L_0x009a:
            androidx.media3.transformer.ExportException r1 = new androidx.media3.transformer.ExportException
            java.lang.String r2 = "Video frame processing error"
            r3 = 5001(0x1389, float:7.008E-42)
            r1.<init>(r2, r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flf.<init>(android.content.Context, qy5, f1f, crd, java.util.List, zff, v43, hj9, gte, x99, xw0, long, boolean):void");
    }

    public final sf6 j(lv4 lv4, qy5 qy5, int i2) {
        try {
            return ((p1f) this.e.a).f(i2);
        } catch (VideoFrameProcessingException e2) {
            throw new ExportException("Video frame processing error", e2, 5001);
        }
    }

    public final p54 k() {
        p54 p54 = this.g;
        elf elf = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        p54.X = elf.i != null ? elf.i.c() : null;
        if (this.g.X == null) {
            return null;
        }
        elf elf2 = this.f;
        if (elf2.i != null) {
            y84 y84 = elf2.i;
            if (y84.f(false)) {
                bufferInfo = y84.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0) {
            if (((p1f) this.e.a).k() != this.j || this.i == -9223372036854775807L || bufferInfo.size <= 0) {
                this.j = true;
            } else {
                bufferInfo.presentationTimeUs = this.i;
            }
        }
        p54 p542 = this.g;
        p542.Z = bufferInfo.presentationTimeUs;
        p542.b = bufferInfo.flags;
        return p542;
    }

    public final qy5 l() {
        elf elf = this.f;
        if (elf.i == null) {
            return null;
        }
        y84 y84 = elf.i;
        y84.f(false);
        qy5 qy5 = y84.j;
        if (qy5 == null || elf.j == 0) {
            return qy5;
        }
        ny5 a = qy5.a();
        a.v = elf.j;
        return new qy5(a);
    }

    public final boolean m() {
        elf elf = this.f;
        return elf.i != null && elf.i.d();
    }

    public final void o() {
        this.e.release();
        elf elf = this.f;
        if (elf.i != null) {
            elf.i.h();
        }
        elf.k = true;
    }

    public final void p() {
        elf elf = this.f;
        if (elf.i != null) {
            elf.i.i();
        }
    }
}
