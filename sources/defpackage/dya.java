package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dya  reason: default package */
public final class dya extends hu3 {
    public int X;
    public final /* synthetic */ p32 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dya(p32 p32, Continuation continuation) {
        super(continuation);
        this.Y = p32;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
