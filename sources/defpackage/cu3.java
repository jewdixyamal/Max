package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* renamed from: cu3  reason: default package */
public class cu3 extends PopupWindow {
    public static final /* synthetic */ bc7[] g;
    public final zt3 a;
    public k56 b;
    public final boolean c;
    public boolean d;
    public final float e;
    public final yj f;

    static {
        oi9 oi9 = new oi9(cu3.class, "customTheme", "getCustomTheme()Lru/ok/tamtam/themes/TamTheme;");
        nec.a.getClass();
        g = new bc7[]{oi9};
    }

    public /* synthetic */ cu3(Context context) {
        this(context, -2);
    }

    public final void a(sme sme) {
        Integer valueOf = Integer.valueOf(sme.m);
        Context context = getContentView().getContext();
        float dimension = context.getResources().getDimension(ntb.bottom_sheet_corner_radius);
        setBackgroundDrawable(hm9.c0(valueOf, (Integer) null, (Integer) null, new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}));
    }

    public final void b() {
        if (this.d) {
            View rootView = getContentView().getRootView();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = this.e;
            nd7.z(getContentView().getContext()).updateViewLayout(rootView, layoutParams);
        }
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        b();
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        b();
    }

    public cu3(Context context, int i) {
        super(new zt3(context), i, -2);
        zt3 zt3 = (zt3) getContentView();
        this.a = zt3;
        this.c = true;
        this.d = true;
        this.e = 0.5f;
        this.f = new yj(7, this);
        setOnDismissListener(new m11(3, this));
        setFocusable(true);
        setElevation(fk4.d().getDisplayMetrics().density * 8.0f);
        sme customTheme = zt3.getCustomTheme();
        if (customTheme == null) {
            View contentView = getContentView();
            if (contentView.isInEditMode()) {
                customTheme = ee4.e0;
            } else {
                Context context2 = contentView.getContext();
                khe khe = sme.a0;
                customTheme = fm9.R(context2);
            }
        }
        a(customTheme);
    }
}
