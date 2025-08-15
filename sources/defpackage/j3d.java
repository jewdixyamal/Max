package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j3d  reason: default package */
public final class j3d extends hu3 {
    public final /* synthetic */ q3d X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j3d(q3d q3d, Continuation continuation) {
        super(continuation);
        this.X = q3d;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.q(this);
    }
}
