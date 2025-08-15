package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Collections;

/* renamed from: jqd  reason: default package */
public final class jqd implements pi4 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object d;

    public jqd(iqe iqe, int i, fyc fyc) {
        this.c = fyc;
        long incrementAndGet = ei4.b.incrementAndGet();
        this.b = incrementAndGet;
        this.d = new w7c(r0e.a(Collections.singletonList(new b54(incrementAndGet, iqe, i, (jqe) null, y44.e, 8))));
    }

    public final j0e c() {
        switch (this.a) {
            case 0:
                return (w7c) this.d;
            default:
                return (q0e) this.d;
        }
    }

    public final void d(b54 b54) {
        switch (this.a) {
            case 0:
                if (ei4.a(b54.a, this.b)) {
                    ((k56) this.c).invoke();
                    return;
                }
                return;
            default:
                if (ei4.a(b54.a, this.b)) {
                    gi4.b.getClass();
                    ((f64) ((je7) this.c).getValue()).b(m64.a(gi4.j.a), (Bundle) null);
                    return;
                }
                return;
        }
    }

    public jqd(Context context, je7 je7) {
        this.c = je7;
        long incrementAndGet = ei4.b.incrementAndGet();
        this.b = incrementAndGet;
        this.d = r0e.a(Collections.singletonList(new b54(incrementAndGet, new iqe(qp4.u0.b(context).g().a), woc.r0, new iqe("Смена темы"), (fp3) null, 16)));
    }
}
