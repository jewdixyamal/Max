package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.views.widgets.SquareFrameLayout;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* renamed from: sg2  reason: default package */
public final class sg2 extends SquareFrameLayout implements kre {
    public final ColorDrawable a;
    public final OneMeDraweeView b;
    public final je7 c;

    public sg2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ColorDrawable colorDrawable = new ColorDrawable(qp4.u0.j(this).b().j);
        this.a = colorDrawable;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ma6 ma6 = new ma6(oneMeDraweeView.getResources());
        ma6.d = colorDrawable;
        oneMeDraweeView.setHierarchy(ma6.a());
        this.b = oneMeDraweeView;
        this.c = tu0.r(3, new x2((Object) context, 22, (Object) this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(oneMeDraweeView);
    }

    public final void onThemeChanged(fka fka) {
        this.a.setColor(fka.b().j);
    }

    public final void setItem(wm8 wm8) {
        wv6 wv6;
        sme sme;
        Uri uri;
        if (!wm8.u0 && (uri = wm8.o) != null) {
            xv6 d = xv6.d(uri);
            d.i = true;
            wv6 = d.a();
        } else {
            wv6 = null;
        }
        Uri uri2 = wm8.t0;
        wv6 a2 = uri2 != null ? xv6.d(uri2).a() : null;
        OneMeDraweeView oneMeDraweeView = this.b;
        oneMeDraweeView.setBackground((Drawable) null);
        oneMeDraweeView.o(wv6, a2);
        int s = au1.s(wm8.X);
        je7 je7 = this.c;
        if (s != 0) {
            if (s == 1) {
                VideoInfoTextView videoInfoTextView = (VideoInfoTextView) je7.getValue();
                Long l = wm8.Y;
                long longValue = l != null ? l.longValue() : 0;
                Context context = videoInfoTextView.getContext();
                int i = gpc.u0;
                if (videoInfoTextView.isInEditMode()) {
                    sme = ee4.e0;
                } else {
                    Context context2 = videoInfoTextView.getContext();
                    khe khe = sme.a0;
                    sme = fm9.R(context2);
                }
                pag.I(ngg.u(i, sme.t, context), (Drawable) null, (Drawable) null, (Drawable) null, videoInfoTextView);
                String[] strArr = are.b;
                videoInfoTextView.setText(tfg.c(longValue));
                videoInfoTextView.setVisibility(0);
                videoInfoTextView.setVisibility(0);
            } else if (s == 2) {
                VideoInfoTextView videoInfoTextView2 = (VideoInfoTextView) je7.getValue();
                videoInfoTextView2.setText(videoInfoTextView2.getContext().getString(jpc.m1));
                videoInfoTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                videoInfoTextView2.setVisibility(0);
                videoInfoTextView2.setVisibility(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (je7.a()) {
            ((VideoInfoTextView) je7.getValue()).setVisibility(8);
        }
    }
}
