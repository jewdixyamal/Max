package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bp5  reason: default package */
public final class bp5 extends hu3 {
    public int X;
    public final /* synthetic */ cp5 Y;
    public Object Z;
    public /* synthetic */ Object o;
    public on5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bp5(cp5 cp5, Continuation continuation) {
        super(continuation);
        this.Y = cp5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d((on5) null, this);
    }
}
