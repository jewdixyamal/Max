package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;

/* renamed from: kk3  reason: default package */
public final class kk3 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ lk3 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kk3(defpackage.lk3 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x0022;
                case 2: goto L_0x0019;
                case 3: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            jk3 r2 = defpackage.jk3.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0019:
            r0.o = r1
            r1 = 0
            r2 = 9
            r0.<init>((int) r2, (java.lang.Object) r1)
            return
        L_0x0022:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk3.<init>(lk3, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue) {
                    lk3 lk3 = this.o;
                    if (lk3.P0.a() || booleanValue) {
                        ((View) lk3.P0.getValue()).setVisibility(booleanValue ? 0 : 8);
                        lk3.x(lk3);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue2) {
                    je7 je7 = this.o.P0;
                    if (je7.a()) {
                        ((AppCompatCheckBox) je7.getValue()).setChecked(booleanValue2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                fka fka = (fka) obj2;
                if (!tpa.f((fka) obj, fka)) {
                    lk3 lk32 = this.o;
                    if (fka == null) {
                        fka = qp4.u0.j(lk32);
                    }
                    lk32.onThemeChanged(fka);
                    return;
                }
                return;
            default:
                if (((jk3) obj) != ((jk3) obj2)) {
                    this.o.T();
                    return;
                }
                return;
        }
    }
}
