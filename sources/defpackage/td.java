package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.webrtc.IceCandidate;
import ru.ok.tamtam.nano.Protos;

/* renamed from: td  reason: default package */
public final class td implements qv6, q78, z66, erd, a76, ofc {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object o;

    public td() {
        this.a = 20;
        this.o = new Object();
    }

    public static boolean e(eu4 eu4, eu4 eu42) {
        c54.p("Fully specified range is not actually fully specified.", eu42.b());
        int i = eu4.a;
        int i2 = eu42.a;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = eu4.b;
        return i3 == 0 || i3 == eu42.b;
    }

    public static boolean f(eu4 eu4, eu4 eu42, HashSet hashSet) {
        if (hashSet.contains(eu42)) {
            return e(eu4, eu42);
        }
        eu4.toString();
        eu42.toString();
        return false;
    }

    public static eu4 q(eu4 eu4, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (eu4.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            eu4 eu42 = (eu4) it.next();
            c54.o(eu42, "Fully specified DynamicRange cannot be null.");
            c54.p("Fully specified DynamicRange must have fully defined encoding.", eu42.b());
            if (eu42.a != 1 && f(eu4, eu42, hashSet)) {
                return eu42;
            }
        }
        return null;
    }

    private final void r(Throwable th) {
    }

    public static void w(HashSet hashSet, eu4 eu4, o9g o9g) {
        c54.p("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set c2 = ((iu4) o9g.b).c(eu4);
        if (!c2.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(c2);
            if (hashSet.isEmpty()) {
                String join = TextUtils.join("\n  ", c2);
                String join2 = TextUtils.join("\n  ", hashSet2);
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + eu4 + "\nConstraints:\n  " + join + "\nExisting constraints:\n  " + join2);
            }
        }
    }

    public void a(Object obj) {
        int i;
        switch (this.a) {
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                if (!this.b) {
                    bu9 bu9 = (bu9) this.c;
                    bu9.k(bitmap);
                    sh0 sh0 = new sh0(bu9.b());
                    ui0 ui0 = (ui0) this.o;
                    ue ueVar = (ue) ui0.c;
                    ((a84) ueVar.g).execute(new t05((Object) ueVar, ui0.b, (Object) (qh8) ui0.o, (Object) sh0, 2));
                    return;
                }
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ii8 ii8 = (ii8) this.o;
                ii8.getClass();
                j47.m0(ii8.s, (ph8) obj);
                oaf.I(ii8.s);
                if (this.b) {
                    ii8.p((oh8) this.c);
                    return;
                }
                return;
            case 13:
                ii8 ii82 = ((si8) this.o).f;
                Handler handler = ii82.l;
                boolean z = this.b;
                oh8 oh8 = (oh8) this.c;
                oaf.W(handler, new vs5(ii82, oh8, new ii5(3, this, (ph8) obj, oh8, z), 19));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                if (!this.b) {
                    ((erd) this.c).a(obj);
                    return;
                }
                return;
            default:
                Void voidR = (Void) obj;
                rdf rdf = (rdf) this.o;
                if (((bm7) this.c) == rdf.t && (i = rdf.v) != 3) {
                    int i2 = this.b ? 1 : 2;
                    if (i2 != i) {
                        rdf.v = i2;
                        rdf.L().c(i2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            bhg r13 = (defpackage.bhg) r13
            qne r14 = (defpackage.qne) r14
            monitor-enter(r12)
            java.lang.Object r0 = r12.c     // Catch:{ all -> 0x00e1 }
            rw4 r0 = (defpackage.rw4) r0     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00e1 }
            hm7 r0 = (defpackage.hm7) r0     // Catch:{ all -> 0x00e1 }
            boolean r1 = r12.b     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r12.c     // Catch:{ all -> 0x00e1 }
            rw4 r2 = (defpackage.rw4) r2     // Catch:{ all -> 0x00e1 }
            r3 = 0
            r2.b = r3     // Catch:{ all -> 0x00e1 }
            r2.c = r3     // Catch:{ all -> 0x00e1 }
            monitor-exit(r12)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0021
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r14.b(r12)
            return
        L_0x0021:
            qpd r2 = r13.L0
            monitor-enter(r2)
            qpd r12 = r13.L0     // Catch:{ all -> 0x0037 }
            java.lang.Object r12 = r12.remove(r0)     // Catch:{ all -> 0x0037 }
            r8 = r12
            ahg r8 = (defpackage.ahg) r8     // Catch:{ all -> 0x0037 }
            if (r8 != 0) goto L_0x003a
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            r14.b(r12)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x00de
        L_0x0037:
            r12 = move-exception
            goto L_0x00df
        L_0x003a:
            td r12 = r8.d     // Catch:{ all -> 0x0037 }
            rw4 r12 = r12.x()     // Catch:{ all -> 0x0037 }
            r12.b = r3     // Catch:{ all -> 0x0037 }
            r12.c = r3     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x00d8
            pe5[] r12 = r13.h()     // Catch:{ all -> 0x0037 }
            if (r12 == 0) goto L_0x00b5
            r0 = 0
        L_0x004d:
            int r1 = r12.length     // Catch:{ all -> 0x0037 }
            if (r0 >= r1) goto L_0x0061
            r1 = r12[r0]     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "location_updates_with_callback"
            java.lang.String r5 = r1.a     // Catch:{ all -> 0x0037 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x005e
            r3 = r1
            goto L_0x0061
        L_0x005e:
            int r0 = r0 + 1
            goto L_0x004d
        L_0x0061:
            if (r3 != 0) goto L_0x0064
            goto L_0x00b5
        L_0x0064:
            long r0 = r3.b()     // Catch:{ all -> 0x0037 }
            r3 = 1
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 < 0) goto L_0x00b5
            android.os.IInterface r12 = r13.o()     // Catch:{ all -> 0x0037 }
            nkg r12 = (defpackage.nkg) r12     // Catch:{ all -> 0x0037 }
            java.lang.String r13 = "ILocationCallback@"
            int r0 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0037 }
            int r1 = r1.length()     // Catch:{ all -> 0x0037 }
            int r1 = r1 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r3.<init>(r1)     // Catch:{ all -> 0x0037 }
            r3.append(r13)     // Catch:{ all -> 0x0037 }
            r3.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0037 }
            khg r13 = new khg     // Catch:{ all -> 0x0037 }
            r5 = 2
            r0 = 0
            r6 = 0
            r4 = r13
            r7 = r8
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            ygg r1 = new ygg     // Catch:{ all -> 0x0037 }
            r1.<init>(r0, r14)     // Catch:{ all -> 0x0037 }
            android.os.Parcel r14 = r12.G0()     // Catch:{ all -> 0x0037 }
            defpackage.zfg.b(r14, r13)     // Catch:{ all -> 0x0037 }
            r14.writeStrongBinder(r1)     // Catch:{ all -> 0x0037 }
            r13 = 89
            r12.H0(r14, r13)     // Catch:{ all -> 0x0037 }
            goto L_0x00dd
        L_0x00b5:
            android.os.IInterface r12 = r13.o()     // Catch:{ all -> 0x0037 }
            nkg r12 = (defpackage.nkg) r12     // Catch:{ all -> 0x0037 }
            zgg r10 = new zgg     // Catch:{ all -> 0x0037 }
            r10.<init>(r14)     // Catch:{ all -> 0x0037 }
            mhg r13 = new mhg     // Catch:{ all -> 0x0037 }
            r7 = 0
            r9 = 0
            r11 = 0
            r5 = 2
            r6 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0037 }
            android.os.Parcel r14 = r12.G0()     // Catch:{ all -> 0x0037 }
            defpackage.zfg.b(r14, r13)     // Catch:{ all -> 0x0037 }
            r13 = 59
            r12.H0(r14, r13)     // Catch:{ all -> 0x0037 }
            goto L_0x00dd
        L_0x00d8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            r14.b(r12)     // Catch:{ all -> 0x0037 }
        L_0x00dd:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
        L_0x00de:
            return
        L_0x00df:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r12
        L_0x00e1:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00e1 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.accept(java.lang.Object, java.lang.Object):void");
    }

    public void b(fg1 fg1, nsa nsa) {
        ((a4c) this.o).log("IceCandidatesHandler", "handle, participant=" + fg1 + ", client=" + nsa);
        if (!this.b || !fg1.b() || nsa == null || !nsa.l1) {
            ((a4c) this.o).log("IceCandidatesHandler", "Cant apply ice candidates, isIceApplyPermitted=" + this.b + ", " + fg1 + ", client=" + nsa);
            return;
        }
        ((a4c) this.o).log("IceCandidatesHandler", nsa + " is iceable for " + fg1);
        Map map = (Map) ((HashMap) this.c).get(fg1);
        if (map != null) {
            if (Objects.equals(fg1.j, fg1.r)) {
                ((a4c) this.o).log("IceCandidatesHandler", "push all ice candidates to " + nsa);
                for (Map.Entry entry : map.entrySet()) {
                    for (IceCandidate r : (List) ((kpa) entry.getValue()).a) {
                        nsa.r(r);
                    }
                    if (!((List) ((kpa) entry.getValue()).b).isEmpty()) {
                        nsa.H((IceCandidate[]) ((List) ((kpa) entry.getValue()).b).toArray(new IceCandidate[((List) ((kpa) entry.getValue()).b).size()]));
                    }
                }
            } else {
                kpa kpa = (kpa) map.get(fg1.j);
                if (kpa != null) {
                    for (IceCandidate r2 : (List) kpa.a) {
                        nsa.r(r2);
                    }
                    if (!((List) kpa.b).isEmpty()) {
                        List list = (List) kpa.b;
                        nsa.H((IceCandidate[]) list.toArray(new IceCandidate[list.size()]));
                    }
                }
            }
            map.clear();
        }
    }

    public void c(zl4 zl4) {
        erd erd = (erd) this.c;
        try {
            ((qj3) this.o).accept(zl4);
            erd.c(zl4);
        } catch (Throwable th) {
            c37.B(th);
            this.b = true;
            zl4.g();
            iz4.c(th, erd);
        }
    }

    public void close() {
        synchronized (this.o) {
            ((ImageReader) this.c).close();
        }
    }

    public void d(Throwable th) {
        switch (this.a) {
            case 5:
                if (!this.b) {
                    z04.c0("Failed to load bitmap: " + th.getMessage());
                    return;
                }
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                if (th instanceof UnsupportedOperationException) {
                    z04.d0("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    z04.v("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                ii8 ii8 = (ii8) this.o;
                oaf.I(ii8.s);
                if (this.b) {
                    ii8.p((oh8) this.c);
                    return;
                }
                return;
            case 13:
                return;
            default:
                boolean z = th instanceof CancellationException;
                return;
        }
    }

    public ov6 g() {
        Image image;
        synchronized (this.o) {
            try {
                image = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            rd rdVar = new rd(image);
            return rdVar;
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.o) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.o) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.o) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    public void h() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = ((MediaCodec) this.c).dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (this.b) {
            int dequeueInputBuffer = ((MediaCodec) this.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
            if (dequeueInputBuffer >= 0) {
                ((MediaCodec) this.c).queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                this.b = false;
            } else {
                this.b = true;
            }
        }
        if (dequeueOutputBuffer != -3 && dequeueOutputBuffer != -2 && dequeueOutputBuffer != -1) {
            if (dequeueOutputBuffer < 0) {
                hm9.p("td", "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer, (Throwable) null);
                return;
            }
            boolean z = bufferInfo.size != 0;
            ((MediaCodec) this.c).releaseOutputBuffer(dequeueOutputBuffer, z);
            xef xef = (xef) this.o;
            if (xef != null) {
                if (z) {
                    long j = bufferInfo.presentationTimeUs;
                    long j2 = xef.x;
                    if (j >= j2) {
                        if (j >= xef.y) {
                            xef.m = true;
                        } else {
                            bufferInfo.presentationTimeUs = j - j2;
                            m5d m5d = xef.i;
                            EGLSurface eGLSurface = (EGLSurface) m5d.o;
                            if (EGL14.eglMakeCurrent((EGLDisplay) m5d.b, eGLSurface, eGLSurface, (EGLContext) m5d.c)) {
                                yna yna = xef.g;
                                synchronized (yna.c) {
                                    while (!yna.o) {
                                        try {
                                            yna.c.wait(500);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                    yna.o = false;
                                }
                                yna.X.getClass();
                                ere.a("before updateTexImage");
                                yna.a.updateTexImage();
                                yna yna2 = xef.g;
                                yna2.getClass();
                                yna2.X.b(yna2.a, 36197);
                                m5d m5d2 = xef.i;
                                EGLExt.eglPresentationTimeANDROID((EGLDisplay) m5d2.b, (EGLSurface) m5d2.o, bufferInfo.presentationTimeUs * 1000);
                                m5d m5d3 = xef.i;
                                EGL14.eglSwapBuffers((EGLDisplay) m5d3.b, (EGLSurface) m5d3.o);
                            } else {
                                throw new RuntimeException("eglMakeCurrent failed");
                            }
                        }
                    }
                }
                if ((bufferInfo.flags & 4) != 0) {
                    xef xef2 = (xef) this.o;
                    ((MediaCodec) xef2.h.a).signalEndOfInputStream();
                    MediaCodec mediaCodec = (MediaCodec) xef2.f.c;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                    }
                    MediaCodec mediaCodec2 = (MediaCodec) xef2.f.c;
                    if (mediaCodec2 != null) {
                        mediaCodec2.release();
                    }
                    xef2.i.K();
                    xef2.k = true;
                }
            }
        }
    }

    public int j() {
        int imageFormat;
        synchronized (this.o) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    public void k() {
        synchronized (this.o) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public void l(pv6 pv6, Executor executor) {
        synchronized (this.o) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new sd(this, executor, pv6), ay7.t());
        }
    }

    public int m() {
        int maxImages;
        synchronized (this.o) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ay i(defpackage.o78 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "createCodec:"
            y78 r1 = r6.a
            java.lang.String r1 = r1.a
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b }
            r3.<init>(r0)     // Catch:{ Exception -> 0x006b }
            r3.append(r1)     // Catch:{ Exception -> 0x006b }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x006b }
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x006b }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ Exception -> 0x006b }
            boolean r1 = r5.b     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x003c
            qy5 r1 = r6.c     // Catch:{ Exception -> 0x003a }
            int r3 = defpackage.oaf.a     // Catch:{ Exception -> 0x003a }
            r4 = 34
            if (r3 >= r4) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            r4 = 35
            if (r3 >= r4) goto L_0x0033
            java.lang.String r1 = r1.n     // Catch:{ Exception -> 0x003a }
            boolean r1 = defpackage.ia9.k(r1)     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x003c
        L_0x0033:
            w5e r1 = new w5e     // Catch:{ Exception -> 0x003a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x003a }
            r3 = 4
            goto L_0x004c
        L_0x003a:
            r5 = move-exception
            goto L_0x006d
        L_0x003c:
            gy r1 = new gy     // Catch:{ Exception -> 0x003a }
            java.lang.Object r3 = r5.o     // Catch:{ Exception -> 0x003a }
            jde r3 = (defpackage.jde) r3     // Catch:{ Exception -> 0x003a }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x003a }
            android.os.HandlerThread r3 = (android.os.HandlerThread) r3     // Catch:{ Exception -> 0x003a }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x003a }
            r3 = 0
        L_0x004c:
            ay r4 = new ay     // Catch:{ Exception -> 0x003a }
            java.lang.Object r5 = r5.c     // Catch:{ Exception -> 0x003a }
            jde r5 = (defpackage.jde) r5     // Catch:{ Exception -> 0x003a }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x003a }
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x003a }
            r4.<init>((android.media.MediaCodec) r0, (android.os.HandlerThread) r5, (defpackage.w78) r1)     // Catch:{ Exception -> 0x003a }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0068 }
            android.media.MediaFormat r5 = r6.b     // Catch:{ Exception -> 0x0068 }
            android.view.Surface r1 = r6.d     // Catch:{ Exception -> 0x0068 }
            android.media.MediaCrypto r6 = r6.e     // Catch:{ Exception -> 0x0068 }
            defpackage.ay.p(r4, r5, r1, r6, r3)     // Catch:{ Exception -> 0x0068 }
            return r4
        L_0x0068:
            r5 = move-exception
            r2 = r4
            goto L_0x006d
        L_0x006b:
            r5 = move-exception
            r0 = r2
        L_0x006d:
            if (r2 != 0) goto L_0x0075
            if (r0 == 0) goto L_0x0078
            r0.release()
            goto L_0x0078
        L_0x0075:
            r2.release()
        L_0x0078:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.i(o78):ay");
    }

    public ov6 o() {
        Image image;
        synchronized (this.o) {
            try {
                image = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            rd rdVar = new rd(image);
            return rdVar;
        }
    }

    public void onError(Throwable th) {
        if (this.b) {
            j47.Z(th);
        } else {
            ((erd) this.c).onError(th);
        }
    }

    public void p() {
        this.b = true;
    }

    public void s() {
        isc isc = (isc) this.c;
        gh7 Q = isc.Q();
        if (Q.d == fg7.b) {
            Q.a(new fdc(0, isc));
            mm mmVar = (mm) this.o;
            if (!mmVar.c) {
                Q.a(new sjc(1, mmVar));
                mmVar.c = true;
                this.b = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public void t(Bundle bundle) {
        if (!this.b) {
            s();
        }
        gh7 Q = ((isc) this.c).Q();
        if (!Q.d.a(fg7.o)) {
            mm mmVar = (mm) this.o;
            if (!mmVar.c) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!mmVar.d) {
                mmVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                mmVar.d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + Q.d).toString());
        }
    }

    public void u(Bundle bundle) {
        mm mmVar = (mm) this.o;
        mmVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) mmVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        rqc rqc = (rqc) mmVar.f;
        rqc.getClass();
        pqc pqc = new pqc(rqc);
        rqc.c.put(pqc, Boolean.FALSE);
        while (pqc.hasNext()) {
            Map.Entry entry = (Map.Entry) pqc.next();
            bundle2.putBundle((String) entry.getKey(), ((hsc) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public void v() {
        if (this.b) {
            ((Context) this.c).unregisterReceiver((k30) this.o);
            this.b = false;
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.rw4 x() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0009 }
            rw4 r0 = (defpackage.rw4) r0     // Catch:{ all -> 0x0009 }
            monitor-exit(r1)
            return r0
        L_0x0007:
            monitor-exit(r1)     // Catch:{ all -> 0x0009 }
            throw r0
        L_0x0009:
            r0 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.x():rw4");
    }

    public void y(zjg zjg) {
        synchronized (this.o) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(zjg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        r1 = r2.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (defpackage.zjg) ((java.util.ArrayDeque) r2.c).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(com.google.android.gms.tasks.Task r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.o
            monitor-enter(r0)
            java.lang.Object r1 = r2.c     // Catch:{ all -> 0x002f }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r2.b     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x000e
            goto L_0x0031
        L_0x000e:
            r1 = 1
            r2.b = r1     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
        L_0x0012:
            java.lang.Object r1 = r2.o
            monitor-enter(r1)
            java.lang.Object r0 = r2.c     // Catch:{ all -> 0x0026 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0026 }
            zjg r0 = (defpackage.zjg) r0     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0028
            r3 = 0
            r2.b = r3     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r2 = move-exception
            goto L_0x002d
        L_0x0028:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            r0.b(r3)
            goto L_0x0012
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r2
        L_0x002f:
            r2 = move-exception
            goto L_0x0033
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td.z(com.google.android.gms.tasks.Task):void");
    }

    public /* synthetic */ td(int i, byte b2) {
        this.a = i;
    }

    public /* synthetic */ td(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public /* synthetic */ td(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.b = z;
        this.o = obj;
    }

    public td(reg reg, rw4 rw4) {
        this.a = 19;
        this.o = reg;
        this.b = true;
        this.c = rw4;
    }

    public td(fg1 fg1, boolean z, zad zad) {
        this.a = 17;
        this.c = fg1;
        this.b = z;
        this.o = zad;
    }

    public td(a4c a4c) {
        this.a = 18;
        this.c = new HashMap();
        this.o = a4c;
    }

    public td(Context context) {
        Sensor defaultSensor;
        this.a = 11;
        q0e a2 = r0e.a(Float.valueOf(100.0f));
        this.c = a2;
        this.o = new w7c(a2);
        SensorManager sensorManager = (SensorManager) lt3.b(context, SensorManager.class);
        if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(5)) != null) {
            sensorManager.registerListener(new jh7(0, this), defaultSensor, 3, 2500000);
        }
    }

    public td(String str, MediaFormat mediaFormat, yna yna, xef xef) {
        this.a = 4;
        this.b = false;
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
        this.c = createDecoderByType;
        hm9.m("td", mediaFormat.toString(), new Object[0]);
        createDecoderByType.configure(mediaFormat, yna.b, (MediaCrypto) null, 0);
        createDecoderByType.start();
        this.o = xef;
    }

    public td(isc isc) {
        this.a = 14;
        this.c = isc;
        this.o = new mm();
    }

    public td(Context context, Handler handler, n75 n75) {
        this.a = 2;
        this.c = context.getApplicationContext();
        this.o = new k30(this, handler, n75, 0);
    }

    public td(Context context, Handler handler, o75 o75) {
        this.a = 3;
        this.c = context.getApplicationContext();
        this.o = new k30(this, handler, o75, 1);
    }

    public td(ImageReader imageReader) {
        this.a = 0;
        this.o = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public td(xv1 xv1) {
        this.a = 6;
        this.c = xv1;
        this.o = o9g.x(xv1);
        int[] iArr = (int[]) xv1.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (iArr[i] == 18) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.b = z;
    }

    public td(int i) {
        this.a = 1;
        yx yxVar = new yx(i, 1);
        yx yxVar2 = new yx(i, 3);
        this.c = yxVar;
        this.o = yxVar2;
        this.b = true;
    }

    public td(st1 st1, q6d q6d) {
        this.a = 7;
        this.b = false;
        this.c = new sh0(6, (byte) 0);
        this.o = q6d;
    }

    public td(ii8 ii8, oh8 oh8, boolean z, k3b k3b) {
        this.a = 12;
        this.o = ii8;
        this.c = oh8;
        this.b = z;
    }
}
