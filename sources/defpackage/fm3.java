package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fm3  reason: default package */
public final class fm3 extends ffe implements a66 {
    public final /* synthetic */ jm3 X;
    public final /* synthetic */ faf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fm3(jm3 jm3, faf faf, Continuation continuation) {
        super(2, continuation);
        this.X = jm3;
        this.Y = faf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fm3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fm3(this.X, this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        od2.a0(obj);
        ? obj2 = new Object();
        obj2.q = this.Y;
        return new Long(((pk) this.X.z.getValue()).a(new gaf(obj2)));
    }
}
