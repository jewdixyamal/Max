package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: ag9  reason: default package */
public final class ag9 extends hu3 {
    public kl7 X;
    public kl7 Y;
    public /* synthetic */ Object Z;
    public eg9 o;
    public final /* synthetic */ eg9 s0;
    public int t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag9(eg9 eg9, Continuation continuation) {
        super(continuation);
        this.s0 = eg9;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return this.s0.c((MessageModel) null, this);
    }
}
