package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: lx9  reason: default package */
public final class lx9 extends ffe implements a66 {
    public qx9 X;
    public List Y;
    public int Z;
    public final /* synthetic */ qx9 s0;
    public final /* synthetic */ List t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx9(qx9 qx9, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.s0 = qx9;
        this.t0 = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lx9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lx9(this.s0, (ArrayList) this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            java.util.List r3 = r0.t0
            qx9 r4 = r0.s0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 == r7) goto L_0x002d
            if (r2 == r6) goto L_0x0022
            if (r2 != r5) goto L_0x001a
            defpackage.od2.a0(r23)
            goto L_0x00bc
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            java.util.List r3 = r0.Y
            qx9 r4 = r0.X
            defpackage.od2.a0(r23)
            r2 = r23
            goto L_0x00ab
        L_0x002d:
            defpackage.od2.a0(r23)
            goto L_0x009e
        L_0x0032:
            defpackage.od2.a0(r23)
            java.util.ArrayList r2 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.z53.S(r3, r9)
            r2.<init>(r9)
            java.util.Iterator r9 = r3.iterator()
        L_0x0044:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0095
            java.lang.Object r10 = r9.next()
            ux9 r10 = (defpackage.ux9) r10
            vx9 r14 = new vx9
            boolean r11 = r10 instanceof defpackage.tx9
            if (r11 == 0) goto L_0x005a
            r11 = r10
            tx9 r11 = (defpackage.tx9) r11
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            if (r11 == 0) goto L_0x0066
            boolean r11 = r11.d
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r18 = r11
            goto L_0x0068
        L_0x0066:
            r18 = 0
        L_0x0068:
            boolean r11 = r10 instanceof defpackage.sx9
            if (r11 == 0) goto L_0x0070
            r11 = r10
            sx9 r11 = (defpackage.sx9) r11
            goto L_0x0071
        L_0x0070:
            r11 = 0
        L_0x0071:
            if (r11 == 0) goto L_0x0078
            ks4 r11 = r11.d
            r19 = r11
            goto L_0x007a
        L_0x0078:
            r19 = 0
        L_0x007a:
            long r12 = r10.b
            r23 = r9
            long r8 = r10.c
            long r10 = r10.a
            r15 = r10
            r11 = r14
            r20 = r12
            r12 = r15
            r10 = r14
            r14 = r20
            r16 = r8
            r11.<init>(r12, r14, r16, r18, r19)
            r2.add(r10)
            r9 = r23
            goto L_0x0044
        L_0x0095:
            r0.Z = r7
            java.lang.Object r2 = defpackage.qx9.d(r4, r2, r0)
            if (r2 != r1) goto L_0x009e
            return r1
        L_0x009e:
            r0.X = r4
            r0.Y = r3
            r0.Z = r6
            java.lang.Object r2 = defpackage.qx9.a(r4, r3, r0)
            if (r2 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            java.util.List r2 = (java.util.List) r2
            r6 = 0
            r0.X = r6
            r0.Y = r6
            r0.Z = r5
            r5 = 0
            java.lang.Object r0 = defpackage.qx9.c(r4, r3, r2, r5, r0)
            if (r0 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx9.o(java.lang.Object):java.lang.Object");
    }
}
