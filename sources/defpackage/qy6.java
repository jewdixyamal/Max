package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qy6  reason: default package */
public final class qy6 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ fz6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qy6(fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.Z = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qy6 qy6 = new qy6(this.Z, continuation);
        qy6.Y = obj;
        return qy6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: sx3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.X
            r2 = 2
            r3 = 1
            r4 = 0
            fz6 r5 = r9.Z
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            defpackage.od2.a0(r10)
            goto L_0x0080
        L_0x0013:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001b:
            java.lang.Object r1 = r9.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r10)
            goto L_0x0043
        L_0x0023:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Y
            r1 = r10
            sx3 r1 = (defpackage.sx3) r1
            r9.Y = r1
            r9.X = r3
            kke r10 = r5.c
            w9a r10 = (defpackage.w9a) r10
            nx3 r10 = r10.b()
            iy6 r3 = new iy6
            r3.<init>(r5, r4)
            java.lang.Object r10 = defpackage.j47.t0(r10, r3, r9)
            if (r10 != r0) goto L_0x0043
            return r0
        L_0x0043:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.z53.S(r10, r6)
            r3.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x0054:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0075
            java.lang.Object r6 = r10.next()
            b86 r6 = (defpackage.b86) r6
            kke r7 = r5.c
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            py6 r8 = new py6
            r8.<init>(r5, r6, r4)
            zf4 r6 = defpackage.j47.h(r1, r7, r8, r2)
            r3.add(r6)
            goto L_0x0054
        L_0x0075:
            r9.Y = r4
            r9.X = r2
            java.lang.Object r10 = defpackage.pag.c(r3, r9)
            if (r10 != r0) goto L_0x0080
            return r0
        L_0x0080:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            l45 r9 = new l45
            r0 = 2
            r9.<init>(r0, r5)
            java.util.List r9 = defpackage.x53.x0(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy6.o(java.lang.Object):java.lang.Object");
    }
}
