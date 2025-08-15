package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ms8  reason: default package */
public final class ms8 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ns8 Y;
    public int Z;
    public ns8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms8(ns8 ns8, Continuation continuation) {
        super(continuation);
        this.Y = ns8;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.e((Set) null, this);
    }
}
