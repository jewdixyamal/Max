package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: f89  reason: default package */
public final class f89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f89(l89 l89, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = l89;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f89(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.i;
            long j = this.Z;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, ey8.h(j, "Scrolling to requested message with id="), (Throwable) null);
            }
            l89 l89 = this.Y;
            long j2 = this.Z;
            this.X = 1;
            if (l89.a(l89, j2, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
