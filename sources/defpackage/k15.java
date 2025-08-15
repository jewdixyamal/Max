package defpackage;

import android.text.Editable;

/* renamed from: k15  reason: default package */
public final class k15 extends wqe {
    public final /* synthetic */ m15 a;

    public k15(m15 m15) {
        this.a = m15;
    }

    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }
}
