package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mb2  reason: default package */
public final class mb2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb2(zb2 zb2, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2;
        this.s0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mb2 mb2 = new mb2(this.Z, this.s0, continuation);
        mb2.Y = obj;
        return mb2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: zb2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 3
            tx3 r1 = defpackage.tx3.a
            int r2 = r8.X
            r3 = 1
            zb2 r4 = r8.Z
            r5 = 2
            if (r2 == 0) goto L_0x002a
            if (r2 == r3) goto L_0x0026
            if (r2 == r5) goto L_0x001d
            if (r2 != r0) goto L_0x0015
            defpackage.od2.a0(r9)
            goto L_0x006b
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001d:
            java.lang.Object r2 = r8.Y
            r4 = r2
            zb2 r4 = (defpackage.zb2) r4
            defpackage.od2.a0(r9)
            goto L_0x005d
        L_0x0026:
            defpackage.od2.a0(r9)     // Catch:{ all -> 0x004c }
            goto L_0x004c
        L_0x002a:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Y
            sx3 r9 = (defpackage.sx3) r9
            long r6 = r8.s0
            java.lang.String r9 = defpackage.zb2.K0     // Catch:{ all -> 0x004c }
            alc r9 = r4.e()     // Catch:{ all -> 0x004c }
            r8.X = r3     // Catch:{ all -> 0x004c }
            r9.getClass()     // Catch:{ all -> 0x004c }
            td5 r2 = new td5     // Catch:{ all -> 0x004c }
            r2.<init>(r9, r6, r0)     // Catch:{ all -> 0x004c }
            ilc r9 = r9.a     // Catch:{ all -> 0x004c }
            java.lang.Object r9 = defpackage.ote.j(r9, r2, r8)     // Catch:{ all -> 0x004c }
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r9 = defpackage.zb2.K0
            alc r9 = r4.e()
            r8.Y = r4
            r8.X = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.util.List r9 = (java.util.List) r9
            r2 = 0
            r8.Y = r2
            r8.X = r0
            java.lang.Object r8 = defpackage.zb2.j(r4, r9, r3, r8)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb2.o(java.lang.Object):java.lang.Object");
    }
}
