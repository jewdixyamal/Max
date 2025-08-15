package defpackage;

/* renamed from: wj2  reason: default package */
public final class wj2 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ ck2 c;

    public /* synthetic */ wj2(on5 on5, ck2 ck2, int i) {
        this.a = i;
        this.b = on5;
        this.c = ck2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x00bc;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r10 instanceof defpackage.zj2
            if (r0 == 0) goto L_0x0018
            r0 = r10
            zj2 r0 = (defpackage.zj2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            zj2 r0 = new zj2
            r0.<init>(r8, r10)
        L_0x001d:
            java.lang.Object r10 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            defpackage.od2.a0(r10)
            goto L_0x00b9
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            defpackage.od2.a0(r10)
            on5 r10 = r8.b
            l29 r9 = (defpackage.l29) r9
            ck2 r2 = r8.c
            boolean r2 = r2.X
            if (r2 == 0) goto L_0x0049
            java.util.List r2 = r9.a
            java.util.List r2 = defpackage.x53.v0(r2)
            goto L_0x004b
        L_0x0049:
            java.util.List r2 = r9.a
        L_0x004b:
            ck2 r4 = r8.c
            java.util.concurrent.atomic.AtomicReference r4 = r4.J0
            ak2 r5 = new ak2
            r5.<init>(r9)
            java.lang.Object r9 = r4.updateAndGet(r5)
            bj2 r9 = (defpackage.bj2) r9
            ck2 r8 = r8.c
            java.lang.String r8 = r8.w0
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x0063
            goto L_0x007d
        L_0x0063:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x007d
            us7 r5 = defpackage.us7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Media viewer. Map result from loader, loadingState:"
            r6.<init>(r7)
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            r6 = 0
            r4.d(r5, r8, r9, r6)
        L_0x007d:
            kl7 r8 = defpackage.j1e.l()
            int r9 = r2.size()
            r4 = 0
            r5 = r4
        L_0x0087:
            if (r4 >= r9) goto L_0x00a3
            java.lang.Object r6 = r2.get(r4)
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            java.util.List r6 = defpackage.tfg.B(r6)
            boolean r7 = r6.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x009e
            r8.addAll(r6)
            goto L_0x00a0
        L_0x009e:
            int r5 = r5 + 1
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0087
        L_0x00a3:
            kl7 r8 = defpackage.j1e.d(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            kpa r2 = new kpa
            r2.<init>(r8, r9)
            r0.X = r3
            java.lang.Object r8 = r10.a(r2, r0)
            if (r8 != r1) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            e5f r1 = defpackage.e5f.a
        L_0x00bb:
            return r1
        L_0x00bc:
            boolean r0 = r10 instanceof defpackage.vj2
            if (r0 == 0) goto L_0x00cf
            r0 = r10
            vj2 r0 = (defpackage.vj2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00cf
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00d4
        L_0x00cf:
            vj2 r0 = new vj2
            r0.<init>(r8, r10)
        L_0x00d4:
            java.lang.Object r10 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00eb
            if (r2 != r3) goto L_0x00e3
            defpackage.od2.a0(r10)
            goto L_0x0104
        L_0x00e3:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x00eb:
            defpackage.od2.a0(r10)
            r10 = r9
            zc8 r10 = (defpackage.zc8) r10
            ck2 r2 = r8.c
            boolean r10 = defpackage.ck2.u(r2, r10)
            if (r10 == 0) goto L_0x0104
            r0.X = r3
            on5 r8 = r8.b
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            e5f r1 = defpackage.e5f.a
        L_0x0106:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
