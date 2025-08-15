package defpackage;

import android.view.View;

/* renamed from: tl1  reason: default package */
public final /* synthetic */ class tl1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl1 b;

    public /* synthetic */ tl1(vl1 vl1, int i) {
        this.a = i;
        this.b = vl1;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ul1 ul1 = this.b.G0;
                if (ul1 != null) {
                    ul1.h();
                    return;
                }
                return;
            case 1:
                ul1 ul12 = this.b.G0;
                if (ul12 != null) {
                    ul12.e();
                    return;
                }
                return;
            case 2:
                ul1 ul13 = this.b.G0;
                if (ul13 != null) {
                    ul13.d();
                    return;
                }
                return;
            default:
                ul1 ul14 = this.b.G0;
                if (ul14 != null) {
                    ul14.m();
                    return;
                }
                return;
        }
    }
}
