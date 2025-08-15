package defpackage;

import android.view.View;

/* renamed from: ub  reason: default package */
public final class ub extends hqd {
    /* renamed from: E */
    public final void A(ba baVar) {
        lk3 lk3 = (lk3) this.a;
        lk3.setId(Long.hashCode(baVar.Z));
        lk3.setName(baVar.b);
        jqe jqe = baVar.c;
        lk3.setMessage(jqe != null ? jqe.b(lk3.getContext()) : null);
        lk3.N();
        lk3.setOnClickListener((View.OnClickListener) null);
        lk3.setVerified(baVar.Y);
        lk3.O(baVar.a, baVar.X, baVar.o);
        lk3.setSelectionEnabled(false);
    }
}
