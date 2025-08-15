package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cb2  reason: default package */
public final class cb2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ List t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cb2(zb2 zb2, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2;
        this.s0 = str;
        this.t0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cb2(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Y
            r2 = 1
            zb2 r3 = r8.Z
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0027
            if (r1 == r2) goto L_0x0023
            if (r1 == r5) goto L_0x001d
            if (r1 != r4) goto L_0x0015
            defpackage.od2.a0(r9)
            goto L_0x0066
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001d:
            zb2 r3 = r8.X
            defpackage.od2.a0(r9)
            goto L_0x0058
        L_0x0023:
            defpackage.od2.a0(r9)
            goto L_0x0047
        L_0x0027:
            defpackage.od2.a0(r9)
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r3.e()
            r8.Y = r2
            r9.getClass()
            k55 r1 = new k55
            java.util.List r6 = r8.t0
            java.lang.String r7 = r8.s0
            r1.<init>((defpackage.alc) r9, (java.util.List) r6, (java.lang.String) r7)
            ilc r9 = r9.a
            java.lang.Object r9 = defpackage.ote.j(r9, r1, r8)
            if (r9 != r0) goto L_0x0047
            return r0
        L_0x0047:
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r3.e()
            r8.X = r3
            r8.Y = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r0) goto L_0x0058
            return r0
        L_0x0058:
            java.util.List r9 = (java.util.List) r9
            r1 = 0
            r8.X = r1
            r8.Y = r4
            java.lang.Object r8 = defpackage.zb2.j(r3, r9, r2, r8)
            if (r8 != r0) goto L_0x0066
            return r0
        L_0x0066:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb2.o(java.lang.Object):java.lang.Object");
    }
}
