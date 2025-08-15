package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ga3  reason: default package */
public final class ga3 extends hu3 {
    public int X;
    public final /* synthetic */ y40 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ga3(y40 y40, Continuation continuation) {
        super(continuation);
        this.Y = y40;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
