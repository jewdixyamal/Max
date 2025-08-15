package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: e9e  reason: default package */
public abstract class e9e {
    public static final aa0 a = new aa0(Long.TYPE, (Object) null, "camera2.streamSpec.streamUseCase");
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            q9f q9f = q9f.b;
            hashSet.add(q9f);
            q9f q9f2 = q9f.Y;
            hashSet.add(q9f2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(q9f);
            hashSet2.add(q9f2);
            hashSet2.add(q9f.c);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            q9f q9f3 = q9f.a;
            hashSet3.add(q9f3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            q9f q9f4 = q9f.o;
            hashSet4.add(q9f4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(q9f);
            hashSet5.add(q9f3);
            hashSet5.add(q9f4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(q9f);
            hashSet6.add(q9f4);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [re6, cv1] */
    public static cv1 a(ce3 ce3, long j) {
        aa0 aa0 = a;
        if (ce3.o(aa0) && ((Long) ce3.h(aa0)).longValue() == j) {
            return null;
        }
        mi9 c2 = mi9.c(ce3);
        c2.j(aa0, Long.valueOf(j));
        return new re6(8, (Object) c2);
    }

    public static boolean b(q9f q9f, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (q9f == q9f.X) {
            HashMap hashMap = c;
            if (!hashMap.containsKey(Long.valueOf(j))) {
                return false;
            }
            Set set = (Set) hashMap.get(Long.valueOf(j));
            if (list.size() != set.size()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!set.contains((q9f) it.next())) {
                    return false;
                }
            }
            return true;
        }
        HashMap hashMap2 = b;
        return hashMap2.containsKey(Long.valueOf(j)) && ((Set) hashMap2.get(Long.valueOf(j))).contains(q9f);
    }

    public static boolean c(ce3 ce3, q9f q9f) {
        if (((Boolean) ce3.f(o9f.m0, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        aa0 aa0 = gu6.b;
        if (!ce3.o(aa0)) {
            return false;
        }
        return q9f.ordinal() == 0 && ((Integer) ce3.h(aa0)).intValue() == 2;
    }
}
