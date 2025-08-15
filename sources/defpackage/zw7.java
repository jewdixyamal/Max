package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zw7  reason: default package */
public final class zw7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ax7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw7(ax7 ax7, Continuation continuation) {
        super(2, continuation);
        this.Z = ax7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zw7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zw7 zw7 = new zw7(this.Z, continuation);
        zw7.Y = obj;
        return zw7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: sx3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            e5f r2 = defpackage.e5f.a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            defpackage.od2.a0(r7)
            goto L_0x0059
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r6.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r7)
            goto L_0x0037
        L_0x0022:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            r1 = r7
            sx3 r1 = (defpackage.sx3) r1
            r6.Y = r1
            r6.X = r4
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = defpackage.j47.x(r4, r6)
            if (r7 != r0) goto L_0x0037
            return r0
        L_0x0037:
            boolean r7 = defpackage.j1e.z(r1)
            if (r7 != 0) goto L_0x003e
            return r2
        L_0x003e:
            ax7 r7 = r6.Z
            kke r1 = r7.a
            w9a r1 = (defpackage.w9a) r1
            cx7 r1 = r1.c()
            yw7 r4 = new yw7
            r5 = 0
            r4.<init>(r7, r5)
            r6.Y = r5
            r6.X = r3
            java.lang.Object r6 = defpackage.j47.t0(r1, r4, r6)
            if (r6 != r0) goto L_0x0059
            return r0
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw7.o(java.lang.Object):java.lang.Object");
    }
}
