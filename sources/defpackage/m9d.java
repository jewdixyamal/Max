package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: m9d  reason: default package */
public final class m9d extends e9d {
    public h7b D0;

    public final long z(long j, e52 e52) {
        ti5 ti5;
        long j2;
        l20 a;
        h7b h7b = this.D0;
        si5 si5 = si5.a;
        if (h7b != null) {
            ((CountDownLatch) h7b.b).await(MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS);
            ti5 = (ti5) ((AtomicReference) h7b.c).get();
            if (ti5 == null) {
                ti5 = si5;
            }
        } else {
            ti5 = null;
        }
        if (tpa.f(ti5, si5)) {
            j2 = super.z(j, e52);
        } else {
            cu8 q = o().q(j);
            if (q == null || (a = q.a(g20.o)) == null) {
                return 0;
            }
            n().u(q, a.r, d20.o);
            j2 = 0;
        }
        this.D0 = null;
        return j2;
    }
}
