package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d89  reason: default package */
public final class d89 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l89 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d89(l89 l89, Continuation continuation) {
        super(2, continuation);
        this.Y = l89;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d89) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d89(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.i;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "Scrolling to first reacted message", (Throwable) null);
            }
            axc axc = ((bxc) this.Y.m.getValue()).d;
            if (axc != null) {
                long j = axc.b;
                l89 l89 = this.Y;
                this.X = 1;
                l89.d(l89, j, 0, false, 0, 14);
                if (e5f == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
