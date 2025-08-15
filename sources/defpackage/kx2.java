package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kx2  reason: default package */
public final class kx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nx2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kx2(nx2 nx2, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kx2) n((gi9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kx2 kx2 = new kx2(this.Y, continuation);
        kx2.X = obj;
        return kx2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gi9 gi9 = (gi9) this.X;
        xb9 xb9 = (xb9) this.Y.B0.getValue();
        xb9.getClass();
        if (!gi9.i()) {
            List b = xb9.b(gi9);
            if (!b.isEmpty()) {
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "MissedContactsController", zr6.i("requestForChatListScreen: ids=[", x53.n0(b, (String) null, (String) null, (String) null, (m56) null, 63), "]"), (Throwable) null);
                }
                xb9.h().d(b);
            }
        }
        return e5f.a;
    }
}
