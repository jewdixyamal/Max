package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* renamed from: tz1  reason: default package */
public final class tz1 {
    public final kz1 a;

    public tz1() {
        HashSet hashSet = new HashSet();
        mi9 b = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 a2 = ui9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        wma a3 = wma.a(b);
        ArrayList arrayList3 = new ArrayList(arrayList);
        nje nje = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        this.a = new kz1(arrayList2, a3, -1, false, arrayList3, false, new nje(arrayMap), (pv1) null);
    }
}
