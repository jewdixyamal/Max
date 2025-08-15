package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: q11  reason: default package */
public final /* synthetic */ class q11 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r11 c;

    public /* synthetic */ q11(Context context, r11 r11, int i) {
        this.a = i;
        this.b = context;
        this.c = r11;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                p11 p11 = new p11(this.b, (AttributeSet) null);
                r11 r11 = this.c;
                p11.setLayoutParams(r11.getLayoutParams());
                r11.removeAllViews();
                r11.addView(p11);
                return p11;
            default:
                j11 j11 = new j11(this.b, (AttributeSet) null);
                r11 r112 = this.c;
                j11.setLayoutParams(r112.getLayoutParams());
                r112.removeAllViews();
                r112.addView(j11);
                return j11;
        }
    }
}
