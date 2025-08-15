package defpackage;

import java.util.List;

/* renamed from: dua  reason: default package */
public final class dua implements j0e {
    public final ti9 X;
    public final String[] a;
    public final je7 b = fua.a.b();
    public final je7 c;
    public final ti9 o;

    public dua(String[] strArr) {
        this.a = strArr;
        je7 r = tu0.r(3, new zj7(27, this));
        this.c = r;
        this.o = (ti9) r.getValue();
        this.X = (ti9) r.getValue();
    }

    public final List b() {
        return this.o.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.on5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cua
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cua r0 = (defpackage.cua) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            cua r0 = new cua
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002b:
            defpackage.od2.a0(r6)
            goto L_0x0043
        L_0x002f:
            defpackage.od2.a0(r6)
            je7 r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            ti9 r4 = (defpackage.ti9) r4
            r0.Y = r3
            java.lang.Object r4 = r4.d(r5, r0)
            if (r4 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dua.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getValue() {
        return (bua) this.X.getValue();
    }

    public final void h() {
        ((ti9) this.c.getValue()).setValue(((eua) this.b.getValue()).b(this.a) ? bua.a : bua.b);
    }

    public final boolean j() {
        return ((bua) this.X.getValue()) == bua.a;
    }
}
