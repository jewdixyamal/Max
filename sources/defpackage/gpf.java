package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: gpf  reason: default package */
public final class gpf implements ipf, qj3, fu3 {
    public Object a;

    public /* synthetic */ gpf(Object obj) {
        this.a = obj;
    }

    public cn9 a(int i) {
        List list = (List) ((SparseArray) this.a).get(i);
        if (list != null && !list.isEmpty()) {
            return (cn9) list.get(0);
        }
        throw new IllegalArgumentException(zr6.h(i, "Cannot find the wrapper for global view type "));
    }

    public void accept(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        qoa qoa = (qoa) this.a;
        double abs = Math.abs(doubleValue - qoa.i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dhc dhc = qoa.a;
        boolean z = false;
        boolean z2 = abs > dhc.a;
        if (elapsedRealtime - qoa.j > ((long) dhc.c)) {
            z = true;
        }
        m56 m56 = qoa.f;
        if (z2 || z) {
            qoa.j = elapsedRealtime;
            m56.invoke("submit p2p network status");
            qoa.i = doubleValue;
            qoa.e.invoke(Double.valueOf(doubleValue));
            return;
        }
        m56.invoke("not valuable network status diff: " + abs + ": " + qoa.i + " -> " + doubleValue);
    }

    public hpf d(cn9 cn9) {
        return new wva(this, cn9, false, 15);
    }

    public Object u(Task task) {
        b9b b9b = (b9b) this.a;
        if (!task.h() && !((ukg) task).d) {
            Exception e = task.e();
            if (e instanceof ApiException) {
                int i = ((ApiException) e).a.a;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    cjg cjg = (cjg) b9b.c;
                    cjg.getClass();
                    qne qne = new qne();
                    ((ExecutorService) cjg.c).execute(new u8g(cjg, qne, false, 3));
                    task = qne.a;
                } else if (i == 43000) {
                    task = j1e.q(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                } else if (i == 15) {
                    return j1e.q(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }
}
