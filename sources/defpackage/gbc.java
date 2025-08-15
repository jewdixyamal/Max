package defpackage;

import android.graphics.drawable.InsetDrawable;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: gbc  reason: default package */
public final /* synthetic */ class gbc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ gbc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final Object invoke() {
        khe d;
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RecordControlsWidget.b1;
                int ordinal = recordControlsWidget.H0().ordinal();
                if (ordinal == 0) {
                    return new Object();
                }
                if (ordinal == 1) {
                    f9g f9g = f9g.a;
                    return new c50(f9g.getAccessor().d(kke.class), f9g.getAccessor().d(ch9.class));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                if (recordControlsWidget.H0() == bac.b) {
                    return new p70();
                }
                return null;
            case 2:
                bc7[] bc7Arr3 = RecordControlsWidget.b1;
                bac H0 = recordControlsWidget.H0();
                jac jac = (jac) recordControlsWidget.b.getValue();
                int ordinal2 = recordControlsWidget.H0().ordinal();
                if (ordinal2 == 0) {
                    d = f9g.a.getAccessor().d(ejf.class);
                } else if (ordinal2 == 1) {
                    d = f9g.a.getAccessor().d(o60.class);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return new cbc(H0, jac, d, new khe(new gbc(recordControlsWidget, 0)), new khe(new gbc(recordControlsWidget, 1)));
            case 3:
                return kt3.b(recordControlsWidget.getContext(), recordControlsWidget.F0.a);
            case 4:
                bc7[] bc7Arr4 = RecordControlsWidget.b1;
                return kt3.b(recordControlsWidget.getContext(), woc.U0);
            default:
                bc7[] bc7Arr5 = RecordControlsWidget.b1;
                float f = (float) 2;
                return new InsetDrawable(kt3.b(recordControlsWidget.getContext(), woc.o), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        }
    }
}
