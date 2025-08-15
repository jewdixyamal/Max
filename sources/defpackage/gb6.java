package defpackage;

/* renamed from: gb6  reason: default package */
public final class gb6 {
    public static final /* synthetic */ int f = 0;
    public final pk a;
    public final av0 b;
    public final p82 c;
    public final ua3 d = ngg.a();
    public final fb6 e = new fb6(this);

    public gb6(pk pkVar, av0 av0, p82 p82) {
        this.a = pkVar;
        this.b = av0;
        this.c = p82;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Comparable a(long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.eb6
            if (r0 == 0) goto L_0x0013
            r0 = r12
            eb6 r0 = (defpackage.eb6) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            eb6 r0 = new eb6
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "gb6"
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            long r9 = r0.X
            gb6 r8 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x002f }
            goto L_0x00ab
        L_0x002f:
            r9 = move-exception
            goto L_0x00ce
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            defpackage.od2.a0(r12)
            r6 = 0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x005c
            java.lang.Class<gb6> r8 = defpackage.gb6.class
            java.lang.String r8 = r8.getName()
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x004e
            goto L_0x005b
        L_0x004e:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x005b
            us7 r10 = defpackage.us7.Z
            java.lang.String r11 = "invalid server chat id #0!"
            r9.d(r10, r8, r11, r4)
        L_0x005b:
            return r4
        L_0x005c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "execute: "
            r12.<init>(r2)
            r12.append(r9)
            java.lang.String r2 = ", force: "
            r12.append(r2)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.m(r5, r12, new java.lang.Object[0])
            p82 r12 = r8.c
            e52 r12 = r12.z(r9)
            if (r12 == 0) goto L_0x0085
            if (r11 != 0) goto L_0x0085
            java.lang.String r8 = "execute: chat contains!"
            defpackage.hm9.m(r5, r8, new java.lang.Object[0])
            return r12
        L_0x0085:
            fb6 r11 = r8.e
            r11.a = r9
            av0 r11 = r8.b
            fb6 r12 = r8.e
            r11.d(r12)
            fb6 r11 = r8.e
            pk r12 = r8.a
            k4a r12 = (defpackage.k4a) r12
            long r6 = r12.j(r9)
            r11.b = r6
            ua3 r11 = r8.d     // Catch:{ all -> 0x002f }
            r0.o = r8     // Catch:{ all -> 0x002f }
            r0.X = r9     // Catch:{ all -> 0x002f }
            r0.s0 = r3     // Catch:{ all -> 0x002f }
            java.lang.Object r12 = r11.awaitInternal(r0)     // Catch:{ all -> 0x002f }
            if (r12 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            e52 r12 = (defpackage.e52) r12     // Catch:{ all -> 0x002f }
            av0 r11 = r8.b
            fb6 r8 = r8.e
            r11.f(r8)
            java.lang.String r8 = "get chat info"
            defpackage.hm9.m(r5, r8, new java.lang.Object[0])
            if (r12 != 0) goto L_0x00cd
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r9)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r3)
            java.lang.String r9 = "chat info is null %d"
            defpackage.hm9.k0(r5, r4, r9, r8)
        L_0x00cd:
            return r12
        L_0x00ce:
            av0 r10 = r8.b
            fb6 r8 = r8.e
            r10.f(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb6.a(long, boolean, kotlin.coroutines.Continuation):java.lang.Comparable");
    }
}
