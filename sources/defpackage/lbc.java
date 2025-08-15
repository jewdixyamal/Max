package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: lbc  reason: default package */
public final class lbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lbc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lbc lbc = new lbc(continuation, this.Y);
        lbc.X = obj;
        return lbc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = RecordControlsWidget.b1;
        RecordControlsWidget recordControlsWidget = this.Y;
        View F0 = recordControlsWidget.F0();
        cc1 cc1 = new cc1((uac) this.X, 4, recordControlsWidget);
        if (F0.isLaidOut()) {
            cc1.invoke();
        } else if (!F0.isLaidOut() || F0.isLayoutRequested()) {
            F0.addOnLayoutChangeListener(new qq0(11, cc1));
        } else {
            cc1.invoke();
        }
        return e5f.a;
    }
}
