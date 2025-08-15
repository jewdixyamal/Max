package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ome  reason: default package */
public final class ome {
    public final mle a;

    public ome(mle mle) {
        this.a = mle;
    }

    public static long a(mle mle, mme mme) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "ome", "execute " + mme, (Throwable) null);
        }
        if (mme.b) {
            ol olVar = mme.a;
            long j = mme.d;
            int i = mme.e;
            tle tle = (tle) mle;
            tle.getClass();
            if (olVar instanceof hua) {
                ((iba) tle.u0.getValue()).c().execute(new ole(tle, olVar, j, i));
                return olVar.a;
            }
            throw new IllegalArgumentException("task must be instance of PersistableTask");
        }
        ol olVar2 = mme.a;
        return ((tle) mle).b(olVar2, (lme) olVar2, mme.c);
    }

    public static long b(ome ome, ol olVar) {
        ome.getClass();
        return a(ome.a, new mme(olVar, false, false, 0, 0));
    }

    public static /* synthetic */ long d(ome ome, ol olVar, boolean z, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return ome.c(olVar, z, 0, i);
    }

    public final long c(ol olVar, boolean z, long j, int i) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            StringBuilder sb = new StringBuilder("executeAndSave ");
            ol olVar2 = olVar;
            sb.append(olVar);
            sb.append(", ");
            boolean z2 = z;
            sb.append(z);
            sb.append(", ");
            sb.append(j);
            sb.append(", ");
            sb.append(i);
            ir6.d(us7, "ome", sb.toString(), (Throwable) null);
        } else {
            ol olVar3 = olVar;
            boolean z3 = z;
            long j2 = j;
            int i2 = i;
        }
        mme mme = new mme(olVar, true, z, j, i);
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us72 = us7.X;
            ir62.d(us72, "ome", "tamService != null, execute task " + mme + " ", (Throwable) null);
        }
        return a(this.a, mme);
    }

    public final Object e(dle dle, Continuation continuation) {
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        nme nme = new nme(sy1);
        tle tle = (tle) this.a;
        je7 je7 = tle.x0;
        ((yle) je7.getValue()).f(false);
        gaa gaa = new gaa((Object) nme);
        yle yle = (yle) je7.getValue();
        long d = tle.d(dle);
        x9d x9d = (x9d) yle.Y.get();
        if (x9d != null && !yle.e(dle, gaa)) {
            x9d.i(dle, false, d, gaa);
        }
        return sy1.m();
    }
}
