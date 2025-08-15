package defpackage;

import android.app.Application;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: i00  reason: default package */
public final class i00 {
    public static final /* synthetic */ bc7[] f;
    public final d00 a;
    public final Application b;
    public final ContextScope c;
    public final w4d d = mqd.D();
    public final q0e e = r0e.a((Object) null);

    static {
        oi9 oi9 = new oi9(i00.class, "updateAttachJob", "getUpdateAttachJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        f = new bc7[]{oi9};
    }

    public i00(kke kke, d00 d00, Application application) {
        this.a = d00;
        this.b = application;
        this.c = j1e.a(((w9a) kke).a());
    }

    public final b00 a(r5c r5c) {
        Long l;
        boolean z = r5c instanceof n5c;
        Application application = this.b;
        if (z) {
            n5c n5c = (n5c) r5c;
            float f2 = n5c.c;
            Long l2 = n5c.e;
            long longValue = (l2 == null || (l = n5c.f) == null || l2.longValue() != 0) ? n5c.d : (long) ((f2 / ((float) 100)) * ((float) l.longValue()));
            long j = n5c.b;
            return new xz(n5c.a, f2, j > 0 ? new iqe(rh4.j(are.w(longValue, false, application), "/", are.v(j, are.m(j), true, application))) : new eqe(oda.t));
        } else if (r5c instanceof q5c) {
            q5c q5c = (q5c) r5c;
            float f3 = (float) q5c.b;
            float f4 = q5c.c;
            String w = are.w((long) ((f4 / ((float) 100)) * f3), false, application);
            long j2 = q5c.b;
            return new a00(q5c.a, f4, new iqe(rh4.j(w, "/", are.v(j2, are.m(j2), true, application))));
        } else if (r5c instanceof o5c) {
            o5c o5c = (o5c) r5c;
            return new yz(o5c.a, new iqe(are.w(o5c.b, true, application)));
        } else if (r5c instanceof p5c) {
            p5c p5c = (p5c) r5c;
            return new zz(p5c.a, new iqe(are.w(p5c.b, true, application)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
