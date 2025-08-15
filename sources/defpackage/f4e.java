package defpackage;

import android.view.View;

/* renamed from: f4e  reason: default package */
public final class f4e {
    public final View a;
    public final boolean b = false;
    public int c;
    public int d;
    public final jt e;
    public z2e f;

    public f4e(View view) {
        this.a = view;
        jt jtVar = new jt(9);
        jtVar.b = 0;
        jtVar.c = 0;
        this.e = jtVar;
    }

    public final jt a(int i, int i2) {
        int i3;
        jt jtVar = this.e;
        jtVar.b = i;
        jtVar.c = i2;
        z2e z2e = this.f;
        if (z2e == null) {
            return jtVar;
        }
        boolean z = this.b;
        int i4 = z2e.t0;
        if (z) {
            i3 = this.d;
        } else {
            i3 = this.c;
            if (i4 >= i3 && i4 <= (i3 = this.d)) {
                i3 = i4;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.a;
        if (mode == 1073741824) {
            i3 = (int) Math.min((double) i3, (double) ((View.MeasureSpec.getSize(i2) - view.getPaddingBottom()) - view.getPaddingTop()));
        }
        float f2 = ((float) z2e.s0) / ((float) i4);
        jtVar.b = View.MeasureSpec.makeMeasureSpec(view.getPaddingRight() + view.getPaddingLeft() + ((int) (f2 * ((float) i3))), 1073741824);
        jtVar.c = View.MeasureSpec.makeMeasureSpec(view.getPaddingBottom() + view.getPaddingTop() + i3, 1073741824);
        return jtVar;
    }

    public final void b(z2e z2e) {
        this.f = z2e;
        c();
    }

    public final void c() {
        z2e z2e = this.f;
        if (z2e == null || !z2e.u0) {
            float f2 = (float) 170;
            this.c = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            this.d = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            return;
        }
        this.c = tu0.G(((float) 158) * fk4.d().getDisplayMetrics().density);
        this.d = tu0.G(((float) 194) * fk4.d().getDisplayMetrics().density);
    }
}
