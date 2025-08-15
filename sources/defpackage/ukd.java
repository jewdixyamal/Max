package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ukd  reason: default package */
public final /* synthetic */ class ukd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xkd c;

    public /* synthetic */ ukd(Context context, xkd xkd, int i) {
        this.a = i;
        this.b = context;
        this.c = xkd;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                bu6 bu6 = new bu6(this.b);
                this.c.addView(bu6, new ViewGroup.LayoutParams(-2, -2));
                return bu6;
            case 1:
                return xkd.a(this.b, this.c);
            case 2:
                return xkd.h(this.b, this.c);
            default:
                return xkd.d(this.b, this.c);
        }
    }
}
