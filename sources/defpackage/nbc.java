package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: nbc  reason: default package */
public final class nbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((nbc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nbc nbc = new nbc(continuation, this.Y);
        nbc.X = obj;
        return nbc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        qac qac = (qac) this.X;
        boolean f = tpa.f(qac, oac.a);
        RecordControlsWidget recordControlsWidget = this.Y;
        if (f) {
            bc7[] bc7Arr = RecordControlsWidget.b1;
            String[] strArr = eua.h;
            boolean b = ((eua) recordControlsWidget.o.getValue()).b(strArr);
            je7 je7 = recordControlsWidget.o;
            if (!b) {
                eua eua = (eua) je7.getValue();
                l5g l5g = new l5g(recordControlsWidget, 1);
                int i = oga.c;
                eua.getClass();
                int i2 = j1c.permissions_audio_title;
                int i3 = oga.g;
                if (eua.i(l5g, strArr)) {
                    l5g.c(strArr, 160, i2, i, i3);
                } else {
                    eua.f(l5g, strArr, 160);
                }
            }
            if (!((eua) je7.getValue()).b(eua.l)) {
                ((eua) je7.getValue()).h(new l5g(recordControlsWidget, 1));
            }
        } else if (tpa.f(qac, pac.a)) {
            bc7[] bc7Arr2 = RecordControlsWidget.b1;
            recordControlsWidget.getClass();
            bc7[] bc7Arr3 = BottomSheetWidget.x0;
            znc znc = null;
            lg3 e = wg0.e(mga.d, 6, (Bundle) null);
            e.f(new eqe(mga.c));
            e.a(new mg3(1, new eqe(mga.a), 3, false));
            e.a(new mg3(2, new eqe(mga.b), 2, false));
            ConfirmationBottomSheet e2 = e.e();
            e2.setTargetController(recordControlsWidget);
            uu3 uu3 = recordControlsWidget;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e2.z0(recordControlsWidget);
            if (znc != null) {
                coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
