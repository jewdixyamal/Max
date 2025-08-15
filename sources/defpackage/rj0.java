package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: rj0  reason: default package */
public final class rj0 extends le {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ rj0(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                sj0 sj0 = (sj0) this.c;
                sj0.setIndeterminate(false);
                sj0.b(sj0.b);
                return;
            case 1:
                sj0 sj02 = (sj0) this.c;
                if (!sj02.t0) {
                    sj02.setVisibility(sj02.u0);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((l18) this.c).C0;
                if (colorStateList != null) {
                    aq4.h(drawable, colorStateList);
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                l18 l18 = (l18) this.c;
                ColorStateList colorStateList = l18.C0;
                if (colorStateList != null) {
                    aq4.g(drawable, colorStateList.getColorForState(l18.G0, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
