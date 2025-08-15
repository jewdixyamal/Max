package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ex9  reason: default package */
public final class ex9 extends ffe implements a66 {
    public final /* synthetic */ gx9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ex9(gx9 gx9, Continuation continuation) {
        super(2, continuation);
        this.X = gx9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ex9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ex9(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = gx9.C0;
        gx9 gx9 = this.X;
        long j = 0;
        if (((jp) gx9.q()).g.getLong("app.notification.dontDisturbUntil", 0) == 0) {
            j = -1;
        }
        ((jp) gx9.q()).l("app.notification.dontDisturbUntil", Long.valueOf(j));
        ? obj2 = new Object();
        obj2.b = new Long(j);
        ((pk) gx9.o.getValue()).a(new gaf(obj2));
        q0e q0e = gx9.x0;
        q0e.m((Object) null, new Integer(((Number) q0e.getValue()).intValue() + 1));
        return e5f.a;
    }
}
