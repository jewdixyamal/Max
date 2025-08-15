package defpackage;

import android.content.Context;
import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: ev1  reason: default package */
public final class ev1 implements r9f {
    public final ul4 b;

    public ev1(Context context) {
        this.b = ul4.b(context);
    }

    public final ce3 a(q9f q9f, int i) {
        int i2;
        int i3;
        q9f q9f2 = q9f;
        int i4 = i;
        mi9 b2 = mi9.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        mi9 b3 = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 a = ui9.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int ordinal = q9f.ordinal();
        if (ordinal != 0) {
            i2 = ordinal != 3 ? 1 : 3;
        } else {
            i2 = i4 == 2 ? 5 : 1;
        }
        aa0 aa0 = o9f.g0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        wma a2 = wma.a(b3);
        ArrayList arrayList10 = new ArrayList(arrayList);
        nje nje = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        b2.j(aa0, new fad(arrayList5, arrayList6, arrayList7, arrayList8, new kz1(arrayList9, a2, i2, false, arrayList10, false, new nje(arrayMap), (pv1) null), (dad) null, (InputConfiguration) null, 0, (rb0) null));
        b2.j(o9f.i0, dv1.a);
        HashSet hashSet2 = new HashSet();
        mi9 b4 = mi9.b();
        ArrayList arrayList11 = new ArrayList();
        ui9 a3 = ui9.a();
        int ordinal2 = q9f.ordinal();
        if (ordinal2 != 0) {
            i3 = ordinal2 != 3 ? 1 : 3;
        } else {
            i3 = i4 == 2 ? 5 : 2;
        }
        aa0 aa02 = o9f.h0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        wma a4 = wma.a(b4);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        nje nje2 = nje.b;
        ArrayMap arrayMap2 = new ArrayMap();
        Map map2 = a3.a;
        for (String str2 : map2.keySet()) {
            arrayMap2.put(str2, map2.get(str2));
        }
        b2.j(aa02, new kz1(arrayList12, a4, i3, false, arrayList13, false, new nje(arrayMap2), (pv1) null));
        b2.j(o9f.j0, q9f2 == q9f.a ? hu6.c : lu1.a);
        q9f q9f3 = q9f.b;
        ul4 ul4 = this.b;
        if (q9f2 == q9f3) {
            b2.j(ev6.H, ul4.e());
        }
        b2.j(ev6.C, Integer.valueOf(ul4.c(true).getRotation()));
        if (q9f2 == q9f.o || q9f2 == q9f.X) {
            b2.j(o9f.m0, Boolean.TRUE);
        }
        return wma.a(b2);
    }
}
