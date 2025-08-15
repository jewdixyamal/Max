package defpackage;

import android.view.View;

/* renamed from: gv8  reason: default package */
public final /* synthetic */ class gv8 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ gv8(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.valueOf(z));
                return;
            default:
                this.b.invoke(Boolean.valueOf(z));
                return;
        }
    }
}
