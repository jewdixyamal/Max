package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oj4  reason: default package */
public final class oj4 extends ffe implements a66 {
    public final /* synthetic */ pj4 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oj4(pj4 pj4, Continuation continuation) {
        super(2, continuation);
        this.X = pj4;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oj4) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oj4(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, eaf] */
    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = pj4.s0;
        pj4 pj4 = this.X;
        int i = ((kxc) ((hp) pj4.c.getValue())).p() == 1 ? 0 : 1;
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        kxc kxc = (kxc) ((hp) pj4.c.getValue());
        kxc.k(i, "app.notification.dialogs.show");
        kxc.j.e(Integer.valueOf(i));
        ? obj2 = new Object();
        obj2.c = str;
        ((pk) pj4.b.getValue()).a(new gaf(obj2));
        pj4.X.setValue(pj4.q());
        return e5f.a;
    }
}
