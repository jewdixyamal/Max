package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* renamed from: ft6  reason: default package */
public final /* synthetic */ class ft6 implements Callable {
    public final /* synthetic */ re6 a;
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;

    public /* synthetic */ ft6(re6 re6, int i) {
        this.a = re6;
        this.c = i;
    }

    public final Object call() {
        WorkDatabase workDatabase = (WorkDatabase) this.a.b;
        Long j = workDatabase.u().j("next_job_scheduler_id");
        int i = 0;
        int longValue = j != null ? (int) j.longValue() : 0;
        if (longValue != Integer.MAX_VALUE) {
            i = longValue + 1;
        }
        workDatabase.u().p(new g7b("next_job_scheduler_id", Long.valueOf((long) i)));
        int i2 = this.b;
        if (i2 > longValue || longValue > this.c) {
            workDatabase.u().p(new g7b("next_job_scheduler_id", Long.valueOf((long) (i2 + 1))));
            longValue = i2;
        }
        return Integer.valueOf(longValue);
    }
}
