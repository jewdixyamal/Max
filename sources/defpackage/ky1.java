package defpackage;

/* renamed from: ky1  reason: default package */
public final class ky1 {
    public static final /* synthetic */ bc7[] e;
    public static final String f;
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;

    static {
        Class<ky1> cls = ky1.class;
        hob hob = new hob(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0);
        oec oec = nec.a;
        e = new bc7[]{hob, zr6.e(oec, cls, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0), zr6.f(cls, "messageReactionsUpdateLogic", "getMessageReactionsUpdateLogic()Lru/ok/tamtam/messages/reactions/MessageReactionsUpdateLogic;", 0, oec), zr6.f(cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0, oec)};
        f = cls.getName();
    }

    public ky1(rm4 rm4, rm4 rm42, rm4 rm43, rm4 rm44) {
        this.a = rm4;
        this.b = rm42;
        this.c = rm43;
        this.d = rm44;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r23, long r25, long r27, long r29, defpackage.c6c r31, kotlin.coroutines.Continuation r32) {
        /*
            r22 = this;
            r1 = r22
            r0 = r32
            boolean r2 = r0 instanceof defpackage.jy1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            jy1 r2 = (defpackage.jy1) r2
            int r3 = r2.v0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.v0 = r3
            goto L_0x001c
        L_0x0017:
            jy1 r2 = new jy1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.t0
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.v0
            e5f r5 = defpackage.e5f.a
            java.lang.String r7 = f
            bc7[] r8 = e
            r9 = 1
            if (r4 == 0) goto L_0x0050
            if (r4 != r9) goto L_0x0048
            long r3 = r2.s0
            long r9 = r2.Z
            long r11 = r2.Y
            long r13 = r2.X
            ky1 r1 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0044 }
            r2 = r3
            r4 = r7
            r16 = r9
            r20 = r11
            r12 = r13
            r14 = r20
            goto L_0x009d
        L_0x0044:
            r0 = move-exception
            r4 = r7
            goto L_0x00db
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0050:
            defpackage.od2.a0(r0)
            r0 = r8[r9]
            rm4 r0 = r1.b
            java.lang.Object r0 = r0.get()
            y7d r0 = (defpackage.y7d) r0
            r0.getClass()
            java.lang.String r0 = "reactions, msgCancelReaction"
            defpackage.hm9.m(r7, r0, new java.lang.Object[0])
            r0 = 2
            r0 = r8[r0]     // Catch:{ all -> 0x0044 }
            rm4 r0 = r1.c     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0044 }
            r10 = r0
            lx8 r10 = (defpackage.lx8) r10     // Catch:{ all -> 0x0044 }
            r2.o = r1     // Catch:{ all -> 0x0044 }
            r13 = r23
            r2.X = r13     // Catch:{ all -> 0x0044 }
            r11 = r25
            r2.Y = r11     // Catch:{ all -> 0x0044 }
            r4 = r7
            r6 = r27
            r2.Z = r6     // Catch:{ all -> 0x00da }
            r15 = r10
            r9 = r29
            r2.s0 = r9     // Catch:{ all -> 0x00da }
            r0 = 1
            r2.v0 = r0     // Catch:{ all -> 0x00da }
            r10 = r15
            r11 = r23
            r13 = r25
            r15 = r31
            r10.e(r11, r13, r15)     // Catch:{ all -> 0x00da }
            if (r5 != r3) goto L_0x0095
            return r3
        L_0x0095:
            r12 = r23
            r14 = r25
            r2 = r29
            r16 = r6
        L_0x009d:
            r1.getClass()     // Catch:{ all -> 0x00da }
            r6 = 0
            r0 = r8[r6]     // Catch:{ all -> 0x00da }
            rm4 r0 = r1.a     // Catch:{ all -> 0x00da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00da }
            pk r0 = (defpackage.pk) r0     // Catch:{ all -> 0x00da }
            k4a r0 = (defpackage.k4a) r0     // Catch:{ all -> 0x00da }
            boolean r6 = r0.o(r12)     // Catch:{ all -> 0x00da }
            if (r6 != 0) goto L_0x00b4
            goto L_0x00f4
        L_0x00b4:
            boolean r6 = r0.p(r14)     // Catch:{ all -> 0x00da }
            if (r6 != 0) goto L_0x00bb
            goto L_0x00f4
        L_0x00bb:
            boolean r6 = r0.q(r2)     // Catch:{ all -> 0x00da }
            if (r6 != 0) goto L_0x00c2
            goto L_0x00f4
        L_0x00c2:
            me9 r6 = new me9     // Catch:{ all -> 0x00da }
            m7b r7 = r0.y()     // Catch:{ all -> 0x00da }
            p7b r7 = (defpackage.p7b) r7     // Catch:{ all -> 0x00da }
            t33 r7 = r7.a     // Catch:{ all -> 0x00da }
            long r10 = r7.o()     // Catch:{ all -> 0x00da }
            r9 = r6
            r18 = r2
            r9.<init>(r10, r12, r14, r16, r18)     // Catch:{ all -> 0x00da }
            defpackage.k4a.w(r0, r6)     // Catch:{ all -> 0x00da }
            goto L_0x00f4
        L_0x00da:
            r0 = move-exception
        L_0x00db:
            java.lang.String r2 = "reactions, cancelReaction async query failed"
            defpackage.hm9.p(r4, r2, r0)
            r1.getClass()
            r2 = 3
            r2 = r8[r2]
            rm4 r1 = r1.d
            java.lang.Object r1 = r1.get()
            o45 r1 = (defpackage.o45) r1
            cba r1 = (defpackage.cba) r1
            r2 = 0
            r1.c(r0, r2)
        L_0x00f4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky1.a(long, long, long, long, c6c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
