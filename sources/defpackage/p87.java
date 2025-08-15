package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: p87  reason: default package */
public final class p87 extends hu3 {
    public Iterator X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ q40 Z;
    public ConcurrentHashMap o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p87(q40 q40, Continuation continuation) {
        super(continuation);
        this.Z = q40;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.b(this);
    }
}
