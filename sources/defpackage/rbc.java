package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: rbc  reason: default package */
public final class rbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lsf Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rbc(Continuation continuation, lsf lsf, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = lsf;
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rbc) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rbc rbc = new rbc(continuation, this.Y, this.Z);
        rbc.X = obj;
        return rbc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = RecordControlsWidget.b1;
        Long l = (Long) this.Z.I0().x0.a.getValue();
        this.Y.d(l, (zl7) this.X);
        return e5f.a;
    }
}
