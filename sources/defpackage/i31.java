package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i31  reason: default package */
public final class i31 extends hu3 {
    public int X;
    public on5 Y;
    public final /* synthetic */ y40 Z;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i31(y40 y40, Continuation continuation) {
        super(continuation);
        this.Z = y40;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a((Object) null, this);
    }
}
