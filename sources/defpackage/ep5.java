package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ep5  reason: default package */
public final class ep5 extends hu3 {
    public int X;
    public final /* synthetic */ ac Y;
    public ac Z;
    public /* synthetic */ Object o;
    public on5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep5(ac acVar, Continuation continuation) {
        super(continuation);
        this.Y = acVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d((on5) null, this);
    }
}
