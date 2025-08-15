package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;

/* renamed from: cz4  reason: default package */
public final class cz4 implements lx4 {
    public final Context a;
    public final khe b = new khe(new bz4(this, 0));
    public final iy4 c;
    public final adb d;
    public final khe e;
    public final khe f;

    public cz4(Context context, je7 je7) {
        this.a = context;
        this.c = new iy4(context);
        this.d = new adb(6);
        this.e = new khe(new yf3(this, 4, je7));
        this.f = new khe(new bz4(this, 1));
    }

    public final mn5 a() {
        return ((gy4) this.e.getValue()).e;
    }

    public final void b(Activity activity) {
        ((gy4) this.e.getValue()).b(activity);
    }

    public final mwd c(String str) {
        ty4 a2 = ((ux4) this.b.getValue()).a(str, 0, str.length());
        if (a2 == null) {
            return null;
        }
        iy4 iy4 = this.c;
        iy4.getClass();
        return new mwd(a2, tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density), new nw4((Object) this.d, (Object) iy4, (Object) (gy4) this.e.getValue(), 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List d(java.lang.CharSequence r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x00e1
            int r0 = r14.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00e1
        L_0x000a:
            khe r13 = r13.f
            java.lang.Object r13 = r13.getValue()
            dy4 r13 = (defpackage.dy4) r13
            int r0 = r14.length()
            r13.getClass()
            boolean r1 = r14 instanceof android.text.Spannable
            if (r1 == 0) goto L_0x0020
            android.text.Spannable r14 = (android.text.Spannable) r14
            goto L_0x0028
        L_0x0020:
            android.text.Spannable$Factory r1 = android.text.Spannable.Factory.getInstance()
            android.text.Spannable r14 = r1.newSpannable(r14)
        L_0x0028:
            y8 r1 = new y8
            r1.<init>((android.text.Spannable) r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ux4 r13 = r13.a
            r3 = 0
        L_0x0035:
            if (r3 >= r0) goto L_0x00e3
            int r4 = r1.E(r3)
            r5 = 0
            if (r4 >= 0) goto L_0x0040
            r4 = r5
            goto L_0x0046
        L_0x0040:
            java.lang.Object r6 = r1.a
            cvd[] r6 = (defpackage.cvd[]) r6
            r4 = r6[r4]
        L_0x0046:
            r6 = 1
            java.lang.String r7 = ", "
            java.lang.String r8 = "Can't subSequence by "
            java.lang.Class<dy4> r9 = defpackage.dy4.class
            if (r4 != 0) goto L_0x00a7
            int r4 = r1.E(r3)
            r10 = -1
            if (r4 < 0) goto L_0x0065
            java.lang.Object r11 = r1.a
            cvd[] r11 = (defpackage.cvd[]) r11
            int r12 = r11.length
            int r12 = r12 - r6
            if (r4 > r12) goto L_0x0065
            int r4 = r4 + 1
            r4 = r11[r4]
            int r4 = r4.a
            goto L_0x0066
        L_0x0065:
            r4 = r10
        L_0x0066:
            if (r4 != r10) goto L_0x0069
            r4 = r0
        L_0x0069:
            ty4 r4 = r13.a(r14, r3, r4)
            if (r4 == 0) goto L_0x00a4
            int r10 = r4.b()
            int r10 = r10 + r3
            java.lang.CharSequence r11 = r14.subSequence(r3, r10)     // Catch:{ Exception -> 0x0086 }
            j37 r12 = new j37     // Catch:{ Exception -> 0x0086 }
            r12.<init>(r3, r10, r6)     // Catch:{ Exception -> 0x0086 }
            kpa r6 = new kpa     // Catch:{ Exception -> 0x0086 }
            r6.<init>(r11, r12)     // Catch:{ Exception -> 0x0086 }
            r2.add(r6)     // Catch:{ Exception -> 0x0086 }
            goto L_0x009e
        L_0x0086:
            java.lang.String r6 = r9.getName()
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L_0x008f
            goto L_0x009e
        L_0x008f:
            boolean r11 = r9.c()
            if (r11 == 0) goto L_0x009e
            us7 r11 = defpackage.us7.s0
            java.lang.String r7 = defpackage.rh4.h(r8, r3, r10, r7)
            r9.d(r11, r6, r7, r5)
        L_0x009e:
            int r4 = r4.b()
            int r3 = r3 + r4
            goto L_0x0035
        L_0x00a4:
            int r3 = r3 + 1
            goto L_0x0035
        L_0x00a7:
            int r3 = r4.a     // Catch:{ Exception -> 0x00c1 }
            int r10 = r4.b     // Catch:{ Exception -> 0x00c1 }
            java.lang.CharSequence r3 = r14.subSequence(r3, r10)     // Catch:{ Exception -> 0x00c1 }
            j37 r10 = new j37     // Catch:{ Exception -> 0x00c1 }
            int r11 = r4.a     // Catch:{ Exception -> 0x00c1 }
            int r12 = r4.b     // Catch:{ Exception -> 0x00c1 }
            r10.<init>(r11, r12, r6)     // Catch:{ Exception -> 0x00c1 }
            kpa r6 = new kpa     // Catch:{ Exception -> 0x00c1 }
            r6.<init>(r3, r10)     // Catch:{ Exception -> 0x00c1 }
            r2.add(r6)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00dd
        L_0x00c1:
            java.lang.String r3 = r9.getName()
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x00ca
            goto L_0x00dd
        L_0x00ca:
            boolean r9 = r6.c()
            if (r9 == 0) goto L_0x00dd
            us7 r9 = defpackage.us7.s0
            int r10 = r4.a
            int r11 = r4.b
            java.lang.String r7 = defpackage.rh4.h(r8, r10, r11, r7)
            r6.d(r9, r3, r7, r5)
        L_0x00dd:
            int r3 = r4.b
            goto L_0x0035
        L_0x00e1:
            nz4 r2 = defpackage.nz4.a
        L_0x00e3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz4.d(java.lang.CharSequence):java.util.List");
    }

    public final Spannable e(int i, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        dy4 dy4 = (dy4) this.f.getValue();
        dy4.getClass();
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        y8 y8Var = new y8(newSpannable);
        int i2 = 0;
        while (i2 < length) {
            int E = y8Var.E(i2);
            cvd[] cvdArr = (cvd[]) y8Var.a;
            cvd cvd = E < 0 ? null : cvdArr[E];
            if (cvd == null) {
                int E2 = y8Var.E(i2);
                int i3 = (E2 < 0 || E2 > cvdArr.length + -1) ? -1 : cvdArr[E2 + 1].a;
                if (i3 == -1) {
                    i3 = length;
                }
                ty4 a2 = dy4.a.a(newSpannable, i2, i3);
                if (a2 != null) {
                    iy4 iy4 = dy4.c;
                    adb adb = dy4.b;
                    nw4 nw4 = new nw4((Object) adb, (Object) iy4, (Object) (gy4) dy4.d.getValue(), 0);
                    mw7 mw7 = (mw7) adb.c;
                    kvd kvd = (kvd) mw7.c(a2);
                    if (kvd == null) {
                        kvd = new kvd(0);
                        mw7.d(a2, kvd);
                    }
                    mwd mwd = (mwd) kvd.c(i);
                    if (mwd == null) {
                        mwd = new mwd(a2, i, nw4);
                        kvd.d(i, mwd);
                    }
                    newSpannable.setSpan(new ey4(mwd), i2, a2.b() + i2, 33);
                    i2 += a2.b();
                } else {
                    i2++;
                }
            } else {
                i2 = cvd.b;
            }
        }
        return newSpannable;
    }
}
