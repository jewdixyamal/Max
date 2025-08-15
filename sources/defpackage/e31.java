package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e31  reason: default package */
public final class e31 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l31 Y;
    public final /* synthetic */ boolean Z = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e31(l31 l31, Continuation continuation) {
        super(2, continuation);
        this.Y = l31;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((e31) n((e52) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        e31 e31 = new e31(this.Y, continuation);
        e31.X = obj;
        return e31;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        e52 e52 = (e52) this.X;
        q0e q0e = this.Y.j;
        long j = e52.a;
        e52.k0();
        CharSequence charSequence = e52.u0;
        String g = e52.g(kk0.o, jk0.a);
        long f = e52.f();
        e52.l0();
        CharSequence charSequence2 = e52.x0;
        boolean z = !this.Z;
        long j2 = e52.b.a;
        q0e.m((Object) null, new y21(new Long(j), new Long(j2), charSequence, g, new Long(f), charSequence2, z));
        return e5f.a;
    }
}
