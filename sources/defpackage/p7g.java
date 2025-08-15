package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: p7g  reason: default package */
public abstract class p7g {
    public final void a(WorkRequest workRequest) {
        List singletonList = Collections.singletonList(workRequest);
        s7g s7g = (s7g) this;
        if (!singletonList.isEmpty()) {
            new g7g(s7g, (String) null, h65.b, singletonList).l();
            return;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public abstract pma b(String str, int i, mta mta);
}
