package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cx9  reason: default package */
public final class cx9 extends ffe implements a66 {
    public final /* synthetic */ gx9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cx9(gx9 gx9, Continuation continuation) {
        super(2, continuation);
        this.X = gx9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((cx9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cx9(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = gx9.C0;
        gx9 gx9 = this.X;
        ((jp) gx9.q()).j("app.notification.show.text", !((jp) gx9.q()).g.getBoolean("app.notification.show.text", true));
        ((cea) gx9.Y.getValue()).c();
        q0e q0e = gx9.x0;
        q0e.m((Object) null, new Integer(((Number) q0e.getValue()).intValue() + 1));
        return e5f.a;
    }
}
