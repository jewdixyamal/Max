package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: no6  reason: default package */
public final class no6 extends ffe implements a66 {
    public final /* synthetic */ String X;
    public final /* synthetic */ oo6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no6(String str, oo6 oo6, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = oo6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((no6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new no6(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String str = this.X;
        boolean o0 = eae.o0(str, "Custom", false);
        e5f e5f = e5f.a;
        oo6 oo6 = this.Y;
        if (o0) {
            pnf.o(oo6.t0, new ko6(oo6.Y.getString("Custom", "")));
            return e5f;
        }
        boolean d = ((f5a) oo6.X.getValue()).d();
        p7b p7b = (p7b) oo6.q();
        p7b.a.c();
        p7b.b.c();
        p7b.c.c();
        p7b.d.c();
        p7b.e.c();
        ((p7b) oo6.q()).a.m("server.host", str);
        ((p7b) oo6.q()).a.m("server.port", "443");
        oo6.s0.setValue(oo6.r());
        s35 s35 = oo6.t0;
        if (d) {
            pnf.o(s35, lo6.a);
            o23 o23 = oo6.b;
            String str2 = (String) o23.b;
            hm9.m(str2, "execute", new Object[0]);
            ((av0) ((je7) o23.c).getValue()).d(new n23(o23));
            try {
                ((f5a) ((je7) o23.o).getValue()).g(true);
            } catch (Throwable th) {
                hm9.p(str2, "resetCache: failed", th);
            }
        }
        pnf.o(s35, jo6.a);
        return e5f;
    }
}
