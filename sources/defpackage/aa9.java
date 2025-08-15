package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;

/* renamed from: aa9  reason: default package */
public final /* synthetic */ class aa9 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca9 b;

    public /* synthetic */ aa9(ca9 ca9, int i) {
        this.a = i;
        this.b = ca9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = x7a.a0;
                Context context = this.b.a;
                Drawable b2 = kt3.b(context, i);
                qp4.u0.o(context).c.getIcon();
                b2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                return b2;
            default:
                Paint paint = new Paint();
                paint.setColor(qp4.u0.o(this.b.a).c.getIcon().e);
                paint.setAntiAlias(true);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                return paint;
        }
    }
}
