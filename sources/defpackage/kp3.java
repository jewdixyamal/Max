package defpackage;

import android.content.Context;

/* renamed from: kp3  reason: default package */
public final /* synthetic */ class kp3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ lp3 c;

    public /* synthetic */ kp3(Context context, lp3 lp3, int i) {
        this.a = i;
        this.b = context;
        this.c = lp3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return lp3.a(this.b, this.c);
            default:
                return lp3.b(this.b, this.c);
        }
    }
}
