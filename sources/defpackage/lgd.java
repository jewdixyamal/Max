package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;

/* renamed from: lgd  reason: default package */
public final class lgd extends ppd {
    public final fd7 X;

    public lgd(fd7 fd7, ExecutorService executorService) {
        super(executorService);
        this.X = fd7;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        if (hqd instanceof kgd) {
            kgd kgd = (kgd) hqd;
            ol7 ol7 = (ol7) C(i);
            if (ol7 instanceof c1d) {
                kgd.A(ol7);
                ufd ufd = (ufd) kgd.a;
                boolean z = ((c1d) ol7).Z instanceof ffd;
                fd7 fd7 = this.X;
                if (z) {
                    ufd.setOnSwitchCheckedListener(new bk(17, fd7));
                } else {
                    ufd.setOnSwitchListener((qfd) null);
                }
                tu0.K(ufd, 300, new v7d(fd7, 3, (c1d) ol7));
                return;
            }
            return;
        }
        hqd.A((ol7) C(i));
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == fha.D) {
            return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == fha.C) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = (float) 16;
            textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
            i4f.u.b(textView, du4.b);
            v3c.y(new v9(3, (Continuation) null, 22), textView);
            return new az0(textView, 12);
        }
        String name = lgd.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), (Throwable) null);
        }
        return new az0(new View(viewGroup.getContext()), 13);
    }
}
