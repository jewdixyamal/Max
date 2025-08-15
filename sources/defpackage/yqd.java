package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: yqd  reason: default package */
public final /* synthetic */ class yqd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ yqd(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new up0(this.b);
            case 1:
                return new pm8(this.b);
            case 2:
                return new up0(this.b);
            case 3:
                mdf mdf = new mdf(this.b);
                mdf.setBackgroundEnabled(true);
                mdf.setDrawableEnabled(false);
                return mdf;
            case 4:
                return new up0(this.b);
            case 5:
                mdf mdf2 = new mdf(this.b);
                mdf2.setBackgroundEnabled(true);
                mdf2.setDrawableEnabled(false);
                return mdf2;
            case 6:
                TextView textView = new TextView(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginStart(tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                i4f.C.b(textView, du4.b);
                v3c.y(new v9(3, (Continuation) null, 25), textView);
                textView.setGravity(17);
                return textView;
            case 7:
                return new cu6(this.b);
            default:
                return Integer.valueOf(qp4.u0.b(this.b).i().a().k().d.b);
        }
    }
}
