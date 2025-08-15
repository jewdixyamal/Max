package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: wo7  reason: default package */
public final class wo7 extends hu3 {
    public final /* synthetic */ yo7 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo7(yo7 yo7, Continuation continuation) {
        super(continuation);
        this.X = yo7;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.q((ArrayList) null, this);
    }
}
