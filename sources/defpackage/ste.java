package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: ste  reason: default package */
public final class ste extends hl7 {
    public ste() {
        super((ema) y34.g);
        A(true);
    }

    public final long k(int i) {
        return (long) ((qte) C(i)).a;
    }

    public final void r(dec dec, int i) {
        ((rte) dec).F0.setText(((qte) C(i)).b);
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new rte(LayoutInflater.from(viewGroup.getContext()).inflate(pyb.number_item, viewGroup, false));
    }
}
