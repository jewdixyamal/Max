package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: u7d  reason: default package */
public abstract class u7d {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public static final List b(gy8 gy8, List list, m56 m56) {
        int i;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            if (gy8.n().a() == 7) {
                ArrayList arrayList = new ArrayList();
                i = lz7.G(gy8);
                for (int i2 = 0; i2 < i; i2++) {
                    Object invoke = m56.invoke(gy8);
                    if (invoke != null) {
                        arrayList.add(invoke);
                    }
                }
                return arrayList;
            }
            gy8.z();
            return list;
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                return list;
            }
            if (s != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
    }

    public static final long[] c(gy8 gy8) {
        int i;
        CopyOnWriteArraySet copyOnWriteArraySet = a;
        try {
            i = lz7.G(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                return null;
            }
            if (s != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = lz7.M(gy8, 0);
        }
        return jArr;
    }
}
