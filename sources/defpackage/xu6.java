package defpackage;

import java.io.File;

/* renamed from: xu6  reason: default package */
public final class xu6 extends li0 {
    public final /* synthetic */ zu6 a;
    public final /* synthetic */ wv6 b;
    public final /* synthetic */ av6 c;

    public xu6(av6 av6, zu6 zu6, wv6 wv6) {
        this.c = av6;
        this.a = zu6;
        this.b = wv6;
    }

    public final void e(g0 g0Var) {
        this.c.b(this.a);
    }

    public final void f(g0 g0Var) {
        if (g0Var.h()) {
            o43 o43 = (o43) g0Var.e();
            zu6 zu6 = this.a;
            av6 av6 = this.c;
            if (o43 == null) {
                av6.b(zu6);
                return;
            }
            q5b q5b = new q5b((qq8) o43.e0());
            try {
                je7 je7 = pu6.d;
                String str = i24.o(q5b).b;
                if ("webp".equalsIgnoreCase(str)) {
                    s36.o().a(this.b, (Object) null).m(new yu6(av6, zu6, (zi5) av6.a.getValue()), qq1.a);
                } else {
                    File a2 = ((zi5) av6.a.getValue()).a(str);
                    s5c.I(q5b, a2);
                    String absolutePath = a2.getAbsolutePath();
                    if (zu6 != null) {
                        av6.c(new vs5(zu6, 6, absolutePath));
                    }
                }
            } catch (Exception e) {
                hm9.p("av6", "onNewResultImpl: failed to save image", e);
                av6.b(zu6);
            } catch (Throwable th) {
                q43.b(q5b);
                o43.S(o43);
                throw th;
            }
            q43.b(q5b);
            o43.S(o43);
        }
    }
}
