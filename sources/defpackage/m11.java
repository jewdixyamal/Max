package defpackage;

import android.widget.PopupWindow;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: m11  reason: default package */
public final /* synthetic */ class m11 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((k56) this.b).invoke();
                return;
            case 1:
                pq9 pq9 = qp4.u0;
                knc knc = ((in1) this.b).I0;
                knc.setIconTint(pq9.p(knc).c.getIcon().f);
                knc.setMode(fnc.a);
                return;
            case 2:
                ((mn1) this.b).J0 = null;
                return;
            case 3:
                k56 k56 = ((cu3) this.b).b;
                if (k56 != null) {
                    k56.invoke();
                    return;
                }
                return;
            default:
                ((ForwardPickerScreen) this.b).H0 = null;
                return;
        }
    }
}
