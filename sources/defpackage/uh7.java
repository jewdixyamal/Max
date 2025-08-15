package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: uh7  reason: default package */
public final class uh7 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int i2;
        int size = this.k.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((dec) this.k.get(i4)).a;
            pdc pdc = (pdc) view3.getLayoutParams();
            if (view3 != view && !pdc.a.p() && (i2 = (pdc.a.i() - this.d) * this.e) >= 0 && i2 < i3) {
                view2 = view3;
                if (i2 == 0) {
                    break;
                }
                i3 = i2;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((pdc) view2.getLayoutParams()).a.i();
        }
    }

    public final View b(vdc vdc) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((dec) this.k.get(i2)).a;
                pdc pdc = (pdc) view.getLayoutParams();
                if (!pdc.a.p() && this.d == pdc.a.i()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = vdc.j(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }
}
