package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final fm7 b() {
        xlc xlc;
        die die;
        k8g k8g;
        y7g y7g;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        WorkDatabase workDatabase = s7g.d(getApplicationContext()).c;
        i8g y = workDatabase.y();
        y7g w = workDatabase.w();
        k8g z6 = workDatabase.z();
        die v = workDatabase.v();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);
        y.getClass();
        xlc a = xlc.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a.j(1, currentTimeMillis);
        ilc ilc = (ilc) y.a;
        ilc.b();
        Cursor o = ilc.o(a, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "state");
            int n3 = tfg.n(o, "worker_class_name");
            int n4 = tfg.n(o, "input_merger_class_name");
            int n5 = tfg.n(o, "input");
            int n6 = tfg.n(o, "output");
            int n7 = tfg.n(o, "initial_delay");
            int n8 = tfg.n(o, "interval_duration");
            int n9 = tfg.n(o, "flex_duration");
            int n10 = tfg.n(o, "run_attempt_count");
            die die2 = v;
            int n11 = tfg.n(o, "backoff_policy");
            y7g y7g2 = w;
            int n12 = tfg.n(o, "backoff_delay_duration");
            k8g k8g2 = z6;
            int n13 = tfg.n(o, "last_enqueue_time");
            i8g i8g = y;
            int n14 = tfg.n(o, "minimum_retention_duration");
            xlc = a;
            try {
                int n15 = tfg.n(o, "schedule_requested_at");
                int n16 = tfg.n(o, "run_in_foreground");
                int n17 = tfg.n(o, "out_of_quota_policy");
                int n18 = tfg.n(o, "period_count");
                int n19 = tfg.n(o, "generation");
                int n20 = tfg.n(o, "required_network_type");
                int n21 = tfg.n(o, "requires_charging");
                int n22 = tfg.n(o, "requires_device_idle");
                int n23 = tfg.n(o, "requires_battery_not_low");
                int n24 = tfg.n(o, "requires_storage_not_low");
                int n25 = tfg.n(o, "trigger_content_update_delay");
                int n26 = tfg.n(o, "trigger_max_content_delay");
                int n27 = tfg.n(o, "content_uri_triggers");
                int i6 = n14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(n) ? null : o.getString(n);
                    m7g v2 = nu0.v(o.getInt(n2));
                    String string2 = o.isNull(n3) ? null : o.getString(n3);
                    String string3 = o.isNull(n4) ? null : o.getString(n4);
                    d24 a2 = d24.a(o.isNull(n5) ? null : o.getBlob(n5));
                    d24 a3 = d24.a(o.isNull(n6) ? null : o.getBlob(n6));
                    long j = o.getLong(n7);
                    long j2 = o.getLong(n8);
                    long j3 = o.getLong(n9);
                    int i7 = o.getInt(n10);
                    mf0 s = nu0.s(o.getInt(n11));
                    long j4 = o.getLong(n12);
                    long j5 = o.getLong(n13);
                    int i8 = i6;
                    long j6 = o.getLong(i8);
                    int i9 = n11;
                    int i10 = n15;
                    long j7 = o.getLong(i10);
                    n15 = i10;
                    int i11 = n16;
                    if (o.getInt(i11) != 0) {
                        n16 = i11;
                        i = n17;
                        z = true;
                    } else {
                        n16 = i11;
                        i = n17;
                        z = false;
                    }
                    jna u = nu0.u(o.getInt(i));
                    n17 = i;
                    int i12 = n18;
                    int i13 = o.getInt(i12);
                    n18 = i12;
                    int i14 = n19;
                    int i15 = o.getInt(i14);
                    n19 = i14;
                    int i16 = n20;
                    int t = nu0.t(o.getInt(i16));
                    n20 = i16;
                    int i17 = n21;
                    if (o.getInt(i17) != 0) {
                        n21 = i17;
                        i2 = n22;
                        z2 = true;
                    } else {
                        n21 = i17;
                        i2 = n22;
                        z2 = false;
                    }
                    if (o.getInt(i2) != 0) {
                        n22 = i2;
                        i3 = n23;
                        z3 = true;
                    } else {
                        n22 = i2;
                        i3 = n23;
                        z3 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        n23 = i3;
                        i4 = n24;
                        z4 = true;
                    } else {
                        n23 = i3;
                        i4 = n24;
                        z4 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        n24 = i4;
                        i5 = n25;
                        z5 = true;
                    } else {
                        n24 = i4;
                        i5 = n25;
                        z5 = false;
                    }
                    long j8 = o.getLong(i5);
                    n25 = i5;
                    int i18 = n26;
                    long j9 = o.getLong(i18);
                    n26 = i18;
                    int i19 = n27;
                    n27 = i19;
                    arrayList.add(new h8g(string, v2, string2, string3, a2, a3, j, j2, j3, new kj3(t, z2, z3, z4, z5, j8, j9, nu0.c(o.isNull(i19) ? null : o.getBlob(i19))), i7, s, j4, j5, j6, j7, z, u, i13, i15));
                    n11 = i9;
                    i6 = i8;
                }
                o.close();
                xlc.n();
                ArrayList h = i8g.h();
                ArrayList f = i8g.f();
                if (!arrayList.isEmpty()) {
                    a14 u2 = a14.u();
                    String str = fj4.a;
                    u2.x(str, "Recently completed work:\n\n");
                    die = die2;
                    y7g = y7g2;
                    k8g = k8g2;
                    a14.u().x(str, fj4.a(y7g, k8g, die, arrayList));
                } else {
                    die = die2;
                    y7g = y7g2;
                    k8g = k8g2;
                }
                if (!h.isEmpty()) {
                    a14 u3 = a14.u();
                    String str2 = fj4.a;
                    u3.x(str2, "Running work:\n\n");
                    a14.u().x(str2, fj4.a(y7g, k8g, die, h));
                }
                if (!f.isEmpty()) {
                    a14 u4 = a14.u();
                    String str3 = fj4.a;
                    u4.x(str3, "Enqueued work:\n\n");
                    a14.u().x(str3, fj4.a(y7g, k8g, die, f));
                }
                return fm7.b();
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a;
            o.close();
            xlc.n();
            throw th;
        }
    }
}
