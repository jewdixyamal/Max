package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: r44  reason: default package */
public final class r44 {
    public static final /* synthetic */ int g = 0;
    public final q44 a;
    public final Runnable b;
    public final m56 c;
    public final ztc d;
    public final xpb e = new xpb();
    public sd7 f;

    static {
        int i = ft4.o;
        z7.R(100, kt4.MILLISECONDS);
    }

    public r44(q44 q44, yh0 yh0, m56 m56) {
        ztc a2 = muc.a();
        this.a = q44;
        this.b = yh0;
        this.c = m56;
        this.d = a2;
        a();
    }

    public final void a() {
        q44 q44 = this.a;
        if (q44 instanceof q44) {
            r0a n = this.e.t(ft4.e(q44.a), TimeUnit.MILLISECONDS).n(this.d);
            sd7 sd7 = new sd7(new rxd(12, this), new o9g(12, (Object) this), ft.d);
            n.a(sd7);
            this.f = sd7;
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
