package defpackage;

import android.graphics.Point;
import android.view.View;

/* renamed from: vo1  reason: default package */
public final /* synthetic */ class vo1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap1 b;

    public /* synthetic */ vo1(ap1 ap1, int i) {
        this.a = i;
        this.b = ap1;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ap1 ap1 = this.b;
                xo1 xo1 = ap1.b1;
                if (xo1 != null) {
                    gg1 gg1 = ap1.h1;
                    int[] iArr = new int[2];
                    ap1.O0.getLocationOnScreen(iArr);
                    xo1.v(gg1, new Point(iArr[0], iArr[1]));
                    return;
                }
                return;
            case 1:
                ap1 ap12 = this.b;
                xo1 xo12 = ap12.b1;
                if (xo12 != null) {
                    xo12.y(ap12.h1);
                    return;
                }
                return;
            case 2:
                xo1 xo13 = this.b.b1;
                if (xo13 != null) {
                    xo13.N();
                    return;
                }
                return;
            default:
                ap1 ap13 = this.b;
                xo1 xo14 = ap13.b1;
                if (xo14 != null) {
                    xo14.S(ap13.h1);
                    return;
                }
                return;
        }
    }
}
