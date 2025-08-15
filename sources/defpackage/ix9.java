package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ix9  reason: default package */
public final class ix9 extends hu3 {
    public final /* synthetic */ qx9 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ix9(qx9 qx9, Continuation continuation) {
        super(continuation);
        this.X = qx9;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return qx9.a(this.X, (List) null, this);
    }
}
