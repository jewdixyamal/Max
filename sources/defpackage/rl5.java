package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: rl5  reason: default package */
public final class rl5 extends kgb {
    public final AppCompatEditText F0;
    public final je7 G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rl5(android.content.Context r12) {
        /*
            r11 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r12)
            r11.<init>(r0)
            androidx.appcompat.widget.AppCompatEditText r1 = new androidx.appcompat.widget.AppCompatEditText
            r2 = 0
            r1.<init>(r12, r2)
            int r3 = defpackage.rwb.profile_edit_first_name_field
            r1.setId(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r1.setLayoutParams(r3)
            r3 = 12
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.fk4.d()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = defpackage.tu0.G(r6)
            r7 = 16
            float r8 = (float) r7
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r9 = r9 * r8
            int r9 = defpackage.tu0.G(r9)
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r3 = r3 * r10
            int r3 = defpackage.tu0.G(r3)
            android.content.res.Resources r10 = defpackage.fk4.d()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r8
            int r10 = defpackage.tu0.G(r10)
            r1.setPaddingRelative(r6, r9, r3, r10)
            r3 = 1
            r1.setSingleLine(r3)
            kqe r6 = defpackage.i4f.l
            r6.b(r1, defpackage.du4.b)
            android.content.res.Resources r6 = r1.getResources()
            int r9 = defpackage.vea.g0
            java.lang.CharSequence r6 = r6.getText(r9)
            r1.setHint(r6)
            r1.setClipToOutline(r3)
            ix3 r6 = new ix3
            android.content.res.Resources r9 = defpackage.fk4.d()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r8 = r8 * r9
            int r8 = defpackage.tu0.G(r8)
            float r8 = (float) r8
            r6.<init>(r8)
            r1.setOutlineProvider(r6)
            int r6 = r1.getInputType()
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r1.setInputType(r6)
            r11.F0 = r1
            hy4 r6 = new hy4
            r8 = 6
            r6.<init>((android.content.Context) r12, (int) r8)
            r12 = 3
            je7 r12 = defpackage.tu0.r(r12, r6)
            r11.G0 = r12
            r0.setOrientation(r3)
            r0.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r4, r5)
            r0.setLayoutParams(r12)
            r0.addView(r1)
            xh0 r12 = new xh0
            r1 = 11
            r12.<init>((java.lang.Object) r11, (kotlin.coroutines.Continuation) r2, (int) r1)
            defpackage.v3c.y(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl5.<init>(android.content.Context):void");
    }

    public final void A(ol7 ol7) {
        ql5 ql5 = (ql5) ol7;
        String str = ql5.a;
        if (str != null) {
            this.F0.setText(str);
        }
        E(ql5.b);
    }

    public final void E(a73 a73) {
        je7 je7 = this.G0;
        if (je7.a() || a73 != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) je7.getValue();
            appCompatTextView.setVisibility(a73 != null ? 0 : 8);
            appCompatTextView.setText(a73 != null ? a73.a(appCompatTextView.getContext()) : null);
            ay7.b((ViewGroup) this.a, appCompatTextView, (Integer) null);
        }
    }
}
