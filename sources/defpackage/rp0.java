package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;

/* renamed from: rp0  reason: default package */
public final class rp0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public rp0(sp0 sp0, Context context, boolean z) {
        this.c = sp0;
        this.o = context;
        this.b = z;
    }

    private final void a(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                sp0 sp0 = (sp0) this.c;
                if (sp0.c == null) {
                    sp0.c = (this.b || Build.VERSION.SDK_INT < 31) ? new bme((Context) this.o) : new aea(1);
                }
                sp0.b(sp0.b);
                return;
            default:
                if (!this.b) {
                    gmf gmf = (gmf) this.o;
                    if (gmf.Y != null) {
                        this.b = true;
                        gmf gmf2 = (gmf) ((qje) this.c).b;
                        gmf2.b = true;
                        gmf2.b();
                        view.removeOnAttachStateChangeListener(this);
                        gmf.Y = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                sp0 sp0 = (sp0) this.c;
                sp0.b(false);
                sp0.f = false;
                Bitmap bitmap = sp0.g;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                sp0.g = null;
                sp0.h = null;
                op0 op0 = sp0.c;
                if (op0 != null) {
                    op0.b();
                }
                sp0.c = null;
                return;
            default:
                return;
        }
    }

    public rp0(gmf gmf, qje qje) {
        this.o = gmf;
        this.c = qje;
        this.b = false;
    }
}
