package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* renamed from: dz0  reason: default package */
public final class dz0 extends ppd {
    public final wmc X;

    public dz0(wmc wmc, ExecutorService executorService) {
        super(executorService);
        this.X = wmc;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        if (hqd instanceof cz0) {
            cz0 cz0 = (cz0) hqd;
            ol7 ol7 = (ol7) C(i);
            if (ol7 instanceof e01) {
                View view = cz0.a;
                ufd ufd = (ufd) view;
                ufd.setThemeDepended(pfd.b);
                cz0.A(ol7);
                boolean z = ((e01) ol7).t0;
                wmc wmc = this.X;
                if (z) {
                    ufd.setEnabled(true);
                    tu0.K(view, 300, new bz0(cz0, wmc, (e01) ol7, 0));
                } else {
                    ufd.setEnabled(false);
                    view.setOnClickListener((View.OnClickListener) null);
                }
                ufd.setOnSwitchCheckedListener(new bk(2, wmc));
                return;
            }
            return;
        }
        hqd.A((ol7) C(i));
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == y7a.g) {
            return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
        }
        int i2 = y7a.f;
        pq9 pq9 = qp4.u0;
        if (i == i2) {
            TextView textView = new TextView(viewGroup.getContext());
            i4f.u.b(textView, du4.b);
            textView.setTextColor(pq9.p(textView).c.getText().g);
            return new az0(textView, 1);
        } else if (i == y7a.e) {
            TextView textView2 = new TextView(viewGroup.getContext());
            i4f.n.b(textView2, du4.b);
            textView2.setTextColor(pq9.p(textView2).c.getText().g);
            return new az0(textView2, 0);
        } else {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
    }
}
