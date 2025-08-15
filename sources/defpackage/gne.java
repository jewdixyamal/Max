package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: gne  reason: default package */
public final class gne implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gne(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                fne fne = (fne) this.b;
                fne.getClass();
                boolean isCancelled = task.isCancelled();
                rne rne = fne.b;
                if (isCancelled) {
                    rne.a();
                    return null;
                } else if (task.isFaulted()) {
                    rne.b(task.getError());
                    return null;
                } else {
                    rne.c(task.getResult());
                    return null;
                }
            default:
                Collection<Task> collection = (Collection) this.b;
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (Task result : collection) {
                    arrayList.add(result.getResult());
                }
                return arrayList;
        }
    }
}
