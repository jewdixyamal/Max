package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: uj4  reason: default package */
public final class uj4 {
    public static final l7d f;
    public final a4c a;
    public final rsa b;
    public List c = Collections.emptyList();
    public Map d = Collections.emptyMap();
    public boolean e = false;

    /* JADX WARNING: type inference failed for: r0v0, types: [l7d, java.lang.Object] */
    static {
        ? obj = new Object();
        f = obj;
        obj.a = true;
    }

    public uj4(a4c a4c, d5f d5f) {
        this.a = a4c;
        this.b = d5f;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [l7d, java.lang.Object] */
    public final void a(List list) {
        List<u41> emptyList = this.e ? Collections.emptyList() : this.c;
        HashMap hashMap = new HashMap();
        for (u41 u41 : emptyList) {
            hashMap.put(u41.a, u41);
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u41 u412 = (u41) it.next();
            hashMap2.put(u412.a, u412);
        }
        ArrayList arrayList = new ArrayList();
        for (fp1 fp1 : hashMap2.keySet()) {
            u41 u413 = (u41) hashMap.get(fp1);
            u41 u414 = (u41) hashMap2.get(fp1);
            if (u414 != null && (u413 == null || !u413.b.equals(u414.b))) {
                fp1 fp12 = u414.a;
                bff bff = u414.b;
                ? obj = new Object();
                int i = 1;
                if (bff.c != 1) {
                    i = 2;
                }
                obj.d = i;
                obj.b = bff.a;
                obj.c = bff.b;
                obj.a = false;
                arrayList.add(new m7d(fp12, obj));
            }
        }
        for (fp1 fp13 : hashMap.keySet()) {
            u41 u415 = (u41) hashMap.get(fp13);
            if (u415 != null && !hashMap2.containsKey(fp13)) {
                arrayList.add(new m7d(u415.a, f));
            }
        }
        boolean z = this.e;
        if (!arrayList.isEmpty()) {
            d6f d6f = new d6f(arrayList, z);
            koc B = ((d5f) this.b).B0.B();
            tj4 tj4 = new tj4(this, 0);
            tj4 tj42 = new tj4(this, 1);
            ioc ioc = new ioc((hoc) d6f);
            ioc.c = tj4;
            ioc.d = tj42;
            B.d(new ioc(ioc));
        }
        this.c = list;
        HashMap hashMap3 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            u41 u416 = (u41) it2.next();
            bg1 bg1 = u416.a.b;
            Set set = (Set) hashMap3.get(bg1);
            if (set == null) {
                set = new HashSet();
                hashMap3.put(bg1, set);
            }
            set.add(u416.a);
        }
        this.d = hashMap3;
        this.e = false;
    }
}
