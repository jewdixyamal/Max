package defpackage;

import android.graphics.Bitmap;

/* renamed from: qfc  reason: default package */
public final class qfc extends wh0 {
    public final /* synthetic */ l28 a;

    public qfc(j28 j28) {
        this.a = j28;
    }

    public final void e(g0 g0Var) {
        l28 l28 = this.a;
        if (!((j28) l28).h()) {
            ((j28) l28).onError(g0Var.c());
        }
    }

    public final void g(Bitmap bitmap) {
        l28 l28 = this.a;
        if (((j28) l28).h()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (bitmap == null) {
            ((j28) l28).b();
        } else {
            ((j28) l28).a(bitmap);
        }
    }
}
