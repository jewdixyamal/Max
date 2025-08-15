package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: ez5  reason: default package */
public final /* synthetic */ class ez5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz5 b;

    public /* synthetic */ ez5(iz5 iz5, int i) {
        this.a = i;
        this.b = iz5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Drawable b2 = kt3.b(this.b.f, woc.L1);
                if (b2 != null) {
                    return b2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            default:
                Drawable b3 = kt3.b(this.b.f, woc.M1);
                if (b3 != null) {
                    return b3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
