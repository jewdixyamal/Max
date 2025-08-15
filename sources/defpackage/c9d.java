package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* renamed from: c9d  reason: default package */
public final class c9d extends d8d {
    public final boolean b;
    public final boolean c;
    public final String o = c9d.class.getName();

    public c9d(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [kec, java.lang.Object] */
    public final void x() {
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        if (!((EnumSet) ((js7) e8d.w.getValue()).s0.getValue()).contains(gs7.b)) {
            e8d e8d2 = this.a;
            if (e8d2 == null) {
                e8d2 = null;
            }
            if (!((ch3) e8d2.E.getValue()).e()) {
                hm9.m(this.o, "Not logged in session, skip task", new Object[0]);
                return;
            }
        }
        if (this.c) {
            String str = this.o;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "Starting flushing all strategy", (Throwable) null);
            }
            ? obj = new Object();
            Object unused = j47.f0(hz4.a, new a9d(this, obj, (Continuation) null));
            if (obj.a > 1000) {
                ((cba) j()).c(new ExceptionHandler$HandledException(wg0.g(obj.a, "Got ", " analytic events!"), (Throwable) null, 2, "ONEME-11049"), false);
                return;
            }
            return;
        }
        List list = (List) j47.f0(hz4.a, new b9d(this, (Continuation) null));
        String str2 = this.o;
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            ir62.d(us7.X, str2, "Starting critical ids=" + list, (Throwable) null);
        }
        if (!list.isEmpty()) {
            pk a = a();
            boolean z = this.b;
            k4a k4a = (k4a) a;
            k4a.getClass();
            if (!list.isEmpty()) {
                ArrayList I0 = x53.I0(list, 100, 100);
                int size = I0.size();
                long[] jArr = new long[size];
                int i = 0;
                while (i < size) {
                    bs7 bs7 = r7;
                    int i2 = i;
                    long[] jArr2 = jArr;
                    bs7 bs72 = new bs7(((p7b) k4a.y()).a.o(), (List) I0.get(i), true, z);
                    jArr2[i2] = k4a.v(k4a, bs72);
                    i = i2 + 1;
                    jArr = jArr2;
                    size = size;
                }
            }
        }
        if (list.size() > 10) {
            ((cba) j()).c(new ExceptionHandler$HandledException(wg0.g(list.size(), "Got ", " critical analytic events!"), (Throwable) null, 2, "ONEME-11049"), false);
        }
    }
}
