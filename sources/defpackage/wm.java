package defpackage;

import android.window.OnBackInvokedCallback;

/* renamed from: wm  reason: default package */
public final /* synthetic */ class wm implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((dn) obj).B();
                return;
            case 1:
                ((w08) obj).a();
                return;
            case 2:
                ((k56) obj).invoke();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
