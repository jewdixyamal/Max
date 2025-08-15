package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: i32  reason: default package */
public final class i32 implements r29 {
    public static List b(jqe jqe, eqe eqe, e52 e52) {
        String g = e52.g(kk0.b, jk0.a);
        e52.l0();
        return Collections.singletonList(new v92(jqe, eqe, g, e52.x0, e52.f(), (List) null, 96));
    }

    public final List a(e52 e52) {
        return (e52 == null || !e52.I()) ? nz4.a : e52.b0() ? b(new eqe(oda.J0), new eqe(oda.I0), e52) : e52.Z() ? b(new iqe(e52.q()), new eqe(oda.K0), e52) : b(new iqe(e52.q()), new eqe(oda.L0), e52);
    }
}
