package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: b02  reason: default package */
public final class b02 extends hqd {
    public final k56 F0;
    public final FrameLayout G0;
    public final AppCompatTextView H0;
    public final khe I0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b02(android.content.Context r6, defpackage.k56 r7) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r1 = 30
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.fk4.d()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.tu0.G(r1)
            r0.setMinimumHeight(r1)
            r5.<init>(r0)
            r5.F0 = r7
            r5.G0 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = new androidx.appcompat.widget.AppCompatTextView
            r1 = 0
            r7.<init>(r6, r1)
            int r2 = defpackage.jca.m
            r7.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r3, r3)
            r3 = 8388627(0x800013, float:1.175497E-38)
            r2.gravity = r3
            r7.setLayoutParams(r2)
            kqe r2 = defpackage.i4f.o
            r2.b(r7, defpackage.du4.b)
            br r2 = new br
            r3 = 3
            r4 = 3
            r2.<init>((int) r3, (kotlin.coroutines.Continuation) r1, (int) r4)
            defpackage.v3c.y(r2, r7)
            r5.H0 = r7
            a5 r1 = new a5
            r2 = 25
            r1.<init>((android.content.Context) r6, (int) r2)
            khe r6 = new khe
            r6.<init>(r1)
            r5.I0 = r6
            r0.addView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.<init>(android.content.Context, k56):void");
    }

    public final void A(ol7 ol7) {
        if (ol7 instanceof f02) {
            AppCompatTextView appCompatTextView = this.H0;
            f02 f02 = (f02) ol7;
            appCompatTextView.setText(f02.getName().b(appCompatTextView.getContext()));
            boolean r = f02.r();
            khe khe = this.I0;
            if (r) {
                ay7.b(this.G0, (View) khe.getValue(), -1);
                ((View) khe.getValue()).setVisibility(0);
                tu0.K((View) khe.getValue(), 300, new c5(14, (Object) this));
            } else if (khe.a()) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) khe.getValue();
                appCompatImageView.setVisibility(8);
                appCompatImageView.setOnClickListener((View.OnClickListener) null);
            }
        }
    }
}
