package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: u4d  reason: default package */
public final class u4d extends hl7 {
    public final p58 X;
    public a66 Y = new ai0(26);

    public u4d(p58 p58) {
        super((ema) y34.h);
        this.X = p58;
    }

    public final void D(List list, List list2) {
        this.Y.invoke(list, list2);
    }

    public final void r(dec dec, int i) {
        t4d t4d = (t4d) dec;
        q4d q4d = (q4d) C(i);
        t4d.I0 = q4d;
        Uri uri = t4d.J0;
        Uri uri2 = q4d.o;
        boolean f = tpa.f(uri, uri2);
        Uri uri3 = q4d.s0;
        if (!f || !tpa.f(t4d.K0, uri3)) {
            t4d.J0 = uri2;
            t4d.K0 = uri3;
            xv6 d = xv6.d(uri2);
            d.i = true;
            OneMeDraweeView oneMeDraweeView = t4d.G0;
            if (uri3 != null) {
                d.l = new eoa(oneMeDraweeView.getContext(), uri3);
            }
            wv6 a = d.a();
            int i2 = OneMeDraweeView.B0;
            oneMeDraweeView.o(a, (wv6) null);
        }
        t4d.H0.setVisibility(q4d.a.w0 == 4 ? 0 : 8);
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = t4d.L0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Drawable b = kt3.b(context, s8a.g);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 10.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 8388613);
        float f2 = (float) 4;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        layoutParams.setMargins(G, G, G, G);
        appCompatImageView.setLayoutParams(layoutParams);
        int G2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(G2, G2, G2, G2);
        appCompatImageView.setImageDrawable(b);
        appCompatImageView.setBackground(gradientDrawable);
        Drawable b2 = kt3.b(context, s8a.l);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
        int G3 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        layoutParams2.setMargins(G3, G3, G3, G3);
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setImageDrawable(b2);
        FrameLayout frameLayout = new FrameLayout(context);
        float f3 = (float) 64;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        float f4 = (float) 2;
        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f4), layoutParams3.topMargin, tu0.G(f4 * fk4.d().getDisplayMetrics().density), layoutParams3.bottomMargin);
        frameLayout.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
        frameLayout.setBackground(gradientDrawable2);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(oneMeDraweeView);
        frameLayout.addView(appCompatImageView);
        frameLayout.addView(appCompatImageView2);
        v3c.y(new jf1(b, b2, gradientDrawable, (Continuation) null, 6), frameLayout);
        return new t4d(this.X, oneMeDraweeView, appCompatImageView, appCompatImageView2, frameLayout);
    }
}
