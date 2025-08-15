package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: xjc  reason: default package */
public final class xjc {
    public float a;
    public final Serializable b;

    public xjc() {
        this.b = new Random(System.currentTimeMillis());
        this.a = 0.0f;
    }

    public long a(long j) {
        fm9.f(j >= 0);
        Map.Entry firstEntry = ((nx6) this.b).tailMap(Long.valueOf(j), false).firstEntry();
        Long l = (Long) (firstEntry == null ? null : firstEntry.getKey());
        if (l != null) {
            return l.longValue();
        }
        return -9223372036854775807L;
    }

    public float b(long j) {
        fm9.f(j >= 0);
        Map.Entry lastEntry = ((nx6) this.b).headMap(Long.valueOf(j), true).lastEntry();
        return lastEntry != null ? ((Float) lastEntry.getValue()).floatValue() : this.a;
    }

    public xjc(f99 f99) {
        float f;
        nx6 nx6;
        int i = 0;
        while (true) {
            d99[] d99Arr = f99.a;
            if (i >= d99Arr.length) {
                f = -3.4028235E38f;
                break;
            }
            d99 d99 = d99Arr[i];
            if (d99 instanceof eud) {
                f = ((eud) d99).a;
                break;
            }
            i++;
        }
        float f2 = f == -3.4028235E38f ? 1.0f : f / 30.0f;
        this.a = f2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            d99[] d99Arr2 = f99.a;
            if (i2 >= d99Arr2.length) {
                break;
            }
            d99 d992 = d99Arr2[i2];
            if (d992 instanceof itd) {
                arrayList.addAll(((itd) d992).a);
            }
            i2++;
        }
        ffc r = zw6.r(gtd.o, arrayList);
        if (r.isEmpty()) {
            nx6 = nx6.o();
        } else {
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < r.size(); i3++) {
                gtd gtd = (gtd) r.get(i3);
                treeMap.put(Long.valueOf(oaf.S(gtd.a)), Float.valueOf(f2 / ((float) gtd.c)));
            }
            for (int i4 = 0; i4 < r.size(); i4++) {
                long j = ((gtd) r.get(i4)).b;
                if (!treeMap.containsKey(Long.valueOf(oaf.S(j)))) {
                    treeMap.put(Long.valueOf(oaf.S(j)), Float.valueOf(f2));
                }
            }
            nx6 = nx6.k(treeMap);
        }
        this.b = nx6;
    }
}
