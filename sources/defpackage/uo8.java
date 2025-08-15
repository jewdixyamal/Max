package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: uo8  reason: default package */
public final class uo8 extends hu3 {
    public final /* synthetic */ bp8 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo8(bp8 bp8, Continuation continuation) {
        super(continuation);
        this.X = bp8;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.r((Collection) null, this);
    }
}
