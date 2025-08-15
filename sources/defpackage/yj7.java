package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yj7  reason: default package */
public final class yj7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ej7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yj7(ej7 ej7, Continuation continuation) {
        super(2, continuation);
        this.Z = ej7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yj7) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yj7 yj7 = new yj7(this.Z, continuation);
        yj7.Y = obj;
        return yj7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: on5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            defpackage.od2.a0(r6)
            goto L_0x0043
        L_0x0010:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0018:
            java.lang.Object r1 = r5.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r6)
            goto L_0x0035
        L_0x0020:
            defpackage.od2.a0(r6)
            java.lang.Object r6 = r5.Y
            r1 = r6
            on5 r1 = (defpackage.on5) r1
            r5.Y = r1
            r5.X = r3
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r6 = defpackage.j47.x(r3, r5)
            if (r6 != r0) goto L_0x0035
            return r0
        L_0x0035:
            r6 = 0
            r5.Y = r6
            r5.X = r2
            ej7 r6 = r5.Z
            java.lang.Object r5 = r1.a(r6, r5)
            if (r5 != r0) goto L_0x0043
            return r0
        L_0x0043:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj7.o(java.lang.Object):java.lang.Object");
    }
}
