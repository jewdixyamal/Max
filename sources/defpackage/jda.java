package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: jda  reason: default package */
public final class jda extends hu3 {
    public final /* synthetic */ kda X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jda(kda kda, Continuation continuation) {
        super(continuation);
        this.X = kda;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0, (List) null, this);
    }
}
