package defpackage;

import java.util.Comparator;
import java.util.List;

/* renamed from: l45  reason: default package */
public final class l45 implements Comparator {
    public static final pz2 c = new pz2(17);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l45(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r4 = r3.b(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x00ad;
                case 2: goto L_0x0079;
                case 3: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.util.Rational r4 = (android.util.Rational) r4
            android.util.Rational r5 = (android.util.Rational) r5
            float r4 = r4.floatValue()
            java.lang.Object r3 = r3.b
            android.util.Rational r3 = (android.util.Rational) r3
            float r0 = r3.floatValue()
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x001b
            float r0 = r0 / r4
            goto L_0x001d
        L_0x001b:
            float r0 = r4 / r0
        L_0x001d:
            float r4 = r5.floatValue()
            float r3 = r3.floatValue()
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x002b
            float r3 = r3 / r4
            goto L_0x002d
        L_0x002b:
            float r3 = r4 / r3
        L_0x002d:
            int r3 = java.lang.Float.compare(r3, r0)
            return r3
        L_0x0032:
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            boolean r0 = r4.C0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.C0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x0049
            goto L_0x0078
        L_0x0049:
            boolean r0 = r4.isPressed()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.isPressed()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x0060
            goto L_0x0078
        L_0x0060:
            java.lang.Object r3 = r3.b
            com.google.android.material.button.MaterialButtonToggleGroup r3 = (com.google.android.material.button.MaterialButtonToggleGroup) r3
            int r4 = r3.indexOfChild(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = r3.indexOfChild(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r4.compareTo(r3)
        L_0x0078:
            return r0
        L_0x0079:
            b86 r5 = (defpackage.b86) r5
            java.lang.Object r3 = r3.b
            fz6 r3 = (defpackage.fz6) r3
            java.util.concurrent.ConcurrentHashMap r0 = r3.B0
            a86 r5 = r5.a
            java.lang.Object r5 = r0.get(r5)
            zp7 r5 = (defpackage.zp7) r5
            r0 = 0
            if (r5 == 0) goto L_0x0093
            long r1 = r5.X
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            goto L_0x0094
        L_0x0093:
            r5 = r0
        L_0x0094:
            b86 r4 = (defpackage.b86) r4
            java.util.concurrent.ConcurrentHashMap r3 = r3.B0
            a86 r4 = r4.a
            java.lang.Object r3 = r3.get(r4)
            zp7 r3 = (defpackage.zp7) r3
            if (r3 == 0) goto L_0x00a8
            long r3 = r3.X
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L_0x00a8:
            int r3 = defpackage.xfg.f(r5, r0)
            return r3
        L_0x00ad:
            gg1 r4 = (defpackage.gg1) r4
            java.lang.Object r3 = r3.b
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r3.get(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            gg1 r5 = (defpackage.gg1) r5
            java.lang.Object r3 = r3.get(r5)
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = defpackage.xfg.f(r4, r3)
            return r3
        L_0x00c6:
            java.lang.Object r3 = r3.b
            ki9 r3 = (defpackage.ki9) r3
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == 0) goto L_0x00da
            int r4 = r3.b(r4)
            if (r4 < 0) goto L_0x00da
            int[] r1 = r3.c
            r4 = r1[r4]
            goto L_0x00db
        L_0x00da:
            r4 = r0
        L_0x00db:
            if (r5 == 0) goto L_0x00e7
            int r5 = r3.b(r5)
            if (r5 < 0) goto L_0x00e7
            int[] r3 = r3.c
            r0 = r3[r5]
        L_0x00e7:
            int r3 = defpackage.tpa.m(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l45.compare(java.lang.Object, java.lang.Object):int");
    }

    public l45(List list) {
        this.a = 0;
        f8.c(1, c);
        ki9 ki9 = new ki9(list.size());
        int i = 0;
        for (Object d : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ki9.d(i, d);
                i = i2;
            } else {
                y53.R();
                throw null;
            }
        }
        this.b = ki9;
    }
}
