package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: g6e  reason: default package */
public final class g6e {
    public static final /* synthetic */ bc7[] j;
    public static final d6e k = new d6e(3, false, (List) null);
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public final q0e d;
    public final w7c e;
    public final q0e f;
    public final AtomicReference g = new AtomicReference(new c6e((String) null, 3));
    public vxd h;
    public final w4d i = mqd.D();

    static {
        oi9 oi9 = new oi9(g6e.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9};
    }

    public g6e(je7 je7, je7 je72, kke kke) {
        this.a = je7;
        this.b = je72;
        ContextScope a2 = j1e.a(((w9a) kke).b());
        this.c = a2;
        q0e a3 = r0e.a(k);
        this.d = a3;
        this.e = new w7c(a3);
        q0e a4 = r0e.a((Object) null);
        this.f = a4;
        od2.L(new zn5(od2.u(new jp5(a4, 0), 200), new shb(2, this, g6e.class, "searchSetsByQuery", "searchSetsByQuery(Ljava/lang/String;)V", 4, 15), 5), a2);
    }

    public final boolean a() {
        String str = ((c6e) this.g.get()).b;
        return !(str == null || str.length() == 0);
    }
}
