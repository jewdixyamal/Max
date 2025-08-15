package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import androidx.media3.muxer.Muxer$MuxerException;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: hj9  reason: default package */
public final class hj9 {
    public static final long x = oaf.S(500);
    public final String a;
    public final cj9 b;
    public final ece c;
    public final boolean d;
    public final SparseArray e;
    public final ScheduledExecutorService f;
    public final qy5 g;
    public final long h;
    public final MediaCodec.BufferInfo i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public long n;
    public ScheduledFuture o;
    public boolean p;
    public fj9 q;
    public int r;
    public boolean s;
    public boolean t;
    public long u;
    public volatile int v;
    public volatile int w;

    public hj9(String str, cj9 cj9, ece ece, int i2, boolean z, qy5 qy5, long j2) {
        this.a = str;
        this.b = cj9;
        this.c = ece;
        boolean z2 = false;
        fm9.f(i2 == 0 || i2 == 1);
        this.r = i2;
        this.d = z;
        if ((i2 == 0 && qy5 == null) || (i2 == 1 && qy5 != null)) {
            z2 = true;
        }
        fm9.e("appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.", z2);
        this.g = qy5;
        this.h = j2;
        this.e = new SparseArray();
        this.l = -2;
        this.u = -9223372036854775807L;
        this.f = Executors.newSingleThreadScheduledExecutor(new pd3(3, "Muxer:Timer"));
        this.i = new MediaCodec.BufferInfo();
    }

    public static gj9 e(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        gj9 gj9 = (gj9) sparseArray.valueAt(0);
        for (int i2 = 1; i2 < sparseArray.size(); i2++) {
            gj9 gj92 = (gj9) sparseArray.valueAt(i2);
            if (gj92.e < gj9.e) {
                gj9 = gj92;
            }
        }
        return gj9;
    }

    public final void a(qy5 qy5) {
        String str = qy5.n;
        int g2 = ia9.g(str);
        int i2 = 0;
        fm9.e("Unsupported track format: " + str, g2 == 1 || g2 == 2);
        if (g2 == 2) {
            ny5 a2 = qy5.a();
            a2.v = (qy5.w + this.v) % 360;
            qy5 = new qy5(a2);
            if (this.r == 1) {
                qy5 qy52 = this.g;
                qy52.getClass();
                boolean c2 = qy5.c(qy52);
                List list = qy5.q;
                if (!c2) {
                    if (Objects.equals(qy52.n, "video/avc") && Objects.equals(qy5.n, "video/avc")) {
                        List list2 = qy52.q;
                        if (list2.size() == 2 && list.size() == 2 && Arrays.equals((byte[]) list2.get(1), (byte[]) list.get(1))) {
                            byte[] bArr = (byte[]) list2.get(0);
                            byte[] bArr2 = (byte[]) list.get(0);
                            if (7 < bArr.length && bArr.length == bArr2.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < bArr.length) {
                                        if (i3 != 7 && bArr[i3] != bArr2[i3]) {
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < 4) {
                                                if (bArr[i4] != fm9.e[i4]) {
                                                    break;
                                                }
                                                i4++;
                                            } else if ((bArr[4] & 31) == 7 && bArr[5] != 0) {
                                                if (bArr2[7] < bArr[7]) {
                                                    list = list2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    list = null;
                }
                if (list != null) {
                    ny5 a3 = qy5.a();
                    a3.p = list;
                    qy5 = new qy5(a3);
                } else {
                    throw new Exception("Switching to MUXER_MODE_APPEND will fail.");
                }
            }
        }
        if (this.r == 2) {
            if (g2 == 2) {
                fm9.k(oaf.l(this.e, 2));
                qy5 qy53 = ((gj9) this.e.get(2)).a;
                if (!oaf.a(qy53.n, qy5.n)) {
                    throw new Exception("Video format mismatch - sampleMimeType: " + qy53.n + " != " + qy5.n);
                } else if (qy53.t != qy5.t) {
                    throw new Exception("Video format mismatch - width: " + qy53.t + " != " + qy5.t);
                } else if (qy53.u != qy5.u) {
                    throw new Exception("Video format mismatch - height: " + qy53.u + " != " + qy5.u);
                } else if (qy53.w == qy5.w) {
                    qy5 qy54 = this.g;
                    qy54.getClass();
                    if (!qy5.c(qy54)) {
                        throw new Exception("The initialization data of the newly added track format doesn't match appendVideoFormat.");
                    }
                } else {
                    throw new Exception("Video format mismatch - rotationDegrees: " + qy53.w + " != " + qy5.w);
                }
            } else if (g2 == 1) {
                fm9.k(oaf.l(this.e, 1));
                qy5 qy55 = ((gj9) this.e.get(1)).a;
                if (!oaf.a(qy55.n, qy5.n)) {
                    throw new Exception("Audio format mismatch - sampleMimeType: " + qy55.n + " != " + qy5.n);
                } else if (qy55.B != qy5.B) {
                    throw new Exception("Audio format mismatch - channelCount: " + qy55.B + " != " + qy5.B);
                } else if (qy55.C != qy5.C) {
                    throw new Exception("Audio format mismatch - sampleRate: " + qy55.C + " != " + qy5.C);
                } else if (!qy55.c(qy5)) {
                    throw new Exception("Audio format mismatch - initializationData.");
                }
            }
            g();
            return;
        }
        int i5 = this.w;
        fm9.j("The track count should be set before the formats are added.", i5 > 0);
        fm9.j("All track formats have already been added.", this.e.size() < i5);
        fm9.j("There is already a track of type " + g2, !oaf.l(this.e, g2));
        if (this.q == null) {
            this.q = this.b.D(this.a);
        }
        this.e.put(g2, new gj9(qy5, this.q.i(qy5)));
        oaf.H(g2);
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        if (qy5.k != null) {
            while (true) {
                d99[] d99Arr = qy5.k.a;
                if (i2 >= d99Arr.length) {
                    break;
                }
                this.q.e(d99Arr[i2]);
                i2++;
            }
        }
        if (this.e.size() == i5) {
            this.j = true;
            g();
        }
    }

    public final void b() {
        boolean z = true;
        if (this.r != 1) {
            z = false;
        }
        fm9.k(z);
        this.r = 2;
    }

    public final void c(int i2) {
        if (i2 != 0 || this.r != 1) {
            this.j = false;
            this.f.shutdownNow();
            fj9 fj9 = this.q;
            if (fj9 != null) {
                try {
                    fj9.close();
                } catch (Muxer$MuxerException e2) {
                    if (i2 == 1) {
                        String message = e2.getMessage();
                        message.getClass();
                        if (message.equals("Failed to stop the MediaMuxer")) {
                            return;
                        }
                    }
                    throw e2;
                }
            }
        }
    }

    public final long d() {
        long length = new File(this.a).length();
        if (length > 0) {
            return length;
        }
        return -1;
    }

    public final boolean f() {
        if (!this.k) {
            return this.r == 1 && this.s && (this.t || this.w == 1);
        }
        return true;
    }

    public final void g() {
        fm9.l(this.q);
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            ScheduledFuture scheduledFuture = this.o;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.o = this.f.schedule(new nn6(19, this), j2, TimeUnit.MILLISECONDS);
        }
    }

    public final boolean h(String str) {
        return this.b.w(ia9.g(str)).contains(str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean i(int r19, java.nio.ByteBuffer r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r5 = r22
            r3 = 4
            android.util.SparseArray r4 = r0.e
            boolean r4 = defpackage.oaf.l(r4, r1)
            defpackage.fm9.f(r4)
            android.util.SparseArray r4 = r0.e
            java.lang.Object r4 = r4.get(r1)
            r8 = r4
            gj9 r8 = (defpackage.gj9) r8
            boolean r4 = r0.d
            android.util.SparseArray r7 = r0.e
            r9 = 1
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 2
            if (r4 == 0) goto L_0x0039
            if (r1 == r13) goto L_0x0039
            boolean r4 = defpackage.oaf.l(r7, r13)
            if (r4 == 0) goto L_0x0039
            long r14 = r0.u
            int r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
        L_0x0037:
            r4 = r10
            goto L_0x0080
        L_0x0039:
            boolean r4 = r0.j
            if (r4 != 0) goto L_0x003e
            goto L_0x0037
        L_0x003e:
            int r4 = r7.size()
            if (r4 != r9) goto L_0x0046
        L_0x0044:
            r4 = r9
            goto L_0x0080
        L_0x0046:
            java.lang.Object r4 = r7.get(r1)
            gj9 r4 = (defpackage.gj9) r4
            long r14 = r4.e
            long r14 = r5 - r14
            long r16 = x
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x0068
            gj9 r4 = e(r7)
            r4.getClass()
            qy5 r4 = r4.a
            java.lang.String r4 = r4.n
            int r4 = defpackage.ia9.g(r4)
            if (r4 != r1) goto L_0x0068
        L_0x0067:
            goto L_0x0044
        L_0x0068:
            int r4 = r0.l
            if (r1 == r4) goto L_0x0077
            gj9 r4 = e(r7)
            r4.getClass()
            long r14 = r4.e
            r0.m = r14
        L_0x0077:
            long r14 = r0.m
            long r14 = r5 - r14
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 > 0) goto L_0x0037
            goto L_0x0067
        L_0x0080:
            defpackage.oaf.H(r19)
            java.util.LinkedHashMap r7 = defpackage.d54.a
            java.lang.Class<d54> r7 = defpackage.d54.class
            monitor-enter(r7)
            monitor-exit(r7)
            if (r1 != r13) goto L_0x0094
            long r13 = r0.u
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x00b0
            r0.u = r5
            goto L_0x00b0
        L_0x0094:
            if (r1 != r9) goto L_0x00b0
            boolean r7 = r0.d
            if (r7 == 0) goto L_0x00b0
            android.util.SparseArray r7 = r0.e
            boolean r7 = defpackage.oaf.l(r7, r13)
            if (r7 == 0) goto L_0x00b0
            long r13 = r0.u
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x00b0
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b0
            r18.g()
            return r9
        L_0x00b0:
            if (r4 != 0) goto L_0x00b3
            return r10
        L_0x00b3:
            int r4 = r8.d
            int r4 = r4 + r9
            r8.d = r4
            long r11 = r8.c
            int r4 = r20.remaining()
            long r13 = (long) r4
            long r11 = r11 + r13
            r8.c = r11
            long r11 = r8.e
            long r11 = java.lang.Math.max(r11, r5)
            r8.e = r11
            r18.g()
            fj9 r4 = r0.q
            defpackage.fm9.l(r4)
            android.media.MediaCodec$BufferInfo r4 = r0.i
            int r7 = r20.position()
            int r11 = r20.remaining()
            if (r2 != r9) goto L_0x00df
            r10 = r9
        L_0x00df:
            r2 = r2 & r3
            if (r2 != r3) goto L_0x00e5
            r2 = r10 | 4
            r10 = r2
        L_0x00e5:
            r2 = r4
            r3 = r7
            r4 = r11
            r5 = r22
            r7 = r10
            r2.set(r3, r4, r5, r7)
            fj9 r2 = r0.q
            g36 r3 = r8.b
            android.media.MediaCodec$BufferInfo r4 = r0.i
            r5 = r20
            r2.f(r3, r5, r4)
            defpackage.oaf.H(r19)
            java.lang.Class<d54> r2 = defpackage.d54.class
            monitor-enter(r2)
            monitor-exit(r2)
            r0.l = r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj9.i(int, java.nio.ByteBuffer, boolean, long):boolean");
    }
}
