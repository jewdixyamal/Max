package defpackage;

import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ns1  reason: default package */
public final class ns1 extends ffe implements a66 {
    public final /* synthetic */ List X;
    public final /* synthetic */ m5d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ns1(List list, m5d m5d, Continuation continuation) {
        super(2, continuation);
        this.X = list;
        this.Y = m5d;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ns1) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ns1(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        for (al6 al6 : this.X) {
            boolean z = al6 instanceof wk6;
            m5d m5d = this.Y;
            if (z) {
                wk6 wk6 = (wk6) al6;
                ((s8g) ((je7) m5d.c).getValue()).a(new k8d(wk6.b, wk6.d, (da3) null, false, mg4.REGULAR));
            } else if (al6 instanceof yk6) {
                yk6 yk6 = (yk6) al6;
                ((s8g) ((je7) m5d.c).getValue()).a(new k8d(yk6.b, yk6.c, (da3) null, false, mg4.REGULAR));
            } else if (al6 instanceof xk6) {
                String str = ((xk6) al6).d;
                uqd h = ((hd1) ((je7) m5d.o).getValue()).a.n().h(yb9.a);
                gd1 gd1 = new gd1(0, str);
                uy1 uy1 = new uy1(1);
                Objects.requireNonNull(uy1, "observer is null");
                try {
                    iq1 iq1 = new iq1(uy1, 7, gd1);
                    uy1.c(iq1);
                    h.k(iq1);
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else if (!(al6 instanceof zk6)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
