package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: kd0  reason: default package */
public final class kd0 extends wh0 {
    public final /* synthetic */ uz9 a;
    public final /* synthetic */ ld0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ g0 d;

    public kd0(ez9 ez9, ld0 ld0, Context context, g0 g0Var) {
        this.a = ez9;
        this.b = ld0;
        this.c = context;
        this.d = g0Var;
    }

    public final void e(g0 g0Var) {
        Drawable c2 = this.b.c(this.c);
        uz9 uz9 = this.a;
        ((ez9) uz9).d(c2);
        ((ez9) uz9).b();
        g0Var.a();
    }

    public final void g(Bitmap bitmap) {
        g0 g0Var = this.d;
        Context context = this.c;
        uz9 uz9 = this.a;
        if (bitmap == null) {
            ((ez9) uz9).d(this.b.c(context));
            ((ez9) uz9).b();
            g0Var.a();
            return;
        }
        pnc pnc = new pnc(context.getResources(), Bitmap.createBitmap(bitmap));
        pnc.d.setAntiAlias(true);
        pnc.invalidateSelf();
        ((ez9) uz9).d(pnc);
        ((ez9) uz9).b();
        g0Var.a();
    }
}
