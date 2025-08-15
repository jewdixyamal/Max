package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: z86  reason: default package */
public final class z86 extends a96 {
    public final z96 F0;
    public NumericCheckButton G0;
    public final OneMeDraweeView H0;
    public final VideoInfoTextView I0;

    public z86(View view, z96 z96) {
        super(view);
        sme sme;
        sme sme2;
        this.F0 = z96;
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) view.findViewById(fga.e);
        this.H0 = oneMeDraweeView;
        ViewStub viewStub = (ViewStub) view.findViewById(fga.c);
        this.I0 = (VideoInfoTextView) view.findViewById(fga.f);
        Drawable b = kt3.b(view.getContext(), gpc.D);
        if (view.isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context = view.getContext();
            khe khe = sme.a0;
            sme = fm9.R(context);
        }
        b.setTint(ote.b0(sme.w, 0.3f));
        la6 la6 = (la6) oneMeDraweeView.getHierarchy();
        if (la6 != null) {
            la6.i(b, 1);
        }
        if (view.isInEditMode()) {
            sme2 = ee4.e0;
        } else {
            Context context2 = view.getContext();
            khe khe2 = sme.a0;
            sme2 = fm9.R(context2);
        }
        oneMeDraweeView.setBackgroundColor(sme2.H);
        if (z96.b.c) {
            viewStub.setOnInflateListener(new y86(this));
            viewStub.inflate();
        }
    }
}
