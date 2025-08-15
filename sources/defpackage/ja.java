package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: ja  reason: default package */
public final class ja extends ppd {
    public final ia X;
    public final lrf Y;

    public ja(ia iaVar, ExecutorService executorService, lrf lrf) {
        super(executorService);
        this.X = iaVar;
        this.Y = lrf;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        iv ivVar = this.o;
        int l = ((ol7) ivVar.f.get(i)).l();
        int i2 = y7a.U0;
        ia iaVar = this.X;
        if (l == i2) {
            ha haVar = (ha) hqd;
            ol7 ol7 = (ol7) C(i);
            if (ol7 instanceof z9f) {
                haVar.A((z9f) ol7);
                lk3 lk3 = (lk3) haVar.a;
                lk3.N();
                lrf lrf = haVar.F0;
                lk3.Q((LayerDrawable) lrf.b.getValue(), (LayerDrawable) lrf.c.getValue(), new ga(iaVar, 0, (z9f) ol7));
            }
        } else if (((ol7) ivVar.f.get(i)).l() == y7a.R0) {
            fa faVar = (fa) hqd;
            ol7 ol72 = (ol7) C(i);
            if (ol72 instanceof aaf) {
                View view = faVar.a;
                ((ufd) view).setModelItem((aaf) ol72);
                tu0.K(view, 300, new c5(7, (Object) iaVar));
            }
        } else {
            hqd.A((ol7) C(i));
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == y7a.U0) {
            return new ha(viewGroup.getContext(), this.Y);
        }
        if (i == y7a.R0) {
            ufd ufd = new ufd(viewGroup.getContext(), (AttributeSet) null);
            dec dec = new dec(ufd);
            ufd.setThemeDepended(pfd.b);
            return dec;
        }
        throw new IllegalStateException(("unknown item viewType " + i).toString());
    }
}
