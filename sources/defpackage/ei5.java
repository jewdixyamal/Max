package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: ei5  reason: default package */
public final /* synthetic */ class ei5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gi5 c;

    public /* synthetic */ ei5(Context context, gi5 gi5, int i) {
        this.a = i;
        this.b = context;
        this.c = gi5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ch5 ch5 = new ch5(this.b);
                this.c.addView(ch5);
                return ch5;
            case 1:
                ImageView imageView = new ImageView(this.b);
                float f = (float) 44;
                imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                gi5 gi5 = this.c;
                imageView.setBackground(gi5.L0);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setTranslationZ(Float.MAX_VALUE);
                gi5.addView(imageView);
                return imageView;
            case 2:
                bu6 bu6 = new bu6(this.b);
                this.c.addView(bu6);
                return bu6;
            default:
                mdf mdf = new mdf(this.b);
                mdf.setBackgroundEnabled(true);
                this.c.addView(mdf);
                return mdf;
        }
    }
}
