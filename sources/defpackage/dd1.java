package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: dd1  reason: default package */
public final class dd1 extends pnf {
    public final rg1 X;
    public final je7 Y;
    public final je7 Z;
    public final bd1 b;
    public final h7b c;
    public final m5d o;
    public volatile Long s0;
    public final q0e t0;
    public final w7c u0;
    public final s35 v0 = new s35(0);

    public dd1(bd1 bd1, h7b h7b, m5d m5d, hs1 hs1, rg1 rg1, je7 je7, je7 je72) {
        bd1 bd12 = bd1;
        this.b = bd12;
        this.c = h7b;
        this.o = m5d;
        this.X = rg1;
        this.Y = je72;
        this.Z = je7;
        q0e a = r0e.a(rc1.k);
        this.t0 = a;
        this.u0 = new w7c(a);
        CharSequence charSequence = null;
        od2.L(new zn5(new v7c(hs1.a), new yc1(this, (Continuation) null), 5), this.a);
        if (bd12 instanceof zc1) {
            r();
        } else if (bd12 instanceof ad1) {
            ad1 ad1 = (ad1) bd12;
            while (true) {
                q0e q0e = this.t0;
                Object value = q0e.getValue();
                rc1 rc1 = (rc1) value;
                boolean z = !ad1.c;
                CharSequence charSequence2 = ad1.d;
                CharSequence charSequence3 = z ? charSequence2 : charSequence;
                long j = ad1.a;
                Long valueOf = Long.valueOf(j);
                h7b h7b2 = this.c;
                uc0 b2 = h7b2.b(charSequence3, valueOf);
                jqe iqe = charSequence2 != null ? new iqe(charSequence2) : new eqe(t7a.k);
                String str = ad1.b;
                if (q0e.c(value, rc1.a(rc1, b2, c37.D(str), new pc1(h7b2.c(str)), iqe, rc1.j, kc1.a, false, Long.valueOf(j), 1))) {
                    break;
                }
                charSequence = null;
            }
            long j2 = ((ad1) this.b).a;
            se5 se5 = (se5) ((qe5) this.Y.getValue());
            se5.getClass();
            if (se5.n(PmsKey.f45groupcallchatsupport, false)) {
                w7c n = ((jz2) ((iy2) this.Z.getValue())).n(j2);
                int i = ft4.o;
                od2.L(od2.X(new zn5(od2.w(nu0.Q(n, z7.R(1, kt4.SECONDS)), new ai0(5)), new lq0(2, this, dd1.class, "updateActions", "updateActions(Lru/ok/tamtam/chats/Chat;)V", 4, 4), 5), this.a, wld.a, 0), this.a);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void q(long j) {
        int i = (j > ((long) r7a.c) ? 1 : (j == ((long) r7a.c) ? 0 : -1));
        if (i == 0) {
            r();
            return;
        }
        w7c w7c = this.u0;
        CharSequence charSequence = ((rc1) w7c.a.getValue()).c;
        s35 s35 = this.v0;
        if (charSequence == null) {
            pnf.o(s35, new ia1(new eqe(t7a.o)));
        } else if (j == ((long) r7a.b)) {
            Long l = ((rc1) w7c.a.getValue()).i;
            if (l != null) {
                long longValue = l.longValue();
                z71.c.getClass();
                wg0.k(":chats?id=" + longValue + "&type=server", s35);
            }
        } else if (j == ((long) r7a.a)) {
            CharSequence charSequence2 = ((rc1) w7c.a.getValue()).c;
            if (charSequence2 != null) {
                pnf.o(s35, new fa1(charSequence2));
            }
        } else if (j == ((long) r7a.d)) {
            pnf.o(s35, new ga1(charSequence));
        } else if (j == ((long) r7a.e)) {
            pnf.o(s35, new ha1(charSequence));
        } else if (j == ((long) r7a.f)) {
            this.X.j(charSequence.toString(), !((rc1) w7c.a.getValue()).h, false, ((rc1) w7c.a.getValue()).h, new x2((Object) this, 12, (Object) charSequence));
        } else if (i == 0) {
            r();
        }
    }

    public final void r() {
        if (((rc1) this.u0.a.getValue()).c == null && this.s0 == null) {
            j47.T(this.a, (lx3) null, (vx3) null, new cd1(this, (Continuation) null), 3);
            return;
        }
        String name = dd1.class.getName();
        boolean z = ((rc1) this.u0.a.getValue()).c != null;
        Long l = this.s0;
        hm9.m0(name, "Skip creating call link: callLink=" + z + " createJoinLinkRequestId=" + l, new Object[0]);
    }
}
