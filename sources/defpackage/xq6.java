package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: xq6  reason: default package */
public final class xq6 extends pj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xq6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void a() {
        boolean remove;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        oj0 oj0;
        g05 g05;
        switch (this.a) {
            case 0:
                if (((Future) this.b).cancel(false)) {
                    h7b h7b = (h7b) this.c;
                    ((un9) h7b.c).getClass();
                    hf5 hf5 = (hf5) h7b.b;
                    hf5.a().k(hf5.b, "NetworkFetchProducer");
                    hf5.a.c();
                    return;
                }
                return;
            case 1:
                synchronized (((vg9) this.c)) {
                    try {
                        remove = ((vg9) this.c).b.remove((Pair) this.b);
                        arrayList = null;
                        if (!remove) {
                            oj0 = null;
                            arrayList3 = null;
                        } else if (((vg9) this.c).b.isEmpty()) {
                            oj0 = ((vg9) this.c).f;
                            arrayList3 = null;
                        } else {
                            ArrayList k = ((vg9) this.c).k();
                            arrayList3 = ((vg9) this.c).l();
                            arrayList2 = ((vg9) this.c).j();
                            ArrayList arrayList4 = k;
                            oj0 = null;
                            arrayList = arrayList4;
                        }
                        arrayList2 = arrayList3;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                oj0.c(arrayList);
                oj0.d(arrayList3);
                oj0.b(arrayList2);
                if (oj0 != null) {
                    if (!((vg9) this.c).h.c || oj0.g()) {
                        oj0.e();
                    } else {
                        oj0.d(oj0.i(a9b.a));
                    }
                }
                if (remove) {
                    ((fi0) ((Pair) this.b).first).c();
                    return;
                }
                return;
            case 2:
                hic hic = (hic) this.c;
                n87 n87 = hic.g;
                synchronized (n87) {
                    g05 = n87.e;
                    n87.e = null;
                    n87.f = 0;
                }
                g05.d(g05);
                hic.f = true;
                ((fi0) this.b).c();
                return;
            case 3:
                Looper myLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                b8c b8c = (b8c) this.b;
                if (myLooper != mainLooper) {
                    b8c.d();
                    return;
                }
                ExecutorService executorService = ((ble) this.c).p;
                Objects.requireNonNull(b8c);
                executorService.execute(new u3c(28, b8c));
                return;
            default:
                w0e w0e = (w0e) this.b;
                w0e.a();
                ((aab) ((sse) this.c).c).o((ip7) w0e);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 1:
                oj0.b(((vg9) this.c).j());
                return;
            case 2:
                hic hic = (hic) this.c;
                if (((oj0) hic.e).f()) {
                    hic.g.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c() {
        switch (this.a) {
            case 1:
                oj0.c(((vg9) this.c).k());
                return;
            default:
                return;
        }
    }

    public void d() {
        switch (this.a) {
            case 1:
                oj0.d(((vg9) this.c).l());
                return;
            default:
                return;
        }
    }

    public /* synthetic */ xq6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
