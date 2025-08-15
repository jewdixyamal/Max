package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d40  reason: default package */
public final class d40 extends ffe implements a66 {
    public final /* synthetic */ f40 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d40(f40 f40, long j, Continuation continuation) {
        super(2, continuation);
        this.X = f40;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d40) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d40(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        return ((au8) this.X.Y.getValue()).q(this.Y);
    }
}
