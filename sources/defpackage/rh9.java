package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rh9  reason: default package */
public final class rh9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;
    public final /* synthetic */ float Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh9(uh9 uh9, float f, Continuation continuation) {
        super(2, continuation);
        this.X = uh9;
        this.Y = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rh9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rh9(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        a98 a98 = this.X.m;
        if (a98 != null) {
            a98.setPlaybackSpeed(this.Y);
        }
        return e5f.a;
    }
}
