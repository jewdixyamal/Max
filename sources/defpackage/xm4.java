package defpackage;

import android.content.Context;

/* renamed from: xm4  reason: default package */
public final /* synthetic */ class xm4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm4 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ xm4(zm4 zm4, Context context, int i) {
        this.a = i;
        this.b = zm4;
        this.c = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.f(this.c, true);
            default:
                return this.b.f(this.c, false);
        }
    }
}
