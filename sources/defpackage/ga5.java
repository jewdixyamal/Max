package defpackage;

/* renamed from: ga5  reason: default package */
public final /* synthetic */ class ga5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga5(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r5 = r5.getAdapter();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L_0x007c;
                case 1: goto L_0x0063;
                case 2: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            j29 r0 = new j29
            int r1 = r9.b
            java.lang.Object r9 = r9.c
            je7 r9 = (defpackage.je7) r9
            r0.<init>(r1, r9)
            return r0
        L_0x0011:
            java.lang.Object r0 = r9.c
            one.me.messages.list.ui.recycler.MessagesLayoutManager r0 = (one.me.messages.list.ui.recycler.MessagesLayoutManager) r0
            int r9 = r9.b
            android.view.View r1 = r0.r(r9)
            if (r1 == 0) goto L_0x005d
            java.lang.String r2 = r0.F
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0024
            goto L_0x005a
        L_0x0024:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x005a
            us7 r4 = defpackage.us7.X
            androidx.recyclerview.widget.RecyclerView r5 = r0.I
            r6 = 0
            if (r5 == 0) goto L_0x0040
            hdc r5 = r5.getAdapter()
            if (r5 == 0) goto L_0x0040
            int r5 = r5.j()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0041
        L_0x0040:
            r5 = r6
        L_0x0041:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "LM scroll to inflated view after redraw by pos:"
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r8 = ", curSize:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r3.d(r4, r2, r5, r6)
        L_0x005a:
            r0.v1(r1, r9)
        L_0x005d:
            r9 = 0
            r0.H = r9
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L_0x0063:
            java.lang.Object r0 = r9.c
            oo7 r0 = (defpackage.oo7) r0
            android.content.Context r1 = r0.a
            int r9 = r9.b
            android.graphics.drawable.Drawable r9 = r1.getDrawable(r9)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            int r0 = r0.b
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r0, r2)
            r9.setColorFilter(r1)
            return r9
        L_0x007c:
            java.lang.Object r0 = r9.c
            ia5 r0 = (defpackage.ia5) r0
            android.view.View r0 = r0.a
            int r9 = r9.b
            android.view.View r9 = r0.findViewById(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga5.invoke():java.lang.Object");
    }

    public /* synthetic */ ga5(int i, je7 je7) {
        this.a = 3;
        this.b = i;
        this.c = je7;
    }
}
