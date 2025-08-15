package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: k5d  reason: default package */
public final /* synthetic */ class k5d implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5d(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                kv0 kv0 = (kv0) this.c;
                tpa.H((y07) obj, (String) this.b, kv0.a, kv0.b, true);
                return e5f.a;
            case 1:
                c9d c9d = (c9d) this.b;
                kec kec = (kec) this.c;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    pk a2 = c9d.a();
                    boolean z2 = c9d.b;
                    k4a k4a = (k4a) a2;
                    k4a.getClass();
                    if (!list.isEmpty()) {
                        ArrayList I0 = x53.I0(list, 100, 100);
                        int size = I0.size();
                        long[] jArr = new long[size];
                        for (int i = 0; i < size; i++) {
                            jArr[i] = k4a.v(k4a, new bs7(((p7b) k4a.y()).a.o(), (List) I0.get(i), false, z2));
                        }
                    }
                    kec.a = list.size() + kec.a;
                    String str = c9d.o;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.X, str, zr6.h(list.size(), "sending events entries count="), (Throwable) null);
                    }
                }
                return e5f.a;
            case 2:
                String str2 = (String) obj;
                li5 li5 = new li5((String) this.b);
                sld sld = (sld) this.c;
                return new ne7(sld.a, li5, sld.c, (fd7) null);
            case 3:
                uj3 uj3 = (uj3) obj;
                int ordinal = ((ltd) this.b).b.ordinal();
                boolean z3 = true;
                if (ordinal != 0 && ordinal == 1) {
                    z3 = ((e52) this.c).E(uj3.n());
                }
                return Boolean.valueOf(z3);
            case 4:
                uj3 uj32 = (uj3) obj;
                if (((Set) this.b).contains(Long.valueOf(uj32.n()))) {
                    if (!uj32.t()) {
                        ((q40) this.c).getClass();
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                dk2 dk2 = (dk2) obj;
                wm3 wm3 = dk2.a;
                String c2 = bre.c(wm3.w0);
                ArrayList arrayList = new ArrayList();
                List list2 = dk2.a.X;
                qi8 qi8 = (qi8) this.c;
                qi8.getClass();
                qi8.n(arrayList, list2);
                return ((bdb) qi8.b).b(wm3.a, arrayList, c2, (String) this.b, wm3.d(kk0.c), iz7.l(dk2.b), ((y4d) ((je7) qi8.X).getValue()).a(wm3.a));
            case 6:
                return new v2f(obj, (m56) this.b, (m56) this.c);
            default:
                tpa.L((j10) obj, (d20) this.b, ((hyc) ((q33) ((k6f) this.c).c.getValue())).n());
                return e5f.a;
        }
    }

    public /* synthetic */ k5d(Object obj, String str, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }
}
