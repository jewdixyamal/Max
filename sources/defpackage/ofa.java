package defpackage;

import android.content.res.ColorStateList;

/* renamed from: ofa  reason: default package */
public final class ofa extends mn implements kre {
    public final void b(boolean z, fka fka) {
        setButtonTintList(ColorStateList.valueOf(z ? fka.getIcon().k : fka.i().b.b));
    }

    public final void onThemeChanged(fka fka) {
        b(isChecked(), fka);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        b(z, qp4.u0.j(this));
    }
}
