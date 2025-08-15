package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: vm2  reason: default package */
public final class vm2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cn2 Y;
    public int Z;
    public AtomicLong o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm2(cn2 cn2, Continuation continuation) {
        super(continuation);
        this.Y = cn2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c((String) null, (RectF) null, this);
    }
}
