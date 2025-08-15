package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ald  reason: default package */
public final class ald implements Runnable {
    public final /* synthetic */ List X;
    public final /* synthetic */ fld Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ List c;
    public final /* synthetic */ View o;

    public ald(fld fld, View view, View view2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.Y = fld;
        this.b = view;
        this.o = view2;
        this.c = arrayList;
        this.X = arrayList2;
        this.Z = arrayList3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r6v5, types: [qpd, us] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.Z
            java.util.List r1 = r13.X
            android.view.View r2 = r13.o
            java.util.List r3 = r13.c
            android.view.View r4 = r13.b
            fld r5 = r13.Y
            int r13 = r13.a
            switch(r13) {
                case 0: goto L_0x00cc;
                default: goto L_0x0011;
            }
        L_0x0011:
            us r13 = r5.Z
            boolean r6 = r13.isEmpty()
            r7 = 1
            r8 = 0
            r9 = 0
            if (r6 != 0) goto L_0x006e
            w1f r6 = r5.w0
            if (r6 == 0) goto L_0x006e
            if (r4 != 0) goto L_0x0023
            goto L_0x006e
        L_0x0023:
            us r6 = new us
            r6.<init>(r8)
            defpackage.hm9.y(r6, r4)
            java.util.ArrayList r4 = r5.t0
            java.util.Iterator r4 = r4.iterator()
        L_0x0031:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x004b
            java.lang.Object r10 = r4.next()
            eld r10 = (defpackage.eld) r10
            android.view.View r11 = r10.a
            java.util.WeakHashMap r12 = defpackage.zmf.a
            java.lang.String r11 = defpackage.omf.k(r11)
            android.view.View r10 = r10.a
            r6.put(r11, r10)
            goto L_0x0031
        L_0x004b:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Collection r10 = r13.values()
            r4.<init>(r10)
            r6.l(r4)
            int r4 = r13.c
            int r4 = r4 - r7
        L_0x005a:
            if (r4 < 0) goto L_0x0072
            java.lang.Object r10 = r13.i(r4)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = r6.containsKey(r10)
            if (r10 != 0) goto L_0x006b
            r13.g(r4)
        L_0x006b:
            int r4 = r4 + -1
            goto L_0x005a
        L_0x006e:
            r13.clear()
            r6 = r9
        L_0x0072:
            if (r6 == 0) goto L_0x007e
            java.util.Collection r13 = r6.values()
            r3.addAll(r13)
            r3.add(r2)
        L_0x007e:
            w1f r13 = r5.w0
            if (r13 == 0) goto L_0x00cb
            java.util.ArrayList r13 = r13.Y
            r13.clear()
            w1f r13 = r5.w0
            java.util.ArrayList r13 = r13.Y
            r13.addAll(r3)
            w1f r13 = r5.w0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            defpackage.hm9.a0(r13, r1, r3)
            w1f r13 = r5.v0
            if (r13 == 0) goto L_0x00ac
            us r13 = r5.Z
            int r1 = r13.c
            if (r1 <= 0) goto L_0x00ac
            if (r6 == 0) goto L_0x00ac
            java.lang.Object r13 = r13.i(r8)
            java.lang.Object r13 = r6.get(r13)
            r9 = r13
            android.view.View r9 = (android.view.View) r9
        L_0x00ac:
            if (r9 == 0) goto L_0x00cb
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 == 0) goto L_0x00cb
            r13 = 2
            int[] r13 = new int[r13]
            r9.getLocationOnScreen(r13)
            r1 = r13[r8]
            r2 = r13[r7]
            int r3 = r9.getWidth()
            int r3 = r3 + r1
            r13 = r13[r7]
            int r4 = r9.getHeight()
            int r4 = r4 + r13
            r0.set(r1, r2, r3, r4)
        L_0x00cb:
            return
        L_0x00cc:
            w1f r13 = r5.v0
            if (r13 == 0) goto L_0x00f3
            r13.E(r4)
            w1f r13 = r5.v0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r2 == 0) goto L_0x00e1
            defpackage.fld.n(r6, r2)
        L_0x00e1:
            r6.removeAll(r3)
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x00f0
            r6.add(r4)
            defpackage.hm9.b(r13, r6)
        L_0x00f0:
            r1.addAll(r6)
        L_0x00f3:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x010e
            w1f r13 = r5.u0
            if (r13 == 0) goto L_0x0108
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r4)
            w1f r1 = r5.u0
            defpackage.hm9.a0(r1, r0, r13)
        L_0x0108:
            r0.clear()
            r0.add(r4)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ald.run():void");
    }

    public ald(fld fld, View view, boolean z, ArrayList arrayList, View view2, ArrayList arrayList2, Rect rect) {
        this.Y = fld;
        this.b = view;
        this.c = arrayList;
        this.o = view2;
        this.X = arrayList2;
        this.Z = rect;
    }
}
