package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: chd  reason: default package */
public final class chd extends ppd {
    public final qqd X;

    public chd(qqd qqd, ExecutorService executorService) {
        super(executorService);
        this.X = qqd;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        if (hqd instanceof bhd) {
            bhd bhd = (bhd) hqd;
            ol7 ol7 = (ol7) C(i);
            if (ol7 instanceof v0d) {
                bhd.A(ol7);
                boolean z = ((v0d) ol7).t0;
                View view = bhd.a;
                qqd qqd = this.X;
                if (z) {
                    ((ufd) view).setEnabled(true);
                    tu0.K(view, 300, new v7d(qqd, 4, (v0d) ol7));
                } else {
                    ((ufd) view).setEnabled(false);
                    view.setOnClickListener((View.OnClickListener) null);
                }
                ((ufd) view).setOnSwitchCheckedListener(new bk(18, qqd));
                return;
            }
            return;
        }
        hqd.A((ol7) C(i));
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == iha.v) {
            return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == iha.u) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = (float) 16;
            textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
            i4f.u.b(textView, du4.b);
            v3c.y(new v9(3, (Continuation) null, 23), textView);
            return new az0(textView, 14);
        }
        String name = chd.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), (Throwable) null);
        }
        return new az0(new View(viewGroup.getContext()), 15);
    }
}
