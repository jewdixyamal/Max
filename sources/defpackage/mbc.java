package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: mbc  reason: default package */
public final class mbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mbc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mbc mbc = new mbc(continuation, this.Y);
        mbc.X = obj;
        return mbc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String str = (String) this.X;
        RecordControlsWidget recordControlsWidget = this.Y;
        lsf lsf = recordControlsWidget.E0;
        if (lsf != null) {
            lsf.setDurationText(str);
        }
        recordControlsWidget.x0().setText(str);
        return e5f.a;
    }
}
