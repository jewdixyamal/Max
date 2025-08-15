package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: o8  reason: default package */
public final class o8 extends ffe implements a66 {
    public h7b X;
    public Iterator Y;
    public int Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ h7b t0;
    public final /* synthetic */ List u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o8(h7b h7b, List list, Continuation continuation) {
        super(2, continuation);
        this.t0 = h7b;
        this.u0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o8 o8Var = new o8(this.t0, this.u0, continuation);
        o8Var.s0 = obj;
        return o8Var;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        h7b h7b;
        Iterator it;
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.s0;
            String str = (String) this.t0.c;
            List list = this.u0;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Y, str, "invoke for ".concat(x53.n0(list, ",", "[", "]", n8.a, 24)), (Throwable) null);
            }
            qp4 b = qp4.u0.b((Context) this.t0.b);
            r1f r1f = new r1f(l6d.a0(l6d.f0(l6d.e0(new at(2, this.u0), new k8(2)), new l(1, b)), new k8(3)), new k8(4));
            fka i2 = b.i();
            r1f f0 = l6d.f0(v3c.F(r1f, new k8(0), new l8(0, i2)), new l8(1, i2));
            h7b = this.t0;
            it = new q1f(f0);
            sx3 = sx32;
        } else if (i == 1) {
            it = this.Y;
            h7b = this.X;
            sx3 = (sx3) this.s0;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            View view = (View) it.next();
            String str2 = (String) h7b.c;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                us7 us7 = us7.X;
                try {
                    obj2 = ((Context) h7b.b).getResources().getResourceName(view.getId());
                } catch (Throwable th) {
                    obj2 = new njc(th);
                }
                if (obj2 instanceof njc) {
                    obj2 = null;
                }
                ir62.d(us7, str2, rh4.k("colorized ", (String) obj2, "/", view.getClass().getSimpleName()), (Throwable) null);
            }
            this.s0 = sx3;
            this.X = h7b;
            this.Y = it;
            this.Z = 1;
            if (i24.L(this) == tx3) {
                return tx3;
            }
        }
        return e5f.a;
    }
}
