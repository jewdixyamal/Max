package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: x8c  reason: default package */
public final class x8c extends LinearLayout implements kre {
    public final s5a a;
    public final TextView b;

    public x8c(Context context) {
        super(context, (AttributeSet) null);
        s5a s5a = new s5a(context);
        s5a.setId(View.generateViewId());
        float f = (float) 64;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
        s5a.setLayoutParams(layoutParams);
        s5a.setAvatarShape(j5a.a);
        this.a = s5a;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        setHorizontalGravity(17);
        textView.setLayoutParams(layoutParams2);
        float f2 = (float) 82;
        textView.setMaxWidth(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        i4f.t.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        this.b = textView;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(tu0.G(f2 * fk4.d().getDisplayMetrics().density), -2));
        addView(s5a);
        addView(textView);
    }

    public final s5a getAvatar() {
        return this.a;
    }

    public final TextView getName() {
        return this.b;
    }

    public final void onMeasure(int i, int i2) {
        if (qqe.c(this.b)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(fka fka) {
        this.b.setTextColor(fka.getText().e);
    }

    public final void setAbbreviation(uc0 uc0) {
        this.a.g(uc0, true);
    }

    public final void setAvatar(String str) {
        this.a.setAvatarUrl(str);
    }

    public final void setAvatarShape(m5a m5a) {
        this.a.setAvatarShape(m5a);
    }

    public final void setName(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
    }

    public final void setVerified(boolean z) {
        ecf ecf;
        TextView textView = this.b;
        int I = i24.I(qqe.e(textView));
        int i = 0;
        if (z) {
            ecf a2 = qqe.a(textView);
            if ((a2 != null ? a2.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a3 = qqe.a(textView);
            if (a3 != null) {
                i = a3.a;
            }
            if (i != I) {
                ecf = new ecf(getContext(), I, new w8c(0));
                qqe.d(textView, ecf);
            }
        }
        ecf = null;
        qqe.d(textView, ecf);
    }
}
