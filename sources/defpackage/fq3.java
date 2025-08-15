package defpackage;

import android.view.ViewGroup;

/* renamed from: fq3  reason: default package */
public final class fq3 extends kgb {
    public final void A(ol7 ol7) {
        zm3 zm3 = (zm3) ol7;
        lk3 lk3 = (lk3) this.a;
        if (zm3.t0 && zm3.Z == rdb.CHANGE_ADMIN) {
            int G = tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density);
            int G2 = tu0.G(((float) 80) * fk4.d().getDisplayMetrics().density);
            lk3.b1.b = c32.Y;
            ViewGroup.LayoutParams layoutParams = lk3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = G2;
                lk3.setLayoutParams(layoutParams);
                lk3.g1 = G;
                lk3.J();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        lk3.O(zm3.a, zm3.Y, zm3.o);
        lk3.setName((CharSequence) zm3.b);
        lk3.setMessage(zm3.c.b(lk3.getContext()));
    }
}
