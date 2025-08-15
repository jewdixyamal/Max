package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xpd  reason: default package */
public final class xpd extends PopupWindow {
    public final List a;
    public final m56 b;

    public xpd(Context context, boolean z, ArrayList arrayList, wz7 wz7) {
        boolean z2;
        Context context2 = context;
        boolean z3 = z;
        this.a = arrayList;
        this.b = wz7;
        setHeight(-2);
        setWidth(tu0.G(((float) 250) * fk4.d().getDisplayMetrics().density));
        setElevation(fk4.d().getDisplayMetrics().density * 12.0f);
        boolean z4 = true;
        setOutsideTouchable(true);
        setFocusable(true);
        h6b h6b = new h6b(context2, z3);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((wpd) it.next()).d != null) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        for (wpd wpd : this.a) {
            g6b g6b = new g6b(context2, z3);
            jqe jqe = wpd.b;
            Integer num = wpd.d;
            g6b g6b2 = g6b;
            g6b.c(g6b, jqe, wpd.c, num != null ? z4 : false, z2);
            g6b2.b(num, wpd.e);
            tu0.K(g6b2, 300, new v7d(this, 6, wpd));
            h6b.addView(g6b2, -1, -2);
            z4 = true;
        }
        setContentView(h6b);
    }
}
