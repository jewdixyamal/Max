package defpackage;

import android.view.View;

/* renamed from: tce  reason: default package */
public final /* synthetic */ class tce implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yce b;

    public /* synthetic */ tce(yce yce, int i) {
        this.a = i;
        this.b = yce;
    }

    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        rce rce = (rce) obj2;
        switch (this.a) {
            case 0:
                a66 a66 = this.b.R0;
                if (a66 != null) {
                    a66.invoke(view, rce);
                }
                return e5f.a;
            default:
                a66 a662 = this.b.R0;
                if (a662 != null) {
                    a662.invoke(view, rce);
                }
                return e5f.a;
        }
    }
}
