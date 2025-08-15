package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kp5  reason: default package */
public final class kp5 extends hu3 {
    public final /* synthetic */ zq X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kp5(zq zqVar, Continuation continuation) {
        super(continuation);
        this.X = zqVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a((Object) null, this);
    }
}
