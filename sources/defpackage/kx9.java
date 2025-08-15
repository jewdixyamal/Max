package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kx9  reason: default package */
public final class kx9 extends ffe implements a66 {
    public List X;
    public int Y;
    public final /* synthetic */ vd5 Z;
    public final /* synthetic */ qx9 s0;
    public final /* synthetic */ je5 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kx9(vd5 vd5, qx9 qx9, je5 je5, Continuation continuation) {
        super(2, continuation);
        this.Z = vd5;
        this.s0 = qx9;
        this.t0 = je5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kx9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kx9(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r22v1, types: [tx9] */
    /* JADX WARNING: type inference failed for: r14v2, types: [sx9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r31) {
        /*
            r30 = this;
            r6 = r30
            tx3 r7 = defpackage.tx3.a
            int r0 = r6.Y
            r8 = 0
            vd5 r9 = r6.Z
            r10 = 4
            r11 = 3
            r1 = 2
            qx9 r12 = r6.s0
            r13 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r13) goto L_0x0035
            if (r0 == r1) goto L_0x002f
            if (r0 == r11) goto L_0x0026
            if (r0 != r10) goto L_0x001e
            defpackage.od2.a0(r31)
            goto L_0x00c6
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            java.util.List r0 = r6.X
            defpackage.od2.a0(r31)
            r1 = r31
            goto L_0x00b8
        L_0x002f:
            defpackage.od2.a0(r31)
            r0 = r31
            goto L_0x0061
        L_0x0035:
            defpackage.od2.a0(r31)
            goto L_0x004b
        L_0x0039:
            defpackage.od2.a0(r31)
            if (r9 == 0) goto L_0x004b
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r6.Y = r13
            java.lang.Object r0 = r12.h(r0, r6)
            if (r0 != r7) goto L_0x004b
            return r7
        L_0x004b:
            je5 r0 = r6.t0
            long r2 = r0.a
            r6.Y = r1
            qx9 r1 = r6.s0
            long r4 = r0.b
            r0 = r1
            r1 = r2
            r3 = r4
            r5 = r30
            java.lang.Object r0 = defpackage.qx9.b(r0, r1, r3, r5)
            if (r0 != r7) goto L_0x0061
            return r7
        L_0x0061:
            vx9 r0 = (defpackage.vx9) r0
            if (r0 == 0) goto L_0x009e
            ks4 r1 = r0.e
            if (r1 == 0) goto L_0x007d
            sx9 r2 = new sx9
            long r3 = r0.c
            long r14 = r0.a
            long r10 = r0.b
            r15 = r14
            r14 = r2
            r17 = r10
            r19 = r3
            r21 = r1
            r14.<init>(r15, r17, r19, r21)
            goto L_0x009f
        L_0x007d:
            tx9 r2 = new tx9
            java.lang.Boolean r1 = r0.d
            if (r1 == 0) goto L_0x008a
            boolean r1 = r1.booleanValue()
        L_0x0087:
            r27 = r1
            goto L_0x008c
        L_0x008a:
            r1 = 0
            goto L_0x0087
        L_0x008c:
            long r3 = r0.c
            long r10 = r0.a
            long r0 = r0.b
            r22 = r2
            r23 = r10
            r25 = r0
            r28 = r3
            r22.<init>(r23, r25, r27, r28)
            goto L_0x009f
        L_0x009e:
            r2 = r8
        L_0x009f:
            if (r2 == 0) goto L_0x00c6
            java.util.List r0 = java.util.Collections.singletonList(r2)
            if (r9 == 0) goto L_0x00ac
            java.util.List r1 = java.util.Collections.singletonList(r9)
            goto L_0x00ba
        L_0x00ac:
            r6.X = r0
            r1 = 3
            r6.Y = r1
            java.lang.Object r1 = defpackage.qx9.a(r12, r0, r6)
            if (r1 != r7) goto L_0x00b8
            return r7
        L_0x00b8:
            java.util.List r1 = (java.util.List) r1
        L_0x00ba:
            r6.X = r8
            r2 = 4
            r6.Y = r2
            java.lang.Object r0 = defpackage.qx9.c(r12, r0, r1, r13, r6)
            if (r0 != r7) goto L_0x00c6
            return r7
        L_0x00c6:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx9.o(java.lang.Object):java.lang.Object");
    }
}
