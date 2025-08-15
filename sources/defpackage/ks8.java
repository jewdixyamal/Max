package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ks8  reason: default package */
public final class ks8 extends hu3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ns8 Z;
    public ns8 o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ks8(ns8 ns8, Continuation continuation) {
        super(continuation);
        this.Z = ns8;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.c(0, this);
    }
}
