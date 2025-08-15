package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b44  reason: default package */
public final class b44 extends hl7 {
    public final long k(int i) {
        return ((x34) C(i)).a;
    }

    public final void r(dec dec, int i) {
        ((a44) dec).F0.setText(((x34) C(i)).X);
    }

    public final dec t(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(pyb.day_item, viewGroup, false);
        inflate.setPivotX(0.0f);
        return new a44(inflate);
    }
}
