package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: m4e  reason: default package */
public final class m4e extends ppd {
    public final Executor X;
    public final ad7 Y;
    public gw7 Z;
    public final rxd s0 = new rxd(29, new y8((Object) this));
    public final o9g t0 = new o9g(26, (Object) this);

    public m4e(ExecutorService executorService, ad7 ad7) {
        super(executorService);
        this.X = executorService;
        this.Y = ad7;
    }

    public final int l(int i) {
        return ((ol7) C(i)).l();
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == jca.r) {
            Context context = viewGroup.getContext();
            e09 e09 = new e09(0, this.Y, ad7.class, "onFakeSearchClick", "onFakeSearchClick()V", 0, 10);
            TextView textView = new TextView(context);
            textView.setId(jca.e);
            int G = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
            int G2 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            layoutParams.topMargin = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
            textView.setLayoutParams(layoutParams);
            textView.setClipToOutline(true);
            textView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 10.0f));
            textView.setText(context.getString(yoc.x0));
            Drawable b = kt3.b(context, yfa.r);
            ArrayList arrayList = qqe.a;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
            textView.setPadding(G2, G, G2, G);
            i4f.l.b(textView, du4.b);
            v3c.y(new v9(3, (Continuation) null, 26), textView);
            tu0.K(textView, 300, new m6(26, e09));
            return new az0(textView, 18);
        } else if (i == tga.k) {
            return new b02(viewGroup.getContext(), new e09(0, this.Y, ad7.class, "onRecentClearClick", "onRecentClearClick()V", 0, 11));
        } else {
            if (i == tga.l) {
                return new vt3(viewGroup.getContext(), this.Z, (ExecutorService) this.X, this.t0);
            }
            return rxd.V(this.s0, viewGroup.getContext(), i);
        }
    }
}
