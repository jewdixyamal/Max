package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* renamed from: bu3  reason: default package */
public final class bu3 extends FrameLayout implements kre {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bu3(ContextMenuPopupWindow contextMenuPopupWindow, LayoutInflater layoutInflater, Context context) {
        super(context);
        boolean z;
        ContextMenuPopupWindow contextMenuPopupWindow2 = contextMenuPopupWindow;
        this.a = contextMenuPopupWindow2;
        boolean z2 = true;
        setClickable(true);
        tu0.K(this, 300, new c5(24, (Object) contextMenuPopupWindow2));
        bc7[] bc7Arr = ContextMenuPopupWindow.u0;
        contextMenuPopupWindow.getClass();
        h6b h6b = new h6b(layoutInflater.getContext(), contextMenuPopupWindow.n0());
        h6b.setId(ContextMenuPopupWindow.v0);
        Bundle bundle = contextMenuPopupWindow.getArgs().getBundle("actions");
        List list = null;
        List f = bundle != null ? ay7.f(bundle) : null;
        List list2 = nz4.a;
        f = f == null ? list2 : f;
        if (!f.isEmpty()) {
            Iterator it = f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((tt3) it.next()).d != null) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        jqe jqe = (jqe) ((Parcelable) ay7.v(contextMenuPopupWindow.getArgs(), "header", jqe.class));
        int i = -1;
        int i2 = -2;
        if (jqe != null) {
            au3 au3 = new au3(jqe, contextMenuPopupWindow2, h6b.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f2 = (float) 12;
            layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
            layoutParams.setMarginEnd(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            h6b.addView(au3, layoutParams);
        }
        Bundle bundle2 = contextMenuPopupWindow.getArgs().getBundle("actions");
        list = bundle2 != null ? ay7.f(bundle2) : list;
        for (tt3 tt3 : list != null ? list : list2) {
            g6b g6b = new g6b(h6b.getContext(), contextMenuPopupWindow.n0());
            jqe jqe2 = tt3.b;
            Integer num = tt3.d;
            boolean z3 = num != null ? z2 : false;
            int i3 = i2;
            int i4 = i;
            g6b.c(g6b, jqe2, tt3.c, z3, z);
            g6b.b(num, tt3.e);
            tu0.K(g6b, 300, new tb((Object) contextMenuPopupWindow2, 23, (Object) tt3));
            h6b.addView(g6b, i4, i3);
            i2 = i3;
            i = i4;
            z2 = true;
        }
        addView(h6b, new FrameLayout.LayoutParams(tu0.G(((float) 250) * fk4.d().getDisplayMetrics().density), i2, 51));
        onThemeChanged(ContextMenuPopupWindow.m0(contextMenuPopupWindow));
    }

    public final void onThemeChanged(fka fka) {
        ContextMenuPopupWindow contextMenuPopupWindow = this.a;
        if (contextMenuPopupWindow.getArgs().getBoolean("dim")) {
            setBackgroundColor(ContextMenuPopupWindow.m0(contextMenuPopupWindow).b().e);
        }
    }
}
