package defpackage;

import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: b7c  reason: default package */
public final /* synthetic */ class b7c implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactionsViewModel b;

    public /* synthetic */ b7c(ReactionsViewModel reactionsViewModel, int i) {
        this.a = i;
        this.b = reactionsViewModel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: nz4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.a
            switch(r0) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x00e2;
                case 2: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            boolean r14 = r14.k()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L_0x0010:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            je7 r0 = r14.m
            java.lang.Object r0 = r0.getValue()
            gj r0 = (defpackage.gj) r0
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.o
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0056
            java.util.concurrent.ConcurrentHashMap r0 = r0.n
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x002b
            goto L_0x0056
        L_0x002b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0034:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r1.next()
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r3 = r0.get(r3)
            ti9 r3 = (defpackage.ti9) r3
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r3.getValue()
            ph r3 = (defpackage.ph) r3
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0034
            r2.add(r3)
            goto L_0x0034
        L_0x0056:
            nz4 r2 = defpackage.nz4.a
        L_0x0058:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.z53.S(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x0067:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r2 = r1.next()
            ph r2 = (defpackage.ph) r2
            je7 r3 = r14.l
            java.lang.Object r3 = r3.getValue()
            jx8 r3 = (defpackage.jx8) r3
            long r4 = r2.a
            l6c r6 = r14.f
            int r6 = r6.a()
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.fk4.d()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r13 = defpackage.tu0.G(r6)
            je7 r6 = r3.c
            java.lang.Object r6 = r6.getValue()
            gj r6 = (defpackage.gj) r6
            ti9 r4 = r6.i(r4)
            java.lang.Object r4 = r4.getValue()
            ph r4 = (defpackage.ph) r4
            je7 r5 = r3.b
            java.lang.String r12 = r2.b
            if (r4 == 0) goto L_0x00c1
            boolean r3 = r3.e
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r5.getValue()
            r7 = r3
            tx4 r7 = (defpackage.tx4) r7
            java.lang.String r10 = r4.c
            java.lang.String r11 = r4.e
            long r8 = r4.a
            java.lang.CharSequence r3 = r7.d(r8, r10, r11, r12, r13)
            goto L_0x00cb
        L_0x00c1:
            java.lang.Object r3 = r5.getValue()
            tx4 r3 = (defpackage.tx4) r3
            java.lang.CharSequence r3 = r3.b(r13, r12)
        L_0x00cb:
            v5c r7 = new v5c
            r7.<init>(r3)
            j6c r3 = new j6c
            android.graphics.drawable.Drawable r8 = ru.ok.onechat.reactions.ReactionsViewModel.g(r7)
            r9 = 0
            long r5 = r2.a
            r4 = r3
            r4.<init>(r5, r7, r8, r9)
            r0.add(r3)
            goto L_0x0067
        L_0x00e1:
            return r0
        L_0x00e2:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            khe r14 = r14.n
            java.lang.Object r14 = r14.getValue()
            t5c r14 = (defpackage.t5c) r14
            t5c r0 = defpackage.t5c.a
            if (r14 == r0) goto L_0x00f2
            r14 = 1
            goto L_0x00f3
        L_0x00f2:
            r14 = 0
        L_0x00f3:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L_0x00f8:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            y7d r14 = r14.d
            r14.getClass()
            t5c r14 = defpackage.t5c.c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7c.invoke():java.lang.Object");
    }
}
