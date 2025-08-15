package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hna  reason: default package */
public final class hna extends ffe implements a66 {
    public final /* synthetic */ ina X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hna(ina ina, Continuation continuation) {
        super(2, continuation);
        this.X = ina;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hna) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hna(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = ina.s0;
        ina ina = this.X;
        boolean z = !((jp) ((hp) ina.c.getValue())).g.getBoolean("app.notification.show.new.users", true);
        ((jp) ((hp) ina.c.getValue())).j("app.notification.show.new.users", z);
        ? obj2 = new Object();
        obj2.a = Boolean.valueOf(z);
        ((pk) ina.b.getValue()).a(new gaf(obj2));
        ina.X.setValue(ina.q());
        return e5f.a;
    }
}
