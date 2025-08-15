package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: x5e  reason: default package */
public final class x5e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b6e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x5e(b6e b6e, Continuation continuation) {
        super(2, continuation);
        this.Z = b6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x5e) n((r0d) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x5e x5e = new x5e(this.Z, continuation);
        x5e.Y = obj;
        return x5e;
    }

    public final Object o(Object obj) {
        r0d r0d;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            r0d r0d2 = (r0d) this.Y;
            String name = this.Z.getClass().getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, name, ey8.j("Sets loader. Section with sets exist:", r0d2 != null), (Throwable) null);
            }
            if ((r0d2 instanceof d4e) && ((List) this.Z.d.getValue()).isEmpty()) {
                uqd c = ((a4e) this.Z.a.getValue()).c(((d4e) r0d2).c);
                this.Y = r0d2;
                this.X = 1;
                Object f = s36.f(c, this);
                if (f == tx3) {
                    return tx3;
                }
                r0d = r0d2;
                obj = f;
            }
            return e5f.a;
        } else if (i == 1) {
            r0d = (r0d) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Z.f.updateAndGet(new iz0(10, r0d));
        this.Z.d.m((Object) null, (List) obj);
        return e5f.a;
    }
}
