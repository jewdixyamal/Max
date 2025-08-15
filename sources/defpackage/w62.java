package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w62  reason: default package */
public final class w62 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ k72 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w62(int i, k72 k72, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w62(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        if (r8 == r0) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.X
            e5f r2 = defpackage.e5f.a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 == r5) goto L_0x001a
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001a:
            defpackage.od2.a0(r9)
            goto L_0x010b
        L_0x001f:
            defpackage.od2.a0(r9)
            int r9 = defpackage.sea.z0
            k72 r1 = r8.Z
            int r6 = r8.Y
            if (r6 != r9) goto L_0x0035
            r8.X = r5
            bc7[] r9 = defpackage.k72.x
            java.lang.Object r8 = r1.n(r8)
            if (r8 != r0) goto L_0x010b
            return r0
        L_0x0035:
            int r9 = defpackage.sea.B0
            java.lang.String r7 = "/"
            if (r6 != r9) goto L_0x00b4
            r8.X = r4
            bc7[] r9 = defpackage.k72.x
            q0e r9 = r1.i
            java.lang.Object r3 = r9.getValue()
            o22 r3 = (defpackage.o22) r3
            if (r3 == 0) goto L_0x006c
            java.lang.String r3 = r3.c
            if (r3 != 0) goto L_0x004e
            goto L_0x006c
        L_0x004e:
            java.lang.Object r9 = r9.getValue()
            o22 r9 = (defpackage.o22) r9
            if (r9 == 0) goto L_0x0059
            n22 r9 = r9.b
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            if (r9 != 0) goto L_0x005e
            r9 = -1
            goto L_0x0066
        L_0x005e:
            int[] r6 = defpackage.s62.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r6[r9]
        L_0x0066:
            kld r6 = r1.f
            if (r9 == r5) goto L_0x0089
            if (r9 == r4) goto L_0x006e
        L_0x006c:
            r8 = r2
            goto L_0x00b1
        L_0x006e:
            rcb r9 = new rcb
            int r1 = defpackage.yoc.i
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            gqe r4 = new gqe
            java.util.List r3 = defpackage.ys.m0(r3)
            r4.<init>(r1, r3)
            r9.<init>(r4)
            java.lang.Object r8 = r6.a(r9, r8)
            if (r8 != r0) goto L_0x006c
            goto L_0x00b1
        L_0x0089:
            rcb r9 = new rcb
            int r4 = defpackage.yoc.i
            je7 r1 = r1.m
            java.lang.Object r1 = r1.getValue()
            fl7 r1 = (defpackage.fl7) r1
            java.lang.String r1 = r1.e
            java.lang.String r1 = defpackage.rh4.j(r1, r7, r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            gqe r3 = new gqe
            java.util.List r1 = defpackage.ys.m0(r1)
            r3.<init>(r4, r1)
            r9.<init>(r3)
            java.lang.Object r8 = r6.a(r9, r8)
            if (r8 != r0) goto L_0x006c
        L_0x00b1:
            if (r8 != r0) goto L_0x010b
            return r0
        L_0x00b4:
            int r9 = defpackage.sea.C0
            if (r6 != r9) goto L_0x010b
            r8.X = r3
            bc7[] r9 = defpackage.k72.x
            q0e r9 = r1.i
            java.lang.Object r9 = r9.getValue()
            o22 r9 = (defpackage.o22) r9
            if (r9 != 0) goto L_0x00c8
        L_0x00c6:
            r8 = r2
            goto L_0x0108
        L_0x00c8:
            java.lang.String r3 = r9.c
            if (r3 != 0) goto L_0x00cd
            goto L_0x00c6
        L_0x00cd:
            n22 r9 = r9.b
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x00de
            if (r9 != r5) goto L_0x00d8
            goto L_0x00ec
        L_0x00d8:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x00de:
            je7 r9 = r1.m
            java.lang.Object r9 = r9.getValue()
            fl7 r9 = (defpackage.fl7) r9
            java.lang.String r9 = r9.e
            java.lang.String r3 = defpackage.rh4.j(r9, r7, r3)
        L_0x00ec:
            kld r9 = r1.f
            pcb r1 = new pcb
            int r4 = defpackage.yoc.i
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            gqe r5 = new gqe
            java.util.List r3 = defpackage.ys.m0(r3)
            r5.<init>(r4, r3)
            r1.<init>(r5)
            java.lang.Object r8 = r9.a(r1, r8)
            if (r8 != r0) goto L_0x00c6
        L_0x0108:
            if (r8 != r0) goto L_0x010b
            return r0
        L_0x010b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w62.o(java.lang.Object):java.lang.Object");
    }
}
