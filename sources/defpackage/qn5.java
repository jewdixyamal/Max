package defpackage;

/* renamed from: qn5  reason: default package */
public final class qn5 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qn5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.on5 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x007a;
                case 2: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r6.b
            java.lang.Object r6 = r7.a(r6, r8)
            tx3 r7 = defpackage.tx3.a
            if (r6 != r7) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            e5f r6 = defpackage.e5f.a
        L_0x0012:
            return r6
        L_0x0013:
            boolean r0 = r8 instanceof defpackage.qo5
            if (r0 == 0) goto L_0x0026
            r0 = r8
            qo5 r0 = (defpackage.qo5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0026
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x002b
        L_0x0026:
            qo5 r0 = new qo5
            r0.<init>(r6, r8)
        L_0x002b:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            int r6 = r0.u0
            int r7 = r0.t0
            on5 r2 = r0.s0
            qn5 r4 = r0.Z
            defpackage.od2.a0(r8)
            r8 = r2
            goto L_0x0073
        L_0x0043:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004b:
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r6.b
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            int r8 = r8.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x0058:
            if (r2 >= r6) goto L_0x0077
            java.lang.Object r4 = r7.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r4 = r4[r2]
            r0.Z = r7
            r0.s0 = r8
            r0.t0 = r2
            r0.u0 = r6
            r0.X = r3
            java.lang.Object r4 = r8.a(r4, r0)
            if (r4 != r1) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r4 = r7
            r7 = r2
        L_0x0073:
            int r2 = r7 + 1
            r7 = r4
            goto L_0x0058
        L_0x0077:
            e5f r1 = defpackage.e5f.a
        L_0x0079:
            return r1
        L_0x007a:
            boolean r0 = r8 instanceof defpackage.po5
            if (r0 == 0) goto L_0x008d
            r0 = r8
            po5 r0 = (defpackage.po5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x008d
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0092
        L_0x008d:
            po5 r0 = new po5
            r0.<init>(r6, r8)
        L_0x0092:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00ad
            if (r2 != r3) goto L_0x00a5
            java.util.Iterator r6 = r0.s0
            on5 r7 = r0.Z
            defpackage.od2.a0(r8)
            goto L_0x00b8
        L_0x00a5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x00ad:
            defpackage.od2.a0(r8)
            java.lang.Object r6 = r6.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00b8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00cf
            java.lang.Object r8 = r6.next()
            r0.Z = r7
            r0.s0 = r6
            r0.X = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L_0x00b8
            goto L_0x00d1
        L_0x00cf:
            e5f r1 = defpackage.e5f.a
        L_0x00d1:
            return r1
        L_0x00d2:
            rn5 r0 = new rn5
            java.lang.Object r6 = r6.b
            c66 r6 = (defpackage.c66) r6
            r1 = 0
            r0.<init>(r6, r7, r1)
            pn5 r6 = new pn5
            lx3 r7 = r8.getContext()
            r6.<init>(r7, r8)
            java.lang.Object r6 = defpackage.oag.C(r6, r6, r0)
            tx3 r7 = defpackage.tx3.a
            if (r6 != r7) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            e5f r6 = defpackage.e5f.a
        L_0x00f0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn5.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
