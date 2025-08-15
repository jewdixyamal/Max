package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ofe  reason: default package */
public final class ofe extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cge Z;
    public final /* synthetic */ d7f s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ofe(cge cge, d7f d7f, Continuation continuation) {
        super(2, continuation);
        this.Z = cge;
        this.s0 = d7f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ofe) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ofe ofe = new ofe(this.Z, this.s0, continuation);
        ofe.Y = obj;
        return ofe;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: on5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.X
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            defpackage.od2.a0(r12)
            goto L_0x00d6
        L_0x0012:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001a:
            java.lang.Object r1 = r11.Y
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r12)
            goto L_0x00a7
        L_0x0023:
            defpackage.od2.a0(r12)
            java.lang.Object r12 = r11.Y
            r1 = r12
            on5 r1 = (defpackage.on5) r1
            cge r12 = r11.Z
            java.lang.String r12 = r12.b
            d7f r5 = r11.s0
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0036
            goto L_0x004f
        L_0x0036:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x004f
            us7 r7 = defpackage.us7.X
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Starting uploading data="
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6.d(r7, r12, r5, r2)
        L_0x004f:
            cge r12 = r11.Z
            d7f r5 = r11.s0
            r12.getClass()
            java.lang.String r6 = r5.a
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0066 }
            r7.<init>(r6)     // Catch:{ all -> 0x0066 }
            long r6 = r7.lastModified()     // Catch:{ all -> 0x0066 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0066 }
            goto L_0x006d
        L_0x0066:
            r6 = move-exception
            njc r7 = new njc
            r7.<init>(r6)
            r6 = r7
        L_0x006d:
            r7 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            boolean r10 = r6 instanceof defpackage.njc
            if (r10 == 0) goto L_0x0078
            r6 = r9
        L_0x0078:
            java.lang.Number r6 = (java.lang.Number) r6
            long r9 = r6.longValue()
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0098
            long r5 = r5.b
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            java.lang.String r11 = r12.b
            java.lang.String r12 = "File is changed during uploading, aborting!"
            defpackage.hm9.m(r11, r12, new java.lang.Object[0])
            one.me.sdk.transfer.domain.UploadException r11 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r12 = "Error to upload, file changed"
            r11.<init>(r12)
            throw r11
        L_0x0098:
            cge r12 = r11.Z
            d7f r5 = r11.s0
            r11.Y = r1
            r11.X = r4
            java.lang.Object r12 = defpackage.cge.a(r12, r5, r11)
            if (r12 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            v6f r12 = (defpackage.v6f) r12
            cge r4 = r11.Z
            java.lang.String r4 = r4.b
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x00b2
            goto L_0x00cb
        L_0x00b2:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x00cb
            us7 r6 = defpackage.us7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Retrieved upload from repository = "
            r7.<init>(r8)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r4, r7, r2)
        L_0x00cb:
            r11.Y = r2
            r11.X = r3
            java.lang.Object r11 = r1.a(r12, r11)
            if (r11 != r0) goto L_0x00d6
            return r0
        L_0x00d6:
            e5f r11 = defpackage.e5f.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofe.o(java.lang.Object):java.lang.Object");
    }
}
