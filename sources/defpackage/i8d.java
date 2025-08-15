package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: i8d  reason: default package */
public final class i8d extends g9d {
    public final Object A0;
    public final /* synthetic */ int z0 = 0;

    public i8d(h8d h8d) {
        super(h8d);
        this.A0 = (es8) h8d.m;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, m20] */
    public final bu8 y() {
        List list;
        k8g k8g;
        List list2;
        switch (this.z0) {
            case 0:
                es8 es8 = (es8) this.A0;
                k8g k8g2 = es8.a.z0;
                if (k8g2 == null || (list2 = (List) k8g2.a) == null) {
                    list = nz4.a;
                } else {
                    ArrayList<l20> arrayList = new ArrayList<>();
                    for (Object next : list2) {
                        if (((l20) next).g == null) {
                            arrayList.add(next);
                        }
                    }
                    list = new ArrayList(z53.S(arrayList, 10));
                    for (l20 j : arrayList) {
                        j10 j2 = j.j();
                        j2.l = UUID.randomUUID().toString();
                        list.add(j2.a());
                    }
                }
                bu8 H = es8.a.H();
                H.b = 0;
                H.u = true;
                k8g k8g3 = es8.a.z0;
                if (k8g3 != null) {
                    m20 C = k8g3.C();
                    C.c = null;
                    C.b = null;
                    C.a = list;
                    k8g = C.c();
                } else {
                    k8g = null;
                }
                H.n = k8g;
                H.p = 0;
                H.q = 0;
                H.s = null;
                H.t = null;
                H.x = 0;
                H.y = 0;
                H.r = null;
                H.G = null;
                return H;
            default:
                ? obj = new Object();
                obj.c = (q10) this.A0;
                obj.a = g20.b;
                l20 a = obj.a();
                ? obj2 = new Object();
                obj2.a = Collections.singletonList(a);
                k8g c = obj2.c();
                bu8 bu8 = new bu8();
                bu8.n = c;
                return bu8;
        }
    }

    public i8d(h8d h8d, byte b) {
        super(h8d);
        this.A0 = (q10) h8d.m;
    }
}
