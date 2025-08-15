package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: ueg  reason: default package */
public final class ueg implements wsa {
    public final /* synthetic */ pag a;
    public final /* synthetic */ qne b;
    public final /* synthetic */ qx7 c;

    public ueg(BasePendingResult basePendingResult, qne qne, qx7 qx7) {
        this.a = basePendingResult;
        this.b = qne;
        this.c = qx7;
    }

    public final void a(Status status) {
        rjc rjc;
        if (status.a <= 0) {
            pag pag = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) pag;
            fp3.p("Result has already been consumed.", !basePendingResult.k);
            try {
                if (!basePendingResult.f.await(0, timeUnit)) {
                    basePendingResult.Q(Status.s0);
                }
            } catch (InterruptedException unused) {
                basePendingResult.Q(Status.Y);
            }
            fp3.p("Result is not ready.", basePendingResult.R());
            synchronized (basePendingResult.e) {
                fp3.p("Result has already been consumed.", !basePendingResult.k);
                fp3.p("Result is not ready.", basePendingResult.R());
                rjc = basePendingResult.i;
                basePendingResult.i = null;
                basePendingResult.k = true;
            }
            au1.r(basePendingResult.h.getAndSet((Object) null));
            fp3.n(rjc);
            this.b.b(this.c.c(rjc));
            return;
        }
        this.b.a(i24.k(status));
    }
}
