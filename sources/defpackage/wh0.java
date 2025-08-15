package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: wh0  reason: default package */
public abstract class wh0 extends li0 {
    public final void f(g0 g0Var) {
        if (g0Var.h()) {
            o43 o43 = (o43) g0Var.e();
            try {
                g((o43 == null || !(o43.e0() instanceof CloseableStaticBitmap)) ? null : ((CloseableStaticBitmap) o43.e0()).getUnderlyingBitmap());
            } finally {
                o43.S(o43);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
