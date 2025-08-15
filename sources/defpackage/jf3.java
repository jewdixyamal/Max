package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jf3  reason: default package */
public final class jf3 extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ of3 Z;
    public final /* synthetic */ String s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jf3(of3 of3, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = of3;
        this.s0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jf3(this.Z, this.s0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [a66, ffe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.Y
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 2
            of3 r8 = r11.Z
            if (r1 == 0) goto L_0x003e
            if (r1 == r5) goto L_0x003a
            if (r1 == r7) goto L_0x0032
            if (r1 == r4) goto L_0x002e
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            defpackage.od2.a0(r12)
            goto L_0x00cc
        L_0x001d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0025:
            java.lang.Object r1 = r11.X
            y70 r1 = (defpackage.y70) r1
            defpackage.od2.a0(r12)
            goto L_0x00ad
        L_0x002e:
            defpackage.od2.a0(r12)
            goto L_0x0090
        L_0x0032:
            java.lang.Object r1 = r11.X
            java.lang.String r1 = (java.lang.String) r1
            defpackage.od2.a0(r12)
            goto L_0x007b
        L_0x003a:
            defpackage.od2.a0(r12)
            goto L_0x0056
        L_0x003e:
            defpackage.od2.a0(r12)
            je7 r12 = r8.Z
            java.lang.Object r12 = r12.getValue()
            f80 r12 = (defpackage.f80) r12
            java.lang.String r1 = r8.o
            r11.Y = r5
            java.lang.String r5 = r11.s0
            java.lang.Object r12 = r12.a(r5, r1, r11)
            if (r12 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r1 = r12
            y70 r1 = (defpackage.y70) r1
            java.util.Map r12 = r1.c
            java.lang.String r5 = "LOGIN"
            boolean r12 = r12.containsKey(r5)
            std r9 = defpackage.std.a
            java.util.Map r10 = r1.c
            if (r12 == 0) goto L_0x0098
            java.lang.Object r12 = defpackage.mz7.X(r10, r5)
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            kld r12 = r8.v0
            r11.X = r1
            r11.Y = r7
            java.lang.Object r12 = r12.a(r9, r11)
            if (r12 != r0) goto L_0x007b
            return r0
        L_0x007b:
            je7 r12 = r8.Y
            java.lang.Object r12 = r12.getValue()
            hu7 r12 = (defpackage.hu7) r12
            r11.X = r6
            r11.Y = r4
            java.lang.String r2 = r8.X
            java.lang.Object r11 = r12.a(r1, r2, r11)
            if (r11 != r0) goto L_0x0090
            return r0
        L_0x0090:
            s35 r11 = r8.x0
            we3 r12 = defpackage.we3.b
            defpackage.pnf.o(r11, r12)
            goto L_0x00cc
        L_0x0098:
            java.lang.String r12 = "REGISTER"
            boolean r12 = r10.containsKey(r12)
            if (r12 == 0) goto L_0x00cc
            kld r12 = r8.v0
            r11.X = r1
            r11.Y = r3
            java.lang.Object r12 = r12.a(r9, r11)
            if (r12 != r0) goto L_0x00ad
            return r0
        L_0x00ad:
            q0e r12 = r8.B0
            if3 r3 = new if3
            r3.<init>(r7, r6)
            r4 = 2000(0x7d0, double:9.88E-321)
            ac r12 = defpackage.nu0.h(r12, r4, r3)
            zb r3 = new zb
            r4 = 16
            r3.<init>(r8, r4, r1)
            r11.X = r6
            r11.Y = r2
            java.lang.Object r11 = r12.d(r3, r11)
            if (r11 != r0) goto L_0x00cc
            return r0
        L_0x00cc:
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf3.o(java.lang.Object):java.lang.Object");
    }
}
