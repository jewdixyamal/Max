package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: tca  reason: default package */
public final class tca extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ uca Y;
    public int Z;
    public Iterator o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tca(uca uca, Continuation continuation) {
        super(continuation);
        this.Y = uca;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.k(this);
    }
}
