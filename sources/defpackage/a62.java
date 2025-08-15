package defpackage;

import android.view.View;
import java.util.concurrent.CancellationException;

/* renamed from: a62  reason: default package */
public final class a62 extends of2 {
    public final /* synthetic */ int F0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a62(View view, int i) {
        super(view);
        this.F0 = i;
    }

    public final void A(ol7 ol7) {
        switch (this.F0) {
            case 0:
                qm8 qm8 = (qm8) ol7;
                td2 td2 = (td2) this.a;
                td2.setId((int) qm8.a);
                td2.setupAudio(qm8);
                return;
            default:
                wm8 wm8 = (wm8) ol7;
                sg2 sg2 = (sg2) this.a;
                sg2.setId((int) wm8.a);
                sg2.setItem(wm8);
                return;
        }
    }

    public void D() {
        switch (this.F0) {
            case 0:
                td2 td2 = (td2) this.a;
                td2.removeOnAttachStateChangeListener(td2.K0);
                x77 x77 = td2.L0;
                if (x77 != null) {
                    x77.cancel((CancellationException) null);
                }
                td2.L0 = null;
                td2.M0 = null;
                return;
            default:
                return;
        }
    }

    public final void E(xm8 xm8, m56 m56, a66 a66) {
        switch (this.F0) {
            case 0:
                qm8 qm8 = (qm8) xm8;
                View view = this.a;
                td2 td2 = (td2) view;
                td2 td22 = (td2) view;
                td22.setId((int) qm8.a);
                td22.setupAudio(qm8);
                tu0.K(td2, 300, new tb((Object) m56, 10, (Object) qm8));
                td2.setOnLongClickListener(new z52(a66, qm8, this, 0));
                return;
            default:
                wm8 wm8 = (wm8) xm8;
                View view2 = this.a;
                sg2 sg2 = (sg2) view2;
                sg2 sg22 = (sg2) view2;
                sg22.setId((int) wm8.a);
                sg22.setItem(wm8);
                tu0.K(sg2, 300, new tb((Object) m56, 13, (Object) wm8));
                sg2.setOnLongClickListener(new z52(a66, wm8, this, 2));
                return;
        }
    }
}
