package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dl1  reason: default package */
public final class dl1 extends hu3 {
    public int X;
    public final /* synthetic */ tk1 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl1(tk1 tk1, Continuation continuation) {
        super(continuation);
        this.Y = tk1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
