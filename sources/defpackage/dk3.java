package defpackage;

import android.content.Context;

/* renamed from: dk3  reason: default package */
public final /* synthetic */ class dk3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fk3 c;

    public /* synthetic */ dk3(Context context, fk3 fk3, int i) {
        this.a = i;
        this.b = context;
        this.c = fk3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return fk3.x(this.b, this.c);
            case 1:
                return fk3.y(this.b, this.c);
            default:
                return fk3.w(this.b, this.c);
        }
    }
}
