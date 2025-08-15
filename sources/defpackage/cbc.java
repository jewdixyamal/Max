package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: cbc  reason: default package */
public final class cbc extends pnf implements ubc {
    public static final /* synthetic */ bc7[] G0;
    public final s35 A0;
    public final s35 B0;
    public final khe C0;
    public volatile AudioFocusRequest D0;
    public final w4d E0;
    public final w4d F0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final bac b;
    public final jac c;
    public final z01 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final q0e v0;
    public final w7c w0;
    public final w7c x0;
    public final w7c y0;
    public final mn5 z0;

    static {
        Class<cbc> cls = cbc.class;
        G0 = new bc7[]{new oi9(cls, "longClickJob", "getLongClickJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "startRecordJob", "getStartRecordJob()Lkotlinx/coroutines/Job;")};
    }

    public cbc(bac bac, jac jac, je7 je7, khe khe, khe khe2) {
        f9g f9g = f9g.a;
        khe d = f9g.getAccessor().d(kke.class);
        khe d2 = f9g.getAccessor().d(Context.class);
        khe d3 = f9g.getAccessor().d(lac.class);
        this.b = bac;
        this.c = jac;
        this.o = (z01) f9g.getAccessor().c(z01.class);
        this.X = d;
        this.Y = d2;
        this.Z = je7;
        this.s0 = khe;
        this.t0 = khe2;
        this.u0 = d3;
        q0e a = r0e.a((Object) null);
        this.v0 = a;
        w7c w7c = new w7c(a);
        this.w0 = w7c;
        w7c w7c2 = ((lac) d3.getValue()).e;
        this.x0 = w7c2;
        p70 p70 = (p70) khe2.getValue();
        this.y0 = p70 != null ? p70.c : null;
        this.z0 = ((am7) khe.getValue()).d();
        this.A0 = new s35(0);
        this.B0 = new s35(0);
        this.C0 = new khe(new lwa(12, this));
        this.E0 = mqd.D();
        this.F0 = mqd.D();
        od2.L(od2.F(new zn5(new t03(w7c, 11), new mac(this, (Continuation) null), 5), ((w9a) ((kke) d.getValue())).a()), this.a);
        if (bac == bac.b) {
            od2.L(od2.F(new zn5(new t03(w7c2, 11), new nac(khe2, this, (Continuation) null), 5), ((w9a) ((kke) d.getValue())).a()), this.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.cbc r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.vac
            if (r0 == 0) goto L_0x0013
            r0 = r6
            vac r0 = (defpackage.vac) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            vac r0 = new vac
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            cbc r5 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0053
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            defpackage.od2.a0(r6)
            je7 r6 = r5.X
            java.lang.Object r6 = r6.getValue()
            kke r6 = (defpackage.kke) r6
            w9a r6 = (defpackage.w9a) r6
            cx7 r6 = r6.c()
            wac r2 = new wac
            r2.<init>(r5, r4)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r6 = defpackage.j47.t0(r6, r2, r0)
            if (r6 != r1) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            r5.C()
            tac r6 = new tac
            r0 = 3
            r1 = 0
            r6.<init>(r0, r1, r1)
            q0e r5 = r5.v0
            r5.m(r4, r6)
            e5f r1 = defpackage.e5f.a
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.q(cbc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ all -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.cbc r6, defpackage.bac r7, long r8, byte[] r10, kotlin.coroutines.Continuation r11) {
        /*
            r6.getClass()
            java.lang.String r0 = "Media for "
            boolean r1 = r11 instanceof defpackage.yac
            if (r1 == 0) goto L_0x0018
            r1 = r11
            yac r1 = (defpackage.yac) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.s0 = r2
            goto L_0x001d
        L_0x0018:
            yac r1 = new yac
            r1.<init>(r6, r11)
        L_0x001d:
            java.lang.Object r11 = r1.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.s0
            e5f r4 = defpackage.e5f.a
            r5 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r5) goto L_0x0035
            bac r7 = r1.X
            cbc r6 = r1.o
            defpackage.od2.a0(r11)     // Catch:{ all -> 0x0032 }
            goto L_0x006a
        L_0x0032:
            r7 = move-exception
            goto L_0x00ae
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            defpackage.od2.a0(r11)
            int r11 = r7.ordinal()     // Catch:{ all -> 0x0032 }
            if (r11 == 0) goto L_0x0054
            if (r11 != r5) goto L_0x004e
            vbc r11 = new vbc     // Catch:{ all -> 0x0032 }
            r11.<init>(r8, r10)     // Catch:{ all -> 0x0032 }
            goto L_0x0059
        L_0x004e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0032 }
            r7.<init>()     // Catch:{ all -> 0x0032 }
            throw r7     // Catch:{ all -> 0x0032 }
        L_0x0054:
            wbc r11 = new wbc     // Catch:{ all -> 0x0032 }
            r11.<init>(r8)     // Catch:{ all -> 0x0032 }
        L_0x0059:
            ybc r8 = r6.w()     // Catch:{ all -> 0x0032 }
            r1.o = r6     // Catch:{ all -> 0x0032 }
            r1.X = r7     // Catch:{ all -> 0x0032 }
            r1.s0 = r5     // Catch:{ all -> 0x0032 }
            java.lang.Object r11 = r8.g(r11)     // Catch:{ all -> 0x0032 }
            if (r11 != r2) goto L_0x006a
            goto L_0x00cc
        L_0x006a:
            o2 r11 = (defpackage.o2) r11     // Catch:{ all -> 0x0032 }
            if (r11 != 0) goto L_0x009e
            java.lang.Class r8 = r6.getClass()     // Catch:{ all -> 0x0032 }
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0032 }
            ir6 r9 = defpackage.hm9.m     // Catch:{ all -> 0x0032 }
            if (r9 != 0) goto L_0x007b
            goto L_0x009c
        L_0x007b:
            boolean r10 = r9.c()     // Catch:{ all -> 0x0032 }
            if (r10 == 0) goto L_0x009c
            us7 r10 = defpackage.us7.s0     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r7.name()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r11.<init>(r0)     // Catch:{ all -> 0x0032 }
            r11.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = " wasn't prepared, we cannot send message"
            r11.append(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x0032 }
            r11 = 0
            r9.d(r10, r8, r7, r11)     // Catch:{ all -> 0x0032 }
        L_0x009c:
            r2 = r4
            goto L_0x00cc
        L_0x009e:
            jac r7 = r6.c     // Catch:{ all -> 0x0032 }
            r7.getClass()     // Catch:{ all -> 0x0032 }
            dac r8 = new dac     // Catch:{ all -> 0x0032 }
            r8.<init>(r11)     // Catch:{ all -> 0x0032 }
            s35 r7 = r7.b     // Catch:{ all -> 0x0032 }
            defpackage.pnf.o(r7, r8)     // Catch:{ all -> 0x0032 }
            goto L_0x009c
        L_0x00ae:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = r7.getLocalizedMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "We couldn't send record due to "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            defpackage.hm9.p(r6, r8, r7)
            goto L_0x009c
        L_0x00cc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.r(cbc, bac, long, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0120 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013d A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0154 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015a A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.cbc r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            java.lang.String r0 = "Recoding of "
            boolean r1 = r15 instanceof defpackage.abc
            if (r1 == 0) goto L_0x0015
            r1 = r15
            abc r1 = (defpackage.abc) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.Z = r2
            goto L_0x001a
        L_0x0015:
            abc r1 = new abc
            r1.<init>(r12, r15)
        L_0x001a:
            java.lang.Object r15 = r1.X
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.Z
            r4 = 1
            r5 = 0
            java.lang.Class<cbc> r6 = defpackage.cbc.class
            r7 = 0
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            cbc r12 = r1.o
            defpackage.od2.a0(r15)     // Catch:{ all -> 0x0030 }
            goto L_0x00d5
        L_0x0030:
            r13 = move-exception
            goto L_0x015d
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003b:
            defpackage.od2.a0(r15)
            bc7[] r15 = G0
            r15 = r15[r4]
            w4d r3 = r12.F0
            java.lang.Object r15 = r3.T0(r12, r15)
            x77 r15 = (defpackage.x77) r15
            if (r15 == 0) goto L_0x0056
            boolean r15 = r15.isCancelled()
            if (r15 != r4) goto L_0x0056
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x0184
        L_0x0056:
            java.lang.String r15 = r6.getName()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x005f
            goto L_0x0078
        L_0x005f:
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x0078
            us7 r8 = defpackage.us7.X
            bac r9 = r12.b
            java.lang.String r9 = r9.name()
            java.lang.String r10 = "Start recording of "
            java.lang.String r11 = " "
            java.lang.String r9 = defpackage.zr6.i(r10, r9, r11)
            r3.d(r8, r15, r9, r5)
        L_0x0078:
            am7 r15 = r12.u()
            r15.a()
            android.media.AudioFocusRequest$Builder r15 = new android.media.AudioFocusRequest$Builder
            r15.<init>(r4)
            android.media.AudioAttributes$Builder r3 = new android.media.AudioAttributes$Builder
            r3.<init>()
            android.media.AudioAttributes$Builder r3 = r3.setUsage(r4)
            r8 = 2
            android.media.AudioAttributes$Builder r3 = r3.setContentType(r8)
            android.media.AudioAttributes r3 = r3.build()
            android.media.AudioFocusRequest$Builder r15 = r15.setAudioAttributes(r3)
            android.media.AudioFocusRequest r15 = r15.build()
            khe r3 = r12.C0
            java.lang.Object r3 = r3.getValue()
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            int r3 = r3.requestAudioFocus(r15)
            if (r3 != r4) goto L_0x00ae
            r12.D0 = r15
        L_0x00ae:
            ybc r15 = r12.w()
            boolean r15 = r15.b()
            if (r15 == 0) goto L_0x00bb
            r12.C()
        L_0x00bb:
            q0e r15 = r12.v0     // Catch:{ all -> 0x0030 }
            sac r3 = new sac     // Catch:{ all -> 0x0030 }
            r3.<init>(r7, r7)     // Catch:{ all -> 0x0030 }
            r15.m(r5, r3)     // Catch:{ all -> 0x0030 }
            ybc r15 = r12.w()     // Catch:{ all -> 0x0030 }
            r1.o = r12     // Catch:{ all -> 0x0030 }
            r1.Z = r4     // Catch:{ all -> 0x0030 }
            java.lang.Object r13 = r15.f(r13, r1)     // Catch:{ all -> 0x0030 }
            if (r13 != r2) goto L_0x00d5
            goto L_0x0184
        L_0x00d5:
            ybc r13 = r12.w()     // Catch:{ all -> 0x0030 }
            r13.j(r12)     // Catch:{ all -> 0x0030 }
            java.lang.String r13 = r6.getName()     // Catch:{ all -> 0x0030 }
            ir6 r14 = defpackage.hm9.m     // Catch:{ all -> 0x0030 }
            if (r14 != 0) goto L_0x00e5
            goto L_0x0107
        L_0x00e5:
            boolean r15 = r14.c()     // Catch:{ all -> 0x0030 }
            if (r15 == 0) goto L_0x0107
            us7 r15 = defpackage.us7.X     // Catch:{ all -> 0x0030 }
            bac r1 = r12.b     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r2.<init>(r0)     // Catch:{ all -> 0x0030 }
            r2.append(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = " started successfully "
            r2.append(r0)     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0030 }
            r14.d(r15, r13, r0, r5)     // Catch:{ all -> 0x0030 }
        L_0x0107:
            lac r13 = r12.v()     // Catch:{ all -> 0x0030 }
            q0e r13 = r13.d     // Catch:{ all -> 0x0030 }
            r14 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0030 }
            r13.m(r5, r14)     // Catch:{ all -> 0x0030 }
            lac r13 = r12.v()     // Catch:{ all -> 0x0030 }
            kotlinx.coroutines.internal.ContextScope r14 = r12.a     // Catch:{ all -> 0x0030 }
            vxd r15 = r13.a     // Catch:{ all -> 0x0030 }
            if (r15 == 0) goto L_0x0121
            goto L_0x0133
        L_0x0121:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            r13.c = r0     // Catch:{ all -> 0x0030 }
            kac r15 = new kac     // Catch:{ all -> 0x0030 }
            r15.<init>(r13, r5)     // Catch:{ all -> 0x0030 }
            r0 = 3
            vxd r14 = defpackage.j47.T(r14, r5, r5, r15, r0)     // Catch:{ all -> 0x0030 }
            r13.a = r14     // Catch:{ all -> 0x0030 }
        L_0x0133:
            z01 r13 = r12.o     // Catch:{ all -> 0x0030 }
            a11 r13 = (defpackage.a11) r13     // Catch:{ all -> 0x0030 }
            ru.ok.android.externcalls.sdk.audio.MicrophoneManager r13 = r13.c()     // Catch:{ all -> 0x0030 }
            if (r13 == 0) goto L_0x0140
            r13.setMicEnabled(r7)     // Catch:{ all -> 0x0030 }
        L_0x0140:
            bc7[] r13 = G0     // Catch:{ all -> 0x0030 }
            r13 = r13[r4]     // Catch:{ all -> 0x0030 }
            w4d r14 = r12.F0     // Catch:{ all -> 0x0030 }
            java.lang.Object r13 = r14.T0(r12, r13)     // Catch:{ all -> 0x0030 }
            x77 r13 = (defpackage.x77) r13     // Catch:{ all -> 0x0030 }
            if (r13 == 0) goto L_0x015a
            boolean r13 = r13.isCancelled()     // Catch:{ all -> 0x0030 }
            if (r13 != r4) goto L_0x015a
            r12.B(r7)     // Catch:{ all -> 0x0030 }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0030 }
            goto L_0x0184
        L_0x015a:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0030 }
            goto L_0x0184
        L_0x015d:
            java.lang.Class r14 = r12.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = r13.getLocalizedMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Recoding was failed due to '"
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = "'"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            defpackage.hm9.p(r14, r15, r13)
            r12.C()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L_0x0184:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbc.s(cbc, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void A() {
        q0e q0e = this.v0;
        if (((uac) q0e.getValue()) instanceof rac) {
            try {
                w().e();
                lac v = v();
                ContextScope contextScope = this.a;
                if (v.a == null) {
                    v.c = System.currentTimeMillis();
                    v.a = j47.T(contextScope, (lx3) null, (vx3) null, new kac(v, (Continuation) null), 3);
                }
                u().a();
                q0e.m((Object) null, new sac(true, true));
                u().c();
            } catch (RuntimeException unused) {
                C();
                q0e.m((Object) null, new tac(3, false, false));
            }
        }
    }

    public final void B(boolean z) {
        byte[] bArr;
        if ((this.w0.a.getValue() instanceof sac) || (this.w0.a.getValue() instanceof rac)) {
            Long l = (Long) this.x0.a.getValue();
            long longValue = l != null ? l.longValue() : 0;
            AudioFocusRequest audioFocusRequest = this.D0;
            if (audioFocusRequest != null) {
                ((AudioManager) this.C0.getValue()).abandonAudioFocusRequest(audioFocusRequest);
            }
            if (!z) {
                this.v0.m((Object) null, new tac(false, false));
                C();
            } else if (longValue < 1000) {
                jac jac = this.c;
                bac bac = this.b;
                eqe eqe = new eqe(mga.g);
                jac.getClass();
                pnf.o(jac.b, new hac(bac, eqe));
                this.v0.m((Object) null, new tac(x(), false));
                C();
            } else {
                w7c w7c = this.y0;
                if (w7c == null || (bArr = (byte[]) w7c.a.getValue()) == null) {
                    bArr = new byte[0];
                }
                byte[] bArr2 = bArr;
                C();
                j47.T(this.a, xq9.a, (vx3) null, new bbc(this, longValue, bArr2, (Continuation) null), 2);
                this.v0.m((Object) null, new tac(2, x(), false));
            }
        }
    }

    public final void C() {
        jac jac = this.c;
        bac bac = this.b;
        jac.getClass();
        pnf.o(jac.b, new eac(bac, false));
        w().d();
        w().j((cbc) null);
        p70 p70 = (p70) this.t0.getValue();
        if (p70 != null) {
            p70.a.clear();
            p70.b.setValue((Object) null);
        }
        u().b((Long) null);
        lac v = v();
        vxd vxd = v.a;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        v.a = null;
        v.b = 0;
        v.d.setValue((Object) null);
    }

    public final void p() {
        u().release();
        C();
    }

    public final void t() {
        q0e q0e = this.v0;
        uac uac = (uac) q0e.getValue();
        if (uac instanceof sac) {
            try {
                w().h();
                v().a();
                q0e.m((Object) null, new rac(true));
            } catch (RuntimeException unused) {
                C();
                q0e.m((Object) null, new tac(3, false, false));
                return;
            }
        }
        if (uac instanceof rac) {
            q0e.m((Object) null, new rac(true));
        }
    }

    public final am7 u() {
        return (am7) this.s0.getValue();
    }

    public final lac v() {
        return (lac) this.u0.getValue();
    }

    public final ybc w() {
        return (ybc) this.Z.getValue();
    }

    public final boolean x() {
        uac uac = (uac) this.v0.getValue();
        return uac instanceof sac ? ((sac) uac).b : uac instanceof rac;
    }

    public final void y() {
        eqe eqe = new eqe(mga.f);
        jac jac = this.c;
        jac.getClass();
        pnf.o(jac.b, new gac(eqe));
        this.v0.m((Object) null, new tac(3, false, false));
        p70 p70 = (p70) this.t0.getValue();
        if (p70 != null) {
            p70.a();
        }
        C();
    }

    public final void z() {
        q0e q0e = this.v0;
        if (((uac) q0e.getValue()) instanceof sac) {
            try {
                w().h();
                v().a();
                q0e.m((Object) null, new rac(false));
            } catch (RuntimeException unused) {
                C();
                q0e.m((Object) null, new tac(3, false, false));
            }
        }
    }
}
