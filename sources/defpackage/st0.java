package defpackage;

import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: st0  reason: default package */
public final /* synthetic */ class st0 implements c66 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ zt0 b;
    public final /* synthetic */ z3d c;

    public /* synthetic */ st0(Object obj, zt0 zt0, z3d z3d) {
        this.a = obj;
        this.b = zt0;
        this.c = z3d;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        lx3 lx3 = (lx3) obj3;
        Symbol symbol = bu0.l;
        Object obj4 = this.a;
        if (obj4 != symbol) {
            OnUndeliveredElementKt.callUndeliveredElement(this.b.b, obj4, ((y3d) this.c).a);
        }
        return e5f.a;
    }
}
