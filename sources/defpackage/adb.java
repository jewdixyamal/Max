package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.BufferedReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adb  reason: default package */
public final class adb implements e15, s78 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ adb(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public void a(long j, int i, int i2, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    public boolean b(String str) {
        boolean z;
        qi3 qi3;
        synchronized (this.c) {
            try {
                qi3[] qi3Arr = (qi3[]) this.b;
                int length = qi3Arr.length;
                z = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        qi3 = qi3Arr[i];
                        Object obj = qi3.d;
                        if (obj != null && qi3.b(obj) && qi3.c.contains(str)) {
                            break;
                        }
                        i++;
                    } else {
                        qi3 = null;
                        break;
                    }
                }
                if (qi3 != null) {
                    a14.u().n(f7g.a, "Work " + str + " constrained by " + qi3.getClass().getSimpleName());
                }
                if (qi3 == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public fp1 c() {
        Objects.requireNonNull((bg1) this.a);
        Objects.requireNonNull((olf) this.b);
        return new fp1(this);
    }

    public void d(int i, long j) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, j);
    }

    public int e() {
        return ((MediaCodec) this.a).dequeueInputBuffer(0);
    }

    public sba f(String str) {
        return (sba) ((ConcurrentHashMap) ((je7) this.c).getValue()).computeIfAbsent(str, new di(13, new ga(this, 24, str)));
    }

    public void flush() {
        ((MediaCodec) this.a).flush();
    }

    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && oaf.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public ByteBuffer getInputBuffer(int i) {
        return oaf.a >= 21 ? ((MediaCodec) this.a).getInputBuffer(i) : ((ByteBuffer[]) this.b)[i];
    }

    public ByteBuffer getOutputBuffer(int i) {
        return oaf.a >= 21 ? ((MediaCodec) this.a).getOutputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.a).getOutputFormat();
    }

    public void h(int i) {
        ((MediaCodec) this.a).setVideoScalingMode(i);
    }

    public void i(int i, rz3 rz3, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) rz3.i, j, i2);
    }

    public void j(Surface surface) {
        ((MediaCodec) this.a).setOutputSurface(surface);
    }

    public ByteBuffer l() {
        AtomicLong atomicLong = (AtomicLong) this.c;
        long j = atomicLong.get();
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < ((long) byteBuffer.capacity())) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet((long) (-byteBuffer.remaining()));
        }
        return byteBuffer;
    }

    public boolean m(int i) {
        return ((e15) this.a).m(i) && p(i) != null;
    }

    public f15 n(int i) {
        return p(i);
    }

    public void o(r88 r88, Handler handler) {
        ((MediaCodec) this.a).setOnFrameRenderedListener(new xx(this, r88, 3), handler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.f15 p(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r0 = r2.get(r0)
            f15 r0 = (defpackage.f15) r0
            return r0
        L_0x001d:
            java.lang.Object r3 = r0.a
            e15 r3 = (defpackage.e15) r3
            boolean r4 = r3.m(r1)
            if (r4 == 0) goto L_0x00db
            f15 r3 = r3.n(r1)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r0 = r0.b
            bj6 r0 = (defpackage.bj6) r0
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r4 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r0 = r0.f(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r0.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r4 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r4
            if (r4 == 0) goto L_0x003c
            r0 = 4
            if (r1 == r0) goto L_0x0068
            r0 = 5
            if (r1 == r0) goto L_0x005e
            r0 = 6
            if (r1 == r0) goto L_0x0054
            goto L_0x0072
        L_0x0054:
            android.util.Size r0 = new android.util.Size
            r4 = 1440(0x5a0, float:2.018E-42)
            r6 = 1080(0x438, float:1.513E-42)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x005e:
            android.util.Size r0 = new android.util.Size
            r4 = 960(0x3c0, float:1.345E-42)
            r6 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x0068:
            android.util.Size r0 = new android.util.Size
            r4 = 640(0x280, float:8.97E-43)
            r6 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 != 0) goto L_0x0077
            r5 = r3
            goto L_0x00dc
        L_0x0077:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r6 = r3.d()
            java.util.Iterator r6 = r6.iterator()
        L_0x0084:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c3
            java.lang.Object r7 = r6.next()
            ha0 r7 = (defpackage.ha0) r7
            int r9 = r7.a
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            ha0 r15 = new ha0
            int r12 = r7.i
            int r11 = r7.j
            java.lang.String r10 = r7.b
            int r8 = r7.c
            int r5 = r7.d
            r19 = r0
            int r0 = r7.g
            int r7 = r7.h
            r16 = r8
            r8 = r15
            r18 = r11
            r11 = r16
            r17 = r12
            r12 = r5
            r5 = r15
            r15 = r0
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r5)
            r0 = r19
            goto L_0x0084
        L_0x00c3:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            int r0 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            ga0 r5 = defpackage.ga0.e(r0, r5, r3, r4)
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r2.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adb.p(int):f15");
    }

    public String q(int i) {
        hm9.m("adb", "getVcfByPhoneContactId: phoneContactId %d", Integer.valueOf(i));
        try {
            String str = (String) mqd.r((Context) this.a, Collections.singletonList(Integer.valueOf(i)), (o45) this.c).get(i);
            if (!oag.t(str)) {
                return str;
            }
            hm9.q("adb", "getVcfByPhoneContactId: vCard is empty for phoneContactId %d", Integer.valueOf(i));
            return null;
        } catch (Exception e) {
            Locale locale = Locale.ENGLISH;
            hm9.p("adb", "getVcfByPhoneContactId: exception for phoneContactId " + i, e);
            return null;
        }
    }

    public boolean r() {
        String trim;
        if (((String) this.c) != null) {
            return true;
        }
        Queue queue = (Queue) this.b;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.c = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.a).readLine();
            this.c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.c = trim;
        } while (trim.isEmpty());
        return true;
    }

    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.a;
        this.b = null;
        this.c = null;
        try {
            int i = oaf.a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, z);
    }

    public boolean s() {
        return ((ByteBuffer) this.b).hasRemaining() || ((AtomicLong) this.c).get() > 0;
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public boolean t(int i, hj3 hj3, dob dob) {
        int[] iArr = hj3.p0;
        int i2 = iArr[0];
        xk0 xk0 = (xk0) this.b;
        xk0.b = i2;
        xk0.d = iArr[1];
        xk0.e = hj3.q();
        xk0.f = hj3.k();
        xk0.k = false;
        xk0.j = i;
        boolean z = xk0.b == 3;
        boolean z2 = xk0.d == 3;
        boolean z3 = z && hj3.W > 0.0f;
        boolean z4 = z2 && hj3.W > 0.0f;
        int[] iArr2 = hj3.t;
        if (z3 && iArr2[0] == 4) {
            xk0.b = 1;
        }
        if (z4 && iArr2[1] == 4) {
            xk0.d = 1;
        }
        dob.c(hj3, xk0);
        hj3.O(xk0.g);
        hj3.L(xk0.h);
        hj3.E = xk0.c;
        hj3.I(xk0.i);
        xk0.j = 0;
        return xk0.k;
    }

    public String u() {
        if (r()) {
            String str = (String) this.c;
            this.c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [rpa, java.lang.Object] */
    public void v(JSONObject jSONObject) {
        o61 o61;
        gk3 gk3 = (gk3) this.b;
        gk3.getClass();
        djb djb = null;
        try {
            o61 k = jSONObject.has("decorativeExternalParticipantId") ? f46.k(jSONObject) : null;
            bg1 a2 = bg1.a(jSONObject.getString("participantId"));
            String t = f8.t(jSONObject, "decorativeParticipantId");
            if (t != null) {
                bg1.a(t);
            }
            djb = new djb(a2, k, false, 4);
        } catch (JSONException e) {
            gk3.a.logException("ContactCallParser", "Can't parse decorative-id-changed info", e);
        }
        if (djb != null && (o61 = (o61) djb.c) != null) {
            kg1 kg1 = (kg1) this.a;
            bg1 bg1 = (bg1) djb.b;
            if (kg1.j(bg1) != null) {
                if (kg1.j(bg1) != null) {
                    zad c2 = kg1.c(bg1);
                    List singletonList = Collections.singletonList((fg1) kg1.a(new dqa(bg1, new Object(), new Object(), new Object(), new Object(), new wmc(o61, false), new Object()), c2).c);
                    boolean f = tpa.f(c2, kg1.k);
                    id1 id1 = kg1.b;
                    if (f) {
                        id1.a.onActiveParticipantsDeAnonimized(new wy0(singletonList, kg1.d(kg1.k).values()));
                    }
                    id1.c.onCallParticipantsDeAnonimized(new ng1(singletonList));
                }
                ((s31) this.c).onDecorativeParticipantIdChanged(new q31(bg1));
            }
        }
    }

    public void w(Iterable iterable) {
        synchronized (this.c) {
            try {
                for (qi3 qi3 : (qi3[]) this.b) {
                    if (qi3.e != null) {
                        qi3.e = null;
                        qi3.d((adb) null, qi3.d);
                    }
                }
                for (qi3 c2 : (qi3[]) this.b) {
                    c2.c(iterable);
                }
                for (qi3 qi32 : (qi3[]) this.b) {
                    if (qi32.e != this) {
                        qi32.e = this;
                        qi32.d(this, qi32.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.c) {
            for (qi3 qi3 : (qi3[]) this.b) {
                ArrayList arrayList = qi3.b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    qi3.a.n(qi3);
                }
            }
        }
    }

    public void y(ij3 ij3, int i, int i2, int i3) {
        int i4 = ij3.b0;
        int i5 = ij3.c0;
        ij3.b0 = 0;
        ij3.c0 = 0;
        ij3.O(i2);
        ij3.L(i3);
        if (i4 < 0) {
            ij3.b0 = 0;
        } else {
            ij3.b0 = i4;
        }
        if (i5 < 0) {
            ij3.c0 = 0;
        } else {
            ij3.c0 = i5;
        }
        ij3 ij32 = (ij3) this.c;
        ij32.t0 = i;
        ij32.U();
    }

    public void z(ij3 ij3) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = ij3.q0.size();
        for (int i = 0; i < size; i++) {
            hj3 hj3 = (hj3) ij3.q0.get(i);
            int[] iArr = hj3.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(hj3);
            }
        }
        ij3.s0.a = true;
    }

    public adb(int i) {
        switch (i) {
            case 6:
                Bitmap[] bitmapArr = new Bitmap[25];
                for (int i2 = 0; i2 < 25; i2++) {
                    bitmapArr[i2] = null;
                }
                this.a = bitmapArr;
                Integer num = 50;
                this.b = new bo0(tu0.F(num.doubleValue() * ((double) 1048576)), 0);
                this.c = new mw7(100);
                return;
            default:
                this.b = olf.a;
                return;
        }
    }

    public adb(j60 j60) {
        this.a = j60;
        ByteBuffer order = ByteBuffer.allocateDirect(j60.d * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY).order(ByteOrder.nativeOrder());
        this.b = order;
        order.flip();
        this.c = new AtomicLong();
    }

    public adb(c8d c8d, e7g e7g) {
        hl0 hl0 = new hl0((ej3) c8d.a, 0);
        hl0 hl02 = new hl0((il0) c8d.b, 1);
        hl0 hl03 = new hl0((ej3) c8d.o, 4);
        ej3 ej3 = (ej3) c8d.c;
        this.a = e7g;
        this.b = new qi3[]{hl0, hl02, hl03, new hl0(ej3, 2), new hl0(ej3, 3), new qi3(ej3), new qi3(ej3)};
        this.c = new Object();
    }

    public adb(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}
