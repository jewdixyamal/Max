package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: txa  reason: default package */
public final class txa extends pnf {
    public final w7c X;
    public final q0e Y;
    public final w7c Z;
    public final sya b;
    public final qza c;
    public final q0e o;
    public final s35 s0 = new s35(0);
    public final q0e t0;
    public final w7c u0;

    public txa(Set set, sya sya, qza qza, kke kke) {
        this.b = sya;
        this.c = qza;
        q0e a = r0e.a(oz4.a);
        this.o = a;
        this.X = new w7c(a);
        q0e a2 = r0e.a(set);
        this.Y = a2;
        this.Z = new w7c(a2);
        lld.b(0, Integer.MAX_VALUE, 0, 4);
        q0e a3 = r0e.a("");
        this.t0 = a3;
        mn5 x = od2.x(od2.u(a3, 200));
        Object value = a3.getValue();
        this.u0 = od2.X(x, this.a, wld.a, value);
        od2.L(od2.F(od2.M(a2, new sxa(this, (Continuation) null)), ((w9a) kke).b()), this.a);
        qza.c(this.a);
    }

    public final void p() {
        this.c.a();
    }

    public final void q(long j, fza fza) {
        q0e q0e = this.Y;
        Set G0 = x53.G0((Iterable) q0e.getValue());
        boolean remove = G0.remove(Long.valueOf(j));
        qza qza = this.c;
        if (!remove) {
            G0.add(Long.valueOf(j));
            if (fza != null) {
                qza.b(new gza(j, fza));
            } else {
                qza.getClass();
            }
        } else {
            qza.e(j);
        }
        q0e.m((Object) null, G0);
    }
}
