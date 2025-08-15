package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: uc8  reason: default package */
public final class uc8 extends hu3 {
    public final /* synthetic */ yc8 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uc8(yc8 yc8, Continuation continuation) {
        super(continuation);
        this.X = yc8;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b((es8) null, (Set) null, (Long) null, this);
    }
}
