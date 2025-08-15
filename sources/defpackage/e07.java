package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;

/* renamed from: e07  reason: default package */
public final /* synthetic */ class e07 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ g07 c;

    public /* synthetic */ e07(Context context, g07 g07, int i) {
        this.a = i;
        this.b = context;
        this.c = g07;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                w3b w3b = new w3b(this.b);
                w3b.setListener(this.c);
                return w3b;
            default:
                ImageView imageView = new ImageView(this.b);
                int i = woc.b2;
                pq9 pq9 = qp4.u0;
                bs6 icon = pq9.p(imageView).c.getIcon();
                Drawable b2 = kt3.b(imageView.getContext(), i);
                ngg.G(b2, icon.f);
                imageView.setImageDrawable(b2);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9.p(imageView).c.d().a.a.h), (Drawable) null, (Drawable) null));
                int G = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                imageView.setPadding(G, G, G, G);
                tu0.K(imageView, 300, new f07(this.c, 1));
                return imageView;
        }
    }
}
