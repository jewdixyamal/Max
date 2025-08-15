package defpackage;

/* renamed from: mj7  reason: default package */
public final class mj7 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ mj7(on5 on5, String str, int i) {
        this.a = i;
        this.b = on5;
        this.c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0051;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r7 instanceof defpackage.sje
            if (r0 == 0) goto L_0x0018
            r0 = r7
            sje r0 = (defpackage.sje) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            sje r0 = new sje
            r0.<init>(r5, r7)
        L_0x001d:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            defpackage.od2.a0(r7)
            goto L_0x004e
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            defpackage.od2.a0(r7)
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            r2 = 0
            java.lang.String r4 = r5.c
            boolean r7 = defpackage.w9e.p0(r7, r4, r2)
            if (r7 == 0) goto L_0x004e
            r0.X = r3
            on5 r5 = r5.b
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            e5f r1 = defpackage.e5f.a
        L_0x0050:
            return r1
        L_0x0051:
            boolean r0 = r7 instanceof defpackage.mba
            if (r0 == 0) goto L_0x0064
            r0 = r7
            mba r0 = (defpackage.mba) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0064
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0069
        L_0x0064:
            mba r0 = new mba
            r0.<init>(r5, r7)
        L_0x0069:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0080
            if (r2 != r3) goto L_0x0078
            defpackage.od2.a0(r7)
            goto L_0x0097
        L_0x0078:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0080:
            defpackage.od2.a0(r7)
            hy3 r6 = (defpackage.hy3) r6
            kba r7 = new kba
            java.lang.String r2 = r5.c
            r7.<init>(r2, r6)
            r0.X = r3
            on5 r5 = r5.b
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            e5f r1 = defpackage.e5f.a
        L_0x0099:
            return r1
        L_0x009a:
            boolean r0 = r7 instanceof defpackage.lj7
            if (r0 == 0) goto L_0x00ad
            r0 = r7
            lj7 r0 = (defpackage.lj7) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00ad
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00b2
        L_0x00ad:
            lj7 r0 = new lj7
            r0.<init>(r5, r7)
        L_0x00b2:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00c9
            if (r2 != r3) goto L_0x00c1
            defpackage.od2.a0(r7)
            goto L_0x00f8
        L_0x00c1:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x00c9:
            defpackage.od2.a0(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00d2:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00ea
            java.lang.Object r7 = r6.next()
            r2 = r7
            at5 r2 = (defpackage.at5) r2
            java.lang.String r2 = r2.a
            java.lang.String r4 = r5.c
            boolean r2 = defpackage.tpa.f(r2, r4)
            if (r2 == 0) goto L_0x00d2
            goto L_0x00eb
        L_0x00ea:
            r7 = 0
        L_0x00eb:
            if (r7 == 0) goto L_0x00f8
            r0.X = r3
            on5 r5 = r5.b
            java.lang.Object r5 = r5.a(r7, r0)
            if (r5 != r1) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            e5f r1 = defpackage.e5f.a
        L_0x00fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj7.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
