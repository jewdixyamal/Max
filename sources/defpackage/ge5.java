package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ge5  reason: default package */
public final class ge5 extends hu3 {
    public final /* synthetic */ he5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ge5(he5 he5, Continuation continuation) {
        super(continuation);
        this.X = he5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return he5.p(this.X, (List) null, this);
    }
}
