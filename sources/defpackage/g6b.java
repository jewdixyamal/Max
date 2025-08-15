package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;

/* renamed from: g6b  reason: default package */
public final class g6b extends FrameLayout {
    public final boolean a;
    public Integer b;
    public AppCompatTextView c;
    public ImageView o;

    public g6b(Context context, boolean z) {
        super(context);
        this.a = z;
        setMinimumHeight(tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density));
        v3c.y(new br(3, (Continuation) null, 13), this);
    }

    /* access modifiers changed from: private */
    public final fka getCurrentTheme() {
        boolean z = this.a;
        pq9 pq9 = qp4.u0;
        return z ? pq9.p(this).c : pq9.j(this);
    }

    public final void b(Integer num, Integer num2) {
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(intValue);
            imageView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().c(num2 != null ? num2.intValue() : wfa.Q)));
            v3c.y(new r1b((Object) this, (Continuation) null, 1), imageView);
            this.o = imageView;
            float f = (float) 24;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            layoutParams.gravity = 8388627;
            layoutParams.setMarginStart(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
            addView(this.o, layoutParams);
        }
    }

    public final void c(g6b g6b, jqe jqe, Integer num, boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(g6b.getContext(), (AttributeSet) null);
        i4f.l.b(appCompatTextView, du4.b);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setText(jqe.b(appCompatTextView.getContext()));
        int intValue = num != null ? num.intValue() : wfa.Q;
        this.b = Integer.valueOf(intValue);
        appCompatTextView.setTextColor(getCurrentTheme().c(intValue));
        v3c.y(new r1b((Object) this, (Continuation) null, 2), appCompatTextView);
        this.c = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart((z || z2) ? tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density) : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        float f = (float) 4;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        g6b.addView(this.c, layoutParams);
    }
}
