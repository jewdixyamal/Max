package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: ym6  reason: default package */
public final class ym6 extends an6 {
    public static final ym6 l = new ym6("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (qy5) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final qy5 h;
    public final List i;
    public final Map j;
    public final List k;

    public ym6(String str, List list, List list2, List list3, List list4, List list5, List list6, qy5 qy5, List list7, boolean z, Map map, List list8) {
        super(str, z, list);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Uri uri = ((wm6) list2.get(i2)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.h = qy5;
        this.i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.j = Collections.unmodifiableMap(map);
        this.k = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = ((um6) list.get(i2)).a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i2, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 >= list2.size()) {
                    break;
                }
                x8e x8e = (x8e) list2.get(i4);
                if (x8e.b == i2 && x8e.c == i3) {
                    arrayList.add(obj);
                    break;
                }
                i4++;
            }
        }
        return arrayList;
    }

    public final Object a(List list) {
        return new ym6(this.a, this.b, c(0, this.e, list), Collections.emptyList(), c(1, this.f, list), c(2, this.g, list), Collections.emptyList(), this.h, this.i, this.c, this.j, this.k);
    }
}
