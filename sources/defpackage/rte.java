package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: rte  reason: default package */
public final class rte extends dec implements wme {
    public final AppCompatTextView F0;

    public rte(View view) {
        super(view);
        sme sme;
        this.F0 = (AppCompatTextView) view;
        if (view.isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context = view.getContext();
            khe khe = sme.a0;
            sme = fm9.R(context);
        }
        z(sme);
    }

    public final void z(sme sme) {
        this.F0.setTextColor(sme.F);
    }
}
