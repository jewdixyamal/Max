package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wz8  reason: default package */
public final class wz8 extends hu3 {
    public int X;
    public final /* synthetic */ jv7 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wz8(jv7 jv7, Continuation continuation) {
        super(continuation);
        this.Y = jv7;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
