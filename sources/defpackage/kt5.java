package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: kt5  reason: default package */
public final class kt5 extends ppd {
    public final jt5 X;

    public kt5(ExecutorService executorService, jt5 jt5) {
        super(executorService);
        this.X = jt5;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        int l = l(i) & 536870911;
        boolean m = s36.m(l, 1);
        jt5 jt5 = this.X;
        if (m) {
            tt5 tt5 = (tt5) hqd;
            tt5.A((st5) ((ol7) C(i)));
            tt5.G0 = jt5;
        } else if (s36.m(l, 8)) {
            lt5 lt5 = (lt5) ((ol7) C(i));
            tu0.K(((mt5) hqd).a, 300, new c5(27, (Object) jt5));
        } else if (s36.m(l, 4)) {
            wu5 wu5 = (wu5) hqd;
            pu5 pu5 = (pu5) ((ol7) C(i));
            wu5.A(pu5);
            ((d12) wu5.a).setOnTrailClick(new vu5(jt5, 0, pu5));
        } else {
            super.r(hqd, i);
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = i;
        int i3 = 536870911 & i2;
        if (s36.m(i3, 1)) {
            return new tt5(viewGroup);
        }
        ViewGroup viewGroup2 = viewGroup;
        if (s36.m(i3, 4)) {
            d12 d12 = new d12(viewGroup.getContext());
            dec dec = new dec(d12);
            d12.setTrail(woc.w);
            return dec;
        } else if (s36.m(i3, 2)) {
            e11 e11 = new e11(0, this.X, jt5.class, "onAddChatsClick", "onAddChatsClick()V", 0, 23);
            Context context = viewGroup.getContext();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(layoutParams);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
            appCompatImageView.setImageResource(gpc.h);
            TextView textView = new TextView(context);
            i4f.j.b(textView, du4.b);
            textView.setText(qba.g);
            v3c.y(new jf1((Object) appCompatImageView, (Object) textView, (Continuation) null, 3), frameLayout);
            float f = (float) 24;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), 8388627);
            float f2 = (float) 18;
            layoutParams2.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            layoutParams2.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            float f3 = (float) 12;
            layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
            layoutParams2.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f3);
            frameLayout.addView(appCompatImageView, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 8388627);
            layoutParams3.leftMargin = rh4.c(f, fk4.d().getDisplayMetrics().density, tu0.G(f2 * fk4.d().getDisplayMetrics().density) * 2);
            layoutParams3.rightMargin = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams3);
            dec dec2 = new dec(frameLayout);
            tu0.K(frameLayout, 300, new m6(10, e11));
            return dec2;
        } else if (s36.m(i3, 8)) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
            dec dec3 = new dec(oneMeButton);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            oneMeButton.setSize(c7a.c);
            oneMeButton.setMode(b7a.c);
            oneMeButton.setAppearance(z6a.b);
            oneMeButton.setText(qba.i);
            return dec3;
        } else {
            throw new IllegalArgumentException(wg0.g(i2, "Unknown view type ", "!"));
        }
    }
}
