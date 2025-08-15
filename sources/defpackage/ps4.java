package defpackage;

import android.widget.AutoCompleteTextView;

/* renamed from: ps4  reason: default package */
public final /* synthetic */ class ps4 implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ qs4 a;

    public /* synthetic */ ps4(qs4 qs4) {
        this.a = qs4;
    }

    public final void onDismiss() {
        qs4 qs4 = this.a;
        qs4.m = true;
        qs4.o = System.currentTimeMillis();
        qs4.t(false);
    }
}
