package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lx  reason: default package */
public final class lx extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ px Z;
    public final /* synthetic */ au s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx(px pxVar, au auVar, Continuation continuation) {
        super(2, continuation);
        this.Z = pxVar;
        this.s0 = auVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lx) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lx lxVar = new lx(this.Z, this.s0, continuation);
        lxVar.Y = obj;
        return lxVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: on5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r4.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            defpackage.od2.a0(r5)
            goto L_0x0045
        L_0x0010:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0018:
            java.lang.Object r1 = r4.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r5)
            goto L_0x0039
        L_0x0020:
            defpackage.od2.a0(r5)
            java.lang.Object r5 = r4.Y
            r1 = r5
            on5 r1 = (defpackage.on5) r1
            px r5 = r4.Z
            ome r5 = r5.c
            r4.Y = r1
            r4.X = r3
            au r3 = r4.s0
            java.lang.Object r5 = r5.e(r3, r4)
            if (r5 != r0) goto L_0x0039
            return r0
        L_0x0039:
            r3 = 0
            r4.Y = r3
            r4.X = r2
            java.lang.Object r4 = r1.a(r5, r4)
            if (r4 != r0) goto L_0x0045
            return r0
        L_0x0045:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx.o(java.lang.Object):java.lang.Object");
    }
}
