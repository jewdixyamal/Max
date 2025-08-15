package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: fad  reason: default package */
public final class fad {
    public static final List j = Arrays.asList(new Integer[]{1, 5, 3});
    public final List a;
    public final rb0 b;
    public final List c;
    public final List d;
    public final List e;
    public final dad f;
    public final kz1 g;
    public final int h;
    public final InputConfiguration i;

    public fad(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, kz1 kz1, dad dad, InputConfiguration inputConfiguration, int i2, rb0 rb0) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = dad;
        this.g = kz1;
        this.i = inputConfiguration;
        this.h = i2;
        this.b = rb0;
    }

    public static fad a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        mi9 b2 = mi9.b();
        ArrayList arrayList5 = new ArrayList();
        ui9 a2 = ui9.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        wma a3 = wma.a(b2);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        nje nje = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = a2.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        return new fad(arrayList, arrayList2, arrayList3, arrayList4, new kz1(arrayList6, a3, -1, false, arrayList7, false, new nje(arrayMap), (pv1) null), (dad) null, (InputConfiguration) null, 0, (rb0) null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (rb0 rb0 : this.a) {
            arrayList.add(rb0.a);
            for (xf4 add : rb0.b) {
                arrayList.add(add);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
