package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: v6a  reason: default package */
public final /* synthetic */ class v6a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6a b;

    public /* synthetic */ v6a(w6a w6a, int i) {
        this.a = i;
        this.b = w6a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return c54.a(this.b.a);
            default:
                Context context = this.b.a;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
                return Integer.valueOf(f > 800.0f ? rh4.q((float) 100, fk4.d().getDisplayMetrics().density, s5c.G(context).getWidth()) : f > 360.0f ? tu0.G(((float) 291) * fk4.d().getDisplayMetrics().density) : tu0.G(((float) 248) * fk4.d().getDisplayMetrics().density));
        }
    }
}
