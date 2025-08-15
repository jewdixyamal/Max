package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: w38  reason: default package */
public final class w38 extends OneMeDraweeView {
    public static final /* synthetic */ bc7[] K0;
    public final v38 C0 = new v38(this, 0);
    public final je7 D0;
    public int E0;
    public final v38 F0;
    public final v38 G0;
    public k56 H0;
    public boolean I0;
    public boolean J0;

    static {
        Class<w38> cls = w38.class;
        K0 = new bc7[]{new oi9(cls, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;"), rh4.g(nec.a, cls, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new oi9(cls, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;")};
    }

    public w38(Context context) {
        super(context);
        this.D0 = tu0.r(3, new hy4(context, 12));
        this.F0 = new v38((Object) yt6.m, this);
        this.G0 = new v38(this, 2);
        this.H0 = new m57(24);
        ya5 ya5 = ((la6) getHierarchy()).e;
        ya5.w0 = 0;
        if (ya5.v0 == 1) {
            ya5.v0 = 0;
        }
    }

    private final y2b getDownloadDrawable() {
        return (y2b) this.D0.getValue();
    }

    private final ru6 getImageInfo() {
        bc7 bc7 = K0[0];
        return (ru6) this.C0.b;
    }

    private final void setImageInfo(ru6 ru6) {
        this.C0.o1(this, K0[0], ru6);
    }

    /* access modifiers changed from: private */
    public final void setup(yt6 yt6) {
        wv6 wv6;
        la6 la6 = (la6) getHierarchy();
        la6.h(yt6.j);
        boolean z = yt6.g;
        la6.k(z ? getDownloadDrawable() : getOverlayDrawable());
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

    public final int getBlurOffset() {
        return Math.abs(this.E0);
    }

    public final boolean getIgnoreCropCriteria() {
        return this.J0;
    }

    public final yt6 getImageAttach() {
        bc7 bc7 = K0[1];
        return (yt6) this.F0.b;
    }

    public final k56 getOnFinalImageSetCallback() {
        return this.H0;
    }

    public final Drawable getOverlayDrawable() {
        bc7 bc7 = K0[2];
        return (Drawable) this.G0.b;
    }

    public final boolean getUseMaxDimensionsOnMeasure() {
        return this.I0;
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
        float f = ((float) getImageAttach().c) / ((float) getImageAttach().d);
        this.E0 = 0;
        float f2 = 1.0f;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i3 == 0) {
            if (this.I0 || getImageAttach().c > 291) {
                setMeasuredDimension(size, size);
            } else if (getImageAttach().c > 140) {
                float f3 = (float) 256;
                setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
            } else {
                float f4 = (float) 140;
                setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
            }
        } else if (i3 < 0) {
            if (f < 0.42857143f) {
                int G = tu0.G(((float) 165) * fk4.d().getDisplayMetrics().density);
                float f5 = (float) 384;
                int G2 = (int) (((float) tu0.G(fk4.d().getDisplayMetrics().density * f5)) * f);
                if (this.J0 || ((float) (G - G2)) > ((float) G) * 0.25f) {
                    this.E0 = (G - G2) / 2;
                    setMeasuredDimension(G2, tu0.G(f5 * fk4.d().getDisplayMetrics().density));
                    return;
                }
                setMeasuredDimension(G, tu0.G(f5 * fk4.d().getDisplayMetrics().density));
            } else if (this.I0 || getImageAttach().c > 291) {
                float f6 = (float) 384;
                int G3 = (int) (((float) tu0.G(fk4.d().getDisplayMetrics().density * f6)) * f);
                if (G3 > size) {
                    f2 = ((float) size) / ((float) G3);
                }
                setMeasuredDimension((int) (((float) G3) * f2), (int) (f2 * ((float) tu0.G(f6 * fk4.d().getDisplayMetrics().density))));
            } else if (getImageAttach().c > 120) {
                float f7 = (float) 345;
                int G4 = (int) (((float) tu0.G(fk4.d().getDisplayMetrics().density * f7)) * f);
                if (G4 > size) {
                    f2 = ((float) size) / ((float) G4);
                }
                setMeasuredDimension((int) (((float) G4) * f2), (int) (f2 * ((float) tu0.G(f7 * fk4.d().getDisplayMetrics().density))));
            } else {
                float f8 = (float) 280;
                setMeasuredDimension((int) (((float) tu0.G(fk4.d().getDisplayMetrics().density * f8)) * f), tu0.G(f8 * fk4.d().getDisplayMetrics().density));
            }
        } else if (f <= 1.0f) {
            setMeasuredDimension(size, size2);
        } else if (f > 2.3333333f) {
            int G5 = tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density);
            int i4 = (int) (((float) size) / f);
            int i5 = G5 - i4;
            if (((float) i5) > ((float) G5) * 0.25f) {
                this.E0 = (i5 * -1) / 2;
                setMeasuredDimension(size, i4);
                return;
            }
            setMeasuredDimension(size, G5);
        } else if (this.I0 || getImageAttach().c > 291) {
            setMeasuredDimension(size, (int) (((float) size) / f));
        } else if (getImageAttach().c > 212) {
            float f9 = (float) 256;
            setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * f9), (int) (((float) tu0.G(f9 * fk4.d().getDisplayMetrics().density)) / f));
        } else {
            float f10 = (float) 212;
            setMeasuredDimension(tu0.G(fk4.d().getDisplayMetrics().density * f10), (int) (((float) tu0.G(f10 * fk4.d().getDisplayMetrics().density)) / f));
        }
    }

    public final void p(ru6 ru6, Animatable animatable) {
        if (getImageAttach().e && animatable != null) {
            animatable.start();
        }
        setImageInfo(ru6);
        this.H0.invoke();
    }

    public final boolean r() {
        return this.E0 < 0;
    }

    public final void setIgnoreCropCriteria(boolean z) {
        this.J0 = z;
    }

    public final void setImageAttach(yt6 yt6) {
        this.F0.o1(this, K0[1], yt6);
    }

    public final void setOnFinalImageSetCallback(k56 k56) {
        this.H0 = k56;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.G0.o1(this, K0[2], drawable);
    }

    public final void setUseMaxDimensionsOnMeasure(boolean z) {
        this.I0 = z;
    }
}
