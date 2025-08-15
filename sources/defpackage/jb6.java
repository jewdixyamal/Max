package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jb6  reason: default package */
public final class jb6 extends hu3 {
    public final /* synthetic */ mb6 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jb6(mb6 mb6, Continuation continuation) {
        super(continuation);
        this.X = mb6;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(this);
    }
}
