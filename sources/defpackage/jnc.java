package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: jnc  reason: default package */
public final class jnc extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ knc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jnc(gnc gnc, knc knc) {
        super(9, (Object) gnc);
        this.c = 2;
        this.o = knc;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((fnc) obj) != ((fnc) obj2)) {
                    this.o.C();
                    return;
                }
                return;
            case 1:
                if (((enc) obj) != ((enc) obj2)) {
                    this.o.C();
                    return;
                }
                return;
            default:
                gnc gnc = (gnc) obj2;
                if (!tpa.f((gnc) obj, gnc)) {
                    ImageView x = this.o.getIconView();
                    ViewGroup.LayoutParams layoutParams = x.getLayoutParams();
                    if (layoutParams != null) {
                        ti3 ti3 = (ti3) layoutParams;
                        ti3.height = gnc.b;
                        ti3.width = gnc.a;
                        x.setLayoutParams(ti3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jnc(defpackage.knc r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            fnc r2 = defpackage.fnc.s0
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            enc r2 = defpackage.enc.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnc.<init>(knc, int):void");
    }
}
