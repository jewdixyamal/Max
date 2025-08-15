package defpackage;

import android.text.Layout;
import kotlin.coroutines.Continuation;

/* renamed from: i29  reason: default package */
public final class i29 extends ffe implements a66 {
    public final /* synthetic */ ie7 X;
    public final /* synthetic */ je7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i29(ie7 ie7, khe khe, Continuation continuation) {
        super(2, continuation);
        this.X = ie7;
        this.Y = khe;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((i29) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i29(this.X, (khe) this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.X.a.b((Layout) this.Y.getValue());
        return e5f.a;
    }
}
