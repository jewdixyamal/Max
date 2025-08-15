package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qh9  reason: default package */
public final class qh9 extends ffe implements a66 {
    public final /* synthetic */ long X;
    public final /* synthetic */ uh9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qh9(long j, uh9 uh9, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qh9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qh9(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = uh9.K;
        long j = this.X;
        hm9.m("uh9", "seekToPosition, posMs %d", new Long(j));
        uh9 uh9 = this.Y;
        uh9.f();
        a98 a98 = uh9.m;
        if (a98 != null) {
            a98.seekTo(j);
        }
        uh9.s.m((Object) null, new Long(j));
        uh9.G.m((Object) null, new Float(ote.d((float) (((double) j) / ((double) uh9.E)), 0.0f, 1.0f)));
        return e5f.a;
    }
}
