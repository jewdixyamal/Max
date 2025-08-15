package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: z05  reason: default package */
public final class z05 implements k05, ry9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public lt0 b = lt0.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ d15 o;

    public z05(d15 d15) {
        this.o = d15;
    }

    public final void a(boolean z) {
        lt0 lt0 = lt0.b;
        lt0 lt02 = z ? lt0.a : lt0;
        if (this.b != lt02) {
            this.b = lt02;
            if (lt02 == lt0) {
                ArrayList arrayList = this.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((bm7) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new kl4((Object) entry, 10, (Object) lt02));
                } catch (RejectedExecutionException unused) {
                    String str = this.o.a;
                }
            }
        }
    }

    public final void f(Executor executor, py9 py9) {
        this.o.h.execute(new v05((Object) this, (Object) py9, (Object) executor, 0));
    }

    public final bm7 j() {
        return f8.g(new w05(this, 0));
    }

    public final void l(py9 py9) {
        this.o.h.execute(new kl4((Object) this, 12, (Object) py9));
    }
}
