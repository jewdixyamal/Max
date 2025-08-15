package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: rj  reason: default package */
public final class rj {
    public static final /* synthetic */ bc7[] k;
    public final String a = rj.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final ContextScope h;
    public final w4d i;
    public final boolean j;

    static {
        oi9 oi9 = new oi9(rj.class, "invalidateCacheJob", "getInvalidateCacheJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        k = new bc7[]{oi9};
    }

    public rj(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, ri4 ri4, kke kke) {
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        this.f = je75;
        this.g = je76;
        this.h = j1e.a(((w9a) kke).a().plus(new qj(this)));
        this.i = mqd.D();
        this.j = ri4.b().compareTo(vi4.o) >= 0;
    }

    public final boolean a() {
        if (!((jp) ((hp) this.c.getValue())).g.getBoolean("app.media.animoji.enabled", this.j)) {
            return false;
        }
        qyc qyc = (qyc) ((y7d) this.b.getValue());
        qyc.getClass();
        return qyc.n(PmsKey.f21chatanimojienabled, false);
    }
}
