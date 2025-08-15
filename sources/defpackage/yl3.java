package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yl3  reason: default package */
public final class yl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yl3(jm3 jm3, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yl3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jm3 jm3 = this.Y;
            ((f5a) jm3.t.getValue()).g(true);
            cx7 c = ((w9a) jm3.q()).c();
            xl3 xl3 = new xl3(jm3, (Continuation) null);
            this.X = 1;
            if (j47.t0(c, xl3, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
