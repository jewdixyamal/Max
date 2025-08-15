package defpackage;

import android.view.View;

/* renamed from: sv3  reason: default package */
public final /* synthetic */ class sv3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv3 b;

    public /* synthetic */ sv3(uv3 uv3, int i) {
        this.a = i;
        this.b = uv3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                int measuredHeight = view.getMeasuredHeight();
                uv3 uv3 = this.b;
                ov3 ov3 = uv3.k;
                if (measuredHeight != ov3.a) {
                    Integer x = br7.x(view);
                    uv3.k = ov3.a(ov3, measuredHeight, x != null ? x.intValue() : 0, false, 4);
                    for (pv3 u : uv3.a) {
                        u.u(uv3.k);
                    }
                    return;
                }
                return;
            default:
                int measuredHeight2 = view.getMeasuredHeight();
                int measuredHeight3 = view.getMeasuredHeight();
                uv3 uv32 = this.b;
                ov3 ov32 = uv32.j;
                if (measuredHeight3 != ov32.a) {
                    Integer E = br7.E(view);
                    uv32.j = ov3.a(ov32, measuredHeight2, E != null ? E.intValue() : 0, false, 4);
                    for (pv3 D : uv32.a) {
                        D.D(uv32.j);
                    }
                    return;
                }
                return;
        }
    }
}
