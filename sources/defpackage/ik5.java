package defpackage;

/* renamed from: ik5  reason: default package */
public final class ik5 implements sff, pv1 {
    public long a;
    public Object b;
    public Object c;

    public ik5() {
        this.b = new bw4(this);
        this.c = new bw4(this);
    }

    public mv1 A() {
        pv1 pv1 = (pv1) this.b;
        return pv1 != null ? pv1.A() : mv1.a;
    }

    public nje c() {
        return (nje) this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.gk5
            if (r0 == 0) goto L_0x0013
            r0 = r9
            gk5 r0 = (defpackage.gk5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            gk5 r0 = new gk5
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.od2.a0(r9)
            goto L_0x0068
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.c
            java.lang.String r9 = (java.lang.String) r9
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x003b
            goto L_0x004f
        L_0x003b:
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x004f
            us7 r4 = defpackage.us7.X
            long r5 = r8.a
            java.lang.String r7 = "Fetch video. File fetcher, fileId "
            java.lang.String r5 = defpackage.ey8.h(r5, r7)
            r6 = 0
            r2.d(r4, r9, r5, r6)
        L_0x004f:
            java.lang.Object r9 = r8.b
            pk r9 = (defpackage.pk) r9
            tq2 r2 = new tq2
            long r4 = r8.a
            r8 = 14
            r6 = 0
            r2.<init>(r4, r8, r6)
            r0.Y = r3
            k4a r9 = (defpackage.k4a) r9
            java.lang.Object r9 = r9.J(r2, r0)
            if (r9 != r1) goto L_0x0068
            return r1
        L_0x0068:
            yg5 r9 = (defpackage.yg5) r9
            ef5 r8 = new ef5
            java.lang.String r9 = r9.c
            r0 = 3
            r8.<init>(r0, r9)
            gf5 r9 = new gf5
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik5.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long getTimestamp() {
        pv1 pv1 = (pv1) this.b;
        if (pv1 != null) {
            return pv1.getTimestamp();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public nv1 r() {
        pv1 pv1 = (pv1) this.b;
        return pv1 != null ? pv1.r() : nv1.a;
    }

    public int s() {
        pv1 pv1 = (pv1) this.b;
        if (pv1 != null) {
            return pv1.s();
        }
        return 1;
    }

    public lv1 v() {
        pv1 pv1 = (pv1) this.b;
        return pv1 != null ? pv1.v() : lv1.a;
    }

    public ik5(pv1 pv1, nje nje, long j) {
        this.b = pv1;
        this.c = nje;
        this.a = j;
    }
}
