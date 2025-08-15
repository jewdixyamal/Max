package defpackage;

import android.content.Context;

/* renamed from: ouf  reason: default package */
public final class ouf {
    public final long a;
    public final long b;
    public final sx3 c;
    public final Context d;
    public final j0e e;
    public final kxf f;
    public final String g = ouf.class.getName();
    public final je7 h;
    public final je7 i;
    public final kld j;
    public final v7c k;
    public volatile w97 l;

    public ouf(long j2, long j3, sx3 sx3, Context context, w7c w7c, je7 je7, je7 je72) {
        StringBuilder k2 = au1.k(j2, "webapp_biom_s_key_", "_");
        k2.append(j3);
        kxf kxf = new kxf(k2.toString(), true);
        this.a = j2;
        this.b = j3;
        this.c = sx3;
        this.d = context;
        this.e = w7c;
        this.f = kxf;
        this.h = je7;
        this.i = je72;
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.j = b2;
        this.k = new v7c(b2);
    }

    public static final mtf a(ouf ouf) {
        return (mtf) ouf.h.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.ouf r6, defpackage.hn0 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof defpackage.xtf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            xtf r0 = (defpackage.xtf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            xtf r0 = new xtf
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            hn0 r7 = r0.X
            ouf r6 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            defpackage.od2.a0(r8)
            kke r8 = r6.e()
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            ytf r2 = new ytf
            r2.<init>(r6, r3)
            r0.o = r6
            r0.X = r7
            r0.s0 = r4
            java.lang.Object r8 = defpackage.j47.t0(r8, r2, r0)
            if (r8 != r1) goto L_0x0053
            goto L_0x0078
        L_0x0053:
            puf r8 = (defpackage.puf) r8
            nn0 r0 = new nn0
            boolean r1 = r6.f()
            boolean r2 = r8.e
            boolean r5 = r8.f
            java.lang.String r8 = r8.d
            if (r8 == 0) goto L_0x006c
            int r8 = r8.length()
            if (r8 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r8 = 0
            goto L_0x006d
        L_0x006c:
            r8 = r4
        L_0x006d:
            r8 = r8 ^ r4
            r0.<init>(r1, r2, r5, r8)
            r7.a(r0)
            r6.l = r3
            e5f r1 = defpackage.e5f.a
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.b(ouf, hn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r7 == r1) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.ouf r5, defpackage.in0 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.auf
            if (r0 == 0) goto L_0x0013
            r0 = r7
            auf r0 = (defpackage.auf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            auf r0 = new auf
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            in0 r6 = r0.X
            ouf r5 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            defpackage.od2.a0(r7)
            kke r7 = r5.e()
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            buf r2 = new buf
            r2.<init>(r5, r4)
            r0.o = r5
            r0.X = r6
            r0.s0 = r3
            java.lang.Object r7 = defpackage.j47.t0(r7, r2, r0)
            if (r7 != r1) goto L_0x0053
            goto L_0x0078
        L_0x0053:
            puf r7 = (defpackage.puf) r7
            if (r7 == 0) goto L_0x0059
            java.lang.String r4 = r7.d
        L_0x0059:
            e5f r1 = defpackage.e5f.a
            if (r7 == 0) goto L_0x0070
            if (r4 == 0) goto L_0x0070
            int r7 = r4.length()
            if (r7 != 0) goto L_0x0066
            goto L_0x0070
        L_0x0066:
            kxf r5 = r5.f
            java.lang.String r5 = defpackage.kxf.a(r5, r4)
            r6.a(r5)
            goto L_0x0078
        L_0x0070:
            vuf r5 = new vuf
            r5.<init>()
            r6.b(r5)
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.c(ouf, in0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.ouf r7, defpackage.ln0 r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.muf
            if (r0 == 0) goto L_0x0013
            r0 = r9
            muf r0 = (defpackage.muf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            muf r0 = new muf
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            ln0 r8 = r0.o
            defpackage.od2.a0(r9)
            goto L_0x005d
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            defpackage.od2.a0(r9)
            java.lang.String r9 = r8.d
            if (r9 != 0) goto L_0x003c
        L_0x003a:
            r1 = r3
            goto L_0x0061
        L_0x003c:
            kxf r2 = r7.f
            java.lang.String r9 = r2.b(r9)
            kke r2 = r7.e()
            w9a r2 = (defpackage.w9a) r2
            nx3 r2 = r2.b()
            nuf r5 = new nuf
            r6 = 0
            r5.<init>(r7, r9, r6)
            r0.o = r8
            r0.Z = r4
            java.lang.Object r7 = defpackage.j47.t0(r2, r5, r0)
            if (r7 != r1) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            r8.a(r3)
            goto L_0x003a
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.d(ouf, ln0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static String g(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str.length() > 128 ? w9e.Y0(128, str) : str;
    }

    public final kke e() {
        return (kke) this.i.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5 A[Catch:{ all -> 0x00ed }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r11 = this;
            java.lang.String r0 = "Biometry status: "
            android.content.Context r1 = r11.d     // Catch:{ all -> 0x00ed }
            va8 r2 = new va8     // Catch:{ all -> 0x00ed }
            bn0 r3 = new bn0     // Catch:{ all -> 0x00ed }
            r4 = 0
            r3.<init>(r1, r4)     // Catch:{ all -> 0x00ed }
            r2.<init>((defpackage.bn0) r3)     // Catch:{ all -> 0x00ed }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ed }
            java.lang.Object r4 = r2.b     // Catch:{ all -> 0x00ed }
            android.hardware.biometrics.BiometricManager r4 = (android.hardware.biometrics.BiometricManager) r4     // Catch:{ all -> 0x00ed }
            r5 = 0
            r6 = 1
            r7 = 15
            r8 = 30
            if (r1 < r8) goto L_0x0028
            if (r4 != 0) goto L_0x0022
            r1 = r6
            goto L_0x00cd
        L_0x0022:
            int r1 = defpackage.an0.a(r4, r7)     // Catch:{ all -> 0x00ed }
            goto L_0x00cd
        L_0x0028:
            android.content.Context r9 = r3.a     // Catch:{ all -> 0x00ed }
            android.app.KeyguardManager r9 = defpackage.jd7.a(r9)     // Catch:{ all -> 0x00ed }
            if (r9 == 0) goto L_0x00cb
            boolean r7 = defpackage.f8.m(r7)     // Catch:{ all -> 0x00ed }
            android.content.Context r9 = r3.a     // Catch:{ all -> 0x00ed }
            if (r7 == 0) goto L_0x004d
            android.app.KeyguardManager r1 = defpackage.jd7.a(r9)     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x0040
            r1 = r5
            goto L_0x0044
        L_0x0040:
            boolean r1 = defpackage.jd7.b(r1)     // Catch:{ all -> 0x00ed }
        L_0x0044:
            if (r1 == 0) goto L_0x0049
        L_0x0046:
            r1 = r5
            goto L_0x00cd
        L_0x0049:
            r1 = 11
            goto L_0x00cd
        L_0x004d:
            r7 = 29
            if (r1 != r7) goto L_0x00c6
            java.lang.reflect.Method r1 = defpackage.zm0.c()     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x0075
            a8g r7 = defpackage.oag.k()     // Catch:{ all -> 0x00ed }
            android.hardware.biometrics.BiometricPrompt$CryptoObject r7 = defpackage.oag.H(r7)     // Catch:{ all -> 0x00ed }
            if (r7 == 0) goto L_0x0075
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0075 }
            java.lang.Object r1 = r1.invoke(r4, r7)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0075 }
            boolean r7 = r1 instanceof java.lang.Integer     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0075 }
            if (r7 == 0) goto L_0x0075
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0075 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0075 }
            goto L_0x00cd
        L_0x0075:
            if (r4 != 0) goto L_0x0079
            r1 = r6
            goto L_0x007d
        L_0x0079:
            int r1 = defpackage.zm0.a(r4)     // Catch:{ all -> 0x00ed }
        L_0x007d:
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x00ed }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ed }
            if (r7 < r8) goto L_0x0085
        L_0x0083:
            r4 = r5
            goto L_0x00a3
        L_0x0085:
            int r7 = defpackage.ksb.assume_strong_biometrics_models     // Catch:{ all -> 0x00ed }
            if (r4 != 0) goto L_0x008a
            goto L_0x0083
        L_0x008a:
            android.content.res.Resources r8 = r9.getResources()     // Catch:{ all -> 0x00ed }
            java.lang.String[] r7 = r8.getStringArray(r7)     // Catch:{ all -> 0x00ed }
            int r8 = r7.length     // Catch:{ all -> 0x00ed }
            r9 = r5
        L_0x0094:
            if (r9 >= r8) goto L_0x0083
            r10 = r7[r9]     // Catch:{ all -> 0x00ed }
            boolean r10 = r4.equals(r10)     // Catch:{ all -> 0x00ed }
            if (r10 == 0) goto L_0x00a0
            r4 = r6
            goto L_0x00a3
        L_0x00a0:
            int r9 = r9 + 1
            goto L_0x0094
        L_0x00a3:
            if (r4 != 0) goto L_0x00cd
            if (r1 == 0) goto L_0x00a8
            goto L_0x00cd
        L_0x00a8:
            android.content.Context r1 = r3.a     // Catch:{ all -> 0x00ed }
            android.app.KeyguardManager r1 = defpackage.jd7.a(r1)     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x00b2
            r1 = r5
            goto L_0x00b6
        L_0x00b2:
            boolean r1 = defpackage.jd7.b(r1)     // Catch:{ all -> 0x00ed }
        L_0x00b6:
            if (r1 != 0) goto L_0x00bd
            int r1 = r2.n()     // Catch:{ all -> 0x00ed }
            goto L_0x00cd
        L_0x00bd:
            int r1 = r2.n()     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x00c4
            goto L_0x0046
        L_0x00c4:
            r1 = -1
            goto L_0x00cd
        L_0x00c6:
            int r1 = r2.n()     // Catch:{ all -> 0x00ed }
            goto L_0x00cd
        L_0x00cb:
            r1 = 12
        L_0x00cd:
            java.lang.String r11 = r11.g     // Catch:{ all -> 0x00ed }
            ir6 r2 = defpackage.hm9.m     // Catch:{ all -> 0x00ed }
            if (r2 != 0) goto L_0x00d4
            goto L_0x00ef
        L_0x00d4:
            boolean r3 = r2.c()     // Catch:{ all -> 0x00ed }
            if (r3 == 0) goto L_0x00ef
            us7 r3 = defpackage.us7.X     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r4.<init>(r0)     // Catch:{ all -> 0x00ed }
            r4.append(r1)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ed }
            r4 = 0
            r2.d(r3, r11, r0, r4)     // Catch:{ all -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
            r11 = move-exception
            goto L_0x00f7
        L_0x00ef:
            if (r1 != 0) goto L_0x00f2
            r5 = r6
        L_0x00f2:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00ed }
            goto L_0x00fd
        L_0x00f7:
            njc r0 = new njc
            r0.<init>(r11)
            r11 = r0
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r11 instanceof defpackage.njc
            if (r1 == 0) goto L_0x0104
            r11 = r0
        L_0x0104:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.f():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.mn0 r10, java.lang.String r11, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ztf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ztf r0 = (defpackage.ztf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ztf r0 = new ztf
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r8) goto L_0x004e
            if (r2 == r7) goto L_0x004a
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            defpackage.od2.a0(r12)
            goto L_0x0124
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            defpackage.od2.a0(r12)
            goto L_0x00ff
        L_0x0043:
            jn0 r9 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00d7
        L_0x004a:
            defpackage.od2.a0(r12)
            goto L_0x009f
        L_0x004e:
            defpackage.od2.a0(r12)
            goto L_0x007a
        L_0x0052:
            defpackage.od2.a0(r12)
            boolean r12 = r10 instanceof defpackage.hn0
            r2 = 0
            if (r12 == 0) goto L_0x007b
            hn0 r10 = (defpackage.hn0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x0064
            boolean r2 = defpackage.tpa.f(r12, r11)
        L_0x0064:
            if (r2 != 0) goto L_0x0071
            ruf r9 = new ruf
            evf r11 = defpackage.evf.REQUEST_ACCESS
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x0071:
            r0.Z = r8
            java.lang.Object r9 = r9.j(r10, r0)
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            return r3
        L_0x007b:
            boolean r12 = r10 instanceof defpackage.in0
            if (r12 == 0) goto L_0x00a0
            in0 r10 = (defpackage.in0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x0089
            boolean r2 = defpackage.tpa.f(r12, r11)
        L_0x0089:
            if (r2 != 0) goto L_0x0096
            ruf r9 = new ruf
            evf r11 = defpackage.evf.REQUEST_AUTH
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x0096:
            r0.Z = r7
            java.lang.Object r9 = r9.k(r10, r0)
            if (r9 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r3
        L_0x00a0:
            boolean r12 = r10 instanceof defpackage.jn0
            if (r12 == 0) goto L_0x00db
            jn0 r10 = (defpackage.jn0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x00af
            boolean r11 = defpackage.tpa.f(r12, r11)
            goto L_0x00b0
        L_0x00af:
            r11 = r2
        L_0x00b0:
            if (r11 != 0) goto L_0x00bb
            nn0 r9 = new nn0
            r9.<init>(r2, r2, r2, r2)
            r10.a(r9)
            return r3
        L_0x00bb:
            r0.o = r10
            r0.Z = r6
            kke r11 = r9.e()
            w9a r11 = (defpackage.w9a) r11
            nx3 r11 = r11.b()
            cuf r12 = new cuf
            r2 = 0
            r12.<init>(r9, r2)
            java.lang.Object r12 = defpackage.j47.t0(r11, r12, r0)
            if (r12 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r9 = r10
        L_0x00d7:
            r9.a(r12)
            return r3
        L_0x00db:
            boolean r12 = r10 instanceof defpackage.kn0
            if (r12 == 0) goto L_0x0100
            kn0 r10 = (defpackage.kn0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x00e9
            boolean r2 = defpackage.tpa.f(r12, r11)
        L_0x00e9:
            if (r2 != 0) goto L_0x00f6
            ruf r9 = new ruf
            evf r11 = defpackage.evf.OPEN_SETTINGS
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x00f6:
            r0.Z = r5
            java.lang.Object r9 = r9.i(r10, r0)
            if (r9 != r1) goto L_0x00ff
            return r1
        L_0x00ff:
            return r3
        L_0x0100:
            boolean r12 = r10 instanceof defpackage.ln0
            if (r12 == 0) goto L_0x0125
            ln0 r10 = (defpackage.ln0) r10
            java.lang.String r12 = r10.c
            if (r11 == 0) goto L_0x010e
            boolean r2 = defpackage.tpa.f(r12, r11)
        L_0x010e:
            if (r2 != 0) goto L_0x011b
            ruf r9 = new ruf
            evf r11 = defpackage.evf.UPDATE_TOKEN
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x011b:
            r0.Z = r4
            java.lang.Object r9 = r9.l(r10, r0)
            if (r9 != r1) goto L_0x0124
            return r1
        L_0x0124:
            return r3
        L_0x0125:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.h(mn0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.kn0 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.duf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            duf r0 = (defpackage.duf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            duf r0 = new duf
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r6) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            defpackage.od2.a0(r11)
            goto L_0x00d6
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            kn0 r10 = r0.X
            ouf r9 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x006c
        L_0x003e:
            defpackage.od2.a0(r11)
            boolean r11 = r9.f()
            if (r11 != 0) goto L_0x0050
            suf r9 = new suf
            r9.<init>(r6)
            r10.b(r9)
            return r3
        L_0x0050:
            kke r11 = r9.e()
            w9a r11 = (defpackage.w9a) r11
            nx3 r11 = r11.b()
            euf r2 = new euf
            r2.<init>(r9, r5)
            r0.o = r9
            r0.X = r10
            r0.s0 = r6
            java.lang.Object r11 = defpackage.j47.t0(r11, r2, r0)
            if (r11 != r1) goto L_0x006c
            return r1
        L_0x006c:
            puf r11 = (defpackage.puf) r11
            if (r11 != 0) goto L_0x0079
            suf r9 = new suf
            r9.<init>(r6)
            r10.b(r9)
            return r3
        L_0x0079:
            boolean r2 = r11.e
            if (r2 == 0) goto L_0x008c
            boolean r11 = r11.f
            if (r11 == 0) goto L_0x008c
            tuf r9 = new tuf
            evf r11 = defpackage.evf.OPEN_SETTINGS
            r9.<init>(r11)
            r10.b(r9)
            return r3
        L_0x008c:
            w97 r11 = r9.l
            if (r11 == 0) goto L_0x0098
            s0 r2 = new s0
            r2.<init>()
            r11.b(r2)
        L_0x0098:
            r9.l = r10
            int r10 = defpackage.mla.b
            eqe r11 = new eqe
            r11.<init>(r10)
            mg3 r10 = new mg3
            int r2 = defpackage.mla.a
            eqe r7 = new eqe
            r7.<init>(r2)
            r2 = 3
            r10.<init>(r6, r7, r2, r6)
            mg3 r2 = new mg3
            int r7 = defpackage.mla.d
            eqe r8 = new eqe
            r8.<init>(r7)
            r2.<init>(r4, r8, r4, r6)
            mg3[] r10 = new defpackage.mg3[]{r10, r2}
            java.util.List r10 = defpackage.y53.M(r10)
            kld r9 = r9.j
            qtf r2 = new qtf
            r2.<init>(r11, r10)
            r0.o = r5
            r0.X = r5
            r0.s0 = r4
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.i(kn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(defpackage.hn0 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.fuf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            fuf r0 = (defpackage.fuf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            fuf r0 = new fuf
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r6) goto L_0x0036
            if (r2 != r5) goto L_0x002e
            defpackage.od2.a0(r12)
            goto L_0x00f7
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            hn0 r11 = r0.X
            ouf r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x005d
        L_0x003e:
            defpackage.od2.a0(r12)
            r0.o = r10
            r0.X = r11
            r0.s0 = r6
            kke r12 = r10.e()
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.b()
            cuf r2 = new cuf
            r2.<init>(r10, r4)
            java.lang.Object r12 = defpackage.j47.t0(r12, r2, r0)
            if (r12 != r1) goto L_0x005d
            return r1
        L_0x005d:
            nn0 r12 = (defpackage.nn0) r12
            boolean r2 = r12.a
            if (r2 != 0) goto L_0x006d
            suf r10 = new suf
            r12 = 0
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x006d:
            boolean r2 = r12.b
            if (r2 == 0) goto L_0x0080
            boolean r12 = r12.c
            if (r12 != 0) goto L_0x0080
            tuf r10 = new tuf
            evf r12 = defpackage.evf.REQUEST_ACCESS
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x0080:
            w97 r12 = r10.l
            if (r12 == 0) goto L_0x008c
            s0 r2 = new s0
            r2.<init>()
            r12.b(r2)
        L_0x008c:
            r10.l = r11
            int r12 = defpackage.mla.f
            eqe r2 = new eqe
            r2.<init>(r12)
            java.lang.String r11 = r11.d
            if (r11 != 0) goto L_0x009b
            java.lang.String r11 = ""
        L_0x009b:
            int r12 = r11.length()
            if (r12 != 0) goto L_0x00a9
            int r11 = defpackage.mla.e
            eqe r12 = new eqe
            r12.<init>(r11)
            goto L_0x00c0
        L_0x00a9:
            int r12 = r11.length()
            r7 = 128(0x80, float:1.794E-43)
            if (r12 <= r7) goto L_0x00bb
            java.lang.String r11 = defpackage.w9e.Y0(r7, r11)
            iqe r12 = new iqe
            r12.<init>(r11)
            goto L_0x00c0
        L_0x00bb:
            iqe r12 = new iqe
            r12.<init>(r11)
        L_0x00c0:
            mg3 r11 = new mg3
            int r7 = defpackage.mla.c
            eqe r8 = new eqe
            r8.<init>(r7)
            r7 = 3
            r11.<init>(r6, r8, r7, r6)
            mg3 r7 = new mg3
            int r8 = defpackage.mla.d
            eqe r9 = new eqe
            r9.<init>(r8)
            r7.<init>(r5, r9, r5, r6)
            mg3[] r11 = new defpackage.mg3[]{r11, r7}
            java.util.List r11 = defpackage.y53.M(r11)
            kld r10 = r10.j
            ptf r6 = new ptf
            int r7 = defpackage.woc.A
            r6.<init>(r7, r2, r12, r11)
            r0.o = r4
            r0.X = r4
            r0.s0 = r5
            java.lang.Object r10 = r10.a(r6, r0)
            if (r10 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.j(hn0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: in0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0130 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.in0 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.guf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            guf r0 = (defpackage.guf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            guf r0 = new guf
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x005d
            if (r2 == r7) goto L_0x0052
            if (r2 == r5) goto L_0x0047
            if (r2 == r4) goto L_0x003c
            if (r2 != r6) goto L_0x0034
            defpackage.od2.a0(r12)
            goto L_0x0130
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            java.lang.Object r10 = r0.X
            java.lang.String r10 = (java.lang.String) r10
            ouf r11 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            goto L_0x0130
        L_0x0047:
            java.lang.Object r10 = r0.X
            java.lang.String r10 = (java.lang.String) r10
            ouf r11 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            goto L_0x00e6
        L_0x0052:
            java.lang.Object r10 = r0.X
            r11 = r10
            in0 r11 = (defpackage.in0) r11
            ouf r10 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x008c
        L_0x005d:
            defpackage.od2.a0(r12)
            boolean r12 = r10.f()
            if (r12 != 0) goto L_0x0070
            suf r10 = new suf
            r12 = 0
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x0070:
            kke r12 = r10.e()
            w9a r12 = (defpackage.w9a) r12
            nx3 r12 = r12.b()
            iuf r2 = new iuf
            r2.<init>(r10, r8)
            r0.o = r10
            r0.X = r11
            r0.s0 = r7
            java.lang.Object r12 = defpackage.j47.t0(r12, r2, r0)
            if (r12 != r1) goto L_0x008c
            return r1
        L_0x008c:
            puf r12 = (defpackage.puf) r12
            if (r12 == 0) goto L_0x0093
            java.lang.String r2 = r12.d
            goto L_0x0094
        L_0x0093:
            r2 = r8
        L_0x0094:
            if (r12 == 0) goto L_0x0131
            if (r2 == 0) goto L_0x0131
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00a0
            goto L_0x0131
        L_0x00a0:
            boolean r2 = r12.e
            if (r2 == 0) goto L_0x00b3
            boolean r12 = r12.f
            if (r12 != 0) goto L_0x00b3
            tuf r10 = new tuf
            evf r12 = defpackage.evf.REQUEST_AUTH
            r10.<init>(r12)
            r11.b(r10)
            return r3
        L_0x00b3:
            w97 r12 = r10.l
            if (r12 == 0) goto L_0x00bf
            s0 r2 = new s0
            r2.<init>()
            r12.b(r2)
        L_0x00bf:
            r10.l = r11
            java.lang.String r11 = r11.d
            java.lang.String r11 = g(r11)
            kke r12 = r10.e()     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            w9a r12 = (defpackage.w9a) r12     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            nx3 r12 = r12.b()     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            huf r2 = new huf     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r2.<init>(r10, r8)     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r0.o = r10     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r0.X = r11     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            r0.s0 = r5     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            java.lang.Object r12 = defpackage.j47.t0(r12, r2, r0)     // Catch:{ UserNotAuthenticatedException -> 0x010a }
            if (r12 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x00e6:
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            kxf r2 = r11.f     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            a8g r12 = r2.i(r12)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            kld r2 = r11.j     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            ntf r5 = new ntf     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            j0e r7 = r11.e     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            java.lang.Object r7 = r7.getValue()     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r5.<init>(r12, r7, r10)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r0.o = r11     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r0.X = r10     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            r0.s0 = r4     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            java.lang.Object r10 = r2.a(r5, r0)     // Catch:{ UserNotAuthenticatedException -> 0x010d }
            if (r10 != r1) goto L_0x0130
            return r1
        L_0x010a:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x010d:
            java.lang.String r12 = r11.g
            java.lang.String r2 = "Can't webapp auth by biometry with crypto, try without crypto"
            defpackage.hm9.m0(r12, r2, new java.lang.Object[0])
            kld r12 = r11.j
            ntf r2 = new ntf
            j0e r11 = r11.e
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            r2.<init>(r8, r11, r10)
            r0.o = r8
            r0.X = r8
            r0.s0 = r6
            java.lang.Object r10 = r12.a(r2, r0)
            if (r10 != r1) goto L_0x0130
            return r1
        L_0x0130:
            return r3
        L_0x0131:
            vuf r10 = new vuf
            r10.<init>()
            r11.b(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.k(in0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: ln0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(defpackage.ln0 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.juf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            juf r0 = (defpackage.juf) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            juf r0 = new juf
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            e5f r3 = defpackage.e5f.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            defpackage.od2.a0(r10)
            goto L_0x00d7
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            ln0 r9 = r0.X
            java.lang.Object r8 = r0.o
            ouf r8 = (defpackage.ouf) r8
            defpackage.od2.a0(r10)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            goto L_0x007f
        L_0x0043:
            java.lang.Object r8 = r0.o
            r9 = r8
            ln0 r9 = (defpackage.ln0) r9
            defpackage.od2.a0(r10)
            goto L_0x00d4
        L_0x004d:
            defpackage.od2.a0(r10)
            java.lang.String r10 = r9.d
            if (r10 == 0) goto L_0x00ba
            int r10 = r10.length()
            if (r10 != 0) goto L_0x005b
            goto L_0x00ba
        L_0x005b:
            kxf r10 = r8.f     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            java.lang.String r2 = r9.d     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            java.lang.String r10 = r10.b(r2)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            kke r2 = r8.e()     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            w9a r2 = (defpackage.w9a) r2     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            nx3 r2 = r2.b()     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            luf r6 = new luf     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r6.<init>(r8, r10, r7)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r0.o = r8     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r0.X = r9     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            r0.s0 = r5     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            java.lang.Object r10 = defpackage.j47.t0(r2, r6, r0)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            if (r10 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r9.a(r3)     // Catch:{ UserNotAuthenticatedException -> 0x0083 }
            goto L_0x00d7
        L_0x0083:
            java.lang.String r10 = r8.g
            java.lang.String r2 = "Can't update token because need auth by biometry"
            defpackage.hm9.m0(r10, r2, new java.lang.Object[0])
            w97 r10 = r8.l
            if (r10 == 0) goto L_0x0096
            s0 r2 = new s0
            r2.<init>()
            r10.b(r2)
        L_0x0096:
            r8.l = r9
            java.lang.String r9 = r9.e
            java.lang.String r9 = g(r9)
            kld r10 = r8.j
            ntf r2 = new ntf
            j0e r8 = r8.e
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r2.<init>(r7, r8, r9)
            r0.o = r7
            r0.X = r7
            r0.s0 = r4
            java.lang.Object r8 = r10.a(r2, r0)
            if (r8 != r1) goto L_0x00d7
            return r1
        L_0x00ba:
            kke r10 = r8.e()
            w9a r10 = (defpackage.w9a) r10
            nx3 r10 = r10.b()
            kuf r2 = new kuf
            r2.<init>(r8, r9, r7)
            r0.o = r9
            r0.s0 = r6
            java.lang.Object r8 = defpackage.j47.t0(r10, r2, r0)
            if (r8 != r1) goto L_0x00d4
            return r1
        L_0x00d4:
            r9.a(r3)
        L_0x00d7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouf.l(ln0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
