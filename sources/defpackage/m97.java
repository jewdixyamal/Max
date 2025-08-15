package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m97  reason: default package */
public final class m97 extends hu3 {
    public int X;
    public final /* synthetic */ zb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m97(zb zbVar, Continuation continuation) {
        super(continuation);
        this.Y = zbVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
