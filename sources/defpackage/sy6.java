package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sy6  reason: default package */
public final class sy6 extends ffe implements a66 {
    public gy6 X;
    public int Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ fz6 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy6(fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.t0 = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sy6 sy6 = new sy6(this.t0, continuation);
        sy6.s0 = obj;
        return sy6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0117 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            fz6 r12 = r0.t0
            r13 = 1
            r14 = 3
            r15 = 2
            java.lang.String r11 = "prefetch "
            if (r2 == 0) goto L_0x0050
            if (r2 == r13) goto L_0x0044
            if (r2 == r15) goto L_0x0031
            if (r2 != r14) goto L_0x0029
            int r1 = r0.Y
            gy6 r2 = r0.X
            java.lang.Object r0 = r0.s0
            sx3 r0 = (defpackage.sx3) r0
            defpackage.od2.a0(r21)
            r4 = r2
            r15 = r11
            r2 = r0
            r0 = r21
            goto L_0x0119
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            gy6 r2 = r0.X
            java.lang.Object r4 = r0.s0
            sx3 r4 = (defpackage.sx3) r4
            defpackage.od2.a0(r21)
            r5 = r21
            r15 = r11
            r19 = r4
            r4 = r2
            r2 = r19
            goto L_0x0100
        L_0x0044:
            java.lang.Object r2 = r0.s0
            sx3 r2 = (defpackage.sx3) r2
            defpackage.od2.a0(r21)
            r4 = r21
            r15 = r11
            goto L_0x00cb
        L_0x0050:
            defpackage.od2.a0(r21)
            java.lang.Object r2 = r0.s0
            sx3 r2 = (defpackage.sx3) r2
            java.lang.String r4 = defpackage.fz6.E0
            java.util.concurrent.atomic.AtomicInteger r5 = r12.x0
            int r5 = r5.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r11)
            r6.append(r5)
            java.lang.String r5 = ": start to load virtual albums"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.hm9.m(r4, r5, new java.lang.Object[0])
            java.util.concurrent.atomic.AtomicInteger r5 = r12.x0
            int r5 = r5.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r11)
            r6.append(r5)
            java.lang.String r5 = ": start fetch medias"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.hm9.m(r4, r5, new java.lang.Object[0])
            zme r6 = new zme
            java.util.concurrent.atomic.AtomicInteger r4 = r12.x0
            int r4 = r4.get()
            java.lang.String r5 = " virtual albums recent items"
            java.lang.String r4 = defpackage.wg0.g(r4, r11, r5)
            r6.<init>(r4)
            x76 r5 = defpackage.x76.a
            r0.s0 = r2
            r0.Z = r13
            kke r4 = r12.c
            w9a r4 = (defpackage.w9a) r4
            nx3 r10 = r4.b()
            oy6 r9 = new oy6
            r16 = 0
            r8 = 40
            r17 = 0
            r18 = 0
            r4 = r9
            r7 = r12
            r13 = r9
            r9 = r17
            r14 = r10
            r10 = r18
            r15 = r11
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = defpackage.j47.t0(r14, r13, r0)
            if (r4 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            gy6 r4 = (defpackage.gy6) r4
            boolean r5 = defpackage.j1e.z(r2)
            if (r5 != 0) goto L_0x00d4
            return r3
        L_0x00d4:
            java.lang.String r5 = defpackage.fz6.E0
            java.util.concurrent.atomic.AtomicInteger r6 = r12.x0
            int r6 = r6.get()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r15)
            r7.append(r6)
            java.lang.String r6 = ": finish fetch medias"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.hm9.m(r5, r6, new java.lang.Object[0])
            w76 r5 = defpackage.w76.a
            r0.s0 = r2
            r0.X = r4
            r6 = 2
            r0.Z = r6
            java.lang.Object r5 = defpackage.fz6.a(r5, r12, r0)
            if (r5 != r1) goto L_0x0100
            return r1
        L_0x0100:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            y76 r6 = defpackage.y76.a
            r0.s0 = r2
            r0.X = r4
            r0.Y = r5
            r7 = 3
            r0.Z = r7
            java.lang.Object r0 = defpackage.fz6.a(r6, r12, r0)
            if (r0 != r1) goto L_0x0118
            return r1
        L_0x0118:
            r1 = r5
        L_0x0119:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r2 = defpackage.j1e.z(r2)
            if (r2 != 0) goto L_0x0126
            return r3
        L_0x0126:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.z0
            int r5 = r1 + r0
            r2.set(r5)
            java.util.concurrent.ConcurrentHashMap r2 = r12.A0
            r2.clear()
            q0e r6 = r12.Y
            java.lang.Object r7 = r6.getValue()
            b86 r7 = (defpackage.b86) r7
            a86 r7 = r7.a
            java.util.List r8 = r4.a
            r2.put(r7, r8)
            java.util.List r7 = r4.a
            java.lang.Object r7 = defpackage.x53.i0(r7)
            zp7 r7 = (defpackage.zp7) r7
            java.util.concurrent.ConcurrentHashMap r8 = r12.B0
            if (r7 == 0) goto L_0x0158
            java.lang.Object r9 = r6.getValue()
            b86 r9 = (defpackage.b86) r9
            a86 r9 = r9.a
            r8.put(r9, r7)
        L_0x0158:
            q0e r7 = r12.s0
            java.lang.Object r9 = r7.getValue()
            b86 r9 = (defpackage.b86) r9
            a86 r9 = r9.a
            java.util.List r10 = r4.b
            r2.put(r9, r10)
            java.lang.Object r9 = defpackage.x53.i0(r10)
            zp7 r9 = (defpackage.zp7) r9
            if (r9 == 0) goto L_0x017a
            java.lang.Object r10 = r7.getValue()
            b86 r10 = (defpackage.b86) r10
            a86 r10 = r10.a
            r8.put(r10, r9)
        L_0x017a:
            q0e r9 = r12.t0
            java.lang.Object r10 = r9.getValue()
            b86 r10 = (defpackage.b86) r10
            a86 r10 = r10.a
            java.util.List r4 = r4.c
            r2.put(r10, r4)
            java.lang.Object r2 = defpackage.x53.i0(r4)
            zp7 r2 = (defpackage.zp7) r2
            if (r2 == 0) goto L_0x019c
            java.lang.Object r4 = r9.getValue()
            b86 r4 = (defpackage.b86) r4
            a86 r4 = r4.a
            r8.put(r4, r2)
        L_0x019c:
            java.lang.Object r2 = r6.getValue()
            b86 r2 = (defpackage.b86) r2
            r4 = 9
            r8 = 1
            b86 r2 = defpackage.b86.a(r2, r5, r8, r4)
            r5 = 0
            r6.m(r5, r2)
            java.lang.Object r2 = r7.getValue()
            b86 r2 = (defpackage.b86) r2
            b86 r0 = defpackage.b86.a(r2, r0, r8, r4)
            r7.m(r5, r0)
            java.lang.Object r0 = r9.getValue()
            b86 r0 = (defpackage.b86) r0
            b86 r0 = defpackage.b86.a(r0, r1, r8, r4)
            r9.m(r5, r0)
            q0e r0 = r12.v0
            java.lang.Object r1 = r0.getValue()
            p35 r1 = (defpackage.p35) r1
            if (r1 == 0) goto L_0x01d7
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x01d9
        L_0x01d7:
            nz4 r1 = defpackage.nz4.a
        L_0x01d9:
            p35 r2 = new p35
            r2.<init>(r1)
            r0.m(r5, r2)
            java.lang.String r0 = defpackage.fz6.E0
            java.util.concurrent.atomic.AtomicInteger r1 = r12.x0
            int r1 = r1.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r1)
            java.lang.String r1 = ": finish load virtual albums"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy6.o(java.lang.Object):java.lang.Object");
    }
}
