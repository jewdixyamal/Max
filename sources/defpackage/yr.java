package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yr  reason: default package */
public final class yr extends ffe implements a66 {
    public final /* synthetic */ zr X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr(zr zrVar, Continuation continuation) {
        super(2, continuation);
        this.X = zrVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yr) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yr(this.X, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        od2.a0(obj);
        zr zrVar = this.X;
        bc7[] bc7Arr = zr.J0;
        ze0 ze0 = zrVar.w() ? this.X.z0 : this.X.y0;
        Collection<c62> values = (this.X.w() ? this.X.w0 : this.X.x0).values();
        ArrayList arrayList = new ArrayList(z53.S(values, 10));
        for (c62 c62 : values) {
            ze0 ze02 = c62.b;
            arrayList.add(new c62(Boolean.valueOf(tpa.f(ze0, ze02)), ze02, c62.c, c62.o));
        }
        q0e q0e = this.X.H0;
        do {
            value = q0e.getValue();
            List list = (List) value;
        } while (!q0e.c(value, arrayList));
        return e5f.a;
    }
}
