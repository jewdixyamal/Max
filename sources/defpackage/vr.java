package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vr  reason: default package */
public final class vr extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zr Y;
    public int Z;
    public zr o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr(zr zrVar, Continuation continuation) {
        super(continuation);
        this.Y = zrVar;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.r(this);
    }
}
