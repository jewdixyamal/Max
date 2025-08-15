package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: x3b  reason: default package */
public final class x3b extends ffe implements a66 {
    public Long X;
    public int Y;
    public final /* synthetic */ z3b Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x3b(z3b z3b, Continuation continuation) {
        super(2, continuation);
        this.Z = z3b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x3b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x3b(this.Z, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        e5f e5f = e5f.a;
        z3b z3b = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bh9 n = ((uh9) z3b.a).n();
            if (n == null) {
                return e5f;
            }
            Object obj2 = n.c.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
            l30 l30 = vu4.a;
            q0e q0e = z3b.e;
            if (l2 == null) {
                q0e.m((Object) null, new v50((Long) null, 0.0f, l30));
                return e5f;
            }
            AtomicReference atomicReference = z3b.h;
            long longValue = l2.longValue();
            ch9 ch9 = z3b.a;
            atomicReference.set(new gu0(longValue, ((uh9) ch9).y));
            if (((uh9) ch9).y) {
                this.X = l2;
                this.Y = 1;
                if (j47.x(300, this) == tx3) {
                    return tx3;
                }
                l = l2;
            } else {
                if (!ch9.b()) {
                    uh9 uh9 = (uh9) ch9;
                    if (uh9.x) {
                        l30 = sp3.a;
                    } else {
                        boolean z = uh9.w;
                        o84 o84 = o84.c;
                        if (z || uh9.v != 1) {
                            l30 = o84;
                        }
                    }
                }
                q0e.m((Object) null, new v50(l2, ((Number) ((uh9) ch9).H.a.getValue()).floatValue(), l30));
                return e5f;
            }
        } else if (i == 1) {
            l = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((gu0) z3b.h.get()).b) {
            long j = ((gu0) z3b.h.get()).a;
            if (l != null && j == l.longValue()) {
                z3b.e.m((Object) null, new v50(l, ((Number) ((uh9) z3b.a).H.a.getValue()).floatValue(), dp3.a));
            }
        }
        return e5f;
    }
}
