package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vs0  reason: default package */
public final class vs0 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vs0(long j, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vs0) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vs0 vs0 = new vs0(this.Z, continuation);
        vs0.Y = obj;
        return vs0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
        L_0x0013:
            r7 = r1
            goto L_0x002c
        L_0x0015:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001d:
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
            goto L_0x0042
        L_0x0025:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            on5 r7 = (defpackage.on5) r7
        L_0x002c:
            lx3 r1 = r6.b
            boolean r1 = defpackage.pag.r(r1)
            if (r1 == 0) goto L_0x004f
            r6.Y = r7
            r6.X = r3
            long r4 = r6.Z
            java.lang.Object r1 = defpackage.j47.y(r4, r6)
            if (r1 != r0) goto L_0x0041
            return r0
        L_0x0041:
            r1 = r7
        L_0x0042:
            os5 r7 = defpackage.os5.a
            r6.Y = r1
            r6.X = r2
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L_0x0013
            return r0
        L_0x004f:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs0.o(java.lang.Object):java.lang.Object");
    }
}
