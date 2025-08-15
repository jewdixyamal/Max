package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: lta  reason: default package */
public final class lta extends WorkRequest.Builder {
    public lta(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        h8g workSpec$work_runtime_release = getWorkSpec$work_runtime_release();
        long millis = timeUnit.toMillis(j);
        workSpec$work_runtime_release.getClass();
        int i = (millis > 900000 ? 1 : (millis == 900000 ? 0 : -1));
        String str = h8g.u;
        if (i < 0) {
            a14.u().R(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long c = ote.c(millis, 900000);
        long c2 = ote.c(millis, 900000);
        if (c < 900000) {
            a14.u().R(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        workSpec$work_runtime_release.h = ote.c(c, 900000);
        if (c2 < 300000) {
            a14.u().R(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (c2 > workSpec$work_runtime_release.h) {
            a14 u = a14.u();
            u.R(str, "Flex duration greater than interval duration; Changed to " + c);
        }
        workSpec$work_runtime_release.i = ote.f(c2, 300000, workSpec$work_runtime_release.h);
    }

    public final WorkRequest buildInternal$work_runtime_release() {
        if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().j.c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        } else if (!getWorkSpec$work_runtime_release().q) {
            return new WorkRequest(getId$work_runtime_release(), getWorkSpec$work_runtime_release(), getTags$work_runtime_release());
        } else {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
    }

    public final WorkRequest.Builder getThisObject$work_runtime_release() {
        return this;
    }
}
