package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: adc  reason: default package */
public final class adc implements wjf {
    public static final Set h0 = Collections.unmodifiableSet(EnumSet.of(zcc.b, zcc.c));
    public static final Set i0 = Collections.unmodifiableSet(EnumSet.of(zcc.a, zcc.o, zcc.s0, zcc.Z, zcc.t0));
    public static final b9b j0;
    public static final mc0 k0;
    public static final ab0 l0;
    public static final RuntimeException m0 = new RuntimeException("The video frame producer became inactive before any data was received.");
    public static final av1 n0 = new Object();
    public static final q6d o0 = new q6d(ju0.z());
    public static final int p0 = 3;
    public static final long q0 = 1000;
    public Surface A;
    public Surface B;
    public MediaMuxer C;
    public final cd6 D;
    public e70 E;
    public n05 F;
    public q64 G;
    public d15 H;
    public q64 I;
    public Uri J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public Throwable T;
    public d05 U;
    public final go9 V;
    public Throwable W;
    public boolean X;
    public ScheduledFuture Y;
    public boolean Z;
    public final cd6 a;
    public zm4 a0;
    public final cd6 b;
    public zm4 b0;
    public final Executor c;
    public double c0;
    public final Executor d;
    public boolean d0;
    public final q6d e;
    public wj4 e0;
    public final av1 f;
    public int f0;
    public final av1 g;
    public int g0;
    public final Object h = new Object();
    public final boolean i;
    public final int j;
    public zcc k;
    public zcc l;
    public int m;
    public nb0 n;
    public nb0 o;
    public long p;
    public nb0 q;
    public boolean r;
    public cc0 s;
    public cc0 t;
    public nc0 u;
    public final ArrayList v;
    public Integer w;
    public Integer x;
    public see y;
    public bue z;

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, av1] */
    static {
        mb0 mb0 = mb0.f;
        b9b l2 = b9b.l(Arrays.asList(new mb0[]{mb0, mb0.e, mb0.d}), new la0(mb0, 1));
        j0 = l2;
        lc0 a2 = mc0.a();
        a2.a = l2;
        a2.d = -1;
        mc0 a3 = a2.a();
        k0 = a3;
        nw4 a4 = ab0.a();
        a4.o = -1;
        a4.b = a3;
        l0 = a4.f();
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [lc0, java.lang.Object] */
    public adc(ExecutorService executorService, ab0 ab0, av1 av1, av1 av12) {
        this.i = xi4.a.e(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = zcc.a;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = 0;
        this.q = null;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new ArrayList();
        this.w = null;
        this.x = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f0 = 1;
        this.J = Uri.EMPTY;
        this.K = 0;
        this.L = 0;
        this.M = Long.MAX_VALUE;
        this.N = Long.MAX_VALUE;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = 0;
        this.R = 0;
        this.S = 1;
        this.T = null;
        this.U = null;
        this.V = new go9(60, (av1) null);
        this.W = null;
        this.X = false;
        this.g0 = 3;
        this.Y = null;
        this.Z = false;
        this.b0 = null;
        this.c0 = 0.0d;
        this.d0 = false;
        this.e0 = null;
        this.c = executorService;
        Executor z2 = executorService == null ? ju0.z() : executorService;
        this.d = z2;
        q6d q6d = new q6d(z2);
        this.e = q6d;
        mc0 mc0 = ab0.a;
        o90 o90 = ab0.b;
        Integer valueOf = Integer.valueOf(ab0.c);
        if (ab0.a.d == -1) {
            al9 al9 = new al9(19);
            if (mc0 != null) {
                ? obj = new Object();
                obj.a = mc0.a;
                obj.b = mc0.b;
                obj.c = mc0.c;
                obj.d = Integer.valueOf(mc0.d);
                al9.accept(obj);
                mc0 = obj.a();
            } else {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
        }
        String str = mc0 == null ? " videoSpec" : "";
        str = o90 == null ? str.concat(" audioSpec") : str;
        if (str.isEmpty()) {
            this.D = new cd6(new ab0(mc0, o90, valueOf.intValue()));
            this.j = 0;
            this.a = new cd6(new ub0(this.m, m(this.k), (cc0) null));
            this.b = new cd6(Boolean.FALSE);
            this.f = av1;
            this.g = av12;
            this.a0 = new zm4(av1, q6d, z2);
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static Object l(cd6 cd6) {
        try {
            return cd6.j().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int m(zcc zcc) {
        return (zcc == zcc.X || (zcc == zcc.Z && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) xi4.a.e(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? 1 : 2;
    }

    public static boolean p(cdc cdc, nb0 nb0) {
        return nb0 != null && cdc.c == nb0.x0;
    }

    public static void r(n05 n05) {
        if (n05 instanceof d15) {
            d15 d15 = (d15) n05;
            d15.h.execute(new r05(d15, 5));
        }
    }

    public final void A(Surface surface) {
        int i2;
        if (this.A != surface) {
            this.A = surface;
            synchronized (this.h) {
                if (surface != null) {
                    try {
                        i2 = surface.hashCode();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    i2 = 0;
                }
                if (this.m != i2) {
                    this.m = i2;
                    this.a.v(new ub0(i2, m(this.k), this.s));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(defpackage.zcc r4) {
        /*
            r3 = this;
            zcc r0 = r3.k
            if (r0 == r4) goto L_0x0062
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r4)
            java.util.Set r0 = h0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L_0x0043
            zcc r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x004a
            java.util.Set r0 = i0
            zcc r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002d
            zcc r0 = r3.k
            r3.l = r0
            int r0 = m(r0)
            goto L_0x004b
        L_0x002d:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            zcc r3 = r3.k
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L_0x0043:
            zcc r0 = r3.l
            if (r0 == 0) goto L_0x004a
            r0 = 0
            r3.l = r0
        L_0x004a:
            r0 = 0
        L_0x004b:
            r3.k = r4
            if (r0 != 0) goto L_0x0053
            int r0 = m(r4)
        L_0x0053:
            int r4 = r3.m
            cc0 r1 = r3.s
            ub0 r2 = new ub0
            r2.<init>(r4, r0, r1)
            cd6 r3 = r3.a
            r3.v(r2)
            return
        L_0x0062:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempted to transition to state "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", but Recorder is already in state "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.B(zcc):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7 A[Catch:{ all -> 0x005d, all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec A[Catch:{ all -> 0x005d, all -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e A[Catch:{ all -> 0x005d, all -> 0x0128 }, LOOP:2: B:62:0x0108->B:64:0x010e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(defpackage.nb0 r11) {
        /*
            r10 = this;
            android.media.MediaMuxer r0 = r10.C
            if (r0 != 0) goto L_0x0135
            boolean r0 = r10.n()
            go9 r1 = r10.V
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.g()
            if (r0 != 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Audio is enabled but no audio sample is ready. Cannot start media muxer."
            r10.<init>(r11)
            throw r10
        L_0x001b:
            d05 r0 = r10.U
            if (r0 == 0) goto L_0x012d
            r2 = 0
            r10.U = r2     // Catch:{ all -> 0x005d }
            long r3 = r0.Y()     // Catch:{ all -> 0x005d }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x005d }
            r5.<init>()     // Catch:{ all -> 0x005d }
        L_0x002b:
            boolean r6 = r1.g()     // Catch:{ all -> 0x005d }
            if (r6 != 0) goto L_0x0043
            java.lang.Object r6 = r1.d()     // Catch:{ all -> 0x005d }
            d05 r6 = (defpackage.d05) r6     // Catch:{ all -> 0x005d }
            long r7 = r6.Y()     // Catch:{ all -> 0x005d }
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x002b
            r5.add(r6)     // Catch:{ all -> 0x005d }
            goto L_0x002b
        L_0x0043:
            long r3 = r0.size()     // Catch:{ all -> 0x005d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x004b:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x005d }
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x005d }
            d05 r6 = (defpackage.d05) r6     // Catch:{ all -> 0x005d }
            long r6 = r6.size()     // Catch:{ all -> 0x005d }
            long r3 = r3 + r6
            goto L_0x004b
        L_0x005d:
            r10 = move-exception
            goto L_0x0124
        L_0x0060:
            long r6 = r10.Q     // Catch:{ all -> 0x005d }
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 2
            if (r1 == 0) goto L_0x0087
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0087
            java.lang.String r1 = "Initial data exceeds file size limit %d > %d"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005d }
            long r4 = r10.Q     // Catch:{ all -> 0x005d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x005d }
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch:{ all -> 0x005d }
            java.lang.String.format(r1, r3)     // Catch:{ all -> 0x005d }
            r10.s(r11, r8, r2)     // Catch:{ all -> 0x005d }
            r0.close()
            return
        L_0x0087:
            cd6 r1 = r10.D     // Catch:{ IOException -> 0x00b2 }
            java.lang.Object r1 = l(r1)     // Catch:{ IOException -> 0x00b2 }
            ab0 r1 = (defpackage.ab0) r1     // Catch:{ IOException -> 0x00b2 }
            int r1 = r1.c     // Catch:{ IOException -> 0x00b2 }
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x00b4
            nc0 r1 = r10.u     // Catch:{ IOException -> 0x00b2 }
            ab0 r2 = l0     // Catch:{ IOException -> 0x00b2 }
            int r2 = r2.c     // Catch:{ IOException -> 0x00b2 }
            if (r2 == r4) goto L_0x00a0
            r2 = r3
            goto L_0x00a1
        L_0x00a0:
            r2 = r4
        L_0x00a1:
            if (r1 == 0) goto L_0x00b0
            int r1 = r1.b     // Catch:{ IOException -> 0x00b2 }
            if (r1 == r4) goto L_0x00b9
            if (r1 == r8) goto L_0x00b8
            r3 = 9
            if (r1 == r3) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r8 = r4
            goto L_0x00b9
        L_0x00b0:
            r8 = r2
            goto L_0x00b9
        L_0x00b2:
            r1 = move-exception
            goto L_0x011c
        L_0x00b4:
            if (r1 == r4) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r3 = r4
        L_0x00b8:
            r8 = r3
        L_0x00b9:
            cy1 r1 = new cy1     // Catch:{ IOException -> 0x00b2 }
            r2 = 6
            r1.<init>(r2, r10)     // Catch:{ IOException -> 0x00b2 }
            android.media.MediaMuxer r1 = r11.m(r8, r1)     // Catch:{ IOException -> 0x00b2 }
            cc0 r2 = r10.t     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00cf
            r10.z(r2)     // Catch:{ all -> 0x005d }
            int r2 = r2.b     // Catch:{ all -> 0x005d }
            r1.setOrientationHint(r2)     // Catch:{ all -> 0x005d }
        L_0x00cf:
            hi5 r2 = r11.s0     // Catch:{ all -> 0x005d }
            ma0 r2 = r2.a     // Catch:{ all -> 0x005d }
            r2.getClass()     // Catch:{ all -> 0x005d }
            q64 r2 = r10.G     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x005d }
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch:{ all -> 0x005d }
            int r2 = r1.addTrack(r2)     // Catch:{ all -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005d }
            r10.x = r2     // Catch:{ all -> 0x005d }
            boolean r2 = r10.n()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00fc
            q64 r2 = r10.I     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x005d }
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch:{ all -> 0x005d }
            int r2 = r1.addTrack(r2)     // Catch:{ all -> 0x005d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005d }
            r10.w = r2     // Catch:{ all -> 0x005d }
        L_0x00fc:
            r1.start()     // Catch:{ all -> 0x005d }
            r10.C = r1     // Catch:{ all -> 0x005d }
            r10.K(r0, r11)     // Catch:{ all -> 0x005d }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x0108:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0118
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x005d }
            d05 r2 = (defpackage.d05) r2     // Catch:{ all -> 0x005d }
            r10.J(r2, r11)     // Catch:{ all -> 0x005d }
            goto L_0x0108
        L_0x0118:
            r0.close()
            return
        L_0x011c:
            r2 = 5
            r10.s(r11, r2, r1)     // Catch:{ all -> 0x005d }
            r0.close()
            return
        L_0x0124:
            r0.close()     // Catch:{ all -> 0x0128 }
            goto L_0x012c
        L_0x0128:
            r11 = move-exception
            r10.addSuppressed(r11)
        L_0x012c:
            throw r10
        L_0x012d:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Media muxer cannot be started without an encoded video frame."
            r10.<init>(r11)
            throw r10
        L_0x0135:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = "Unable to set up media muxer when one already exists."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.C(nb0):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: x8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: l0f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: x8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: x8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(defpackage.nb0 r13) {
        /*
            r12 = this;
            cd6 r0 = r12.D
            java.lang.Object r0 = l(r0)
            ab0 r0 = (defpackage.ab0) r0
            nc0 r1 = r12.u
            int r2 = r0.c
            java.lang.String r3 = "audio/vorbis"
            r4 = 1
            java.lang.String r5 = "audio/mp4a-latm"
            if (r2 == r4) goto L_0x0015
            r6 = r5
            goto L_0x0016
        L_0x0015:
            r6 = r3
        L_0x0016:
            if (r2 == r4) goto L_0x0019
            r3 = r5
        L_0x0019:
            boolean r3 = r3.equals(r5)
            r4 = -1
            if (r3 == 0) goto L_0x0022
            r3 = 2
            goto L_0x0023
        L_0x0022:
            r3 = r4
        L_0x0023:
            r5 = 0
            if (r1 == 0) goto L_0x0044
            fa0 r1 = r1.e
            if (r1 == 0) goto L_0x0044
            java.lang.String r7 = r1.b
            java.lang.String r8 = "audio/none"
            boolean r8 = java.util.Objects.equals(r7, r8)
            if (r8 == 0) goto L_0x0035
            goto L_0x0044
        L_0x0035:
            int r8 = r1.f
            if (r2 != r4) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            boolean r2 = r6.equals(r7)
            if (r2 == 0) goto L_0x0044
            if (r3 != r8) goto L_0x0044
            r8 = r3
            goto L_0x0047
        L_0x0044:
            r8 = r3
            r1 = r5
            r7 = r6
        L_0x0047:
            if (r7 == 0) goto L_0x00ff
            if (r1 == 0) goto L_0x004d
            r11 = r1
            goto L_0x004e
        L_0x004d:
            r11 = r5
        L_0x004e:
            o90 r1 = r0.b
            if (r11 == 0) goto L_0x0059
            va8 r2 = new va8
            r3 = 5
            r2.<init>((java.lang.Object) r1, (int) r3, (java.lang.Object) r11)
            goto L_0x005f
        L_0x0059:
            wmc r2 = new wmc
            r3 = 0
            r2.<init>(r1, r3)
        L_0x005f:
            java.lang.Object r1 = r2.get()
            r10 = r1
            n90 r10 = (defpackage.n90) r10
            e70 r1 = r12.E
            if (r1 == 0) goto L_0x006d
            r12.u()
        L_0x006d:
            boolean r1 = r13.v0
            if (r1 == 0) goto L_0x00eb
            java.util.concurrent.atomic.AtomicReference r1 = r13.o
            java.lang.Object r1 = r1.getAndSet(r5)
            ycc r1 = (defpackage.ycc) r1
            if (r1 == 0) goto L_0x00d7
            q6d r13 = o0
            e70 r13 = r1.a(r10, r13)
            r12.E = r13
            int r13 = r13.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r1 = "Set up new audio source: 0x%x"
            java.lang.String.format(r1, r13)
            o90 r9 = r0.b
            if (r11 == 0) goto L_0x009f
            x8 r13 = new x8
            r6 = r13
            r6.<init>((java.lang.String) r7, (int) r8, (defpackage.o90) r9, (defpackage.n90) r10, (defpackage.fa0) r11)
            goto L_0x00a4
        L_0x009f:
            l0f r13 = new l0f
            r13.<init>((java.lang.String) r7, (int) r8, (defpackage.o90) r9, (defpackage.n90) r10)
        L_0x00a4:
            java.lang.Object r13 = r13.get()
            m90 r13 = (defpackage.m90) r13
            av1 r0 = r12.g
            r0.getClass()
            d15 r0 = new d15
            java.util.concurrent.Executor r1 = r12.d
            r0.<init>(r1, r13)
            r12.H = r0
            k05 r13 = r0.f
            boolean r0 = r13 instanceof defpackage.z05
            if (r0 == 0) goto L_0x00cf
            e70 r12 = r12.E
            z05 r13 = (defpackage.z05) r13
            q6d r0 = r12.a
            c r1 = new c
            r2 = 9
            r1.<init>(r12, r2, r13)
            r0.execute(r1)
            return
        L_0x00cf:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r13 = "The EncoderInput of audio isn't a ByteBufferInput."
            r12.<init>(r13)
            throw r12
        L_0x00d7:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "One-time audio source creation has already occurred for recording "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x00eb:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recording does not have audio enabled. Unable to create audio source for recording "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x00ff:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null mimeType"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.D(nb0):void");
    }

    public final void E(nb0 nb0, boolean z2) {
        if (this.q == null) {
            hi5 hi5 = nb0.s0;
            ma0 ma0 = hi5.a;
            if (ma0.a > 0) {
                this.Q = Math.round(((double) ma0.a) * 0.95d);
            } else {
                this.Q = 0;
            }
            ma0 ma02 = hi5.a;
            if (ma02.b > 0) {
                this.R = TimeUnit.MILLISECONDS.toNanos(ma02.b);
            } else {
                this.R = 0;
            }
            this.q = nb0;
            int s2 = au1.s(this.f0);
            int i2 = 5;
            int i3 = 4;
            boolean z3 = nb0.v0;
            if (s2 != 0) {
                if (s2 == 1) {
                    if (!z3) {
                        i3 = 3;
                    }
                    this.f0 = i3;
                } else if (s2 == 2 || s2 == 3 || s2 == 4 || s2 == 5) {
                    throw new AssertionError("Incorrectly invoke startInternal in audio state ".concat(z7b.n(this.f0)));
                }
            } else if (z3) {
                if (((ab0) l(this.D)).b.e != 0) {
                    try {
                        if (this.q.w0) {
                            if (this.H == null) {
                            }
                            this.f0 = 4;
                        }
                        D(nb0);
                        this.f0 = 4;
                    } catch (AudioSourceAccessException | InvalidConfigException e2) {
                        if (!(e2 instanceof InvalidConfigException)) {
                            i2 = 6;
                        }
                        this.f0 = i2;
                        this.W = e2;
                    }
                } else {
                    throw new AssertionError("The Recorder doesn't support recording with audio");
                }
            }
            G(nb0, false);
            if (n()) {
                e70 e70 = this.E;
                e70.a.execute(new c70(e70, nb0.Y.get(), 0));
                this.H.k();
            }
            ((d15) this.F).k();
            nb0 nb02 = this.q;
            nb02.n(new xkf(nb02.s0, k()));
            if (z2) {
                t(nb0);
                return;
            }
            return;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    public final void F(nb0 nb0, long j2, int i2, Exception exc) {
        if (this.q == nb0 && !this.r) {
            this.r = true;
            this.S = i2;
            this.T = exc;
            if (n()) {
                while (true) {
                    go9 go9 = this.V;
                    if (go9.g()) {
                        break;
                    }
                    go9.d();
                }
                d15 d15 = this.H;
                d15.q.getClass();
                d15.h.execute(new u05(0, j2, pq9.u(), d15));
            }
            d05 d05 = this.U;
            if (d05 != null) {
                d05.close();
                this.U = null;
            }
            if (this.g0 != 2) {
                u3c u3c = new u3c(4, this.F);
                this.Y = ju0.D().schedule((Runnable) new do9(this.e, 27, u3c), 1000, TimeUnit.MILLISECONDS);
            } else {
                r(this.F);
            }
            d15 d152 = (d15) this.F;
            d152.q.getClass();
            d152.h.execute(new u05(0, j2, pq9.u(), d152));
        }
    }

    public final void G(nb0 nb0, boolean z2) {
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            nl7 b2 = kq0.b(arrayList);
            if (!b2.isDone()) {
                b2.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(f8.g(new ucc(this, nb0, 0)));
        if (n() && !z2) {
            arrayList.add(f8.g(new ucc(this, nb0, 1)));
        }
        kq0.a(kq0.b(arrayList), new wmc(this, false), ju0.k());
    }

    public final void H() {
        nb0 nb0 = this.q;
        if (nb0 != null) {
            nb0.n(new xkf(nb0.s0, k()));
        }
    }

    public final void I(zcc zcc) {
        if (!h0.contains(this.k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.k);
        } else if (!i0.contains(zcc)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + zcc);
        } else if (this.l != zcc) {
            this.l = zcc;
            this.a.v(new ub0(this.m, m(zcc), this.s));
        }
    }

    public final void J(d05 d05, nb0 nb0) {
        nb0 nb02 = nb0;
        long size = d05.size() + this.K;
        long j2 = this.Q;
        if (j2 == 0 || size <= j2) {
            long Y2 = d05.Y();
            long j3 = this.N;
            if (j3 == Long.MAX_VALUE) {
                this.N = Y2;
                String.format("First audio time: %d (%s)", new Object[]{Long.valueOf(Y2), a14.H(this.N)});
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long nanos = timeUnit.toNanos(Y2 - Math.min(this.M, j3));
                c54.p("There should be a previous data for adjusting the duration.", this.P != Long.MAX_VALUE);
                long nanos2 = timeUnit.toNanos(Y2 - this.P) + nanos;
                long j4 = this.R;
                if (j4 != 0 && nanos2 > j4) {
                    String.format("Audio data reaches duration limit %d > %d", new Object[]{Long.valueOf(nanos2), Long.valueOf(this.R)});
                    s(nb02, 9, (IOException) null);
                    return;
                }
            }
            this.C.writeSampleData(this.w.intValue(), d05.r(), d05.F());
            this.K = size;
            this.P = Y2;
            return;
        }
        String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.Q)});
        s(nb02, 2, (IOException) null);
    }

    public final void K(d05 d05, nb0 nb0) {
        nb0 nb02 = nb0;
        if (this.x != null) {
            long size = d05.size() + this.K;
            long j2 = this.Q;
            long j3 = 0;
            if (j2 == 0 || size <= j2) {
                long Y2 = d05.Y();
                long j4 = this.M;
                if (j4 == Long.MAX_VALUE) {
                    this.M = Y2;
                    String.format("First video time: %d (%s)", new Object[]{Long.valueOf(Y2), a14.H(this.M)});
                } else {
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    long nanos = timeUnit.toNanos(Y2 - Math.min(j4, this.N));
                    c54.p("There should be a previous data for adjusting the duration.", this.O != Long.MAX_VALUE);
                    long nanos2 = timeUnit.toNanos(Y2 - this.O) + nanos;
                    long j5 = this.R;
                    if (j5 == 0 || nanos2 <= j5) {
                        j3 = nanos;
                    } else {
                        String.format("Video data reaches duration limit %d > %d", new Object[]{Long.valueOf(nanos2), Long.valueOf(this.R)});
                        s(nb02, 9, (IOException) null);
                        return;
                    }
                }
                this.C.writeSampleData(this.x.intValue(), d05.r(), d05.F());
                this.K = size;
                this.L = j3;
                this.O = Y2;
                H();
                return;
            }
            String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.Q)});
            s(nb02, 2, (IOException) null);
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    public final void a(see see) {
        f(see, bue.a);
    }

    public final ry9 b() {
        return this.D;
    }

    public final void c(int i2) {
        this.e.execute(new l40(i2, 13, this));
    }

    public final ry9 d() {
        return this.a;
    }

    public final ry9 e() {
        return this.b;
    }

    public final void f(see see, bue bue) {
        synchronized (this.h) {
            try {
                Objects.toString(this.k);
                if (this.k == zcc.t0) {
                    B(zcc.a);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.e.execute(new v05((Object) this, (Object) see, (Object) bue, 25));
    }

    public final kdf g(yw1 yw1) {
        return new bdc(this.j, yw1);
    }

    public final void h(see see, bue bue, boolean z2) {
        mb0 mb0;
        Object obj;
        if (!see.a()) {
            qcc qcc = new qcc(this);
            q6d q6d = this.e;
            see.c(q6d, qcc);
            int i2 = 0;
            bdc bdc = new bdc(0, see.e.p());
            eu4 eu4 = see.c;
            fz1 d2 = bdc.d(eu4);
            Size size = see.b;
            if (d2 == null) {
                mb0 = mb0.j;
            } else {
                TreeMap treeMap = d2.b;
                Size size2 = msd.a;
                Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
                if (ceilingEntry != null) {
                    obj = ceilingEntry.getValue();
                } else {
                    Map.Entry floorEntry = treeMap.floorEntry(size);
                    obj = floorEntry != null ? floorEntry.getValue() : null;
                }
                mb0 = (mb0) obj;
                if (mb0 == null) {
                    mb0 = mb0.j;
                }
            }
            Objects.toString(mb0);
            Objects.toString(size);
            if (mb0 != mb0.j) {
                nc0 b2 = bdc.b(mb0, eu4);
                this.u = b2;
                if (b2 == null) {
                    throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
                }
            }
            wj4 wj4 = this.e0;
            if (wj4 != null && !wj4.b) {
                wj4.b = true;
                ScheduledFuture scheduledFuture = (ScheduledFuture) wj4.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    wj4.f = null;
                }
            }
            if (z2) {
                i2 = p0;
            }
            wj4 wj42 = new wj4(this, see, bue, i2);
            this.e0 = wj42;
            Objects.toString(this.F);
            zm4 zm4 = this.a0;
            zm4.e();
            kq0.w((bm7) zm4.k).d(new v05((Object) wj42, (Object) see, (Object) bue, 26), q6d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fc, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        r10 = null;
        r0 = null;
        r9 = false;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0123, code lost:
        if (r8.g0 != 3) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0125, code lost:
        r10 = r8.o;
        r8.o = null;
        B(defpackage.zcc.a);
        r0 = m0;
        r6 = 4;
        r2 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0136, code lost:
        if (r8.i == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0138, code lost:
        r8.B = null;
        r10 = r8.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013c, code lost:
        if (r10 == null) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0142, code lost:
        if (r10.a() != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0145, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0146, code lost:
        I(defpackage.zcc.a);
        r10 = null;
        r0 = null;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0151, code lost:
        if (r8.F == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0153, code lost:
        r0 = null;
        r2 = 0;
        r4 = 0;
        r6 = 0;
        r1 = q(r8.k);
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0160, code lost:
        r10 = null;
        r0 = null;
        r2 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Throwable r9, int r10) {
        /*
            r8 = this;
            nb0 r0 = r8.q
            if (r0 == 0) goto L_0x019f
            android.media.MediaMuxer r0 = r8.C
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001d
            r0.stop()     // Catch:{ IllegalStateException -> 0x0013 }
            android.media.MediaMuxer r0 = r8.C     // Catch:{ IllegalStateException -> 0x0013 }
            r0.release()     // Catch:{ IllegalStateException -> 0x0013 }
            goto L_0x001a
        L_0x0013:
            r0 = move-exception
            r0.getMessage()
            if (r10 != 0) goto L_0x001a
            r10 = r2
        L_0x001a:
            r8.C = r1
            goto L_0x0021
        L_0x001d:
            if (r10 != 0) goto L_0x0021
            r10 = 8
        L_0x0021:
            nb0 r0 = r8.q
            android.net.Uri r3 = r8.J
            r0.a(r3)
            nb0 r0 = r8.q
            hi5 r0 = r0.s0
            ob0 r3 = r8.k()
            android.net.Uri r4 = r8.J
            java.lang.String r5 = "OutputUri cannot be null."
            defpackage.c54.o(r4, r5)
            nb0 r4 = r8.q
            r5 = 0
            if (r10 != 0) goto L_0x0042
            skf r9 = new skf
            r9.<init>(r0, r3, r5, r1)
            goto L_0x0052
        L_0x0042:
            if (r10 == 0) goto L_0x0046
            r6 = r2
            goto L_0x0047
        L_0x0046:
            r6 = r5
        L_0x0047:
            java.lang.String r7 = "An error type is required."
            defpackage.c54.j(r7, r6)
            skf r6 = new skf
            r6.<init>(r0, r3, r10, r9)
            r9 = r6
        L_0x0052:
            r4.n(r9)
            nb0 r9 = r8.q
            r8.q = r1
            r8.r = r5
            r8.w = r1
            r8.x = r1
            java.util.ArrayList r10 = r8.v
            r10.clear()
            android.net.Uri r10 = android.net.Uri.EMPTY
            r8.J = r10
            r3 = 0
            r8.K = r3
            r8.L = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.M = r3
            r8.N = r3
            r8.O = r3
            r8.P = r3
            r8.S = r2
            r8.T = r1
            r8.W = r1
            r3 = 0
            r8.c0 = r3
        L_0x0085:
            go9 r10 = r8.V
            boolean r0 = r10.g()
            if (r0 != 0) goto L_0x0091
            r10.d()
            goto L_0x0085
        L_0x0091:
            r8.z(r1)
            int r10 = r8.f0
            int r10 = defpackage.au1.s(r10)
            if (r10 == r2) goto L_0x0197
            r0 = 3
            r3 = 2
            r4 = 4
            if (r10 == r3) goto L_0x00ac
            if (r10 == r0) goto L_0x00ac
            if (r10 == r4) goto L_0x00a9
            r3 = 5
            if (r10 == r3) goto L_0x00a9
            goto L_0x00bc
        L_0x00a9:
            r8.f0 = r2
            goto L_0x00bc
        L_0x00ac:
            r8.f0 = r3
            e70 r10 = r8.E
            q6d r3 = r10.a
            b r6 = new b
            r7 = 12
            r6.<init>((int) r7, (java.lang.Object) r10)
            r3.execute(r6)
        L_0x00bc:
            java.lang.String r10 = "Unexpected state on finalize of recording: "
            java.lang.Object r3 = r8.h
            monitor-enter(r3)
            nb0 r6 = r8.n     // Catch:{ all -> 0x00ef }
            if (r6 != r9) goto L_0x018d
            cd6 r9 = r6.Z     // Catch:{ all -> 0x00ef }
            r9.n()     // Catch:{ all -> 0x00ef }
            r8.n = r1     // Catch:{ all -> 0x00ef }
            zcc r9 = r8.k     // Catch:{ all -> 0x00ef }
            int r9 = r9.ordinal()     // Catch:{ all -> 0x00ef }
            switch(r9) {
                case 1: goto L_0x0120;
                case 2: goto L_0x011e;
                case 3: goto L_0x010a;
                case 4: goto L_0x00de;
                case 5: goto L_0x00de;
                case 6: goto L_0x00de;
                case 7: goto L_0x00d6;
                default: goto L_0x00d5;
            }     // Catch:{ all -> 0x00ef }
        L_0x00d5:
            goto L_0x0104
        L_0x00d6:
            r10 = r1
            r0 = r10
            r4 = r2
            r9 = r5
            r2 = r9
            r6 = r2
            goto L_0x0164
        L_0x00de:
            boolean r9 = r8.i     // Catch:{ all -> 0x00ef }
            if (r9 == 0) goto L_0x00ff
            r8.B = r1     // Catch:{ all -> 0x00ef }
            see r9 = r8.y     // Catch:{ all -> 0x00ef }
            if (r9 == 0) goto L_0x00f2
            boolean r9 = r9.a()     // Catch:{ all -> 0x00ef }
            if (r9 != 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00ef:
            r8 = move-exception
            goto L_0x0195
        L_0x00f2:
            r2 = r5
        L_0x00f3:
            zcc r9 = defpackage.zcc.a     // Catch:{ all -> 0x00ef }
            r8.B(r9)     // Catch:{ all -> 0x00ef }
            r10 = r1
            r0 = r10
            r9 = r5
            r4 = r9
        L_0x00fc:
            r6 = r4
            goto L_0x0164
        L_0x00ff:
            zcc r9 = defpackage.zcc.o     // Catch:{ all -> 0x00ef }
            r8.B(r9)     // Catch:{ all -> 0x00ef }
        L_0x0104:
            r10 = r1
            r0 = r10
            r9 = r5
            r2 = r9
        L_0x0108:
            r4 = r2
            goto L_0x00fc
        L_0x010a:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x00ef }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r0.<init>(r10)     // Catch:{ all -> 0x00ef }
            zcc r8 = r8.k     // Catch:{ all -> 0x00ef }
            r0.append(r8)     // Catch:{ all -> 0x00ef }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x00ef }
            r9.<init>(r8)     // Catch:{ all -> 0x00ef }
            throw r9     // Catch:{ all -> 0x00ef }
        L_0x011e:
            r9 = r2
            goto L_0x0121
        L_0x0120:
            r9 = r5
        L_0x0121:
            int r10 = r8.g0     // Catch:{ all -> 0x00ef }
            if (r10 != r0) goto L_0x0134
            nb0 r10 = r8.o     // Catch:{ all -> 0x00ef }
            r8.o = r1     // Catch:{ all -> 0x00ef }
            zcc r0 = defpackage.zcc.a     // Catch:{ all -> 0x00ef }
            r8.B(r0)     // Catch:{ all -> 0x00ef }
            java.lang.RuntimeException r0 = m0     // Catch:{ all -> 0x00ef }
            r6 = r4
            r2 = r5
            r4 = r2
            goto L_0x0164
        L_0x0134:
            boolean r10 = r8.i     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x014f
            r8.B = r1     // Catch:{ all -> 0x00ef }
            see r10 = r8.y     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x0145
            boolean r10 = r10.a()     // Catch:{ all -> 0x00ef }
            if (r10 != 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r2 = r5
        L_0x0146:
            zcc r10 = defpackage.zcc.a     // Catch:{ all -> 0x00ef }
            r8.I(r10)     // Catch:{ all -> 0x00ef }
            r10 = r1
            r0 = r10
            r4 = r5
            goto L_0x00fc
        L_0x014f:
            n05 r10 = r8.F     // Catch:{ all -> 0x00ef }
            if (r10 == 0) goto L_0x0160
            zcc r10 = r8.k     // Catch:{ all -> 0x00ef }
            nb0 r10 = r8.q(r10)     // Catch:{ all -> 0x00ef }
            r0 = r1
            r2 = r5
            r4 = r2
            r6 = r4
            r1 = r10
            r10 = r0
            goto L_0x0164
        L_0x0160:
            r10 = r1
            r0 = r10
            r2 = r5
            goto L_0x0108
        L_0x0164:
            monitor-exit(r3)     // Catch:{ all -> 0x00ef }
            if (r2 == 0) goto L_0x016f
            see r9 = r8.y
            bue r10 = r8.z
            r8.h(r9, r10, r5)
            goto L_0x018c
        L_0x016f:
            if (r4 == 0) goto L_0x0175
            r8.w()
            goto L_0x018c
        L_0x0175:
            if (r1 == 0) goto L_0x0187
            boolean r10 = r8.i
            if (r10 != 0) goto L_0x017f
            r8.E(r1, r9)
            goto L_0x018c
        L_0x017f:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "Attempt to start a pending recording while the Recorder is waiting for a new surface request."
            r8.<init>(r9)
            throw r8
        L_0x0187:
            if (r10 == 0) goto L_0x018c
            r8.j(r10, r6, r0)
        L_0x018c:
            return
        L_0x018d:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x00ef }
            java.lang.String r9 = "Active recording did not match finalized recording on finalize."
            r8.<init>(r9)     // Catch:{ all -> 0x00ef }
            throw r8     // Catch:{ all -> 0x00ef }
        L_0x0195:
            monitor-exit(r3)     // Catch:{ all -> 0x00ef }
            throw r8
        L_0x0197:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "Incorrectly finalize recording when audio state is IDLING"
            r8.<init>(r9)
            throw r8
        L_0x019f:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "Attempted to finalize in-progress recording, but no recording is in progress."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.i(java.lang.Throwable, int):void");
    }

    public final void j(nb0 nb0, int i2, Throwable th) {
        Uri uri = Uri.EMPTY;
        nb0.a(uri);
        boolean z2 = true;
        ob0 a2 = ob0.a(0, 0, new p90(1, 0.0d, this.W));
        c54.o(uri, "OutputUri cannot be null.");
        if (i2 == 0) {
            z2 = false;
        }
        c54.j("An error type is required.", z2);
        nb0.n(new skf(nb0.s0, a2, i2, th));
    }

    public final ob0 k() {
        int i2;
        long j2 = this.L;
        long j3 = this.K;
        int i3 = this.f0;
        int s2 = au1.s(i3);
        if (s2 != 0) {
            i2 = 2;
            if (s2 != 2) {
                if (s2 != 3) {
                    i2 = 4;
                    if (s2 == 4) {
                        i2 = 3;
                    } else if (s2 != 5) {
                        throw new AssertionError("Invalid internal audio state: ".concat(z7b.n(i3)));
                    }
                } else {
                    nb0 nb0 = this.q;
                    if (nb0 != null && nb0.Y.get()) {
                        i2 = 5;
                    } else if (!this.X) {
                        i2 = 0;
                    }
                }
                return ob0.a(j2, j3, new p90(i2, this.c0, this.W));
            }
        }
        i2 = 1;
        return ob0.a(j2, j3, new p90(i2, this.c0, this.W));
    }

    public final boolean n() {
        return this.f0 == 4;
    }

    public final boolean o() {
        nb0 nb0 = this.q;
        return nb0 != null && nb0.w0;
    }

    public final nb0 q(zcc zcc) {
        boolean z2;
        if (zcc == zcc.c) {
            z2 = true;
        } else if (zcc == zcc.b) {
            z2 = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.n == null) {
            nb0 nb0 = this.o;
            if (nb0 != null) {
                this.n = nb0;
                nb0.Z.f(ju0.k(), new xrb(1, this));
                this.o = null;
                if (z2) {
                    B(zcc.Y);
                } else {
                    B(zcc.X);
                }
                return nb0;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    public final void s(nb0 nb0, int i2, IOException iOException) {
        boolean z2;
        if (nb0 == this.q) {
            synchronized (this.h) {
                try {
                    z2 = false;
                    switch (this.k.ordinal()) {
                        case 0:
                        case 3:
                        case 8:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.k);
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                            break;
                        case 4:
                        case 5:
                            B(zcc.Z);
                            z2 = true;
                            break;
                    }
                    if (nb0 != this.n) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                F(nb0, -1, i2, iOException);
                return;
            }
            return;
        }
        throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
    }

    public final void t(nb0 nb0) {
        if (this.q == nb0 && !this.r) {
            if (n()) {
                this.H.e();
            }
            ((d15) this.F).e();
            nb0 nb02 = this.q;
            nb02.n(new xkf(nb02.s0, k()));
        }
    }

    public final void u() {
        e70 e70 = this.E;
        if (e70 != null) {
            this.E = null;
            String.format("Releasing audio source: 0x%x", new Object[]{Integer.valueOf(e70.hashCode())});
            kq0.a(f8.g(new ync(8, e70)), new bkg(22, e70), ju0.k());
            return;
        }
        throw new AssertionError("Cannot release null audio source.");
    }

    public final void v(boolean z2) {
        boolean z3;
        boolean z4;
        synchronized (this.h) {
            try {
                z3 = true;
                z4 = false;
                switch (this.k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        I(zcc.s0);
                        break;
                    case 4:
                    case 5:
                        c54.p("In-progress recording shouldn't be null when in state " + this.k, this.q != null);
                        if (this.n == this.q) {
                            if (!o()) {
                                B(zcc.s0);
                                z4 = true;
                                z3 = false;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                    case 6:
                        B(zcc.s0);
                        break;
                }
                z3 = false;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z3) {
            if (z2) {
                x();
            } else {
                w();
            }
        } else if (z4) {
            F(this.q, -1, 4, (Exception) null);
        }
    }

    public final void w() {
        d15 d15 = this.H;
        if (d15 != null) {
            d15.h.execute(new r05(d15, 4));
            this.H = null;
            this.I = null;
        }
        if (this.E != null) {
            u();
        }
        this.f0 = 1;
        x();
    }

    public final void x() {
        see see;
        n05 n05 = this.F;
        boolean z2 = true;
        if (n05 != null) {
            zm4 zm4 = this.b0;
            if (zm4 != null) {
                c54.p((String) null, ((d15) zm4.f) == n05);
                Objects.toString(this.F);
                this.b0.u();
                this.b0 = null;
                this.F = null;
                this.G = null;
                A((Surface) null);
            } else {
                Objects.toString(n05);
                zm4 zm42 = this.a0;
                zm42.e();
                kq0.w((bm7) zm42.k);
            }
        }
        synchronized (this.h) {
            try {
                switch (this.k.ordinal()) {
                    case 1:
                    case 2:
                        I(zcc.a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z2 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        B(zcc.a);
                        break;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.Z = false;
        if (z2 && (see = this.y) != null && !see.a()) {
            h(this.y, this.z, false);
        }
    }

    public final void y() {
        if (h0.contains(this.k)) {
            B(this.l);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.k);
    }

    public final void z(cc0 cc0) {
        Objects.toString(cc0);
        this.s = cc0;
        synchronized (this.h) {
            this.a.v(new ub0(this.m, m(this.k), cc0));
        }
    }
}
