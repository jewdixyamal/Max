package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.a;

/* renamed from: y19  reason: default package */
public final class y19 extends yh7 {
    public final boolean p;
    public final k56 q;

    public y19(Context context, int i, boolean z, zj7 zj7) {
        super(context);
        this.p = z;
        this.q = zj7;
        if (i >= 0) {
            this.a = i;
        }
    }

    public final void j() {
        super.j();
        this.q.invoke();
    }

    public final void k(View view, n64 n64) {
        int i;
        int h = h();
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            i = 0;
        } else {
            pdc pdc = (pdc) view.getLayoutParams();
            i = m(a.F(view) - pdc.topMargin, a.z(view) + pdc.bottomMargin, aVar.L(), aVar.o - aVar.I(), h);
        }
        int e = e(i);
        if (e > 0) {
            int i2 = -i;
            if (e > 300) {
                e = 300;
            }
            n64.e(0, i2, e, this.i);
        }
    }

    public final int m(int i, int i2, int i3, int i4, int i5) {
        int m;
        if (i5 != -1) {
            boolean z = this.p;
            if (i5 != 0) {
                if (i5 == 1) {
                    int i6 = i4 - i2;
                    return (i6 - (i2 - i) >= i3 || z) ? i6 : i3 - i;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            } else if (!z && (m = m(i, i2, i3, i4, -1)) > 0) {
                return m;
            } else {
                int m2 = m(i, i2, i3, i4, 1);
                if (m2 < 0) {
                    return m2;
                }
                return 0;
            }
        } else {
            return rh4.c((float) 30, fk4.d().getDisplayMetrics().density, i3 - i);
        }
    }
}
