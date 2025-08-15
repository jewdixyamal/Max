package defpackage;

import android.text.InputFilter;

/* renamed from: tt5  reason: default package */
public final class tt5 extends hqd {
    public final cka F0;
    public jt5 G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tt5(android.view.View r7) {
        /*
            r6 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r7 = r7.getContext()
            r0.<init>(r7)
            r6.<init>(r0)
            cka r7 = new cka
            android.content.Context r1 = r0.getContext()
            r7.<init>(r1)
            r6.F0 = r7
            int r1 = defpackage.dwb.oneme_folders_edit_folder_name_field
            r0.setId(r1)
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            int r1 = defpackage.qba.j
            android.content.Context r4 = r7.getContext()
            java.lang.String r1 = defpackage.z7.B(r4, r1)
            r7.setHint(r1)
            jy2 r1 = new jy2
            r4 = 14
            r1.<init>(r4, r6)
            r7.b(r1)
            android.text.InputFilter$LengthFilter r1 = new android.text.InputFilter$LengthFilter
            r4 = 20
            r1.<init>(r4)
            r4 = 1
            android.text.InputFilter[] r4 = new android.text.InputFilter[r4]
            r5 = 0
            r4[r5] = r1
            r7.setFilters(r4)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r4 = 17
            r1.<init>(r2, r3, r4)
            r0.addView(r7, r1)
            xh0 r7 = new xh0
            r1 = 0
            r2 = 12
            r7.<init>((java.lang.Object) r6, (kotlin.coroutines.Continuation) r1, (int) r2)
            defpackage.v3c.y(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt5.<init>(android.view.View):void");
    }

    public final void D() {
        this.G0 = null;
    }

    /* renamed from: E */
    public final void A(st5 st5) {
        cka cka = this.F0;
        boolean z = st5.b;
        cka.setEnabled(z);
        cka.setTextColorAttr(z ? wfa.W : wfa.T);
        if (cka.getText().length() == 0) {
            jqe jqe = st5.a;
            CharSequence a = jqe != null ? jqe.a(this) : null;
            if (a == null) {
                a = "";
            }
            cka.setText(a);
        }
        cka.setFilters(new InputFilter[]{new InputFilter.LengthFilter(st5.c)});
        this.G0 = null;
    }
}
