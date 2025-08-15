package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: k01  reason: default package */
public final class k01 extends pnf implements zl1 {
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final ir1 b;
    public final je7 c;
    public final je7 o;
    public final w7c s0;
    public final s35 t0 = new s35(0);

    public k01(je7 je7, ir1 ir1, je7 je72, je7 je73, je7 je74) {
        this.b = ir1;
        this.c = je72;
        this.o = je73;
        this.X = je7;
        this.Y = je74;
        q0e a = r0e.a(nz4.a);
        this.Z = a;
        this.s0 = new w7c(a);
        ez0 ez0 = (ez0) je72.getValue();
        ez0.getClass();
        r((aa) ((yz0) ez0).F0.getValue());
        od2.L(new zn5(((yz0) ((ez0) je72.getValue())).D0, new i01(this, (Continuation) null), 5), this.a);
        od2.L(new zn5(((yz0) ((ez0) je72.getValue())).F0, new j01(this, (Continuation) null), 5), this.a);
        ((wr1) ((kr1) je7.getValue())).d(this);
    }

    public final void i() {
        pnf.o(this.t0, aj1.D);
    }

    public final ez0 q() {
        return (ez0) this.c.getValue();
    }

    public final void r(aa aaVar) {
        k01 k01 = this;
        aa aaVar2 = aaVar;
        while (true) {
            q0e q0e = k01.Z;
            Object value = q0e.getValue();
            List list = (List) value;
            kl7 l = j1e.l();
            eqe eqe = new eqe(b8a.t);
            int i = z7a.c;
            l.add(new f01(0, eqe));
            e01 e01 = r7;
            e01 e012 = new e01(1, new eqe(b8a.f), 0, (long) y7a.a, (eqe) null, new ffd(aaVar2.b, true), Integer.valueOf(x7a.h), HttpStatus.SC_NOT_MODIFIED);
            l.add(e01);
            e01 e013 = r6;
            e01 e014 = new e01(2, new eqe(b8a.h), 0, (long) y7a.h, (eqe) null, new ffd(aaVar2.c, true), Integer.valueOf(x7a.k), HttpStatus.SC_NOT_MODIFIED);
            l.add(e013);
            je7 je7 = k01.o;
            se5 se5 = (se5) ((qe5) je7.getValue());
            se5.getClass();
            if (se5.n(PmsKey.gsse, false)) {
                int i2 = x7a.t;
                eqe eqe2 = new eqe(b8a.y);
                ffd ffd = new ffd(aaVar2.d, true);
                l.add(new e01(2, eqe2, 0, (long) y7a.j, (eqe) null, ffd, Integer.valueOf(i2), HttpStatus.SC_NOT_MODIFIED));
            }
            se5 se52 = (se5) ((qe5) je7.getValue());
            se52.getClass();
            if (se52.n(PmsKey.grse, false)) {
                e01 e015 = r8;
                e01 e016 = new e01(3, new eqe(b8a.w), 0, (long) y7a.i, (eqe) null, new ffd(aaVar2.e, true), Integer.valueOf(x7a.l), HttpStatus.SC_NOT_MODIFIED);
                l.add(e015);
            }
            l.add(new g01(new eqe(b8a.u)));
            se5 se53 = (se5) ((qe5) je7.getValue());
            se53.getClass();
            if (se53.n(PmsKey.gcwre, false)) {
                l.add(new f01(1, new eqe(b8a.j)));
                e01 e017 = r6;
                e01 e018 = new e01(4, new eqe(b8a.A), 1, (long) y7a.k, new eqe(b8a.B), new ffd(aaVar2.g, true), Integer.valueOf(x7a.I0), 272);
                l.add(e017);
            }
            if (!q0e.c(value, j1e.d(l))) {
                k01 = this;
            } else {
                return;
            }
        }
    }
}
