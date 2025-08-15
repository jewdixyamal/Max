package defpackage;

import android.location.Location;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ck9  reason: default package */
public final /* synthetic */ class ck9 implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk9 b;

    public /* synthetic */ ck9(fk9 fk9, int i) {
        this.a = i;
        this.b = fk9;
    }

    public void accept(Object obj) {
        e08 e08;
        String str;
        ConcurrentHashMap concurrentHashMap;
        boolean z;
        boolean z2 = true;
        fk9 fk9 = this.b;
        switch (this.a) {
            case 1:
                e08 e082 = (e08) obj;
                fk9.getClass();
                long j = e082.c;
                if (j == 0) {
                    fk9.E0 = e082;
                    fk9.f2();
                    return;
                }
                ConcurrentHashMap concurrentHashMap2 = fk9.c;
                e08 e083 = (e08) concurrentHashMap2.get(Long.valueOf(j));
                if (e083 != null) {
                    d08 a2 = e083.a();
                    a2.f = e082.f;
                    a2.g = e082.g;
                    a2.i = e082.i;
                    concurrentHashMap2.put(Long.valueOf(e083.c), new e08(a2));
                    fk9.e2();
                    return;
                }
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                fk9.s0.getClass();
                i28 i28 = new i28(new f38[]{m28.a, new dk9(fk9)}, 1);
                jj9 jj9 = new jj9(8);
                int i = wq5.a;
                hm9.j0(i, "bufferSize");
                ds5 ds5 = new ds5(new yq5(new nr5(i28, jj9, i), new jj9(9)), 1);
                hle hle = fk9.z0;
                hle.getClass();
                drd i2 = ds5.m(((jle) hle).a()).i(ce.a());
                iq1 iq1 = new iq1(new ck9(fk9, 3), 2, new ck9(fk9, 5));
                i2.k(iq1);
                fk9.X.a(iq1);
                return;
            case 3:
                List list = (List) obj;
                fk9.getClass();
                hm9.m("fk9", "invalidateLiveLocations %s", list);
                ConcurrentHashMap concurrentHashMap3 = fk9.c;
                Iterator it = concurrentHashMap3.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    er7 er7 = er7.Z;
                    e08 e084 = fk9.w0;
                    if (hasNext) {
                        Map.Entry entry = (Map.Entry) it.next();
                        e08 e085 = (e08) entry.getValue();
                        Long l = (Long) entry.getKey();
                        long longValue = l.longValue();
                        int i3 = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
                        if (i3 != 0) {
                            if (e085.h) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        ((kw8) it2.next()).getClass();
                                        if (i3 == 0) {
                                            er7 er72 = e085.a;
                                            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                                            boolean f = ((nd) fk9.Z).f(er72.a, er72.b, 1.401298464324817E-45d, 1.401298464324817E-45d);
                                            boolean z3 = e085.k ^ z2;
                                            d08 a3 = e085.a();
                                            a3.a = er7;
                                            a3.j = 0;
                                            a3.h = z2;
                                            a3.k = false;
                                            Long valueOf = Long.valueOf(e085.c);
                                            e08 e086 = new e08(a3);
                                            concurrentHashMap = concurrentHashMap4;
                                            concurrentHashMap.put(valueOf, e086);
                                            e08 e087 = (e08) concurrentHashMap.get(l);
                                            if (e087 != null && (e087.i || !f || !z3)) {
                                                fk9.H0.e(e087);
                                            }
                                            z = true;
                                        }
                                    } else {
                                        concurrentHashMap = concurrentHashMap3;
                                        z = false;
                                    }
                                }
                                if ((e084 == null || e084.c != longValue) && !z) {
                                    it.remove();
                                }
                                concurrentHashMap3 = concurrentHashMap;
                                z2 = true;
                            }
                        }
                    } else {
                        ConcurrentHashMap concurrentHashMap5 = concurrentHashMap3;
                        Iterator it3 = list.iterator();
                        while (true) {
                            boolean hasNext2 = it3.hasNext();
                            i08 i08 = i08.c;
                            if (hasNext2) {
                                ((kw8) it3.next()).getClass();
                                if (((e08) concurrentHashMap5.get(0L)) == null && (e084 == null || e084.h || e084.c != 0)) {
                                    if (fk9.t0 == 0) {
                                        str = fk9.v0;
                                    } else {
                                        uj3 i4 = fk9.x0.i(0, false);
                                        str = i4 != null ? i4.d() : "";
                                    }
                                    d08 d08 = new d08(er7);
                                    d08.b = 0;
                                    d08.c = 0;
                                    d08.j = 0;
                                    d08.h = true;
                                    d08.e = str;
                                    d08.k = false;
                                    if (0 != fk9.C0.h) {
                                        i08 = i08.b;
                                    }
                                    d08.d = i08;
                                    d08.l = "";
                                    e08 e088 = new e08(d08);
                                    concurrentHashMap5.put(0L, e088);
                                    fk9.H0.e(e088);
                                }
                            } else {
                                fk9.b2(new ek9(fk9.C0.d == 3));
                                if (concurrentHashMap5.size() == 1) {
                                    e08 e089 = (e08) concurrentHashMap5.values().iterator().next();
                                    if (fk9.C0.h != e089.c) {
                                        d08 a4 = e089.a();
                                        a4.d = i08;
                                        concurrentHashMap5.put(Long.valueOf(e089.c), new e08(a4));
                                        fk9.b2(new gj0(e089, 2));
                                    }
                                }
                                long j2 = fk9.C0.h;
                                if (!(j2 == 0 || (e08 = (e08) concurrentHashMap5.get(Long.valueOf(j2))) == null)) {
                                    fk9.g2(e08.c);
                                    if (fk9.F0 && fk9.C0.o == -1) {
                                        er7 er73 = e08.a;
                                        ((el9) ((kk9) fk9.b)).B(er73.a, er73.b, false);
                                    }
                                }
                                fk9.h2((ck9) null);
                                fk9.e2();
                                return;
                            }
                        }
                    }
                }
            case 5:
                fk9.getClass();
                Locale locale = Locale.ENGLISH;
                hm9.p("fk9", "Can't get getActiveLiveLocations for chat " + fk9.u0, (Throwable) obj);
                return;
            case 6:
                Long l2 = (Long) obj;
                fk9.G0.e(Boolean.TRUE);
                return;
            case 7:
                fk9.Y.a(fk9);
                fk9.b2(new vx1(fk9, 3, (Boolean) obj));
                fk9.h2((ck9) null);
                return;
            default:
                fk9.getClass();
                fk9.b2(new cy1(2, (Boolean) obj));
                fk9.h2((ck9) null);
                return;
        }
    }

    public Object apply(Object obj) {
        double d;
        double d2;
        float f;
        List list;
        e08 e08 = (e08) obj;
        fk9 fk9 = this.b;
        fk9.getClass();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            long j = e08.c;
            ir7 ir7 = fk9.C0;
            if (j == ir7.h && ir7.o != -1 && (list = (List) fk9.o.get(Long.valueOf(j))) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e08 e082 = (e08) it.next();
                    if (e082.j == fk9.C0.o) {
                        er7 er7 = e082.a;
                        d2 = er7.a;
                        d = er7.b;
                        break;
                    }
                }
            }
            d2 = 1.401298464324817E-45d;
            d = 1.401298464324817E-45d;
            if (d2 == 1.401298464324817E-45d || d == 1.401298464324817E-45d) {
                er7 er72 = e08.a;
                d2 = er72.a;
                d = er72.b;
            }
            er7 er73 = fk9.D0;
            String c = ((nd) fk9.Z).c(d2, d, er73.a, er73.b);
            if (e08.c == 0 || !fk9.D0.a()) {
                f = -1.0f;
            } else {
                er7 er74 = fk9.D0;
                float[] fArr = new float[1];
                Location.distanceBetween(d2, d, er74.a, er74.b, fArr);
                f = fArr[0];
            }
            d08 a2 = e08.a();
            a2.f = c;
            a2.g = f;
            a2.i = false;
            return new e08(a2);
        }
        throw new RuntimeException("This thread is main!");
    }
}
