package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: ae1  reason: default package */
public final class ae1 extends ppd {
    public final wmc X;
    public final acc Y;

    public ae1(wmc wmc, acc acc, ExecutorService executorService) {
        super(executorService);
        this.X = wmc;
        this.Y = acc;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        boolean z = hqd instanceof zd1;
        wmc wmc = this.X;
        if (z) {
            zd1 zd1 = (zd1) hqd;
            ol7 ol7 = (ol7) C(i);
            if (ol7 instanceof sy0) {
                View view = zd1.a;
                ufd ufd = (ufd) view;
                sy0 sy0 = (sy0) ol7;
                boolean z2 = sy0.u0;
                ufd.setDisableStartIconText(z2);
                zd1.A(ol7);
                ufd.setEnabled(z2);
                if (z2) {
                    tu0.K(view, 300, new xd1(wmc, (sy0) ol7, 1));
                } else {
                    view.setOnClickListener((View.OnClickListener) null);
                }
                CharSequence charSequence = zd1.F0.b;
                ufd.setDescription(charSequence != null ? new iqe(charSequence) : sy0.Y);
            }
        } else if (hqd instanceof yd1) {
            yd1 yd1 = (yd1) hqd;
            ol7 ol72 = (ol7) C(i);
            if (ol72 instanceof sy0) {
                yd1.A(ol72);
                View view2 = yd1.a;
                boolean z3 = ((sy0) ol72).u0;
                ((ufd) view2).setEnabled(z3);
                if (z3) {
                    tu0.K(view2, 300, new xd1(wmc, (sy0) ol72, 0));
                } else {
                    view2.setOnClickListener((View.OnClickListener) null);
                }
            }
        } else {
            hqd.A((ol7) C(i));
        }
    }

    /* renamed from: I */
    public final void y(hqd hqd) {
        hqd.D();
        zd1 zd1 = hqd instanceof zd1 ? (zd1) hqd : null;
        if (zd1 != null) {
            zd1.F0.a.remove(zd1);
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == y7a.l0) {
            ufd ufd = new ufd(viewGroup.getContext(), (AttributeSet) null);
            dec dec = new dec(ufd);
            ufd.setThemeDepended(pfd.b);
            return dec;
        } else if (i == y7a.j0) {
            return new zd1(viewGroup.getContext(), this.Y);
        } else {
            String name = ae1.class.getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), (Throwable) null);
            }
            return new az0(new View(viewGroup.getContext()), 3);
        }
    }
}
