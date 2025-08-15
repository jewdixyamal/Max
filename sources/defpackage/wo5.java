package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wo5  reason: default package */
public final class wo5 extends ffe implements c66 {
    public mec X;
    public lec Y;
    public int Z;
    public /* synthetic */ Object s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ m56 u0;
    public final /* synthetic */ mn5 v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo5(jh2 jh2, mn5 mn5, Continuation continuation) {
        super(3, continuation);
        this.u0 = jh2;
        this.v0 = mn5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mn5 mn5 = this.v0;
        wo5 wo5 = new wo5((jh2) this.u0, mn5, (Continuation) obj3);
        wo5.s0 = (sx3) obj;
        wo5.t0 = (on5) obj2;
        return wo5.o(e5f.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: mec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: mec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: mec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: mec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: mec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: mec} */
    /* JADX WARNING: type inference failed for: r10v8, types: [java.lang.Object, lec] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0127 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x002a
            if (r2 != r5) goto L_0x0022
            mec r2 = r0.X
            java.lang.Object r7 = r0.t0
            p8c r7 = (defpackage.p8c) r7
            java.lang.Object r8 = r0.s0
            on5 r8 = (defpackage.on5) r8
            defpackage.od2.a0(r20)
        L_0x001d:
            r9 = r8
            r8 = r7
            r7 = r2
            goto L_0x0128
        L_0x0022:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002a:
            lec r2 = r0.Y
            mec r7 = r0.X
            java.lang.Object r8 = r0.t0
            p8c r8 = (defpackage.p8c) r8
            java.lang.Object r9 = r0.s0
            on5 r9 = (defpackage.on5) r9
            defpackage.od2.a0(r20)
            goto L_0x00a9
        L_0x003b:
            defpackage.od2.a0(r20)
            java.lang.Object r2 = r0.s0
            sx3 r2 = (defpackage.sx3) r2
            java.lang.Object r7 = r0.t0
            on5 r7 = (defpackage.on5) r7
            vo5 r8 = new vo5
            mn5 r9 = r0.v0
            r8.<init>(r9, r6)
            hz4 r9 = defpackage.hz4.a
            vx3 r10 = defpackage.vx3.a
            r11 = 4
            zt0 r11 = defpackage.c37.a(r3, r4, r11)
            lx3 r2 = defpackage.v3c.x(r2, r9)
            fab r9 = new fab
            r9.<init>(r2, r11)
            r9.start(r10, r9, r8)
            mec r2 = new mec
            r2.<init>()
            r8 = r9
            r9 = r7
            r7 = r2
        L_0x006a:
            java.lang.Object r2 = r7.a
            kotlinx.coroutines.internal.Symbol r10 = defpackage.ay9.c
            if (r2 == r10) goto L_0x012b
            lec r10 = new lec
            r10.<init>()
            if (r2 == 0) goto L_0x00ac
            kotlinx.coroutines.internal.Symbol r11 = defpackage.ay9.a
            if (r2 != r11) goto L_0x007c
            r2 = r6
        L_0x007c:
            m56 r12 = r0.u0
            java.lang.Object r2 = r12.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r12 = r2.longValue()
            r10.a = r12
            r14 = 0
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x00b0
            if (r2 != 0) goto L_0x00ac
            java.lang.Object r2 = r7.a
            if (r2 != r11) goto L_0x0097
            r2 = r6
        L_0x0097:
            r0.s0 = r9
            r0.t0 = r8
            r0.X = r7
            r0.Y = r10
            r0.Z = r4
            java.lang.Object r2 = r9.a(r2, r0)
            if (r2 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            r2 = r10
        L_0x00a9:
            r7.a = r6
            r10 = r2
        L_0x00ac:
            r2 = r7
            r7 = r8
            r8 = r9
            goto L_0x00bc
        L_0x00b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Debounce timeout should not be negative"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            y3d r9 = new y3d
            lx3 r11 = r0.b
            r9.<init>(r11)
            java.lang.Object r11 = r2.a
            if (r11 == 0) goto L_0x00d2
            long r10 = r10.a
            m44 r12 = new m44
            r13 = 1
            r12.<init>(r8, r2, r6, r13)
            defpackage.dy7.G(r9, r10, r12)
        L_0x00d2:
            v3d r10 = r7.c()
            to5 r15 = new to5
            r15.<init>(r2, r8, r6)
            w3d r14 = new w3d
            m5d r10 = (defpackage.m5d) r10
            java.lang.Object r13 = r10.b
            java.lang.Object r11 = r10.o
            r16 = r11
            c66 r16 = (defpackage.c66) r16
            r17 = 0
            java.lang.Object r11 = r10.c
            r18 = r11
            c66 r18 = (defpackage.c66) r18
            java.lang.Object r10 = r10.X
            c66 r10 = (defpackage.c66) r10
            r11 = r14
            r12 = r9
            r4 = r14
            r14 = r18
            r18 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r9.f(r4, r3)
            r0.s0 = r8
            r0.t0 = r7
            r0.X = r2
            r0.Y = r6
            r0.Z = r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.y3d.Y
            java.lang.Object r4 = r4.get(r9)
            boolean r4 = r4 instanceof defpackage.w3d
            if (r4 == 0) goto L_0x0121
            java.lang.Object r4 = r9.c(r0)
            goto L_0x0125
        L_0x0121:
            java.lang.Object r4 = r9.d(r0)
        L_0x0125:
            if (r4 != r1) goto L_0x001d
            return r1
        L_0x0128:
            r4 = 1
            goto L_0x006a
        L_0x012b:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo5.o(java.lang.Object):java.lang.Object");
    }
}
