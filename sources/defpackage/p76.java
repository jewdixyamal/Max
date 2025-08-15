package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: p76  reason: default package */
public final class p76 extends hl7 {
    public final z96 X;

    public p76(z96 z96) {
        super((ema) y34.f);
        this.X = z96;
    }

    public final int l(int i) {
        v86 v86 = (v86) C(i);
        if (v86 != null) {
            return v86.a;
        }
        return 0;
    }

    public final void r(dec dec, int i) {
        sme sme;
        a96 a96 = (a96) dec;
        v86 v86 = (v86) C(i);
        if (v86 != null) {
            if ((a96 instanceof z86) && (v86 instanceof u86)) {
                z86 z86 = (z86) a96;
                u86 u86 = (u86) v86;
                zp7 zp7 = u86.c;
                int i2 = zp7.w0;
                int i3 = ((i2 == 3) || i2 == 4) ? 0 : 8;
                VideoInfoTextView videoInfoTextView = z86.I0;
                videoInfoTextView.setVisibility(i3);
                int i4 = zp7.w0;
                if (i4 == 3) {
                    videoInfoTextView.setText(videoInfoTextView.getContext().getString(jpc.m1));
                    videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    videoInfoTextView.setVisibility(0);
                } else if (i4 == 4) {
                    Context context = videoInfoTextView.getContext();
                    int i5 = gpc.u0;
                    if (videoInfoTextView.isInEditMode()) {
                        sme = ee4.e0;
                    } else {
                        Context context2 = videoInfoTextView.getContext();
                        khe khe = sme.a0;
                        sme = fm9.R(context2);
                    }
                    Drawable u = ngg.u(i5, sme.t, context);
                    videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(u, (Drawable) null, (Drawable) null, (Drawable) null);
                    if (u instanceof AnimationDrawable) {
                        videoInfoTextView.post(new cy8(u, 1));
                    }
                    String[] strArr = are.b;
                    videoInfoTextView.setText(tfg.c(u86.m));
                    videoInfoTextView.setVisibility(0);
                }
                Context context3 = z86.a.getContext();
                xv6 d = xv6.d(u86.l);
                d.i = false;
                d.o = Boolean.FALSE;
                d.d = u86.d;
                int i6 = u86.k;
                if (i6 != 0) {
                    d.l = new bwa(i6, 1);
                }
                Uri uri = u86.g;
                if (uri != null) {
                    d.l = new eoa(context3, uri);
                }
                wv6 a = d.a();
                int i7 = OneMeDraweeView.B0;
                z86.H0.o(a, (wv6) null);
                NumericCheckButton numericCheckButton = z86.G0;
                if (numericCheckButton != null) {
                    if (u86.i) {
                        numericCheckButton.setEnabled(true);
                        numericCheckButton.setNumber(u86.h);
                    } else {
                        numericCheckButton.setNumber(0);
                        numericCheckButton.setEnabled(false);
                    }
                    tu0.K(numericCheckButton, 300, new xx5(3, z86));
                }
            }
            tu0.K(a96.a, 300, new p23(this, i, v86, 2));
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return i == 5 ? new dec(from.inflate(gga.b, viewGroup, false)) : new z86(from.inflate(gga.c, viewGroup, false), this.X);
    }
}
