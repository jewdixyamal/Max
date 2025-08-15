package defpackage;

import android.content.Context;

/* renamed from: p3g  reason: default package */
public final /* synthetic */ class p3g implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r10 b;
    public final /* synthetic */ y7d c;

    public /* synthetic */ p3g(r10 r10, y7d y7d, int i) {
        this.a = i;
        this.b = r10;
        this.c = y7d;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                r10 r10 = this.b;
                return new h3g(r10.a, r10.b, (Context) r10.c, this.c);
            default:
                r10 r102 = this.b;
                y7d y7d = this.c;
                return new i3g(r102.a, r102.b, (Context) r102.c, y7d);
        }
    }
}
