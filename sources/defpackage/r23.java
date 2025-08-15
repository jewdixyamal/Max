package defpackage;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r23  reason: default package */
public final class r23 extends hdc {
    public final sme X;
    public final bk4 Y = bk4.b();
    public final List Z;
    public final Context o;

    public r23(Context context, ArrayList arrayList) {
        this.o = context;
        this.Z = arrayList;
        khe khe = sme.a0;
        this.X = fm9.R(context);
    }

    public final int j() {
        return this.Z.size();
    }

    public final void r(dec dec, int i) {
        q23 q23 = (q23) dec;
        iw0 iw0 = (iw0) this.Z.get(i);
        p23 p23 = new p23(this, i, iw0, 0);
        boolean z = iw0.d;
        AppCompatCheckBox appCompatCheckBox = q23.F0;
        appCompatCheckBox.setChecked(z);
        q23.G0.setText(iw0.a);
        q23.H0.setText(iw0.c);
        q23.a.setOnClickListener(new tb((Object) q23, 17, (Object) p23));
        appCompatCheckBox.setOnClickListener(p23);
    }

    public final dec t(ViewGroup viewGroup, int i) {
        Context context = this.o;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new pdc(-1, -2));
        sme sme = this.X;
        RippleDrawable L = hm9.L(0, sme.i);
        linearLayout.setWeightSum(1.0f);
        linearLayout.setBackground(L);
        c54.c(linearLayout);
        bk4 bk4 = this.Y;
        j47.q(linearLayout, bk4.m);
        j47.p(linearLayout, bk4.r);
        j47.o(linearLayout, bk4.j);
        j47.r(linearLayout, bk4.j);
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, (AttributeSet) null);
        kqe kqe = i4f.l;
        kqe.b(appCompatCheckBox, du4.b);
        int i2 = sme.k;
        appCompatCheckBox.setHighlightColor(i2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        c54.c(appCompatCheckBox);
        j47.p(appCompatCheckBox, bk4.d);
        linearLayout.addView(appCompatCheckBox, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setTextColor(sme.F);
        kqe.b(appCompatTextView, du4.b);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setLines(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 8388627;
        c54.c(appCompatTextView);
        appCompatTextView.setTextAlignment(5);
        linearLayout.addView(appCompatTextView, layoutParams2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setTextColor(i2);
        kqe.b(appCompatTextView2, du4.b);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setLines(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388627;
        c54.c(appCompatCheckBox);
        appCompatTextView.setTextAlignment(5);
        linearLayout.addView(appCompatTextView2, layoutParams3);
        return new q23(linearLayout, appCompatCheckBox, appCompatTextView, appCompatTextView2);
    }
}
