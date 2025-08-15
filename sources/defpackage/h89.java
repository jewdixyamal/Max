package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h89  reason: default package */
public final class h89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h89(l89 l89, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = l89;
        this.Z = j;
        this.s0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h89(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.i;
            long j = this.Z;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, ey8.h(j, "Scrolling to unread message with sortTime="), (Throwable) null);
            }
            l89 l89 = this.Y;
            long j2 = this.Z;
            long j3 = this.s0;
            this.X = 1;
            l89.d(l89, j2, j3, false, 1, 4);
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
