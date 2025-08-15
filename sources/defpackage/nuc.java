package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nuc  reason: default package */
public abstract class nuc {
    public static final String a = a14.O("Schedulers");

    public static void a(me3 me3, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            i8g y = workDatabase.y();
            workDatabase.c();
            try {
                ArrayList g = y.g(me3.h);
                ArrayList f = y.f();
                if (g.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = g.iterator();
                    while (it.hasNext()) {
                        y.n(currentTimeMillis, ((h8g) it.next()).a);
                    }
                }
                workDatabase.r();
                workDatabase.l();
                if (g.size() > 0) {
                    h8g[] h8gArr = (h8g[]) g.toArray(new h8g[g.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        auc auc = (auc) it2.next();
                        if (auc.c()) {
                            auc.e(h8gArr);
                        }
                    }
                }
                if (f.size() > 0) {
                    h8g[] h8gArr2 = (h8g[]) f.toArray(new h8g[f.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        auc auc2 = (auc) it3.next();
                        if (!auc2.c()) {
                            auc2.e(h8gArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
    }
}
