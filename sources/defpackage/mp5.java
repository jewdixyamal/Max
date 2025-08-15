package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mp5  reason: default package */
public final class mp5 extends hu3 {
    public int X;
    public final /* synthetic */ jp5 Y;
    public Object Z;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mp5(jp5 jp5, Continuation continuation) {
        super(continuation);
        this.Y = jp5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d((on5) null, this);
    }
}
