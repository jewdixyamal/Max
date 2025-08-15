package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v96  reason: default package */
public final class v96 extends hu3 {
    public int X;
    public final /* synthetic */ i96 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v96(i96 i96, Continuation continuation) {
        super(continuation);
        this.Y = i96;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
