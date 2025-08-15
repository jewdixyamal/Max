package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bza  reason: default package */
public final class bza extends ffe implements a66 {
    public final /* synthetic */ dza X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bza(dza dza, String str, Continuation continuation) {
        super(2, continuation);
        this.X = dza;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bza) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bza(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ((ti9) this.X.c.g.getValue()).setValue(this.Y);
        return e5f.a;
    }
}
