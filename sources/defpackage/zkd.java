package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zkd  reason: default package */
public final class zkd implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ i50 c;
    public final /* synthetic */ fld o;

    public zkd(fld fld, View view, i50 i50) {
        this.o = fld;
        this.b = view;
        this.c = i50;
    }

    public final boolean onPreDraw() {
        ArrayList arrayList = new ArrayList();
        fld fld = this.o;
        Iterator it = fld.s0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            View view = this.b;
            if (hm9.x(view, str) == null) {
                return false;
            }
            arrayList.add(hm9.x(view, str));
        }
        if (this.a) {
            return false;
        }
        this.a = true;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            fld fld2 = fld;
            View view3 = view2;
            dld.a(view2, new z68(fld2, view3, this.b, this, this.c, 1));
        }
        return false;
    }
}
