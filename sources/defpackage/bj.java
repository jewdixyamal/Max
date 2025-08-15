package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bj  reason: default package */
public final class bj extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gj Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj(gj gjVar, Continuation continuation) {
        super(2, continuation);
        this.Z = gjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bj) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bj bjVar = new bj(this.Z, continuation);
        bjVar.Y = obj;
        return bjVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r11 = r10.Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r11.a;
        r5 = new defpackage.au(8, ((defpackage.hyc) r11.c).g.getLong("user.animojiSetsLastSync", 0));
        r10.Y = null;
        r10.X = 2;
        r11 = ((defpackage.k4a) r1).J(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r11 != r0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r11 = (defpackage.ru) r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.X
            e5f r2 = defpackage.e5f.a
            r3 = 0
            r4 = 1
            switch(r1) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0039;
                case 2: goto L_0x0033;
                case 3: goto L_0x002a;
                case 4: goto L_0x0021;
                case 5: goto L_0x0018;
                case 6: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0013:
            defpackage.od2.a0(r11)
            goto L_0x011c
        L_0x0018:
            java.lang.Object r1 = r10.Y
            java.util.List r1 = (java.util.List) r1
            defpackage.od2.a0(r11)
            goto L_0x00f2
        L_0x0021:
            java.lang.Object r1 = r10.Y
            java.util.List r1 = (java.util.List) r1
            defpackage.od2.a0(r11)
            goto L_0x00d7
        L_0x002a:
            java.lang.Object r1 = r10.Y
            ru r1 = (defpackage.ru) r1
            defpackage.od2.a0(r11)
            goto L_0x00c2
        L_0x0033:
            defpackage.od2.a0(r11)     // Catch:{ all -> 0x0037 }
            goto L_0x008a
        L_0x0037:
            r11 = move-exception
            goto L_0x008d
        L_0x0039:
            java.lang.Object r1 = r10.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r11)
            goto L_0x0063
        L_0x0041:
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.Y
            sx3 r11 = (defpackage.sx3) r11
            gj r1 = r10.Z
            w4d r5 = r1.l
            bc7[] r6 = defpackage.gj.p
            r6 = r6[r4]
            java.lang.Object r1 = r5.T0(r1, r6)
            x77 r1 = (defpackage.x77) r1
            if (r1 == 0) goto L_0x0063
            r10.Y = r11
            r10.X = r4
            java.lang.Object r11 = r1.join(r10)
            if (r11 != r0) goto L_0x0063
            return r0
        L_0x0063:
            gj r11 = r10.Z
            pk r1 = r11.a     // Catch:{ all -> 0x0037 }
            au r5 = new au     // Catch:{ all -> 0x0037 }
            q33 r11 = r11.c     // Catch:{ all -> 0x0037 }
            hyc r11 = (defpackage.hyc) r11     // Catch:{ all -> 0x0037 }
            java.lang.String r6 = "user.animojiSetsLastSync"
            ne7 r11 = r11.g     // Catch:{ all -> 0x0037 }
            r7 = 0
            long r6 = r11.getLong(r6, r7)     // Catch:{ all -> 0x0037 }
            r11 = 8
            r5.<init>((int) r11, (long) r6)     // Catch:{ all -> 0x0037 }
            r10.Y = r3     // Catch:{ all -> 0x0037 }
            r11 = 2
            r10.X = r11     // Catch:{ all -> 0x0037 }
            k4a r1 = (defpackage.k4a) r1     // Catch:{ all -> 0x0037 }
            java.lang.Object r11 = r1.J(r5, r10)     // Catch:{ all -> 0x0037 }
            if (r11 != r0) goto L_0x008a
            return r0
        L_0x008a:
            ru r11 = (defpackage.ru) r11     // Catch:{ all -> 0x0037 }
            goto L_0x0093
        L_0x008d:
            njc r1 = new njc
            r1.<init>(r11)
            r11 = r1
        L_0x0093:
            boolean r1 = r11 instanceof defpackage.njc
            if (r1 == 0) goto L_0x0098
            r11 = r3
        L_0x0098:
            r1 = r11
            ru r1 = (defpackage.ru) r1
            if (r1 != 0) goto L_0x00b4
            gj r10 = r10.Z
            java.lang.String r10 = r10.f
            ir6 r11 = defpackage.hm9.m
            if (r11 != 0) goto L_0x00a6
            goto L_0x00b3
        L_0x00a6:
            boolean r0 = r11.c()
            if (r0 == 0) goto L_0x00b3
            us7 r0 = defpackage.us7.Z
            java.lang.String r1 = "response is null"
            r11.d(r0, r10, r1, r3)
        L_0x00b3:
            return r2
        L_0x00b4:
            gj r11 = r10.Z
            r10.Y = r1
            r5 = 3
            r10.X = r5
            java.lang.Object r11 = defpackage.gj.b(r11, r1, r10)
            if (r11 != r0) goto L_0x00c2
            return r0
        L_0x00c2:
            java.util.List r11 = (java.util.List) r11
            gj r5 = r10.Z
            java.util.Map r1 = r1.s0
            r10.Y = r11
            r6 = 4
            r10.X = r6
            java.lang.Object r1 = defpackage.gj.a(r5, r1, r10)
            if (r1 != r0) goto L_0x00d4
            return r0
        L_0x00d4:
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x00d7:
            java.util.List r11 = (java.util.List) r11
            boolean r5 = r11.isEmpty()
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00f2
            gj r5 = r10.Z
            gi9 r11 = defpackage.oag.G(r11)
            r10.Y = r1
            r6 = 5
            r10.X = r6
            java.lang.Object r11 = r5.e(r11, r10)
            if (r11 != r0) goto L_0x00f2
            return r0
        L_0x00f2:
            boolean r11 = r1.isEmpty()
            r11 = r11 ^ r4
            if (r11 == 0) goto L_0x011c
            gj r11 = r10.Z
            gi9 r1 = defpackage.oag.G(r1)
            r10.Y = r3
            r4 = 6
            r10.X = r4
            kke r4 = r11.d
            w9a r4 = (defpackage.w9a) r4
            nx3 r4 = r4.a()
            ui r5 = new ui
            r5.<init>(r11, r1, r3)
            java.lang.Object r10 = defpackage.j47.t0(r4, r5, r10)
            if (r10 != r0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r10 = r2
        L_0x0119:
            if (r10 != r0) goto L_0x011c
            return r0
        L_0x011c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj.o(java.lang.Object):java.lang.Object");
    }
}
