package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dsd  reason: default package */
public final class dsd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ esd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsd(esd esd, Continuation continuation) {
        super(2, continuation);
        this.Y = esd;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((dsd) n((b00) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dsd dsd = new dsd(this.Y, continuation);
        dsd.X = obj;
        return dsd;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        esd.e(this.Y, (b00) this.X);
        return e5f.a;
    }
}
