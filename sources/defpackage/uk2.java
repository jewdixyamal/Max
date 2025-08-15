package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uk2  reason: default package */
public final class uk2 extends hu3 {
    public int X;
    public final /* synthetic */ vk2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uk2(vk2 vk2, Continuation continuation) {
        super(continuation);
        this.Y = vk2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
