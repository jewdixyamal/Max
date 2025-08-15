package defpackage;

import android.opengl.EGL14;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer;

/* renamed from: cp1  reason: default package */
public final class cp1 extends ne1 {
    public static final AtomicInteger m = new AtomicInteger(0);
    public final String b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final AtomicReference d = new AtomicReference((Object) null);
    public final l7 e = new l7(2, false);
    public final y7g f = new y7g(6);
    public oe1 g;
    public final Object h = new Object();
    public Surface i;
    public final String j;
    public RendererCommon.GlDrawer k;
    public final dp1 l;

    public cp1(String str) {
        this.a = EGL14.EGL_NO_SURFACE;
        this.b = str;
        this.j = "CallOpenGL_drawer_".concat(str);
        this.l = new dp1(str, new ie(15, (Object) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r0 = r5.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        r5.k = null;
        r0 = m.decrementAndGet();
        r1 = r5.j;
        r5 = r5.b;
        r2.log(r1, "Instance " + r5 + " released. Remaining count is " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.h
            monitor-enter(r0)
            r1 = 0
            r5.i = r1     // Catch:{ all -> 0x001f }
            oe1 r2 = r5.g     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x004f
            a4c r2 = r2.a     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x000f
            goto L_0x004f
        L_0x000f:
            r5.g = r1     // Catch:{ all -> 0x001f }
            java.util.concurrent.atomic.AtomicReference r3 = r5.d     // Catch:{ all -> 0x001f }
            java.lang.Object r3 = r3.getAndSet(r1)     // Catch:{ all -> 0x001f }
            org.webrtc.VideoFrame r3 = (org.webrtc.VideoFrame) r3     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0021
            r3.release()     // Catch:{ all -> 0x001f }
            goto L_0x0021
        L_0x001f:
            r5 = move-exception
            goto L_0x0051
        L_0x0021:
            monitor-exit(r0)
            org.webrtc.RendererCommon$GlDrawer r0 = r5.k
            if (r0 == 0) goto L_0x0029
            r0.release()
        L_0x0029:
            r5.k = r1
            java.util.concurrent.atomic.AtomicInteger r0 = m
            int r0 = r0.decrementAndGet()
            java.lang.String r1 = r5.j
            java.lang.String r5 = r5.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Instance "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = " released. Remaining count is "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r2.log(r1, r5)
            return
        L_0x004f:
            monitor-exit(r0)
            return
        L_0x0051:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp1.a():void");
    }

    public final void b(oe1 oe1, me1 me1) {
        boolean z;
        boolean z2;
        float f2;
        VideoFrame videoFrame = (VideoFrame) this.d.getAndSet((Object) null);
        if (videoFrame != null) {
            l7 l7Var = this.e;
            synchronized (l7Var) {
                long j2 = l7Var.c;
                z = false;
                if (j2 > 0) {
                    if (j2 != Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        long j3 = l7Var.b;
                        if (nanoTime >= j3) {
                            long j4 = j3 + l7Var.c;
                            l7Var.b = j4;
                            l7Var.b = Math.max(j4, nanoTime);
                        }
                    }
                    z2 = false;
                }
                z2 = true;
            }
            if (z2) {
                try {
                    int rotatedWidth = videoFrame.getRotatedWidth();
                    int rotatedHeight = videoFrame.getRotatedHeight();
                    float f3 = ((float) rotatedWidth) / ((float) rotatedHeight);
                    y7g y7g = this.f;
                    Float f4 = (Float) ((AtomicReference) y7g.b).get();
                    if (f4 != null && f4.floatValue() == 0.0f) {
                        z = true;
                    }
                    if (z) {
                        f4 = Float.valueOf(f3);
                    }
                    float f5 = 1.0f;
                    if (f3 > f4.floatValue()) {
                        float floatValue = f4.floatValue() / f3;
                        f2 = 1.0f;
                        f5 = floatValue;
                    } else {
                        f2 = f3 / f4.floatValue();
                    }
                    oe1.b(me1, this, videoFrame, new sh1(f5, f2, ((AtomicBoolean) y7g.c).get()));
                    this.l.f++;
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        VoipVideoRenderer.drawerListener$lambda$1(((qqf) ((bp1) it.next())).a, rotatedWidth, rotatedHeight);
                    }
                } catch (Throwable th) {
                    videoFrame.release();
                    throw th;
                }
            }
            videoFrame.release();
        }
    }
}
