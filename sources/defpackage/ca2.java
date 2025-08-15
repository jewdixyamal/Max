package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: ca2  reason: default package */
public final class ca2 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ka2 Y;
    public int Z;
    public AtomicLong o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ca2(ka2 ka2, Continuation continuation) {
        super(continuation);
        this.Y = ka2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.h((String) null, (RectF) null, this);
    }
}
