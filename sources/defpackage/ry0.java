package defpackage;

/* renamed from: ry0  reason: default package */
public final class ry0 extends ndc {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int o;

    public ry0(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                return;
            case 3:
                this.b = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                return;
            case 4:
                this.b = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                return;
            case 5:
                this.b = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                return;
            case 6:
                this.b = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 7) * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                return;
            case 7:
                this.b = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                this.o = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                return;
            default:
                float f = (float) 8;
                this.b = tu0.G(fk4.d().getDisplayMetrics().density * f);
                tu0.G(f * fk4.d().getDisplayMetrics().density);
                float f2 = (float) 16;
                this.c = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                this.o = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: mfd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, defpackage.zdc r9) {
        /*
            r5 = this;
            int r9 = r5.a
            switch(r9) {
                case 0: goto L_0x0320;
                case 1: goto L_0x02c5;
                case 2: goto L_0x029e;
                case 3: goto L_0x0213;
                case 4: goto L_0x0197;
                case 5: goto L_0x011b;
                case 6: goto L_0x00e6;
                case 7: goto L_0x006a;
                default: goto L_0x0005;
            }
        L_0x0005:
            hdc r9 = r8.getAdapter()
            if (r9 != 0) goto L_0x000c
            goto L_0x0069
        L_0x000c:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            if (r7 < 0) goto L_0x0069
            int r9 = r9.j()
            if (r7 >= r9) goto L_0x0069
            r9 = 81
            float r9 = (float) r9
            android.content.res.Resources r0 = defpackage.fk4.d()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r9 = r9 * r0
            int r9 = defpackage.tu0.G(r9)
            int r0 = r5.b
            int r9 = defpackage.j1e.f(r8, r9, r0)
            androidx.recyclerview.widget.GridLayoutManager r1 = defpackage.z7.q(r8)
            if (r1 == 0) goto L_0x0069
            kg6 r1 = r1.K
            if (r1 == 0) goto L_0x0069
            int r1 = r1.b(r7, r0)
            androidx.recyclerview.widget.GridLayoutManager r8 = defpackage.z7.q(r8)
            r2 = 1
            if (r8 == 0) goto L_0x004e
            kg6 r8 = r8.K
            if (r8 == 0) goto L_0x004e
            int r7 = r8.c(r7)
            goto L_0x004f
        L_0x004e:
            r7 = r2
        L_0x004f:
            if (r7 != r0) goto L_0x0056
            int r5 = r5.o
            r6.top = r5
            goto L_0x0069
        L_0x0056:
            int r5 = r5.c
            int r5 = r5 / 2
            r6.bottom = r5
            r6.top = r5
            int r5 = r1 * r9
            int r5 = r5 / r0
            r6.left = r5
            int r1 = r1 + r2
            int r1 = r1 * r9
            int r1 = r1 / r0
            int r9 = r9 - r1
            r6.right = r9
        L_0x0069:
            return
        L_0x006a:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            hdc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.hid
            r0 = 0
            if (r9 == 0) goto L_0x007d
            hid r8 = (defpackage.hid) r8
            goto L_0x007e
        L_0x007d:
            r8 = r0
        L_0x007e:
            if (r8 != 0) goto L_0x0082
            goto L_0x00e5
        L_0x0082:
            if (r7 < 0) goto L_0x00e5
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x00e5
            java.lang.Object r9 = r8.C(r7)
            ol7 r9 = (defpackage.ol7) r9
            boolean r1 = r9 instanceof defpackage.l1d
            if (r1 == 0) goto L_0x0097
            l1d r9 = (defpackage.l1d) r9
            goto L_0x0098
        L_0x0097:
            r9 = r0
        L_0x0098:
            int r1 = r7 + 1
            ol7 r8 = r8.G(r1)
            boolean r1 = r8 instanceof defpackage.l1d
            if (r1 == 0) goto L_0x00a5
            l1d r8 = (defpackage.l1d) r8
            goto L_0x00a6
        L_0x00a5:
            r8 = r0
        L_0x00a6:
            r1 = 0
            if (r7 != 0) goto L_0x00ab
            r7 = 1
            goto L_0x00ac
        L_0x00ab:
            r7 = r1
        L_0x00ac:
            int r2 = r5.o
            r6.left = r2
            r6.right = r2
            int r2 = r5.b
            if (r7 == 0) goto L_0x00b8
            r7 = r2
            goto L_0x00b9
        L_0x00b8:
            r7 = r1
        L_0x00b9:
            r6.top = r7
            if (r9 == 0) goto L_0x00c6
            int r7 = r9.u()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00c7
        L_0x00c6:
            r7 = r0
        L_0x00c7:
            if (r8 == 0) goto L_0x00d1
            int r8 = r8.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x00d1:
            boolean r7 = defpackage.tpa.f(r7, r0)
            if (r7 != 0) goto L_0x00d9
            r1 = r2
            goto L_0x00e3
        L_0x00d9:
            if (r9 == 0) goto L_0x00e3
            boolean r7 = r9.g()
            if (r7 != 0) goto L_0x00e3
            int r1 = r5.c
        L_0x00e3:
            r6.bottom = r1
        L_0x00e5:
            return
        L_0x00e6:
            dec r9 = r8.T(r7)
            if (r9 != 0) goto L_0x00ed
            goto L_0x011a
        L_0x00ed:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            hdc r8 = r8.getAdapter()
            int r9 = r9.Y
            if (r9 == 0) goto L_0x011a
            if (r8 == 0) goto L_0x011a
            if (r7 < 0) goto L_0x011a
            int r8 = r8.j()
            if (r7 >= r8) goto L_0x011a
            int r8 = r5.o
            r6.left = r8
            r6.right = r8
            int r8 = r5.b
            if (r7 != 0) goto L_0x0110
            r6.top = r8
            goto L_0x011a
        L_0x0110:
            int r7 = defpackage.gja.s
            if (r9 != r7) goto L_0x011a
            r6.top = r8
            int r5 = r5.c
            r6.bottom = r5
        L_0x011a:
            return
        L_0x011b:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            hdc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.chd
            r0 = 0
            if (r9 == 0) goto L_0x012e
            chd r8 = (defpackage.chd) r8
            goto L_0x012f
        L_0x012e:
            r8 = r0
        L_0x012f:
            if (r8 != 0) goto L_0x0133
            goto L_0x0196
        L_0x0133:
            if (r7 < 0) goto L_0x0196
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x0196
            java.lang.Object r9 = r8.C(r7)
            ol7 r9 = (defpackage.ol7) r9
            boolean r1 = r9 instanceof defpackage.z0d
            if (r1 == 0) goto L_0x0148
            z0d r9 = (defpackage.z0d) r9
            goto L_0x0149
        L_0x0148:
            r9 = r0
        L_0x0149:
            int r1 = r7 + 1
            ol7 r8 = r8.G(r1)
            boolean r1 = r8 instanceof defpackage.z0d
            if (r1 == 0) goto L_0x0156
            z0d r8 = (defpackage.z0d) r8
            goto L_0x0157
        L_0x0156:
            r8 = r0
        L_0x0157:
            r1 = 0
            if (r7 != 0) goto L_0x015c
            r7 = 1
            goto L_0x015d
        L_0x015c:
            r7 = r1
        L_0x015d:
            int r2 = r5.o
            r6.left = r2
            r6.right = r2
            int r2 = r5.b
            if (r7 == 0) goto L_0x0169
            r7 = r2
            goto L_0x016a
        L_0x0169:
            r7 = r1
        L_0x016a:
            r6.top = r7
            if (r9 == 0) goto L_0x0177
            int r7 = r9.u()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0178
        L_0x0177:
            r7 = r0
        L_0x0178:
            if (r8 == 0) goto L_0x0182
            int r8 = r8.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0182:
            boolean r7 = defpackage.tpa.f(r7, r0)
            if (r7 != 0) goto L_0x018a
            r1 = r2
            goto L_0x0194
        L_0x018a:
            if (r9 == 0) goto L_0x0194
            boolean r7 = r9.g()
            if (r7 != 0) goto L_0x0194
            int r1 = r5.c
        L_0x0194:
            r6.bottom = r1
        L_0x0196:
            return
        L_0x0197:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            hdc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.lgd
            r0 = 0
            if (r9 == 0) goto L_0x01aa
            lgd r8 = (defpackage.lgd) r8
            goto L_0x01ab
        L_0x01aa:
            r8 = r0
        L_0x01ab:
            if (r8 != 0) goto L_0x01af
            goto L_0x0212
        L_0x01af:
            if (r7 < 0) goto L_0x0212
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x0212
            java.lang.Object r9 = r8.C(r7)
            ol7 r9 = (defpackage.ol7) r9
            boolean r1 = r9 instanceof defpackage.d1d
            if (r1 == 0) goto L_0x01c4
            d1d r9 = (defpackage.d1d) r9
            goto L_0x01c5
        L_0x01c4:
            r9 = r0
        L_0x01c5:
            int r1 = r7 + 1
            ol7 r8 = r8.G(r1)
            boolean r1 = r8 instanceof defpackage.d1d
            if (r1 == 0) goto L_0x01d2
            d1d r8 = (defpackage.d1d) r8
            goto L_0x01d3
        L_0x01d2:
            r8 = r0
        L_0x01d3:
            r1 = 0
            if (r7 != 0) goto L_0x01d8
            r7 = 1
            goto L_0x01d9
        L_0x01d8:
            r7 = r1
        L_0x01d9:
            int r2 = r5.o
            r6.left = r2
            r6.right = r2
            int r2 = r5.b
            if (r7 == 0) goto L_0x01e5
            r7 = r2
            goto L_0x01e6
        L_0x01e5:
            r7 = r1
        L_0x01e6:
            r6.top = r7
            if (r9 == 0) goto L_0x01f3
            int r7 = r9.u()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x01f4
        L_0x01f3:
            r7 = r0
        L_0x01f4:
            if (r8 == 0) goto L_0x01fe
            int r8 = r8.u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x01fe:
            boolean r7 = defpackage.tpa.f(r7, r0)
            if (r7 != 0) goto L_0x0206
            r1 = r2
            goto L_0x0210
        L_0x0206:
            if (r9 == 0) goto L_0x0210
            boolean r7 = r9.g()
            if (r7 != 0) goto L_0x0210
            int r1 = r5.c
        L_0x0210:
            r6.bottom = r1
        L_0x0212:
            return
        L_0x0213:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            hdc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.nd3
            r0 = 0
            if (r9 == 0) goto L_0x0226
            nd3 r8 = (defpackage.nd3) r8
            goto L_0x0227
        L_0x0226:
            r8 = r0
        L_0x0227:
            if (r8 != 0) goto L_0x022b
            goto L_0x029d
        L_0x022b:
            android.util.Pair r8 = r8.D(r7)
            java.lang.Object r9 = r8.first
            boolean r9 = r9 instanceof defpackage.mfd
            if (r9 == 0) goto L_0x023a
            java.lang.Object r9 = r8.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L_0x023f
        L_0x023a:
            r9 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L_0x023f:
            java.lang.Object r8 = r8.first
            boolean r1 = r8 instanceof defpackage.mfd
            if (r1 == 0) goto L_0x024c
            boolean r1 = r8 instanceof defpackage.mfd
            if (r1 == 0) goto L_0x024c
            r0 = r8
            mfd r0 = (defpackage.mfd) r0
        L_0x024c:
            if (r0 != 0) goto L_0x024f
            goto L_0x029d
        L_0x024f:
            int r8 = r0.j()
            int r1 = r9.intValue()
            if (r1 < 0) goto L_0x029d
            if (r1 >= r8) goto L_0x029d
            int r8 = r9.intValue()
            java.lang.Object r8 = r0.C(r8)
            ol7 r8 = (defpackage.ol7) r8
            kfd r8 = (defpackage.kfd) r8
            int r1 = r9.intValue()
            r2 = 1
            int r1 = r1 + r2
            ol7 r0 = r0.G(r1)
            kfd r0 = (defpackage.kfd) r0
            int r9 = r9.intValue()
            r1 = 0
            if (r9 != 0) goto L_0x027d
            if (r7 != 0) goto L_0x027d
            goto L_0x027e
        L_0x027d:
            r2 = r1
        L_0x027e:
            int r7 = r5.o
            r6.left = r7
            r6.right = r7
            if (r2 == 0) goto L_0x0289
            int r7 = r5.b
            goto L_0x028a
        L_0x0289:
            r7 = r1
        L_0x028a:
            r6.top = r7
            if (r0 == 0) goto L_0x0299
            int r7 = r8.u()
            int r8 = r0.u()
            if (r7 != r8) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            int r1 = r5.c
        L_0x029b:
            r6.bottom = r1
        L_0x029d:
            return
        L_0x029e:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            hdc r8 = r8.getAdapter()
            if (r8 == 0) goto L_0x02c4
            if (r7 < 0) goto L_0x02c4
            int r8 = r8.j()
            if (r7 >= r8) goto L_0x02c4
            int r8 = r5.o
            r6.left = r8
            r6.right = r8
            if (r7 != 0) goto L_0x02c0
            int r5 = r5.b
            r6.top = r5
            goto L_0x02c4
        L_0x02c0:
            int r5 = r5.c
            r6.top = r5
        L_0x02c4:
            return
        L_0x02c5:
            hdc r9 = r8.getAdapter()
            if (r9 != 0) goto L_0x02cc
            goto L_0x031f
        L_0x02cc:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            if (r7 < 0) goto L_0x031f
            int r0 = r9.j()
            if (r7 >= r0) goto L_0x031f
            r0 = 32
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.tu0.G(r0)
            int r1 = r5.b
            int r0 = defpackage.j1e.f(r8, r0, r1)
            androidx.recyclerview.widget.GridLayoutManager r8 = defpackage.z7.q(r8)
            if (r8 == 0) goto L_0x031f
            kg6 r8 = r8.K
            if (r8 == 0) goto L_0x031f
            int r8 = r8.b(r7, r1)
            int r7 = r9.l(r7)
            int r9 = defpackage.jca.q
            if (r7 != r9) goto L_0x030b
            int r5 = r5.o
            r6.top = r5
            goto L_0x031f
        L_0x030b:
            int r5 = r5.c
            int r5 = r5 / 2
            r6.bottom = r5
            r6.top = r5
            int r5 = r8 * r0
            int r5 = r5 / r1
            r6.left = r5
            int r8 = r8 + 1
            int r8 = r8 * r0
            int r8 = r8 / r1
            int r0 = r0 - r8
            r6.right = r0
        L_0x031f:
            return
        L_0x0320:
            r8.getClass()
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            hdc r8 = r8.getAdapter()
            boolean r9 = r8 instanceof defpackage.ae1
            r0 = 0
            if (r9 == 0) goto L_0x0333
            ae1 r8 = (defpackage.ae1) r8
            goto L_0x0334
        L_0x0333:
            r8 = r0
        L_0x0334:
            if (r8 != 0) goto L_0x0338
            goto L_0x039b
        L_0x0338:
            if (r7 < 0) goto L_0x039b
            int r9 = r8.j()
            if (r7 >= r9) goto L_0x039b
            java.lang.Object r9 = r8.C(r7)
            ol7 r9 = (defpackage.ol7) r9
            boolean r1 = r9 instanceof defpackage.sy0
            if (r1 == 0) goto L_0x034d
            sy0 r9 = (defpackage.sy0) r9
            goto L_0x034e
        L_0x034d:
            r9 = r0
        L_0x034e:
            int r1 = r7 + 1
            ol7 r1 = r8.G(r1)
            boolean r2 = r1 instanceof defpackage.sy0
            if (r2 == 0) goto L_0x035b
            sy0 r1 = (defpackage.sy0) r1
            goto L_0x035c
        L_0x035b:
            r1 = r0
        L_0x035c:
            r2 = 1
            r3 = 0
            if (r7 != 0) goto L_0x0362
            r4 = r2
            goto L_0x0363
        L_0x0362:
            r4 = r3
        L_0x0363:
            int r8 = r8.j()
            int r8 = r8 - r2
            if (r7 != r8) goto L_0x036b
            goto L_0x036c
        L_0x036b:
            r2 = r3
        L_0x036c:
            int r7 = r5.c
            r6.left = r7
            r6.right = r7
            int r7 = r5.b
            if (r4 == 0) goto L_0x0378
            r8 = r3
            goto L_0x0379
        L_0x0378:
            r8 = r7
        L_0x0379:
            r6.top = r8
            if (r2 == 0) goto L_0x0380
            int r3 = r5.o
            goto L_0x0399
        L_0x0380:
            if (r9 == 0) goto L_0x0389
            int r5 = r9.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x038a
        L_0x0389:
            r5 = r0
        L_0x038a:
            if (r1 == 0) goto L_0x0392
            int r8 = r1.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
        L_0x0392:
            boolean r5 = defpackage.tpa.f(r5, r0)
            if (r5 != 0) goto L_0x0399
            r3 = r7
        L_0x0399:
            r6.bottom = r3
        L_0x039b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, zdc):void");
    }

    public ry0(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 8:
                this.b = i;
                this.c = i2;
                this.o = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
                return;
            default:
                this.b = i;
                this.c = i2;
                this.o = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
                return;
        }
    }
}
