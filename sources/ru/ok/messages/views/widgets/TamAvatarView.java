package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/widgets/TamAvatarView;", "Lsd0;", "", "Lwme;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class TamAvatarView extends sd0 implements wme {
    public sme y0;

    public TamAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!isInEditMode()) {
            setLayerType(2, (Paint) null);
            la6 a = new ma6(getContext().getResources()).a();
            getContext();
            sq4 sq4 = new sq4(a);
            this.a = sq4;
            sq4.e().setCallback(this);
            jyc D = np8.D(context);
            this.o = D.o();
            this.t0 = (pd0) D.getAccessor().c(pd0.class);
            this.u0 = ((p7b) D.q()).a;
            this.s0 = D.f();
            this.v0 = (u7b) D.getAccessor().c(u7b.class);
        }
        sme sme = (sme) sme.d0.a.getValue();
        this.y0 = sme == null ? ee4.e0 : sme;
        this.y0 = fm9.R(context);
    }

    public final void c(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(hpc.c);
            if (findDrawableByLayerId != null) {
                ngg.G(findDrawableByLayerId, this.y0.m);
            }
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(hpc.b);
            if (findDrawableByLayerId2 != null) {
                ngg.G(findDrawableByLayerId2, this.y0.k);
            }
        }
    }

    public final void z(sme sme) {
        this.y0 = sme;
        c(this.b);
    }
}
