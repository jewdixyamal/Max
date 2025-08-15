package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ttf  reason: default package */
public final class ttf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ttf(ouf ouf, Continuation continuation) {
        super(2, continuation);
        this.Y = ouf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ttf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ttf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            w97 w97 = this.Y.l;
            if (w97 instanceof hn0) {
                this.X = 1;
                if (ouf.b(this.Y, (hn0) w97, this) == tx3) {
                    return tx3;
                }
            } else if (w97 instanceof ln0) {
                this.X = 2;
                if (ouf.d(this.Y, (ln0) w97, this) == tx3) {
                    return tx3;
                }
            } else if (w97 instanceof in0) {
                this.X = 3;
                if (ouf.c(this.Y, (in0) w97, this) == tx3) {
                    return tx3;
                }
            } else {
                w97 w972 = this.Y.l;
                if (w972 != null) {
                    w972.b(new s0());
                }
            }
        } else if (i == 1 || i == 2 || i == 3) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y.l = null;
        return e5f.a;
    }
}
