package defpackage;

import android.animation.ValueAnimator;
import android.util.Rational;
import android.util.Size;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ejf  reason: default package */
public final class ejf implements ybc, ygf, uif {
    public static final /* synthetic */ bc7[] N0;
    public static final px1 O0 = px1.b;
    public final q0e A0 = r0e.a(new vif(new Size(0, 0), (String) null, (String) null));
    public gte B0;
    public volatile boolean C0;
    public final q0e D0;
    public final w7c E0;
    public volatile cdc F0;
    public final q0e G0;
    public final w7c H0;
    public float I0;
    public ValueAnimator J0;
    public bx1 K0;
    public final AtomicBoolean L0;
    public final w4d M0;
    public final je7 X;
    public ubc Y;
    public k9b Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final khe s0;
    public final ContextScope t0;
    public volatile h7b u0;
    public h8b v0;
    public zgf w0;
    public adc x0;
    public rdf y0;
    public hg7 z0;

    static {
        oi9 oi9 = new oi9(ejf.class, "recordingJob", "getRecordingJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        N0 = new bc7[]{oi9};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0099, code lost:
        r5 = (defpackage.gag) (r5 = ((defpackage.fjc) r5).b.r()).d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ejf(defpackage.je7 r5, defpackage.je7 r6, defpackage.je7 r7) {
        /*
            r4 = this;
            f9g r0 = defpackage.f9g.a
            v4 r1 = r0.getAccessor()
            java.lang.Class<iba> r2 = defpackage.iba.class
            java.lang.Object r1 = r1.c(r2)
            iba r1 = (defpackage.iba) r1
            v4 r2 = r0.getAccessor()
            java.lang.Class<kke> r3 = defpackage.kke.class
            khe r2 = r2.d(r3)
            v4 r0 = r0.getAccessor()
            java.lang.Class<qe5> r3 = defpackage.qe5.class
            khe r0 = r0.d(r3)
            r4.<init>()
            r4.a = r5
            r4.b = r7
            r4.c = r6
            r4.o = r2
            r4.X = r0
            gba r5 = new gba
            r6 = 2
            r5.<init>(r1, r6)
            khe r6 = new khe
            r6.<init>(r5)
            r4.s0 = r6
            java.lang.Object r5 = r2.getValue()
            kke r5 = (defpackage.kke) r5
            w9a r5 = (defpackage.w9a) r5
            cx7 r5 = r5.c()
            hde r6 = defpackage.f46.a()
            lx3 r5 = r5.plus(r6)
            kotlinx.coroutines.internal.ContextScope r5 = defpackage.j1e.a(r5)
            r4.t0 = r5
            vif r5 = new vif
            android.util.Size r6 = new android.util.Size
            r7 = 0
            r6.<init>(r7, r7)
            r0 = 0
            r5.<init>(r6, r0, r0)
            q0e r5 = defpackage.r0e.a(r5)
            r4.A0 = r5
            xgf r5 = new xgf
            r5.<init>(r7, r7)
            q0e r5 = defpackage.r0e.a(r5)
            r4.D0 = r5
            w7c r6 = new w7c
            r6.<init>(r5)
            r4.E0 = r6
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            q0e r5 = defpackage.r0e.a(r5)
            r4.G0 = r5
            w7c r6 = new w7c
            r6.<init>(r5)
            r4.H0 = r6
            yw1 r5 = r4.m()
            if (r5 == 0) goto L_0x00a6
            fjc r5 = (defpackage.fjc) r5
            yw1 r5 = r5.b
            xm7 r5 = r5.r()
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r5 = r5.d()
            gag r5 = (defpackage.gag) r5
            if (r5 == 0) goto L_0x00a6
            float r5 = r5.c()
            goto L_0x00a8
        L_0x00a6:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00a8:
            r4.I0 = r5
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>(r7)
            r4.L0 = r5
            w4d r5 = defpackage.mqd.D()
            r4.M0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.<init>(je7, je7, je7):void");
    }

    public final int a() {
        return 0;
    }

    public final boolean b() {
        return this.F0 != null;
    }

    public final void c() {
        String name = ejf.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "onFirstVideoFrameRendered", (Throwable) null);
        }
        zgf zgf = this.w0;
        if (zgf != null) {
            rpc rpc = new rpc(14, this);
            lee lee = zgf.e;
            sif sif = lee instanceof sif ? (sif) lee : null;
            if (sif != null) {
                String str = sif.a;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, str, "captureFrame", (Throwable) null);
                }
                sif.g(sif, new khf(sif, 2, rpc), new bse(12), 2);
            }
        }
    }

    public final void d() {
        String name = ejf.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "stopRecording videoMessage", (Throwable) null);
        }
        bx1 bx1 = this.K0;
        if (bx1 != null) {
            bx1.b.d(eg7.ON_STOP);
        }
        cdc cdc = this.F0;
        if (cdc != null) {
            cdc.close();
        }
        this.F0 = null;
        this.C0 = false;
    }

    public final void e() {
        String name = ejf.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "resumeRecording videoMessage", (Throwable) null);
        }
        bx1 bx1 = this.K0;
        if (bx1 != null) {
            bx1.b.d(eg7.ON_RESUME);
        }
        cdc cdc = this.F0;
        if (cdc != null) {
            cdc.n();
        }
        this.C0 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(long r8, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.xif
            if (r0 == 0) goto L_0x0013
            r0 = r10
            xif r0 = (defpackage.xif) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            xif r0 = new xif
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r10)
            goto L_0x006d
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            defpackage.od2.a0(r10)
            je7 r10 = r7.b
            java.lang.Object r10 = r10.getValue()
            zi5 r10 = (defpackage.zi5) r10
            java.lang.String r8 = java.lang.String.valueOf(r8)
            kk5 r10 = (defpackage.kk5) r10
            java.io.File r8 = r10.n(r8)
        L_0x0044:
            q0e r9 = r7.A0
            java.lang.Object r10 = r9.getValue()
            r2 = r10
            vif r2 = (defpackage.vif) r2
            java.lang.String r4 = r8.getAbsolutePath()
            r5 = 5
            r6 = 0
            vif r2 = defpackage.vif.a(r2, r6, r4, r6, r5)
            boolean r9 = r9.c(r10, r2)
            if (r9 == 0) goto L_0x0044
            zif r9 = new zif
            r9.<init>(r7, r8, r6)
            r0.Y = r3
            r7 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = defpackage.fp3.I(r7, r9, r0)
            if (r10 != r1) goto L_0x006d
            return r1
        L_0x006d:
            e5f r10 = (defpackage.e5f) r10
            if (r10 == 0) goto L_0x0074
            e5f r7 = defpackage.e5f.a
            return r7
        L_0x0074:
            one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException r7 = new one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException
            r8 = 0
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.f(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object g(xbc xbc) {
        String str;
        String str2;
        h7b h7b = this.u0;
        if (h7b == null || (str = ((vif) this.A0.getValue()).b) == null || (str2 = ((vif) this.A0.getValue()).c) == null) {
            return null;
        }
        Size size = ((vif) this.A0.getValue()).a;
        return new fif(str, size.getWidth(), size.getHeight(), ((wbc) xbc).a, str2, h7b);
    }

    public final void h() {
        String name = ejf.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "pauseRecording videoMessage", (Throwable) null);
        }
        bx1 bx1 = this.K0;
        if (bx1 != null) {
            bx1.b.d(eg7.ON_PAUSE);
        }
        cdc cdc = this.F0;
        if (cdc != null) {
            cdc.m();
        }
        this.C0 = true;
    }

    public final boolean i() {
        return ((eua) this.c.getValue()).b(eua.p);
    }

    public final void j(cbc cbc) {
        this.Y = cbc;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, uof] */
    public final void k(eh7 eh7, px1 px1) {
        k9b k9b = this.Z;
        if (k9b != null) {
            k9b.f();
        }
        hg7 hg7 = null;
        try {
            h8b h8b = this.v0;
            if (h8b != null) {
                rdf rdf = this.y0;
                if (rdf != null) {
                    zgf zgf = this.w0;
                    if (zgf != null) {
                        Rational rational = new Rational(1, 1);
                        int k = h8b.k();
                        ? obj = new Object();
                        obj.a = 1;
                        obj.b = rational;
                        obj.c = k;
                        obj.d = 0;
                        k9b k9b2 = this.Z;
                        if (k9b2 != null) {
                            s9f s9f = new s9f();
                            s9f.a(h8b);
                            s9f.a(rdf);
                            s9f.a = obj;
                            s9f.c.add(zgf);
                            hg7 = k9b2.c(eh7, px1, s9f.b());
                        }
                        this.z0 = hg7;
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Throwable th) {
            hm9.p(ejf.class.getName(), "fail to bindCameraToLifecycle", th);
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [lc0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(android.util.Size r18, defpackage.g8b r19, kotlin.coroutines.Continuation r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = 2
            boolean r3 = r0 instanceof defpackage.wif
            if (r3 == 0) goto L_0x0018
            r3 = r0
            wif r3 = (defpackage.wif) r3
            int r4 = r3.u0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0018
            int r4 = r4 - r5
            r3.u0 = r4
            goto L_0x001d
        L_0x0018:
            wif r3 = new wif
            r3.<init>(r1, r0)
        L_0x001d:
            java.lang.Object r0 = r3.s0
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.u0
            e5f r6 = defpackage.e5f.a
            r7 = 0
            java.lang.String r8 = "Required value was null."
            r9 = 1
            if (r5 == 0) goto L_0x0059
            if (r5 == r9) goto L_0x0043
            if (r5 != r2) goto L_0x003b
            g8b r1 = r3.Y
            android.util.Size r4 = r3.X
            ejf r3 = r3.o
            defpackage.od2.a0(r0)
            r0 = r4
            goto L_0x018f
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            ejf r1 = r3.Z
            g8b r5 = r3.Y
            android.util.Size r10 = r3.X
            ejf r11 = r3.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0055 }
            r16 = r10
            r10 = r0
            r0 = r16
            goto L_0x0108
        L_0x0055:
            r0 = move-exception
            r1 = r11
            goto L_0x0236
        L_0x0059:
            defpackage.od2.a0(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.L0
            boolean r0 = r0.get()
            java.lang.Class<ejf> r5 = defpackage.ejf.class
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r5.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x006f
            goto L_0x007c
        L_0x006f:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x007c
            us7 r3 = defpackage.us7.X
            java.lang.String r4 = "Resume camera preview"
            r2.d(r3, r0, r4, r7)
        L_0x007c:
            bx1 r0 = r1.K0
            if (r0 == 0) goto L_0x0099
            yw1 r2 = r17.m()
            if (r2 == 0) goto L_0x0090
            e06 r2 = (defpackage.e06) r2
            yw1 r2 = r2.a
            px1 r2 = r2.i()
            if (r2 != 0) goto L_0x0092
        L_0x0090:
            px1 r2 = O0
        L_0x0092:
            r1.k(r0, r2)
            r0 = r18
            goto L_0x0203
        L_0x0099:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            java.lang.String r0 = r5.getName()
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x00ac
            goto L_0x00b9
        L_0x00ac:
            boolean r10 = r5.c()
            if (r10 == 0) goto L_0x00b9
            us7 r10 = defpackage.us7.X
            java.lang.String r11 = "Start binding camera preview"
            r5.d(r10, r0, r11, r7)
        L_0x00b9:
            bx1 r0 = new bx1
            r0.<init>()
            r1.K0 = r0
            r3.o = r1     // Catch:{ all -> 0x0235 }
            r0 = r18
            r3.X = r0     // Catch:{ all -> 0x0235 }
            r5 = r19
            r3.Y = r5     // Catch:{ all -> 0x0235 }
            r3.getClass()     // Catch:{ all -> 0x0235 }
            r3.Z = r1     // Catch:{ all -> 0x0235 }
            r3.u0 = r9     // Catch:{ all -> 0x0235 }
            sy1 r10 = new sy1     // Catch:{ all -> 0x0235 }
            kotlin.coroutines.Continuation r11 = defpackage.v3c.u(r3)     // Catch:{ all -> 0x0235 }
            r10.<init>(r9, r11)     // Catch:{ all -> 0x0235 }
            r10.n()     // Catch:{ all -> 0x0235 }
            k9b r11 = defpackage.k9b.f     // Catch:{ all -> 0x0235 }
            je7 r11 = r1.a     // Catch:{ all -> 0x0235 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x0235 }
            android.content.Context r11 = (android.content.Context) r11     // Catch:{ all -> 0x0235 }
            k12 r11 = defpackage.s36.p(r11)     // Catch:{ all -> 0x0235 }
            wi3 r12 = new wi3     // Catch:{ all -> 0x0235 }
            r13 = 7
            r12.<init>(r10, r11, r1, r13)     // Catch:{ all -> 0x0235 }
            je7 r13 = r1.a     // Catch:{ all -> 0x0235 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x0235 }
            android.content.Context r13 = (android.content.Context) r13     // Catch:{ all -> 0x0235 }
            java.util.concurrent.Executor r13 = defpackage.ot3.a(r13)     // Catch:{ all -> 0x0235 }
            r11.d(r12, r13)     // Catch:{ all -> 0x0235 }
            java.lang.Object r10 = r10.m()     // Catch:{ all -> 0x0235 }
            if (r10 != r4) goto L_0x0107
            return r4
        L_0x0107:
            r11 = r1
        L_0x0108:
            k9b r10 = (defpackage.k9b) r10     // Catch:{ all -> 0x0055 }
            r1.Z = r10
            av1 r1 = defpackage.adc.n0
            nw4 r10 = defpackage.ab0.a()
            khe r12 = r11.s0
            java.lang.Object r12 = r12.getValue()
            java.util.concurrent.ExecutorService r12 = (java.util.concurrent.ExecutorService) r12
            java.lang.String r13 = "The specified executor can't be null."
            defpackage.c54.o(r12, r13)
            mb0 r13 = defpackage.mb0.d
            b9b r13 = defpackage.b9b.k(r13)
            java.lang.Object r14 = r10.b
            mc0 r14 = (defpackage.mc0) r14
            if (r14 == 0) goto L_0x022d
            lc0 r15 = new lc0
            r15.<init>()
            b9b r9 = r14.a
            r15.a = r9
            android.util.Range r9 = r14.b
            r15.b = r9
            android.util.Range r9 = r14.c
            r15.c = r9
            int r9 = r14.d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.d = r9
            r15.a = r13
            mc0 r9 = r15.a()
            r10.b = r9
            adc r9 = new adc
            ab0 r10 = r10.f()
            r9.<init>(r12, r10, r1, r1)
            r11.x0 = r9
            mt6 r1 = new mt6
            r1.<init>((defpackage.wjf) r9)
            aa0 r9 = defpackage.ev6.E
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            mi9 r12 = r1.b
            r12.j(r9, r10)
            rdf r9 = new rdf
            sdf r10 = new sdf
            mi9 r1 = r1.b
            wma r1 = defpackage.wma.a(r1)
            r10.<init>(r1)
            r9.<init>(r10)
            r11.y0 = r9
            r3.o = r11
            r3.X = r0
            r3.Y = r5
            r3.getClass()
            r3.Z = r7
            r3.u0 = r2
            java.lang.Object r1 = r11.n(r0, r3)
            if (r1 != r4) goto L_0x018d
            return r4
        L_0x018d:
            r1 = r5
            r3 = r11
        L_0x018f:
            mt6 r4 = new mt6
            r4.<init>((int) r2)
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 33
            if (r5 < r9) goto L_0x01a5
            aa0 r5 = defpackage.ev6.E
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            mi9 r9 = r4.b
            r9.j(r5, r2)
        L_0x01a5:
            eu4 r2 = defpackage.eu4.d
            aa0 r5 = defpackage.tu6.A
            mi9 r9 = r4.b
            r9.j(r5, r2)
            h8b r2 = r4.b()
            r2.G(r1)
            r3.v0 = r2
            bx1 r1 = r3.K0
            if (r1 == 0) goto L_0x0223
            px1 r2 = O0
            r3.k(r1, r2)
            q0e r1 = r3.D0
            xgf r2 = new xgf
            yw1 r4 = r3.m()
            r5 = 0
            if (r4 == 0) goto L_0x01d4
            fjc r4 = (defpackage.fjc) r4
            yw1 r4 = r4.b
            boolean r4 = r4.m()
            goto L_0x01d5
        L_0x01d4:
            r4 = r5
        L_0x01d5:
            yw1 r8 = r3.m()
            if (r8 == 0) goto L_0x01f6
            fjc r8 = (defpackage.fjc) r8
            yw1 r8 = r8.b
            xm7 r8 = r8.e()
            if (r8 == 0) goto L_0x01f6
            java.lang.Object r8 = r8.d()
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x01ee
            goto L_0x01f6
        L_0x01ee:
            int r8 = r8.intValue()
            r9 = 1
            if (r8 != r9) goto L_0x01f6
            r5 = 1
        L_0x01f6:
            r2.<init>(r4, r5)
            r1.m(r7, r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.L0
            r2 = 1
            r1.set(r2)
            r1 = r3
        L_0x0203:
            q0e r2 = r1.A0
        L_0x0205:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            vif r4 = (defpackage.vif) r4
            r5 = 6
            vif r4 = defpackage.vif.a(r4, r0, r7, r7, r5)
            boolean r3 = r2.c(r3, r4)
            if (r3 == 0) goto L_0x0205
            bx1 r0 = r1.K0
            if (r0 == 0) goto L_0x0222
            gh7 r0 = r0.b
            eg7 r1 = defpackage.eg7.ON_RESUME
            r0.d(r1)
        L_0x0222:
            return r6
        L_0x0223:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x022d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Property \"videoSpec\" has not been set"
            r0.<init>(r1)
            throw r0
        L_0x0235:
            r0 = move-exception
        L_0x0236:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail to bindPreview"
            defpackage.hm9.p(r1, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.l(android.util.Size, g8b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final yw1 m() {
        hg7 hg7 = this.z0;
        if (hg7 != null) {
            return hg7.c.C0;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(android.util.Size r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ajf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ajf r0 = (defpackage.ajf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            ajf r0 = new ajf
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            sif r6 = r0.Y
            sif r7 = r0.X
            ejf r0 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0064
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            defpackage.od2.a0(r8)
            sif r8 = new sif
            r8.<init>(r7)
            je7 r2 = r6.o
            java.lang.Object r2 = r2.getValue()
            kke r2 = (defpackage.kke) r2
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            bjf r4 = new bjf
            r5 = 0
            r4.<init>(r7, r5)
            r0.o = r6
            r0.X = r8
            r0.Y = r8
            r0.t0 = r3
            java.lang.Object r7 = defpackage.j47.t0(r2, r4, r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r0 = r6
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0064:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L_0x0088
            r6.h(r8, r3)
            java.util.concurrent.CopyOnWriteArraySet r6 = r7.Y
            tif r8 = new tif
            r8.<init>(r0)
            r6.add(r8)
            zgf r6 = new zgf
            al9 r8 = new al9
            r1 = 21
            r8.<init>(r1)
            zh6 r1 = r7.X
            r6.<init>(r1, r7, r8)
            r0.w0 = r6
            e5f r6 = defpackage.e5f.a
            return r6
        L_0x0088:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejf.n(android.util.Size, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
