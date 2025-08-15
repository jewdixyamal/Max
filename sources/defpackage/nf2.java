package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: nf2  reason: default package */
public final class nf2 extends ppd {
    public final mf2 X;

    public nf2(ExecutorService executorService, mf2 mf2) {
        super(executorService);
        this.X = mf2;
    }

    /* renamed from: J */
    public final void r(of2 of2, int i) {
        of2 of22 = of2;
        xm8 xm8 = (xm8) ((ol7) C(i));
        if (xm8 instanceof um8) {
            of22.E(xm8, new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 8), new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 3));
        } else if (xm8 instanceof vm8) {
            bd2 bd2 = of22 instanceof bd2 ? (bd2) of22 : null;
            if (bd2 != null) {
                vm8 vm8 = (vm8) xm8;
                f fVar = new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 9);
                vw vwVar = new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 4);
                f fVar2 = new f(1, this.X, mf2.class, "onLinkLongClick", "onLinkLongClick(Lone/me/profile/screens/media/model/MediaUiMessage$Link;)V", 0, 10);
                lf2 lf2 = (lf2) bd2.a;
                bd2.A(vm8);
                tu0.K(lf2, 300, new yc2(fVar, vm8, 0));
                lf2.setOnLongClickListener(new zc2(vwVar, vm8, bd2, 0));
                lf2.setLinkOnLongClickListener(new ad2(fVar2, 0, vm8));
                lf2.setOnLinkClickListener(new yc2(fVar2, vm8, 1));
            }
        } else if (xm8 instanceof wm8) {
            of22.E(xm8, new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 11), new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 5));
        } else if (xm8 instanceof qm8) {
            of22.E(xm8, new f(1, this.X, mf2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 12), new vw(2, this.X, mf2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 6));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final int l(int i) {
        return ((xm8) this.o.f.get(i)).l();
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int ordinal = ((ih2) ih2.o.get(i)).ordinal();
        if (ordinal == 0) {
            return new a62(new sg2(viewGroup.getContext(), (AttributeSet) null), 1);
        }
        if (ordinal == 1) {
            return new dec(new kf2(viewGroup.getContext(), (AttributeSet) null));
        }
        if (ordinal == 2) {
            return new dec(new lf2(viewGroup.getContext(), (AttributeSet) null));
        }
        if (ordinal == 3) {
            return new a62(new td2(viewGroup.getContext(), (AttributeSet) null), 0);
        }
        throw new NoWhenBranchMatchedException();
    }
}
