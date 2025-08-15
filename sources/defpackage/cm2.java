package defpackage;

/* renamed from: cm2  reason: default package */
public final class cm2 {
    public static final /* synthetic */ int h = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;

    public cm2(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
        this.g = je77;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.tl2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            tl2 r0 = (defpackage.tl2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            tl2 r0 = new tl2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            java.lang.String r3 = "cm2"
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            defpackage.od2.a0(r8)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            goto L_0x005c
        L_0x0029:
            r5 = move-exception
            goto L_0x0057
        L_0x002b:
            r5 = move-exception
            goto L_0x005f
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.od2.a0(r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r2 = "cancel %d"
            defpackage.hm9.m(r3, r2, r8)
            je7 r5 = r5.b     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            he5 r5 = (defpackage.he5) r5     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            r0.Y = r4     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.q(r6, r0)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            if (r5 != r1) goto L_0x005c
            return r1
        L_0x0057:
            java.lang.String r6 = "cancel failure!"
            defpackage.hm9.p(r3, r6, r5)
        L_0x005c:
            e5f r5 = defpackage.e5f.a
            return r5
        L_0x005f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ul2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ul2 r0 = (defpackage.ul2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ul2 r0 = new ul2
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            java.lang.String r3 = "cm2"
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            defpackage.od2.a0(r6)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            goto L_0x0053
        L_0x0029:
            r5 = move-exception
            goto L_0x004e
        L_0x002b:
            r5 = move-exception
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            defpackage.od2.a0(r6)
            java.lang.String r6 = "cancelAll"
            defpackage.hm9.m(r3, r6, new java.lang.Object[0])
            je7 r5 = r5.b     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            he5 r5 = (defpackage.he5) r5     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            r0.Y = r4     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            java.lang.Object r5 = r5.r(r0)     // Catch:{ CancellationException -> 0x002b, all -> 0x0029 }
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x004e:
            java.lang.String r6 = "cancelAll failure!"
            defpackage.hm9.p(r3, r6, r5)
        L_0x0053:
            e5f r5 = defpackage.e5f.a
            return r5
        L_0x0056:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [java.util.Set] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0078, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        r17 = r0;
        r19 = r7;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0118, code lost:
        r9 = ((defpackage.p7b) r0.d()).a.p();
        r6.o = r0;
        r6.X = r1;
        r6.Y = null;
        r6.s0 = r9;
        r6.w0 = 2;
        r2 = (defpackage.jz2) ((defpackage.iy2) r0.e.getValue());
        r2.getClass();
        r2 = defpackage.ema.C(new defpackage.md1(15, r2), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0146, code lost:
        if (r2 != r13) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0148, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0149, code lost:
        r7 = r1;
        r21 = r9;
        r9 = r0;
        r0 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014f, code lost:
        r0 = java.lang.Math.max(r0, ((java.lang.Number) r2).longValue()) - 1;
        defpackage.hm9.m("cm2", "getChatsNotifications: chatServerIds=" + r7 + ", maxCacheSyncTime=" + r0, new java.lang.Object[0]);
        r6.o = r9;
        r6.X = r7;
        r6.s0 = r0;
        r6.w0 = 3;
        r2 = ((defpackage.yo7) r9.a.getValue()).p(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x018a, code lost:
        if (r2 != r13) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x018c, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018d, code lost:
        r2 = (defpackage.sl2) r2;
        r0 = (defpackage.he5) r1.b.getValue();
        r6.o = r1;
        r6.X = r2;
        r6.w0 = 4;
        r0 = defpackage.j47.t0(((defpackage.w9a) r0.X).b(), new defpackage.ce5(r0, r17, r19, (kotlin.coroutines.Continuation) null), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b4, code lost:
        if (r0 != r13) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b6, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01b7, code lost:
        r7 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b9, code lost:
        r2 = (defpackage.sl2) r2;
        defpackage.hm9.m("cm2", "fcmNotificationData = %s", r2);
        r1.getClass();
        r8 = new defpackage.xs((java.util.Collection) defpackage.x53.x0(defpackage.bcd.Z(r7.a.keySet(), r2.a.keySet()), new defpackage.kt(r7, r2)));
        r6.o = r1;
        r6.X = r7;
        r6.Y = r2;
        r6.Z = r8;
        r6.w0 = 5;
        r0 = defpackage.j1e.k(new defpackage.xl2(r8, r1, (kotlin.coroutines.Continuation) null), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01f9, code lost:
        if (r0 != r13) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01fb, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01fc, code lost:
        r15 = r1;
        r1 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0201, code lost:
        r2 = (defpackage.mn5) r2;
        r6.o = r15;
        r6.X = r0;
        r6.Y = r1;
        r6.Z = r2;
        r6.w0 = 6;
        r7 = r15.e(r8, r0, r1, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0217, code lost:
        if (r7 != r13) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0219, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x021a, code lost:
        r8 = r15;
        r21 = r7;
        r7 = r0;
        r0 = r2;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0221, code lost:
        r2 = (defpackage.cv9) r2;
        r9 = ((defpackage.p7b) r8.d()).c.g.getLong("app.notification.dontDisturbUntil", 0);
        r11 = ((defpackage.p7b) r8.d()).a.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0245, code lost:
        if (r9 == -1) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0249, code lost:
        if (r11 >= r9) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x024c, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x024e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x024f, code lost:
        if (r9 != false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0251, code lost:
        r6.o = r8;
        r6.X = r7;
        r6.Y = r2;
        r6.Z = null;
        r6.t0 = r9;
        r6.w0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0262, code lost:
        if (r8.h(r1, r0, r6) != r13) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0264, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0265, code lost:
        r1 = r2;
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0267, code lost:
        r6.o = r8;
        r6.X = r1;
        r6.Y = null;
        r6.t0 = r0;
        r6.w0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0277, code lost:
        if (r8.g(r7, r6) != r13) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0279, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x027a, code lost:
        r6 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x027b, code lost:
        r9 = r0;
        r2 = r1;
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x027e, code lost:
        if (r9 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0280, code lost:
        r8.getClass();
        r0 = r2.a;
        r7 = new java.util.LinkedHashMap(defpackage.mz7.Z(r0.size()));
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x029e, code lost:
        if (r0.hasNext() == false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02a0, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        r6 = r1.getKey();
        r10 = new defpackage.r1f(new defpackage.at(2, ((defpackage.ql2) r1.getValue()).f), new defpackage.we1(20));
        r8 = ((defpackage.ql2) r1.getValue()).g;
        r9 = new java.util.ArrayList(defpackage.z53.S(r8, 10));
        r8 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02de, code lost:
        if (r8.hasNext() == false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02e0, code lost:
        r11 = (defpackage.sx9) r8.next();
        r13 = r11.a;
        r19 = defpackage.ks4.DO_NOT_DISTURB_MODE;
        r3 = r11.b;
        r17 = r11.c;
        r11 = r12;
        r12 = new defpackage.sx9(r13, r3, r17, r19);
        r9.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02fd, code lost:
        r7.put(r6, defpackage.ql2.a((defpackage.ql2) r1.getValue(), defpackage.nz4.a, defpackage.l6d.i0(defpackage.l6d.d0(defpackage.ys.Q(new defpackage.c6d[]{r10, new defpackage.at(2, r9)}), defpackage.n71.s0)), false, 32415));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return new defpackage.cv9(r7, r2.b, 0, r2.d, r2.e, r2.f, r2.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.gi9 r24, kotlin.coroutines.Continuation r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 1
            r5 = 2
            boolean r6 = r2 instanceof defpackage.vl2
            if (r6 == 0) goto L_0x001b
            r6 = r2
            vl2 r6 = (defpackage.vl2) r6
            int r7 = r6.w0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001b
            int r7 = r7 - r8
            r6.w0 = r7
            goto L_0x0020
        L_0x001b:
            vl2 r6 = new vl2
            r6.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r6.u0
            tx3 r13 = defpackage.tx3.a
            int r7 = r6.w0
            java.lang.String r8 = "cm2"
            r14 = 0
            switch(r7) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00a6;
                case 2: goto L_0x0099;
                case 3: goto L_0x0087;
                case 4: goto L_0x007b;
                case 5: goto L_0x0065;
                case 6: goto L_0x0052;
                case 7: goto L_0x0041;
                case 8: goto L_0x0034;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            boolean r0 = r6.t0
            java.lang.Object r1 = r6.X
            cv9 r1 = (defpackage.cv9) r1
            cm2 r6 = r6.o
            defpackage.od2.a0(r2)
            goto L_0x027b
        L_0x0041:
            boolean r0 = r6.t0
            java.lang.Object r1 = r6.Y
            cv9 r1 = (defpackage.cv9) r1
            java.lang.Object r7 = r6.X
            sl2 r7 = (defpackage.sl2) r7
            cm2 r8 = r6.o
            defpackage.od2.a0(r2)
            goto L_0x0267
        L_0x0052:
            java.lang.Object r0 = r6.Z
            mn5 r0 = (defpackage.mn5) r0
            java.lang.Object r1 = r6.Y
            sl2 r1 = (defpackage.sl2) r1
            java.lang.Object r7 = r6.X
            sl2 r7 = (defpackage.sl2) r7
            cm2 r8 = r6.o
            defpackage.od2.a0(r2)
            goto L_0x0221
        L_0x0065:
            java.lang.Object r0 = r6.Z
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r6.Y
            sl2 r1 = (defpackage.sl2) r1
            java.lang.Object r7 = r6.X
            sl2 r7 = (defpackage.sl2) r7
            cm2 r8 = r6.o
            defpackage.od2.a0(r2)
            r15 = r8
            r8 = r0
        L_0x0078:
            r0 = r7
            goto L_0x0201
        L_0x007b:
            java.lang.Object r0 = r6.X
            sl2 r0 = (defpackage.sl2) r0
            cm2 r1 = r6.o
            defpackage.od2.a0(r2)
            r7 = r0
            goto L_0x01b9
        L_0x0087:
            long r0 = r6.s0
            java.lang.Object r7 = r6.X
            gi9 r7 = (defpackage.gi9) r7
            cm2 r9 = r6.o
            defpackage.od2.a0(r2)
        L_0x0092:
            r17 = r0
            r19 = r7
            r1 = r9
            goto L_0x018d
        L_0x0099:
            long r0 = r6.s0
            java.lang.Object r7 = r6.X
            gi9 r7 = (defpackage.gi9) r7
            cm2 r9 = r6.o
            defpackage.od2.a0(r2)
            goto L_0x014f
        L_0x00a6:
            java.lang.Object r0 = r6.Y
            gi9 r0 = (defpackage.gi9) r0
            java.lang.Object r1 = r6.X
            gi9 r1 = (defpackage.gi9) r1
            cm2 r7 = r6.o
            defpackage.od2.a0(r2)
            r21 = r2
            r2 = r0
            r0 = r7
            r7 = r21
            goto L_0x00e8
        L_0x00ba:
            defpackage.od2.a0(r2)
            boolean r2 = r24.i()
            if (r2 == 0) goto L_0x00c6
            gi9 r1 = defpackage.vv7.a
            goto L_0x0118
        L_0x00c6:
            gi9 r2 = new gi9
            int r7 = r1.d
            r2.<init>((int) r7)
            je7 r7 = r0.e
            java.lang.Object r7 = r7.getValue()
            iy2 r7 = (defpackage.iy2) r7
            r6.o = r0
            r6.X = r2
            r6.Y = r2
            r6.w0 = r3
            jz2 r7 = (defpackage.jz2) r7
            java.lang.Object r1 = r7.o(r1, r6)
            if (r1 != r13) goto L_0x00e6
            return r13
        L_0x00e6:
            r7 = r1
            r1 = r2
        L_0x00e8:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00ee:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0118
            java.lang.Object r9 = r7.next()
            e52 r9 = (defpackage.e52) r9
            m7b r10 = r0.d()
            p7b r10 = (defpackage.p7b) r10
            t33 r10 = r10.a
            m7b r11 = r0.d()
            p7b r11 = (defpackage.p7b) r11
            jp r11 = r11.c
            boolean r10 = r9.O(r10, r11)
            if (r10 != 0) goto L_0x00ee
            k92 r9 = r9.b
            long r9 = r9.a
            r2.a(r9)
            goto L_0x00ee
        L_0x0118:
            m7b r2 = r0.d()
            p7b r2 = (defpackage.p7b) r2
            t33 r2 = r2.a
            long r9 = r2.p()
            je7 r2 = r0.e
            java.lang.Object r2 = r2.getValue()
            iy2 r2 = (defpackage.iy2) r2
            r6.o = r0
            r6.X = r1
            r6.Y = r14
            r6.s0 = r9
            r6.w0 = r5
            jz2 r2 = (defpackage.jz2) r2
            r2.getClass()
            md1 r7 = new md1
            r11 = 15
            r7.<init>(r11, r2)
            java.lang.Object r2 = defpackage.ema.C(r7, r6)
            if (r2 != r13) goto L_0x0149
            return r13
        L_0x0149:
            r7 = r1
            r21 = r9
            r9 = r0
            r0 = r21
        L_0x014f:
            java.lang.Number r2 = (java.lang.Number) r2
            long r10 = r2.longValue()
            long r0 = java.lang.Math.max(r0, r10)
            r10 = 1
            long r0 = r0 - r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r10 = "getChatsNotifications: chatServerIds="
            r2.<init>(r10)
            r2.append(r7)
            java.lang.String r10 = ", maxCacheSyncTime="
            r2.append(r10)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            defpackage.hm9.m(r8, r2, new java.lang.Object[0])
            je7 r2 = r9.a
            java.lang.Object r2 = r2.getValue()
            yo7 r2 = (defpackage.yo7) r2
            r6.o = r9
            r6.X = r7
            r6.s0 = r0
            r10 = 3
            r6.w0 = r10
            java.lang.Object r2 = r2.p(r7, r6)
            if (r2 != r13) goto L_0x0092
            return r13
        L_0x018d:
            sl2 r2 = (defpackage.sl2) r2
            je7 r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            he5 r0 = (defpackage.he5) r0
            r6.o = r1
            r6.X = r2
            r7 = 4
            r6.w0 = r7
            kke r7 = r0.X
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            ce5 r9 = new ce5
            r20 = 0
            r15 = r9
            r16 = r0
            r15.<init>(r16, r17, r19, r20)
            java.lang.Object r0 = defpackage.j47.t0(r7, r9, r6)
            if (r0 != r13) goto L_0x01b7
            return r13
        L_0x01b7:
            r7 = r2
            r2 = r0
        L_0x01b9:
            sl2 r2 = (defpackage.sl2) r2
            java.lang.String r0 = "fcmNotificationData = %s"
            java.lang.Object[] r9 = new java.lang.Object[]{r2}
            defpackage.hm9.m(r8, r0, r9)
            r1.getClass()
            java.util.Map r0 = r7.a
            java.util.Set r0 = r0.keySet()
            java.util.Map r8 = r2.a
            java.util.Set r8 = r8.keySet()
            java.util.LinkedHashSet r0 = defpackage.bcd.Z(r0, r8)
            kt r8 = new kt
            r8.<init>((defpackage.sl2) r7, (defpackage.sl2) r2)
            java.util.List r0 = defpackage.x53.x0(r0, r8)
            xs r8 = new xs
            r8.<init>((java.util.Collection) r0)
            r6.o = r1
            r6.X = r7
            r6.Y = r2
            r6.Z = r8
            r0 = 5
            r6.w0 = r0
            xl2 r0 = new xl2
            r0.<init>(r8, r1, r14)
            java.lang.Object r0 = defpackage.j1e.k(r0, r6)
            if (r0 != r13) goto L_0x01fc
            return r13
        L_0x01fc:
            r15 = r1
            r1 = r2
            r2 = r0
            goto L_0x0078
        L_0x0201:
            mn5 r2 = (defpackage.mn5) r2
            r6.o = r15
            r6.X = r0
            r6.Y = r1
            r6.Z = r2
            r7 = 6
            r6.w0 = r7
            r7 = r15
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r6
            java.lang.Object r7 = r7.e(r8, r9, r10, r11, r12)
            if (r7 != r13) goto L_0x021a
            return r13
        L_0x021a:
            r8 = r15
            r21 = r7
            r7 = r0
            r0 = r2
            r2 = r21
        L_0x0221:
            cv9 r2 = (defpackage.cv9) r2
            m7b r9 = r8.d()
            p7b r9 = (defpackage.p7b) r9
            jp r9 = r9.c
            ne7 r9 = r9.g
            java.lang.String r10 = "app.notification.dontDisturbUntil"
            r11 = 0
            long r9 = r9.getLong(r10, r11)
            m7b r11 = r8.d()
            p7b r11 = (defpackage.p7b) r11
            t33 r11 = r11.a
            long r11 = r11.n()
            r15 = -1
            int r15 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x024e
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r9 = 0
            goto L_0x024f
        L_0x024e:
            r9 = r3
        L_0x024f:
            if (r9 != 0) goto L_0x027e
            r6.o = r8
            r6.X = r7
            r6.Y = r2
            r6.Z = r14
            r6.t0 = r9
            r10 = 7
            r6.w0 = r10
            java.lang.Object r0 = r8.h(r1, r0, r6)
            if (r0 != r13) goto L_0x0265
            return r13
        L_0x0265:
            r1 = r2
            r0 = r9
        L_0x0267:
            r6.o = r8
            r6.X = r1
            r6.Y = r14
            r6.t0 = r0
            r2 = 8
            r6.w0 = r2
            java.lang.Object r2 = r8.g(r7, r6)
            if (r2 != r13) goto L_0x027a
            return r13
        L_0x027a:
            r6 = r8
        L_0x027b:
            r9 = r0
            r2 = r1
            r8 = r6
        L_0x027e:
            if (r9 == 0) goto L_0x033f
            r8.getClass()
            java.util.Map r0 = r2.a
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            int r1 = r0.size()
            int r1 = defpackage.mz7.Z(r1)
            r7.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x029a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x032d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r6 = r1.getKey()
            java.lang.Object r8 = r1.getValue()
            ql2 r8 = (defpackage.ql2) r8
            java.util.List r8 = r8.f
            at r9 = new at
            r9.<init>(r5, r8)
            we1 r8 = new we1
            r10 = 20
            r8.<init>(r10)
            r1f r10 = new r1f
            r10.<init>(r9, r8)
            java.lang.Object r8 = r1.getValue()
            ql2 r8 = (defpackage.ql2) r8
            java.util.List r8 = r8.g
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r11 = defpackage.z53.S(r8, r11)
            r9.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x02da:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x02fd
            java.lang.Object r11 = r8.next()
            sx9 r11 = (defpackage.sx9) r11
            sx9 r15 = new sx9
            long r13 = r11.a
            ks4 r19 = defpackage.ks4.DO_NOT_DISTURB_MODE
            long r3 = r11.b
            long r11 = r11.c
            r17 = r11
            r12 = r15
            r11 = r15
            r15 = r3
            r12.<init>(r13, r15, r17, r19)
            r9.add(r11)
            r3 = 1
            goto L_0x02da
        L_0x02fd:
            at r3 = new at
            r3.<init>(r5, r9)
            c6d[] r4 = new defpackage.c6d[r5]
            r8 = 0
            r4[r8] = r10
            r8 = 1
            r4[r8] = r3
            c6d r3 = defpackage.ys.Q(r4)
            n71 r4 = defpackage.n71.s0
            um5 r3 = defpackage.l6d.d0(r3, r4)
            java.util.List r3 = defpackage.l6d.i0(r3)
            java.lang.Object r1 = r1.getValue()
            ql2 r1 = (defpackage.ql2) r1
            nz4 r4 = defpackage.nz4.a
            r9 = 32415(0x7e9f, float:4.5423E-41)
            r10 = 0
            ql2 r1 = defpackage.ql2.a(r1, r4, r3, r10, r9)
            r7.put(r6, r1)
            r3 = r8
            goto L_0x029a
        L_0x032d:
            cv9 r0 = new cv9
            int r10 = r2.d
            java.lang.String r11 = r2.e
            rv9 r8 = r2.b
            r9 = 0
            boolean r12 = r2.f
            java.lang.String r13 = r2.g
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2 = r0
        L_0x033f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.c(gi9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final m7b d() {
        return (m7b) this.d.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: ql2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0214 A[EDGE_INSN: B:92:0x0214->B:71:0x0214 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.util.Set r22, defpackage.sl2 r23, defpackage.sl2 r24, defpackage.mn5 r25, kotlin.coroutines.Continuation r26) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r0 = r26
            boolean r1 = r0 instanceof defpackage.yl2
            if (r1 == 0) goto L_0x001a
            r1 = r0
            yl2 r1 = (defpackage.yl2) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.u0 = r2
        L_0x0018:
            r5 = r1
            goto L_0x0020
        L_0x001a:
            yl2 r1 = new yl2
            r1.<init>(r6, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r5.s0
            tx3 r8 = defpackage.tx3.a
            int r1 = r5.u0
            r9 = 1
            java.lang.String r10 = "cm2"
            if (r1 == 0) goto L_0x0043
            if (r1 != r9) goto L_0x003b
            sl2 r1 = r5.Z
            sl2 r2 = r5.Y
            java.util.Set r3 = r5.X
            cm2 r4 = r5.o
            defpackage.od2.a0(r0)
            r12 = r1
            r11 = r2
            goto L_0x0078
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            defpackage.od2.a0(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "merge: starting for "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            defpackage.hm9.m(r10, r0, new java.lang.Object[0])
            r5.o = r6
            r5.X = r7
            r11 = r23
            r5.Y = r11
            r12 = r24
            r5.Z = r12
            r5.u0 = r9
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            java.io.Serializable r0 = r0.f(r1, r2, r3, r4, r5)
            if (r0 != r8) goto L_0x0076
            return r8
        L_0x0076:
            r4 = r6
            r3 = r7
        L_0x0078:
            r14 = r0
            java.util.Map r14 = (java.util.Map) r14
            int r0 = r11.b
            int r1 = r12.b
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "merge: finished for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ", totalUnreadMessagesCount="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.m(r10, r1, new java.lang.Object[0])
            r4.getClass()
            java.util.Collection r1 = r14.values()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 != 0) goto L_0x00ad
            r2 = r3
            goto L_0x00d2
        L_0x00ad:
            java.lang.Object r2 = r1.next()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x00b8
            goto L_0x00d2
        L_0x00b8:
            r5 = r2
            ql2 r5 = (defpackage.ql2) r5
            long r5 = r5.m
        L_0x00bd:
            java.lang.Object r7 = r1.next()
            r8 = r7
            ql2 r8 = (defpackage.ql2) r8
            long r11 = r8.m
            int r8 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x00cc
            r2 = r7
            r5 = r11
        L_0x00cc:
            boolean r7 = r1.hasNext()
            if (r7 != 0) goto L_0x00bd
        L_0x00d2:
            r1 = r2
            ql2 r1 = (defpackage.ql2) r1
            r5 = 0
            if (r1 == 0) goto L_0x00db
            boolean r1 = r1.j
            goto L_0x00dc
        L_0x00db:
            r1 = r5
        L_0x00dc:
            if (r1 == 0) goto L_0x00df
            r3 = r2
        L_0x00df:
            ql2 r3 = (defpackage.ql2) r3
            if (r3 != 0) goto L_0x00ff
            java.lang.String r1 = "buildNotificationSettings: no alert"
            defpackage.hm9.m(r10, r1, new java.lang.Object[0])
            rv9 r1 = new rv9
            r2 = 0
            java.lang.String r3 = "_NONE_"
            r21 = r1
            r22 = r2
            r23 = r3
            r24 = r2
            r25 = r2
            r26 = r2
            r21.<init>(r22, r23, r24, r25, r26)
            r15 = r1
            goto L_0x01e9
        L_0x00ff:
            java.lang.String r1 = "buildNotificationSettings: need alert"
            defpackage.hm9.m(r10, r1, new java.lang.Object[0])
            rl2 r1 = defpackage.rl2.a
            rl2 r2 = r3.e
            r3 = 1
            if (r2 != r1) goto L_0x010d
            r1 = r3
            goto L_0x010e
        L_0x010d:
            r1 = r5
        L_0x010e:
            if (r1 == 0) goto L_0x011f
            m7b r2 = r4.d()
            p7b r2 = (defpackage.p7b) r2
            jp r2 = r2.c
            java.lang.String r6 = "app.notification.ringtone"
            java.lang.String r2 = r2.x(r6)
            goto L_0x012d
        L_0x011f:
            m7b r2 = r4.d()
            p7b r2 = (defpackage.p7b) r2
            jp r2 = r2.c
            java.lang.String r6 = "app.notification.chats.ringtone"
            java.lang.String r2 = r2.x(r6)
        L_0x012d:
            je7 r6 = r4.f
            java.lang.Object r7 = r6.getValue()
            ri4 r7 = (defpackage.ri4) r7
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x014d
            m7b r7 = r4.d()
            p7b r7 = (defpackage.p7b) r7
            jp r7 = r7.c
            java.lang.String r8 = "app.notification.in.app.sound"
            boolean r7 = r7.d(r8, r9)
            if (r7 != 0) goto L_0x014d
            java.lang.String r2 = "_NONE_"
        L_0x014d:
            if (r1 == 0) goto L_0x015e
            m7b r7 = r4.d()
            p7b r7 = (defpackage.p7b) r7
            jp r7 = r7.c
            java.lang.String r8 = "app.notification.vibrate"
            boolean r7 = r7.d(r8, r9)
            goto L_0x016e
        L_0x015e:
            m7b r7 = r4.d()
            p7b r7 = (defpackage.p7b) r7
            jp r7 = r7.c
            ne7 r7 = r7.g
            java.lang.String r8 = "app.notification.chats.vibrate"
            boolean r7 = r7.getBoolean(r8, r9)
        L_0x016e:
            java.lang.Object r8 = r6.getValue()
            ri4 r8 = (defpackage.ri4) r8
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x018d
            m7b r8 = r4.d()
            p7b r8 = (defpackage.p7b) r8
            jp r8 = r8.c
            ne7 r8 = r8.g
            java.lang.String r10 = "app.notification.in.app.vibrate"
            boolean r8 = r8.getBoolean(r10, r9)
            if (r8 != 0) goto L_0x018d
            r7 = r5
        L_0x018d:
            if (r1 == 0) goto L_0x01a2
            m7b r1 = r4.d()
            p7b r1 = (defpackage.p7b) r1
            jp r1 = r1.c
            int r8 = r1.v()
            java.lang.String r10 = "app.notification.led.color"
            int r1 = r1.e(r10, r8)
            goto L_0x01b6
        L_0x01a2:
            m7b r1 = r4.d()
            p7b r1 = (defpackage.p7b) r1
            jp r1 = r1.c
            int r8 = r1.v()
            ne7 r1 = r1.g
            java.lang.String r10 = "app.notification.chats.led.color"
            int r1 = r1.getInt(r10, r8)
        L_0x01b6:
            java.lang.Object r6 = r6.getValue()
            ri4 r6 = (defpackage.ri4) r6
            boolean r6 = r6.d()
            if (r6 != 0) goto L_0x01d6
            m7b r6 = r4.d()
            p7b r6 = (defpackage.p7b) r6
            jp r6 = r6.c
            ne7 r6 = r6.g
            java.lang.String r8 = "app.notification.important.priority"
            boolean r6 = r6.getBoolean(r8, r9)
            if (r6 == 0) goto L_0x01d6
            r6 = r3
            goto L_0x01d7
        L_0x01d6:
            r6 = r5
        L_0x01d7:
            rv9 r8 = new rv9
            r21 = r8
            r22 = r3
            r23 = r2
            r24 = r1
            r25 = r7
            r26 = r6
            r21.<init>(r22, r23, r24, r25, r26)
            r15 = r8
        L_0x01e9:
            je7 r1 = r4.g
            java.lang.Object r2 = r1.getValue()
            tda r2 = (defpackage.tda) r2
            int r17 = r2.e()
            java.lang.Object r2 = r1.getValue()
            tda r2 = (defpackage.tda) r2
            je7 r2 = r2.d
            java.lang.Object r2 = r2.getValue()
            kaa r2 = (defpackage.kaa) r2
            r2.getClass()
            java.util.Collection r2 = r14.values()
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0217
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0217
        L_0x0214:
            r19 = r5
            goto L_0x024e
        L_0x0217:
            java.util.Iterator r2 = r2.iterator()
        L_0x021b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0214
            java.lang.Object r3 = r2.next()
            ql2 r3 = (defpackage.ql2) r3
            java.util.List r3 = r3.f
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0235
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0235
        L_0x0233:
            r3 = r5
            goto L_0x024a
        L_0x0235:
            java.util.Iterator r3 = r3.iterator()
        L_0x0239:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0233
            java.lang.Object r4 = r3.next()
            rw8 r4 = (defpackage.rw8) r4
            boolean r4 = r4.n
            if (r4 == 0) goto L_0x0239
            r3 = r9
        L_0x024a:
            if (r3 == 0) goto L_0x021b
            r19 = r9
        L_0x024e:
            java.lang.Object r1 = r1.getValue()
            tda r1 = (defpackage.tda) r1
            r1.getClass()
            cv9 r1 = new cv9
            java.lang.String r18 = "ru.oneme.app.notifications"
            r20 = 0
            r13 = r1
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.e(java.util.Set, sl2, sl2, mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0491 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b5  */
    public final java.io.Serializable f(java.util.Set r54, defpackage.sl2 r55, defpackage.sl2 r56, defpackage.mn5 r57, kotlin.coroutines.Continuation r58) {
        /*
            r53 = this;
            r0 = r58
            boolean r1 = r0 instanceof defpackage.zl2
            if (r1 == 0) goto L_0x0017
            r1 = r0
            zl2 r1 = (defpackage.zl2) r1
            int r2 = r1.y0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.y0 = r2
            r2 = r53
            goto L_0x001e
        L_0x0017:
            zl2 r1 = new zl2
            r2 = r53
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.w0
            tx3 r3 = defpackage.tx3.a
            int r4 = r1.y0
            java.lang.String r7 = " fcmLastNotifiedMessageId="
            java.lang.String r8 = ", cacheLastNotifiedMessageId="
            r11 = 2
            java.lang.String r12 = " "
            java.lang.String r14 = "mergeNotificationsMap: chatServerId="
            r15 = 1
            java.lang.String r9 = "cm2"
            if (r4 == 0) goto L_0x008c
            if (r4 == r15) goto L_0x0061
            if (r4 != r11) goto L_0x0059
            r4 = r12
            long r11 = r1.v0
            ql2 r2 = r1.u0
            java.util.Iterator r10 = r1.t0
            java.util.LinkedHashMap r13 = r1.s0
            mn5 r5 = r1.Z
            sl2 r6 = r1.Y
            sl2 r15 = r1.X
            r53 = r2
            cm2 r2 = r1.o
            defpackage.od2.a0(r0)
            r18 = r7
            r19 = r8
            r8 = r15
            r15 = 2
            r7 = r6
            r6 = r5
            r5 = r2
            r2 = r53
            goto L_0x01de
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0061:
            r4 = r12
            long r5 = r1.v0
            ql2 r2 = r1.u0
            java.util.Iterator r10 = r1.t0
            java.util.LinkedHashMap r11 = r1.s0
            mn5 r12 = r1.Z
            sl2 r13 = r1.Y
            sl2 r15 = r1.X
            r53 = r2
            cm2 r2 = r1.o
            defpackage.od2.a0(r0)
            r18 = r7
            r19 = r8
            r7 = r13
            r8 = r15
            r15 = 1
            r13 = r11
            r50 = r2
            r2 = r53
            r51 = r5
            r5 = r50
            r6 = r12
            r11 = r51
            goto L_0x0113
        L_0x008c:
            r4 = r12
            defpackage.od2.a0(r0)
            boolean r0 = r54.isEmpty()
            if (r0 == 0) goto L_0x0099
            oz4 r0 = defpackage.oz4.a
            return r0
        L_0x0099:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r5 = r54.size()
            r0.<init>(r5)
            java.util.Iterator r5 = r54.iterator()
            r13 = r0
            r6 = r1
            r10 = r5
            r0 = r55
            r1 = r56
            r5 = r57
        L_0x00af:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0491
            java.lang.Object r11 = r10.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r11 = r11.longValue()
            java.util.Map r15 = r0.a
            r18 = r7
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r11)
            java.lang.Object r7 = r15.get(r7)
            ql2 r7 = (defpackage.ql2) r7
            java.util.Map r15 = r1.a
            r19 = r8
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r11)
            java.lang.Object r8 = r15.get(r8)
            ql2 r8 = (defpackage.ql2) r8
            if (r8 == 0) goto L_0x01af
            if (r7 != 0) goto L_0x01af
            boolean r7 = r8.j
            if (r7 == 0) goto L_0x018d
            je7 r7 = r2.e
            java.lang.Object r7 = r7.getValue()
            iy2 r7 = (defpackage.iy2) r7
            r6.o = r2
            r6.X = r0
            r6.Y = r1
            r6.Z = r5
            r6.s0 = r13
            r6.t0 = r10
            r6.u0 = r8
            r6.v0 = r11
            r15 = 1
            r6.y0 = r15
            jz2 r7 = (defpackage.jz2) r7
            java.lang.Object r7 = r7.k(r11, r6)
            if (r7 != r3) goto L_0x0109
            return r3
        L_0x0109:
            r50 = r8
            r8 = r0
            r0 = r7
            r7 = r1
            r1 = r6
            r6 = r5
            r5 = r2
            r2 = r50
        L_0x0113:
            e52 r0 = (defpackage.e52) r0
            r53 = r5
            r54 = r6
            long r5 = r2.l
            if (r0 == 0) goto L_0x012c
            k92 r0 = r0.b
            if (r0 == 0) goto L_0x012c
            b92 r0 = r0.a()
            if (r0 == 0) goto L_0x012c
            r55 = r1
            long r0 = r0.d
            goto L_0x0130
        L_0x012c:
            r55 = r1
            r0 = -1
        L_0x0130:
            int r17 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r56 = r7
            if (r17 <= 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r11)
            r57 = r8
            r20 = r10
            r8 = 32255(0x7dff, float:4.5199E-41)
            r10 = 0
            ql2 r2 = defpackage.ql2.a(r2, r10, r10, r15, r8)
            r13.put(r7, r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
            java.lang.String r2 = defpackage.tfg.f(r2, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r14)
            r7.append(r11)
            java.lang.String r8 = ". using fcmNotification, needNotify="
            r7.append(r8)
            r7.append(r15)
            java.lang.String r8 = ", fcmLastNotifiedMessageId="
            defpackage.au1.q(r5, r8, r4, r7)
            r7.append(r2)
            java.lang.String r2 = " cacheLastNotifiedMessageId="
            r7.append(r2)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            defpackage.hm9.m(r9, r0, new java.lang.Object[0])
            r2 = r53
            r5 = r54
            r6 = r55
            r1 = r56
            r0 = r57
            r10 = r20
            goto L_0x01a9
        L_0x018d:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r11)
            r13.put(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r14)
            r7.append(r11)
            java.lang.String r8 = ". using fcmNotification, no notify needed"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            defpackage.hm9.m(r9, r7, new java.lang.Object[0])
        L_0x01a9:
            r7 = r18
            r8 = r19
            goto L_0x00af
        L_0x01af:
            if (r7 == 0) goto L_0x02a4
            if (r8 != 0) goto L_0x02a4
            boolean r8 = r7.j
            if (r8 == 0) goto L_0x0276
            r6.o = r2
            r6.X = r0
            r6.Y = r1
            r6.Z = r5
            r6.s0 = r13
            r6.t0 = r10
            r6.u0 = r7
            r6.v0 = r11
            r15 = 2
            r6.y0 = r15
            java.lang.Object r8 = defpackage.od2.A(r5, r6)
            if (r8 != r3) goto L_0x01d1
            return r3
        L_0x01d1:
            r50 = r8
            r8 = r0
            r0 = r50
            r51 = r7
            r7 = r1
            r1 = r6
            r6 = r5
            r5 = r2
            r2 = r51
        L_0x01de:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01e4:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x0203
            java.lang.Object r20 = r0.next()
            r15 = r20
            me5 r15 = (defpackage.me5) r15
            r54 = r0
            r53 = r1
            long r0 = r15.a
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01fd
            goto L_0x0207
        L_0x01fd:
            r1 = r53
            r0 = r54
            r15 = 2
            goto L_0x01e4
        L_0x0203:
            r53 = r1
            r20 = 0
        L_0x0207:
            r0 = r20
            me5 r0 = (defpackage.me5) r0
            r54 = r5
            r55 = r6
            long r5 = r2.l
            if (r0 == 0) goto L_0x0216
            long r0 = r0.b
            goto L_0x0218
        L_0x0216:
            r0 = -1
        L_0x0218:
            int r15 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r20 = r3
            if (r15 <= 0) goto L_0x0220
            r15 = 1
            goto L_0x0221
        L_0x0220:
            r15 = 0
        L_0x0221:
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r11)
            r57 = r7
            r56 = r10
            r7 = 0
            r10 = 32255(0x7dff, float:4.5199E-41)
            ql2 r2 = defpackage.ql2.a(r2, r7, r7, r15, r10)
            r13.put(r3, r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            java.lang.String r2 = defpackage.tfg.f(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            r3.append(r11)
            java.lang.String r7 = ". using cacheNotification, needNotify="
            r3.append(r7)
            r3.append(r15)
            r15 = r19
            defpackage.au1.q(r5, r15, r4, r3)
            r3.append(r2)
            r2 = r18
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.hm9.m(r9, r0, new java.lang.Object[0])
            r6 = r53
            r5 = r55
            r16 = r56
            r1 = r57
            r3 = r2
            r0 = r8
            r2 = r54
            goto L_0x029c
        L_0x0276:
            r20 = r3
            r16 = r10
            r3 = r18
            r15 = r19
            r10 = 32255(0x7dff, float:4.5199E-41)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r11)
            r13.put(r8, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r14)
            r7.append(r11)
            java.lang.String r8 = ". using cacheNotification, no notify needed"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            defpackage.hm9.m(r9, r7, new java.lang.Object[0])
        L_0x029c:
            r7 = r3
            r8 = r15
            r10 = r16
            r3 = r20
            goto L_0x00af
        L_0x02a4:
            r20 = r3
            r16 = r10
            r3 = r18
            r15 = r19
            r10 = 32255(0x7dff, float:4.5199E-41)
            if (r8 == 0) goto L_0x02b2
            if (r7 != 0) goto L_0x02c4
        L_0x02b2:
            r54 = r0
            r19 = r1
            r55 = r2
            r2 = r3
            r8 = r4
            r56 = r5
            r53 = r6
            r1 = r9
            r5 = r11
            r4 = r14
            r7 = r15
            goto L_0x046a
        L_0x02c4:
            r2.getClass()
            r53 = r11
            long r10 = r7.l
            r12 = r0
            r19 = r1
            long r0 = r8.l
            int r21 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r21 < 0) goto L_0x02d9
            r55 = r2
            boolean r2 = r7.j
            goto L_0x02dd
        L_0x02d9:
            r55 = r2
            boolean r2 = r8.j
        L_0x02dd:
            if (r21 < 0) goto L_0x02e6
            r56 = r5
            int r5 = r7.i
        L_0x02e3:
            r33 = r5
            goto L_0x02eb
        L_0x02e6:
            r56 = r5
            int r5 = r8.i
            goto L_0x02e3
        L_0x02eb:
            java.lang.Long r5 = new java.lang.Long
            r57 = r3
            r43 = r4
            r3 = r53
            r5.<init>(r3)
            r53 = r6
            java.lang.Long r6 = new java.lang.Long
            r44 = r3
            long r3 = r8.a
            r6.<init>(r3)
            long r3 = r6.longValue()
            r22 = 0
            int r3 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r3 == 0) goto L_0x030c
            goto L_0x030d
        L_0x030c:
            r6 = 0
        L_0x030d:
            if (r6 == 0) goto L_0x0314
            long r3 = r6.longValue()
            goto L_0x0316
        L_0x0314:
            long r3 = r7.a
        L_0x0316:
            if (r21 < 0) goto L_0x031d
            java.lang.String r6 = r7.d
        L_0x031a:
            r28 = r6
            goto L_0x0320
        L_0x031d:
            java.lang.String r6 = r8.d
            goto L_0x031a
        L_0x0320:
            java.util.ArrayList r6 = new java.util.ArrayList
            r54 = r12
            java.util.List r12 = r7.f
            r6.<init>(r12)
            r46 = r9
            java.util.List r9 = r8.f
            java.util.Iterator r9 = r9.iterator()
        L_0x0331:
            boolean r24 = r9.hasNext()
            if (r24 == 0) goto L_0x03a5
            java.lang.Object r24 = r9.next()
            r25 = r9
            r9 = r24
            rw8 r9 = (defpackage.rw8) r9
            r47 = r15
            boolean r15 = r12 instanceof java.util.Collection
            if (r15 == 0) goto L_0x0356
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L_0x0356
        L_0x034d:
            r49 = r2
            r34 = r3
            r26 = r12
            r48 = r14
            goto L_0x03a1
        L_0x0356:
            java.util.Iterator r15 = r12.iterator()
        L_0x035a:
            boolean r24 = r15.hasNext()
            if (r24 == 0) goto L_0x034d
            java.lang.Object r24 = r15.next()
            r26 = r12
            r12 = r24
            rw8 r12 = (defpackage.rw8) r12
            r48 = r14
            r24 = r15
            long r14 = r12.c
            r49 = r2
            r34 = r3
            long r2 = r9.c
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0396
            long r2 = r12.e
            long r14 = r9.e
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0396
            android.graphics.Bitmap r2 = r9.h
            if (r2 == 0) goto L_0x0389
            r2.recycle()
        L_0x0389:
            r9 = r25
            r12 = r26
            r3 = r34
            r15 = r47
            r14 = r48
            r2 = r49
            goto L_0x0331
        L_0x0396:
            r15 = r24
            r12 = r26
            r3 = r34
            r14 = r48
            r2 = r49
            goto L_0x035a
        L_0x03a1:
            r6.add(r9)
            goto L_0x0389
        L_0x03a5:
            r49 = r2
            r34 = r3
            r48 = r14
            r47 = r15
            fs4 r2 = new fs4
            r3 = 13
            r2.<init>(r3)
            java.util.List r30 = defpackage.x53.x0(r6, r2)
            android.graphics.Bitmap r2 = r7.h
            android.graphics.Bitmap r3 = r8.h
            if (r21 < 0) goto L_0x03c6
            if (r3 == 0) goto L_0x03c3
            r3.recycle()
        L_0x03c3:
            r32 = r2
            goto L_0x03cd
        L_0x03c6:
            if (r2 == 0) goto L_0x03cb
            r2.recycle()
        L_0x03cb:
            r32 = r3
        L_0x03cd:
            boolean r2 = r7.k
            if (r2 == 0) goto L_0x03d7
            boolean r2 = r8.k
            if (r2 == 0) goto L_0x03d7
            r2 = 1
            goto L_0x03d8
        L_0x03d7:
            r2 = 0
        L_0x03d8:
            long r36 = java.lang.Math.max(r10, r0)
            long r3 = r7.m
            long r14 = r8.m
            long r38 = java.lang.Math.max(r3, r14)
            java.lang.Long r3 = new java.lang.Long
            long r14 = r7.o
            r3.<init>(r14)
            long r14 = r3.longValue()
            int r4 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r4 == 0) goto L_0x03f4
            goto L_0x03f5
        L_0x03f4:
            r3 = 0
        L_0x03f5:
            if (r3 == 0) goto L_0x03fe
            long r3 = r3.longValue()
        L_0x03fb:
            r41 = r3
            goto L_0x0401
        L_0x03fe:
            long r3 = r8.o
            goto L_0x03fb
        L_0x0401:
            java.lang.String r3 = r8.n
            if (r3 != 0) goto L_0x0407
            java.lang.String r3 = r7.n
        L_0x0407:
            r40 = r3
            ql2 r3 = new ql2
            rl2 r4 = r7.e
            r29 = r4
            java.util.List r4 = r7.g
            r31 = r4
            java.lang.String r4 = r8.b
            r25 = r4
            long r6 = r7.c
            r26 = r6
            r22 = r3
            r23 = r34
            r34 = r49
            r35 = r2
            r22.<init>(r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r41)
            r13.put(r5, r3)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r10)
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            java.lang.String r2 = defpackage.tfg.f(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r48
            r3.<init>(r4)
            r5 = r44
            r3.append(r5)
            java.lang.String r5 = ". using both, needNotify="
            r3.append(r5)
            r5 = r49
            r3.append(r5)
            r8 = r43
            r7 = r47
            defpackage.au1.q(r10, r7, r8, r3)
            r3.append(r2)
            r2 = r57
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = r46
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            r3 = 0
            goto L_0x047c
        L_0x046a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "mergeNotificationsMap: failed, no notification data for chatServerId="
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r3 = 0
            defpackage.hm9.p(r1, r0, r3)
        L_0x047c:
            r6 = r53
            r0 = r54
            r5 = r56
            r9 = r1
            r14 = r4
            r4 = r8
            r10 = r16
            r1 = r19
            r3 = r20
            r8 = r7
            r7 = r2
            r2 = r55
            goto L_0x00af
        L_0x0491:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.f(java.util.Set, sl2, sl2, mn5, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.sl2 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.am2
            if (r0 == 0) goto L_0x0013
            r0 = r15
            am2 r0 = (defpackage.am2) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            am2 r0 = new am2
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.util.Iterator r13 = r0.Y
            sl2 r14 = r0.X
            cm2 r2 = r0.o
            defpackage.od2.a0(r15)
            goto L_0x0073
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            sl2 r14 = r0.X
            cm2 r13 = r0.o
            defpackage.od2.a0(r15)
            goto L_0x006b
        L_0x0042:
            defpackage.od2.a0(r15)
            java.util.Map r15 = r14.a
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x004e
            return r3
        L_0x004e:
            je7 r15 = r13.e
            java.lang.Object r15 = r15.getValue()
            iy2 r15 = (defpackage.iy2) r15
            java.util.Map r2 = r14.a
            java.util.Set r2 = r2.keySet()
            r0.o = r13
            r0.X = r14
            r0.t0 = r5
            jz2 r15 = (defpackage.jz2) r15
            java.lang.Object r15 = r15.p(r2, r0)
            if (r15 != r1) goto L_0x006b
            return r1
        L_0x006b:
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r15 = r15.iterator()
            r2 = r13
            r13 = r15
        L_0x0073:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00cc
            java.lang.Object r15 = r13.next()
            e52 r15 = (defpackage.e52) r15
            java.util.Map r5 = r14.a
            k92 r6 = r15.b
            long r6 = r6.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.Object r5 = r5.get(r8)
            ql2 r5 = (defpackage.ql2) r5
            if (r5 != 0) goto L_0x0093
            goto L_0x0073
        L_0x0093:
            k92 r6 = r15.b
            b92 r6 = r6.a()
            long r6 = r6.d
            long r8 = r5.l
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0073
            je7 r6 = r2.e
            java.lang.Object r6 = r6.getValue()
            iy2 r6 = (defpackage.iy2) r6
            r0.o = r2
            r0.X = r14
            r0.Y = r13
            r0.t0 = r4
            r8 = r6
            jz2 r8 = (defpackage.jz2) r8
            r8.getClass()
            xy2 r6 = new xy2
            long r9 = r15.a
            long r11 = r5.l
            r7 = r6
            r7.<init>(r8, r9, r11)
            java.lang.Object r15 = defpackage.ema.C(r6, r0)
            if (r15 != r1) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r15 = r3
        L_0x00c9:
            if (r15 != r1) goto L_0x0073
            return r1
        L_0x00cc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.g(sl2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7 A[LOOP:1: B:43:0x00f1->B:45:0x00f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.sl2 r17, defpackage.mn5 r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r19
            boolean r3 = r1 instanceof defpackage.bm2
            if (r3 == 0) goto L_0x0019
            r3 = r1
            bm2 r3 = (defpackage.bm2) r3
            int r4 = r3.y0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.y0 = r4
            r4 = r16
            goto L_0x0020
        L_0x0019:
            bm2 r3 = new bm2
            r4 = r16
            r3.<init>(r4, r1)
        L_0x0020:
            java.lang.Object r1 = r3.w0
            tx3 r5 = defpackage.tx3.a
            int r6 = r3.y0
            e5f r7 = defpackage.e5f.a
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0057
            if (r6 == r9) goto L_0x0043
            if (r6 != r8) goto L_0x003b
            defpackage.od2.a0(r1)     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            goto L_0x013e
        L_0x0035:
            r0 = move-exception
            goto L_0x0137
        L_0x0038:
            r0 = move-exception
            goto L_0x013f
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            long r11 = r3.v0
            cm2 r0 = r3.u0
            ql2 r4 = r3.t0
            java.lang.Object r6 = r3.s0
            java.util.Iterator r13 = r3.Z
            java.util.Collection r14 = r3.Y
            mn5 r15 = r3.X
            cm2 r8 = r3.o
            defpackage.od2.a0(r1)
            goto L_0x00a3
        L_0x0057:
            defpackage.od2.a0(r1)
            java.util.Map r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0063
            return r7
        L_0x0063:
            java.util.Map r0 = r0.a
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            r14 = r1
            r0 = r18
        L_0x0076:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00e0
            java.lang.Object r6 = r13.next()
            r1 = r6
            ql2 r1 = (defpackage.ql2) r1
            long r11 = r1.l
            r3.o = r4
            r3.X = r0
            r3.Y = r14
            r3.Z = r13
            r3.s0 = r6
            r3.t0 = r1
            r3.u0 = r4
            r3.v0 = r11
            r3.y0 = r9
            java.lang.Object r8 = defpackage.od2.A(r0, r3)
            if (r8 != r5) goto L_0x009e
            return r5
        L_0x009e:
            r15 = r0
            r0 = r4
            r4 = r1
            r1 = r8
            r8 = r0
        L_0x00a3:
            java.util.List r1 = (java.util.List) r1
            long r9 = r4.c
            r0.getClass()
            java.util.Iterator r0 = r1.iterator()
        L_0x00ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r0.next()
            r4 = r1
            me5 r4 = (defpackage.me5) r4
            r16 = r3
            long r2 = r4.a
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            r3 = r16
            goto L_0x00ae
        L_0x00c7:
            r16 = r3
            r1 = 0
        L_0x00ca:
            me5 r1 = (defpackage.me5) r1
            if (r1 == 0) goto L_0x00d1
            long r0 = r1.b
            goto L_0x00d3
        L_0x00d1:
            r0 = 0
        L_0x00d3:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00da
            r14.add(r6)
        L_0x00da:
            r3 = r16
            r4 = r8
            r0 = r15
            r9 = 1
            goto L_0x0076
        L_0x00e0:
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = defpackage.z53.S(r14, r1)
            r0.<init>(r2)
            java.util.Iterator r1 = r14.iterator()
        L_0x00f1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010a
            java.lang.Object r2 = r1.next()
            ql2 r2 = (defpackage.ql2) r2
            me5 r6 = new me5
            long r8 = r2.c
            long r10 = r2.l
            r6.<init>(r8, r10)
            r0.add(r6)
            goto L_0x00f1
        L_0x010a:
            je7 r1 = r4.c     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            le5 r1 = (defpackage.le5) r1     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r2 = 0
            r3.o = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.X = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.Y = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.Z = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.s0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.t0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r3.u0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r2 = 2
            r3.y0 = r2     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r1.getClass()     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            uh r2 = new uh     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            r4 = 10
            r2.<init>(r1, r4, r0)     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            ilc r0 = r1.a     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            java.lang.Object r0 = defpackage.ote.j(r0, r2, r3)     // Catch:{ CancellationException -> 0x0038, all -> 0x0035 }
            if (r0 != r5) goto L_0x013e
            return r5
        L_0x0137:
            java.lang.String r1 = "cm2"
            java.lang.String r2 = "failed to put notifications history items"
            defpackage.hm9.p(r1, r2, r0)
        L_0x013e:
            return r7
        L_0x013f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.h(sl2, mn5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
