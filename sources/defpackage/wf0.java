package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wf0  reason: default package */
public final class wf0 extends hu3 {
    public int X;
    public on5 Y;
    public final /* synthetic */ zb Z;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wf0(zb zbVar, Continuation continuation) {
        super(continuation);
        this.Z = zbVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a((Object) null, this);
    }
}
