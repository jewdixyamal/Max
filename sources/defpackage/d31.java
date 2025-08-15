package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d31  reason: default package */
public final class d31 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ l31 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d31(long j, l31 l31, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = l31;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d31) n((e52) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d31 d31 = new d31(this.Y, this.Z, continuation);
        d31.X = obj;
        return d31;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e52 e52 = (e52) this.X;
        if (e52 != null) {
            l31 l31 = this.Z;
            j47.T(l31.a, ((w9a) ((kke) l31.f.getValue())).a(), (vx3) null, new c31(l31, e52, (Continuation) null), 2);
            return e5f.a;
        }
        throw new IllegalArgumentException("chat not found for id =#" + this.Y);
    }
}
