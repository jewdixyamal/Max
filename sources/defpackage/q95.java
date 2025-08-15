package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q95  reason: default package */
public final class q95 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ t95 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q95(t95 t95, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = t95;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q95) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q95 q95 = new q95(this.s0, this.Z, continuation);
        q95.Y = obj;
        return q95;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: on5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            defpackage.od2.a0(r7)
            goto L_0x0059
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)
            goto L_0x004d
        L_0x0020:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            r1 = r7
            on5 r1 = (defpackage.on5) r1
            tq2 r7 = new tq2
            sla r4 = defpackage.sla.EXTERNAL_CALLBACK
            r5 = 13
            r7.<init>((defpackage.sla) r4, (int) r5)
            java.lang.String r4 = "url"
            java.lang.String r5 = r6.Z
            r7.p(r4, r5)
            t95 r4 = r6.s0
            je7 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            ome r4 = (defpackage.ome) r4
            r6.Y = r1
            r6.X = r3
            java.lang.Object r7 = r4.e(r7, r6)
            if (r7 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r3 = 0
            r6.Y = r3
            r6.X = r2
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L_0x0059
            return r0
        L_0x0059:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q95.o(java.lang.Object):java.lang.Object");
    }
}
