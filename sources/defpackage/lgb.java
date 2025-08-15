package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lgb  reason: default package */
public final class lgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lgb(vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lgb) n((fv4) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lgb lgb = new lgb(this.Y, continuation);
        lgb.X = obj;
        return lgb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        fv4 fv4 = (fv4) this.X;
        vgb vgb = this.Y;
        vgb.u0.setValue(fv4.a);
        vgb.s0.setValue(fv4.b);
        return e5f.a;
    }
}
