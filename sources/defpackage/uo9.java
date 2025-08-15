package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uo9  reason: default package */
public final class uo9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vo9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo9(vo9 vo9, Continuation continuation) {
        super(2, continuation);
        this.Z = vo9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uo9) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uo9 uo9 = new uo9(this.Z, continuation);
        uo9.Y = obj;
        return uo9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: on5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.X
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x001c
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0018:
            defpackage.od2.a0(r7)
            goto L_0x007c
        L_0x001c:
            java.lang.Object r1 = r6.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0024 }
            goto L_0x0051
        L_0x0024:
            r7 = move-exception
            goto L_0x005a
        L_0x0026:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Y
            r1 = r7
            on5 r1 = (defpackage.on5) r1
            vo9 r7 = r6.Z
            e8b r5 = r7.a
            if (r5 != 0) goto L_0x0073
            je7 r7 = r7.b     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0024 }
            e5a r7 = (defpackage.e5a) r7     // Catch:{ all -> 0x0024 }
            r6.Y = r1     // Catch:{ all -> 0x0024 }
            r6.X = r4     // Catch:{ all -> 0x0024 }
            je7 r7 = r7.a     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0024 }
            ome r7 = (defpackage.ome) r7     // Catch:{ all -> 0x0024 }
            c8b r2 = defpackage.c8b.o     // Catch:{ all -> 0x0024 }
            java.lang.Object r7 = r7.e(r2, r6)     // Catch:{ all -> 0x0024 }
            if (r7 != r0) goto L_0x0051
            return r0
        L_0x0051:
            d8b r7 = (defpackage.d8b) r7     // Catch:{ all -> 0x0024 }
            java.util.List r7 = r7.c     // Catch:{ all -> 0x0024 }
            e8b r7 = defpackage.fp3.z(r7)     // Catch:{ all -> 0x0024 }
            goto L_0x0060
        L_0x005a:
            njc r2 = new njc
            r2.<init>(r7)
            r7 = r2
        L_0x0060:
            boolean r2 = r7 instanceof defpackage.njc
            r4 = 0
            if (r2 == 0) goto L_0x0066
            r7 = r4
        L_0x0066:
            e8b r7 = (defpackage.e8b) r7
            r6.Y = r4
            r6.X = r3
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L_0x007c
            return r0
        L_0x0073:
            r6.X = r2
            java.lang.Object r6 = r1.a(r5, r6)
            if (r6 != r0) goto L_0x007c
            return r0
        L_0x007c:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo9.o(java.lang.Object):java.lang.Object");
    }
}
