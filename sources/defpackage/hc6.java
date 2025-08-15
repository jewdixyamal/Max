package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hc6  reason: default package */
public final class hc6 extends hu3 {
    public final /* synthetic */ jc6 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hc6(jc6 jc6, Continuation continuation) {
        super(continuation);
        this.X = jc6;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return jc6.b(this.X, 0, (List) null, this);
    }
}
