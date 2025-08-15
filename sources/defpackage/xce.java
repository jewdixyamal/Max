package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xce  reason: default package */
public final class xce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ yce Y;
    public final /* synthetic */ CharSequence Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xce(yce yce, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = yce;
        this.Z = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xce(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0186 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            e5f r3 = defpackage.e5f.a
            r4 = 1
            java.lang.CharSequence r5 = r0.Z
            r6 = 3
            r7 = 2
            r8 = 0
            yce r9 = r0.Y
            if (r2 == 0) goto L_0x002f
            if (r2 == r4) goto L_0x002b
            if (r2 == r7) goto L_0x0025
            if (r2 != r6) goto L_0x001d
            defpackage.od2.a0(r19)
            goto L_0x0186
        L_0x001d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            defpackage.od2.a0(r19)
            r2 = r19
            goto L_0x0088
        L_0x002b:
            defpackage.od2.a0(r19)
            goto L_0x0049
        L_0x002f:
            defpackage.od2.a0(r19)
            ph4 r2 = r9.o
            java.util.List r2 = r2.p(r5)
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x004a
            kld r2 = r9.E0
            r0.X = r4
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r3
        L_0x004a:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0053:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x006c
            java.lang.Object r10 = r2.next()
            qu8 r10 = (defpackage.qu8) r10
            nu8 r10 = r10.a
            long r10 = r10.a
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            r4.add(r12)
            goto L_0x0053
        L_0x006c:
            moa r2 = r9.O0
            if (r2 == 0) goto L_0x008b
            r0.X = r7
            java.lang.Object r7 = r2.b
            kke r7 = (defpackage.kke) r7
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.a()
            ice r10 = new ice
            r10.<init>(r2, r4, r8)
            java.lang.Object r2 = defpackage.j47.t0(r7, r10, r0)
            if (r2 != r1) goto L_0x0088
            return r1
        L_0x0088:
            java.util.List r2 = (java.util.List) r2
            goto L_0x008c
        L_0x008b:
            r2 = r8
        L_0x008c:
            if (r2 != 0) goto L_0x0090
            nz4 r2 = defpackage.nz4.a
        L_0x0090:
            cjg r4 = r9.Q0
            if (r4 == 0) goto L_0x0099
            java.util.ArrayList r2 = r4.d(r2)
            goto L_0x009a
        L_0x0099:
            r2 = r8
        L_0x009a:
            tce r4 = new tce
            r7 = 1
            r4.<init>(r9, r7)
            ph4 r7 = r9.o
            r7.getClass()
            if (r5 == 0) goto L_0x0179
            boolean r10 = defpackage.w9e.C0(r5)
            if (r10 == 0) goto L_0x00af
            goto L_0x0179
        L_0x00af:
            java.lang.Object r10 = r7.b
            android.text.SpannableStringBuilder r10 = (android.text.SpannableStringBuilder) r10
            r10.clear()
            r10.clearSpans()
            r10.append(r5)
            if (r2 == 0) goto L_0x00ec
            r11 = 10
            int r11 = defpackage.z53.S(r2, r11)
            int r11 = defpackage.mz7.Z(r11)
            r12 = 16
            if (r11 >= r12) goto L_0x00cd
            r11 = r12
        L_0x00cd:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r11)
            java.util.Iterator r2 = r2.iterator()
        L_0x00d6:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x00ed
            java.lang.Object r11 = r2.next()
            rce r11 = (defpackage.rce) r11
            long r13 = r11.a
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.put(r13, r11)
            goto L_0x00d6
        L_0x00ec:
            r12 = r8
        L_0x00ed:
            if (r12 != 0) goto L_0x00f1
            oz4 r12 = defpackage.oz4.a
        L_0x00f1:
            java.util.List r2 = r7.p(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x00f9:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0177
            java.lang.Object r5 = r2.next()
            qu8 r5 = (defpackage.qu8) r5
            int r11 = r10.getSpanStart(r5)
            int r13 = r10.getSpanEnd(r5)
            r14 = -1
            if (r11 == r14) goto L_0x0170
            if (r13 == r14) goto L_0x0170
            java.lang.CharSequence r14 = r10.subSequence(r11, r13)
            r14.toString()
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            java.lang.Object[] r14 = r10.getSpans(r11, r13, r14)
            int r15 = r14.length
            r16 = 0
            r17 = r16
            r16 = r8
            r8 = r17
        L_0x0128:
            if (r8 >= r15) goto L_0x013f
            r6 = r14[r8]
            r19 = r2
            if (r16 != 0) goto L_0x0136
            boolean r2 = r6 instanceof defpackage.qu8
            if (r2 == 0) goto L_0x0136
            r16 = r6
        L_0x0136:
            r10.removeSpan(r6)
            int r8 = r8 + 1
            r2 = r19
            r6 = 3
            goto L_0x0128
        L_0x013f:
            r19 = r2
            nu8 r2 = r5.a
            long r5 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r2 = r12.get(r2)
            rce r2 = (defpackage.rce) r2
            if (r2 == 0) goto L_0x0172
            bk r5 = new bk
            r6 = 11
            r5.<init>(r6, r4)
            mce r6 = new mce
            java.lang.Object r8 = r7.a
            k56 r8 = (defpackage.k56) r8
            r6.<init>(r8, r2, r5)
            r2 = 17
            r10.setSpan(r6, r11, r13, r2)
            r5 = r16
            qu8 r5 = (defpackage.qu8) r5
            if (r5 == 0) goto L_0x0172
            r10.setSpan(r5, r11, r13, r2)
            goto L_0x0172
        L_0x0170:
            r19 = r2
        L_0x0172:
            r2 = r19
            r6 = 3
            r8 = 0
            goto L_0x00f9
        L_0x0177:
            r8 = r10
            goto L_0x017a
        L_0x0179:
            r8 = 0
        L_0x017a:
            kld r2 = r9.E0
            r4 = 3
            r0.X = r4
            java.lang.Object r0 = r2.a(r8, r0)
            if (r0 != r1) goto L_0x0186
            return r1
        L_0x0186:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xce.o(java.lang.Object):java.lang.Object");
    }
}
