package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nh9  reason: default package */
public final class nh9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nh9(uh9 uh9, Continuation continuation) {
        super(2, continuation);
        this.X = uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((nh9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nh9(this.X, continuation);
    }

    public final Object o(Object obj) {
        a98 a98;
        od2.a0(obj);
        uh9 uh9 = this.X;
        a98 a982 = uh9.m;
        if ((a982 == null || a982.getPlaybackState() != 3) && (a98 = uh9.m) != null) {
            a98.prepare();
        }
        a98 a983 = uh9.m;
        if (a983 != null) {
            a983.play();
        }
        return e5f.a;
    }
}
