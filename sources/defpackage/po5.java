package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: po5  reason: default package */
public final class po5 extends hu3 {
    public int X;
    public final /* synthetic */ qn5 Y;
    public on5 Z;
    public /* synthetic */ Object o;
    public Iterator s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public po5(qn5 qn5, Continuation continuation) {
        super(continuation);
        this.Y = qn5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.d((on5) null, this);
    }
}
