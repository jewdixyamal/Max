package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: bu6  reason: default package */
public final class bu6 extends OneMeDraweeView {
    public static final /* synthetic */ bc7[] J0;
    public static final ty4 K0 = new ty4();
    public final au6 C0 = new au6(this, 1);
    public final au6 D0 = new au6((Object) yt6.m, this);
    public k56 E0 = new fh5(16);
    public final au6 F0 = new au6(this, 0);
    public int G0;
    public int H0;
    public final je7 I0;

    static {
        Class<bu6> cls = bu6.class;
        J0 = new bc7[]{new oi9(cls, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;"), rh4.g(nec.a, cls, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new oi9(cls, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;")};
    }

    public bu6(Context context) {
        super(context);
        this.I0 = tu0.r(3, new hy4(context, 7));
        setId(mda.M);
        ya5 ya5 = ((la6) getHierarchy()).e;
        ya5.w0 = 0;
        if (ya5.v0 == 1) {
            ya5.v0 = 0;
        }
    }

    /* access modifiers changed from: private */
    public final void setup(yt6 yt6) {
        wv6 wv6;
        la6 la6 = (la6) getHierarchy();
        la6.h(yt6.j);
        boolean z = yt6.g;
        la6.k(z ? (Drawable) this.I0.getValue() : getOverlayDrawable());
        wv6 wv62 = null;
        jic jic = yt6.i;
        if (z) {
            wv6 = null;
        } else {
            xv6 d = xv6.d(yt6.b);
            d.d = jic;
            wv6 = d.a();
        }
        Uri uri = yt6.h;
        if (uri != null) {
            xv6 d2 = xv6.d(uri);
            d2.d = jic;
            wv62 = d2.a();
        }
        o(wv6, wv62);
    }

    public final yt6 getImageAttach() {
        bc7 bc7 = J0[1];
        return (yt6) this.D0.b;
    }

    public final ru6 getImageInfo() {
        bc7 bc7 = J0[2];
        return (ru6) this.F0.b;
    }

    public final int getMeasuredLayoutHeight() {
        return this.G0;
    }

    public final int getMeasuredLayoutWidth() {
        return this.H0;
    }

    public final k56 getOnFinalImageSetCallback() {
        return this.E0;
    }

    public final Drawable getOverlayDrawable() {
        bc7 bc7 = J0[0];
        return (Drawable) this.C0.b;
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        int i3 = getImageAttach().c;
        int i4 = getImageAttach().d;
        if (i3 <= 0 || i4 <= 0) {
            i4 = size / 2;
            i3 = size;
        }
        int i5 = getImageAttach().f;
        int G = tu0.G(((float) 120) * fk4.d().getDisplayMetrics().density);
        int min = Math.min(size, size);
        int i6 = min / 2;
        float f = (float) i4;
        float f2 = (float) i3;
        int i7 = (int) ((f / f2) * ((float) min));
        ty4 ty4 = K0;
        if (min >= i6 && i7 >= G && i7 <= i5) {
            v3c.B(min, i7, i3, i4, ty4);
        } else if (i7 < G) {
            v3c.B(min, G, i3, i4, ty4);
        } else {
            int i8 = (int) ((f2 / f) * ((float) i5));
            if (i8 < i6 || i5 < G) {
                v3c.B(i6, i5, i3, i4, ty4);
            } else {
                v3c.B(i8, i5, i3, i4, ty4);
            }
        }
        this.G0 = ty4.c;
        this.H0 = ty4.b;
        setMeasuredDimension(ty4.d, ty4.e);
    }

    public final void p(ru6 ru6, Animatable animatable) {
        if (getImageAttach().e && animatable != null) {
            animatable.start();
        }
        setImageInfo(ru6);
        this.E0.invoke();
    }

    public final void setImageAttach(yt6 yt6) {
        this.D0.o1(this, J0[1], yt6);
    }

    public final void setImageInfo(ru6 ru6) {
        this.F0.o1(this, J0[2], ru6);
    }

    public final void setOnFinalImageSetCallback(k56 k56) {
        this.E0 = k56;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.C0.o1(this, J0[0], drawable);
    }
}
