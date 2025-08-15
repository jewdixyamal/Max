package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ForkJoinPool;

/* renamed from: ly5  reason: default package */
public final class ly5 {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final ky5 b = new ky5(this);
    public final ArrayList c = new ArrayList();

    public final iy5 a(String str, Iterable iterable, k56 k56) {
        iy5 iy5 = new iy5(str, new yg3((Object) iterable, (Object) k56, (Object) this, (Object) str, 5));
        ArrayList arrayList = this.c;
        jy5 jy5 = iy5.b;
        arrayList.add(0, jy5);
        ForkJoinPool.commonPool().execute(jy5);
        return iy5;
    }
}
