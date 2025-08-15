package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i72  reason: default package */
public final class i72 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k72 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i72(k72 k72, Continuation continuation) {
        super(2, continuation);
        this.Z = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i72) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i72 i72 = new i72(this.Z, continuation);
        i72.Y = obj;
        return i72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            r6 = 0
            k72 r7 = r0.Z
            if (r2 == 0) goto L_0x002a
            if (r2 == r5) goto L_0x0024
            if (r2 != r4) goto L_0x001c
            java.lang.Object r0 = r0.Y
            ti9 r0 = (defpackage.ti9) r0
            defpackage.od2.a0(r19)
            goto L_0x0135
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            defpackage.od2.a0(r19)
            r2 = r19
            goto L_0x008f
        L_0x002a:
            defpackage.od2.a0(r19)
            java.lang.Object r2 = r0.Y
            java.lang.String r2 = (java.lang.String) r2
            q0e r8 = r7.h
            java.lang.Object r8 = r8.getValue()
            o22 r8 = (defpackage.o22) r8
            if (r8 == 0) goto L_0x003e
            java.lang.String r8 = r8.c
            goto L_0x003f
        L_0x003e:
            r8 = r6
        L_0x003f:
            boolean r8 = defpackage.tpa.f(r2, r8)
            r14 = r8 ^ 1
            q0e r15 = r7.i
            if (r2 == 0) goto L_0x0172
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0051
            goto L_0x0172
        L_0x0051:
            java.lang.Object r8 = r15.getValue()
            o22 r8 = (defpackage.o22) r8
            if (r8 == 0) goto L_0x006e
            if (r14 == 0) goto L_0x0063
            int r9 = defpackage.vea.w
            eqe r10 = new eqe
            r10.<init>(r9)
            goto L_0x0064
        L_0x0063:
            r10 = r6
        L_0x0064:
            r11 = 0
            r12 = 0
            r13 = 35
            r9 = r2
            o22 r8 = defpackage.o22.a(r8, r9, r10, r11, r12, r13)
            goto L_0x006f
        L_0x006e:
            r8 = r6
        L_0x006f:
            r15.setValue(r8)
            if (r14 != 0) goto L_0x0075
            return r3
        L_0x0075:
            bc7[] r8 = defpackage.k72.x
            kke r8 = r7.p()
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            h72 r9 = new h72
            r9.<init>(r7, r2, r6)
            r0.X = r5
            java.lang.Object r2 = defpackage.j47.t0(r8, r9, r0)
            if (r2 != r1) goto L_0x008f
            return r1
        L_0x008f:
            pke r2 = (defpackage.pke) r2
            if (r2 == 0) goto L_0x014e
            q0e r5 = r7.i
            c22 r8 = defpackage.c22.a
            b22 r9 = defpackage.b22.a
            java.lang.String r10 = r2.b
            java.lang.String r2 = r2.o
            if (r2 == 0) goto L_0x00b1
            int r11 = r2.length()
            if (r11 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00a6:
            a22 r11 = new a22
            iqe r12 = new iqe
            r12.<init>(r2)
            r11.<init>(r12)
            goto L_0x00da
        L_0x00b1:
            java.lang.String r2 = "service.unavailable"
            boolean r2 = defpackage.tpa.f(r10, r2)
            if (r2 != 0) goto L_0x00d9
            java.lang.String r2 = "service.timeout"
            boolean r2 = defpackage.tpa.f(r10, r2)
            if (r2 == 0) goto L_0x00c2
            goto L_0x00d9
        L_0x00c2:
            java.lang.String r2 = "io.exception"
            boolean r2 = defpackage.tpa.f(r10, r2)
            if (r2 == 0) goto L_0x00cc
            r11 = r9
            goto L_0x00da
        L_0x00cc:
            d22 r11 = new d22
            int r2 = defpackage.jpc.F
            eqe r12 = new eqe
            r12.<init>(r2)
            r11.<init>(r12)
            goto L_0x00da
        L_0x00d9:
            r11 = r8
        L_0x00da:
            boolean r2 = r11.equals(r9)
            if (r2 != 0) goto L_0x0129
            boolean r2 = r11.equals(r8)
            if (r2 == 0) goto L_0x00e7
            goto L_0x0129
        L_0x00e7:
            boolean r0 = r11 instanceof defpackage.a22
            q0e r1 = r7.i
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r1.getValue()
            r12 = r0
            o22 r12 = (defpackage.o22) r12
            if (r12 == 0) goto L_0x014a
            a22 r11 = (defpackage.a22) r11
            int r0 = defpackage.wfa.U
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r0)
            jqe r14 = r11.a
            r16 = 1
            r13 = 0
            r17 = 7
            o22 r6 = defpackage.o22.a(r12, r13, r14, r15, r16, r17)
            goto L_0x014a
        L_0x010b:
            java.lang.Object r0 = r1.getValue()
            r11 = r0
            o22 r11 = (defpackage.o22) r11
            if (r11 == 0) goto L_0x014a
            iqe r13 = new iqe
            r13.<init>(r10)
            int r0 = defpackage.wfa.U
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r0)
            r12 = 0
            r15 = 1
            r16 = 7
            o22 r6 = defpackage.o22.a(r11, r12, r13, r14, r15, r16)
            goto L_0x014a
        L_0x0129:
            r0.Y = r5
            r0.X = r4
            java.lang.Object r0 = r7.r(r11, r0)
            if (r0 != r1) goto L_0x0134
            return r1
        L_0x0134:
            r0 = r5
        L_0x0135:
            q0e r1 = r7.i
            java.lang.Object r1 = r1.getValue()
            r7 = r1
            o22 r7 = (defpackage.o22) r7
            if (r7 == 0) goto L_0x0149
            r10 = 0
            r11 = 1
            r8 = 0
            r9 = 0
            r12 = 7
            o22 r6 = defpackage.o22.a(r7, r8, r9, r10, r11, r12)
        L_0x0149:
            r5 = r0
        L_0x014a:
            r5.setValue(r6)
            goto L_0x0171
        L_0x014e:
            q0e r0 = r7.i
            java.lang.Object r1 = r0.getValue()
            r7 = r1
            o22 r7 = (defpackage.o22) r7
            if (r7 == 0) goto L_0x016e
            int r1 = defpackage.vea.v
            eqe r9 = new eqe
            r9.<init>(r1)
            int r1 = defpackage.wfa.V
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            r8 = 0
            r11 = 0
            r12 = 7
            o22 r6 = defpackage.o22.a(r7, r8, r9, r10, r11, r12)
        L_0x016e:
            r0.setValue(r6)
        L_0x0171:
            return r3
        L_0x0172:
            java.lang.Object r0 = r15.getValue()
            r8 = r0
            o22 r8 = (defpackage.o22) r8
            if (r8 == 0) goto L_0x018a
            int r0 = defpackage.vea.b2
            eqe r10 = new eqe
            r10.<init>(r0)
            r11 = 0
            r12 = 1
            r13 = 3
            r9 = r2
            o22 r6 = defpackage.o22.a(r8, r9, r10, r11, r12, r13)
        L_0x018a:
            r15.setValue(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i72.o(java.lang.Object):java.lang.Object");
    }
}
