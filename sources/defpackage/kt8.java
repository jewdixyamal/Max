package defpackage;

/* renamed from: kt8  reason: default package */
public final class kt8 {
    public final String a = kt8.class.getName();
    public final je7 b;
    public final je7 c;

    public kt8(je7 je7, je7 je72) {
        this.b = je7;
        this.c = je72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.da3 r9, java.util.List r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.jt8
            if (r0 == 0) goto L_0x0013
            r0 = r11
            jt8 r0 = (defpackage.jt8) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            jt8 r0 = new jt8
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.util.List r10 = r0.Y
            da3 r9 = r0.X
            kt8 r8 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            defpackage.od2.a0(r11)
            je7 r11 = r8.b
            java.lang.Object r11 = r11.getValue()
            r79 r11 = (defpackage.r79) r11
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.t0 = r3
            java.lang.Object r11 = r11.b(r10, r0)
            if (r11 != r1) goto L_0x004f
            return r1
        L_0x004f:
            java.util.List r11 = (java.util.List) r11
            int r0 = r11.size()
            int r1 = r10.size()
            if (r0 == r1) goto L_0x0075
            int r10 = r10.size()
            int r0 = r11.size()
            java.lang.String r1 = "Requested to delete "
            java.lang.String r2 = " messages, but found only "
            java.lang.String r10 = defpackage.rh4.h(r1, r10, r0, r2)
            java.lang.String r0 = r8.a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r10)
            defpackage.hm9.p(r0, r10, r1)
        L_0x0075:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x007e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r11.next()
            r1 = r0
            cu8 r1 = (defpackage.cu8) r1
            long r1 = r1.t0
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            java.lang.Object r1 = r10.get(r3)
            if (r1 != 0) goto L_0x00a0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.put(r3, r1)
        L_0x00a0:
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
            goto L_0x007e
        L_0x00a6:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00ae:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0107
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r11.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            je7 r0 = r8.c
            java.lang.Object r0 = r0.getValue()
            r7 = r0
            s8g r7 = (defpackage.s8g) r7
            mg4 r6 = defpackage.mg4.REGULAR
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.z53.S(r11, r0)
            r3.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x00e4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r11.next()
            cu8 r0 = (defpackage.cu8) r0
            long r4 = r0.b
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            r3.add(r0)
            goto L_0x00e4
        L_0x00fb:
            k8d r11 = new k8d
            r5 = 1
            r0 = r11
            r4 = r9
            r0.<init>(r1, r3, r4, r5, r6)
            r7.a(r11)
            goto L_0x00ae
        L_0x0107:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt8.a(da3, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
