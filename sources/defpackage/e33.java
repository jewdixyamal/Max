package defpackage;

import android.view.View;

/* renamed from: e33  reason: default package */
public final /* synthetic */ class e33 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e33(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                h33 h33 = (h33) this.b;
                h33.t(h33.u());
                return;
            case 1:
                qs4 qs4 = (qs4) this.b;
                qs4.l = z;
                qs4.q();
                if (!z) {
                    qs4.t(false);
                    qs4.m = false;
                    return;
                }
                return;
            default:
                if (!z) {
                    ((lea) this.b).s0 = false;
                    return;
                }
                return;
        }
    }
}
