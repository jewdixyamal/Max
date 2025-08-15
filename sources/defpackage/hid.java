package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: hid  reason: default package */
public final class hid extends ppd {
    public final rxd X;

    public hid(rxd rxd, ExecutorService executorService) {
        super(executorService);
        this.X = rxd;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        boolean z = hqd instanceof gid;
        rxd rxd = this.X;
        if (z) {
            gid gid = (gid) hqd;
            ol7 ol7 = (ol7) C(i);
            if (ol7 instanceof k1d) {
                gid.A(ol7);
                tu0.K((ufd) gid.a, 300, new eid(rxd, (k1d) ol7, 1));
            }
        } else if (hqd instanceof fid) {
            fid fid = (fid) hqd;
            ol7 ol72 = (ol7) C(i);
            if (ol72 instanceof i1d) {
                fid.A(ol72);
                tu0.K((OneMeButton) fid.a, 300, new eid(rxd, (i1d) ol72, 0));
            }
        } else {
            hqd.A((ol7) C(i));
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == nha.H) {
            return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
        }
        if (i == nha.G) {
            TextView textView = new TextView(viewGroup.getContext());
            float f = (float) 16;
            float f2 = (float) 4;
            textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            i4f.u.b(textView, du4.b);
            v3c.y(new v9(3, (Continuation) null, 24), textView);
            return new az0(textView, 16);
        } else if (i == nha.F) {
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), (AttributeSet) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
            layoutParams.leftMargin = G;
            layoutParams.rightMargin = G;
            layoutParams.topMargin = G;
            layoutParams.bottomMargin = G;
            oneMeButton.setLayoutParams(layoutParams);
            oneMeButton.setSize(c7a.c);
            oneMeButton.setMode(b7a.a);
            oneMeButton.setAppearance(z6a.c);
            return new dec(oneMeButton);
        } else {
            String name = hid.class.getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), (Throwable) null);
            }
            return new az0(new View(viewGroup.getContext()), 17);
        }
    }
}
