package defpackage;

import java.util.Objects;
import java.util.Set;

/* renamed from: ce3  reason: default package */
public interface ce3 {
    static void H(mi9 mi9, ce3 ce3, ce3 ce32, aa0 aa0) {
        if (Objects.equals(aa0, ev6.J)) {
            kic kic = (kic) ce32.f(aa0, (Object) null);
            kic kic2 = (kic) ce3.f(aa0, (Object) null);
            be3 q = ce32.q(aa0);
            if (kic != null) {
                if (kic2 != null) {
                    fm5 fm5 = kic.a;
                    if (fm5 == null) {
                        fm5 = kic2.a;
                    }
                    lic lic = kic.b;
                    if (lic == null) {
                        lic = kic2.b;
                    }
                    int i = kic.c;
                    if (i == 0) {
                        i = kic2.c;
                    }
                    kic2 = new kic(fm5, lic, i);
                }
                mi9.d(aa0, q, kic);
                return;
            }
            kic = kic2;
            mi9.d(aa0, q, kic);
            return;
        }
        mi9.d(aa0, ce32.q(aa0), ce32.h(aa0));
    }

    static wma K(ce3 ce3, ce3 ce32) {
        if (ce3 == null && ce32 == null) {
            return wma.c;
        }
        mi9 c = ce32 != null ? mi9.c(ce32) : mi9.b();
        if (ce3 != null) {
            for (aa0 H : ce3.g()) {
                H(c, ce32, ce3, H);
            }
        }
        return wma.a(c);
    }

    void e(f9 f9Var);

    Object f(aa0 aa0, Object obj);

    Set g();

    Object h(aa0 aa0);

    Set i(aa0 aa0);

    Object l(aa0 aa0, be3 be3);

    boolean o(aa0 aa0);

    be3 q(aa0 aa0);
}
