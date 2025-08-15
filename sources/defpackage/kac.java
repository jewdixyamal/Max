package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kac  reason: default package */
public final class kac extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ lac Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kac(lac lac, Continuation continuation) {
        super(2, continuation);
        this.Z = lac;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((kac) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kac kac = new kac(this.Z, continuation);
        kac.Y = obj;
        return kac;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: sx3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.X
            r2 = 50
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 == r5) goto L_0x0017
            if (r1 != r4) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0017:
            java.lang.Object r1 = r12.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r13)
            goto L_0x0032
        L_0x001f:
            defpackage.od2.a0(r13)
            java.lang.Object r13 = r12.Y
            r1 = r13
            sx3 r1 = (defpackage.sx3) r1
            r12.Y = r1
            r12.X = r5
            java.lang.Object r13 = defpackage.j47.x(r2, r12)
            if (r13 != r0) goto L_0x0032
            return r0
        L_0x0032:
            lx3 r13 = r1.getCoroutineContext()
            defpackage.pag.j(r13)
            lac r13 = r12.Z
            q0e r5 = r13.d
            long r6 = r13.b
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r13.c
            long r8 = r8 - r10
            long r8 = r8 + r6
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r8)
            r6 = 0
            r5.m(r6, r13)
            r12.Y = r1
            r12.X = r4
            java.lang.Object r13 = defpackage.j47.x(r2, r12)
            if (r13 != r0) goto L_0x0032
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kac.o(java.lang.Object):java.lang.Object");
    }
}
