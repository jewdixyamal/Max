package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: mz7  reason: default package */
public abstract class mz7 extends z7 {
    public static Object X(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap Y(kpa... kpaArr) {
        HashMap hashMap = new HashMap(Z(kpaArr.length));
        for (kpa kpa : kpaArr) {
            hashMap.put(kpa.a, kpa.b);
        }
        return hashMap;
    }

    public static int Z(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map a0(kpa... kpaArr) {
        if (kpaArr.length <= 0) {
            return oz4.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z(kpaArr.length));
        for (kpa kpa : kpaArr) {
            linkedHashMap.put(kpa.a, kpa.b);
        }
        return linkedHashMap;
    }

    public static void b0(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kpa kpa = (kpa) it.next();
            map.put(kpa.a, kpa.b);
        }
    }

    public static Map c0(ArrayList arrayList) {
        oz4 oz4 = oz4.a;
        int size = arrayList.size();
        if (size == 0) {
            return oz4;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(Z(arrayList.size()));
            b0(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        kpa kpa = (kpa) arrayList.get(0);
        return Collections.singletonMap(kpa.a, kpa.b);
    }

    public static Map d0(Map map) {
        int size = map.size();
        if (size == 0) {
            return oz4.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
