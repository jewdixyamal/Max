package defpackage;

import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: pl2  reason: default package */
public final class pl2 extends kgb {
    public final cka F0;
    public final je7 G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pl2(android.content.Context r10) {
        /*
            r9 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r9.<init>(r0)
            cka r1 = new cka
            r1.<init>(r10)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.setLayoutParams(r2)
            int r2 = defpackage.wfa.N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setBackgroundColorAttr(r2)
            int r2 = defpackage.wfa.X
            r1.setHintColorAttr(r2)
            r2 = 1
            r1.setClipToOutline(r2)
            ix3 r5 = new ix3
            r6 = 16
            float r7 = (float) r6
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = defpackage.tu0.G(r7)
            float r7 = (float) r7
            r5.<init>(r7)
            r1.setOutlineProvider(r5)
            r9.F0 = r1
            a5 r5 = new a5
            r7 = 26
            r5.<init>((android.content.Context) r10, (int) r7)
            r10 = 3
            je7 r10 = defpackage.tu0.r(r10, r5)
            r9.G0 = r10
            r0.setOrientation(r2)
            r0.setGravity(r6)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r3, r4)
            r0.setLayoutParams(r10)
            r0.addView(r1)
            r10 = 0
            r0.setBackground(r10)
            xh0 r1 = new xh0
            r2 = 2
            r1.<init>((java.lang.Object) r9, (kotlin.coroutines.Continuation) r10, (int) r2)
            defpackage.v3c.y(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl2.<init>(android.content.Context):void");
    }

    public final void A(ol7 ol7) {
        ol2 ol2 = (ol2) ol7;
        Object a = ol2.b.a(this);
        if (a == null) {
            a = "";
        }
        String obj = a.toString();
        cka cka = this.F0;
        cka.setHint(obj);
        cka.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ol2.o)});
        String str = ol2.a;
        if (str != null) {
            cka.setText(str);
        }
        E(ol2.c);
    }

    public final void E(a73 a73) {
        je7 je7 = this.G0;
        if (je7.a() || a73 != null) {
            TextView textView = (TextView) je7.getValue();
            textView.setVisibility(a73 != null ? 0 : 8);
            textView.setText(a73 != null ? a73.a(textView.getContext()) : null);
            ay7.b((ViewGroup) this.a, textView, -1);
        }
    }
}
