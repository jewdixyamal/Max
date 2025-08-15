package defpackage;

/* renamed from: kq1  reason: default package */
public final class kq1 extends m32 {
    public final a66 Y;

    public kq1(a66 a66, lx3 lx3, int i, int i2) {
        super(a66, lx3, i, i2, 0);
        this.Y = a66;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(defpackage.iab r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jq1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jq1 r0 = (defpackage.jq1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            jq1 r0 = new jq1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            iab r5 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r6)
            r0.o = r5
            r0.Z = r3
            java.lang.Object r4 = super.j(r5, r0)
            if (r4 != r1) goto L_0x003f
            return r1
        L_0x003f:
            fab r5 = (defpackage.fab) r5
            e32 r4 = r5.a
            boolean r4 = r4.p()
            if (r4 == 0) goto L_0x004c
            e5f r4 = defpackage.e5f.a
            return r4
        L_0x004c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq1.j(iab, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final l32 k(lx3 lx3, int i, int i2) {
        return new kq1(this.Y, lx3, i, i2);
    }
}
