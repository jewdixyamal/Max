package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: f4d  reason: default package */
public final class f4d extends ppd {
    public final bqc X;
    public final Executor Y;

    public f4d(bqc bqc, ExecutorService executorService) {
        super(executorService);
        this.X = bqc;
        this.Y = executorService;
    }

    public final void H(hqd hqd, int i) {
        ((e4d) hqd).A((c86) ((ol7) C(i)));
    }

    public final void r(dec dec, int i) {
        ((e4d) dec).A((c86) ((ol7) C(i)));
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = e4d.J0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        float f = (float) 44;
        oneMeDraweeView.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        oneMeDraweeView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 8.0f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        i4f.l.b(appCompatTextView, du4.b);
        appCompatTextView.setPadding(tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setVerticalGravity(16);
        float f2 = (float) 12;
        float f3 = (float) 6;
        linearLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        linearLayout.addView(oneMeDraweeView);
        linearLayout.addView(appCompatTextView);
        return new e4d(this.X, oneMeDraweeView, appCompatTextView, linearLayout);
    }
}
