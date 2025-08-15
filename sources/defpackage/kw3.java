package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kw3  reason: default package */
public final class kw3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public kw3(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, mec] */
    public final qy9 a(iy8 iy8) {
        r1a r1a;
        ArrayList arrayList;
        hm9.m("kw3", "convertVideo: messageUpload = %s", iy8);
        int i = iy8.d;
        if (i != 2 && i != 9) {
            return qy9.m(iy8);
        }
        ? obj = new Object();
        obj.a = iy8;
        if (iy8.e == null) {
            hy8 a2 = iy8.a();
            i20 i20 = new i20(1);
            mqb mqb = ((kxc) ((hp) this.a.getValue())).q().a;
            String str = ((iy8) obj.a).b;
            cj0 cj0 = (cj0) ((af8) this.c.getValue());
            cj0.getClass();
            Object obj2 = null;
            try {
                arrayList = j1e.s(Uri.parse(str), cj0.a, cj0);
            } catch (Throwable th) {
                hm9.p("cj0", "getAvailableQualitiesForVideo: failed", th);
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (it.hasNext()) {
                        mqb mqb2 = ((nqb) obj2).a;
                        do {
                            Object next = it.next();
                            mqb mqb3 = ((nqb) next).a;
                            if (mqb2.compareTo(mqb3) > 0) {
                                obj2 = next;
                                mqb2 = mqb3;
                            }
                        } while (it.hasNext());
                    }
                }
                nqb nqb = (nqb) obj2;
                if (nqb != null) {
                    mqb mqb4 = nqb.a;
                    if (mqb4.compareTo(mqb) >= 0) {
                        mqb = mqb4;
                    }
                }
            }
            i20.a = mqb;
            a2.e = new ref(i20);
            obj.a = new iy8(a2);
        }
        Object obj3 = obj.a;
        ref ref = ((iy8) obj3).e;
        if (ref == null) {
            return qy9.m(obj3);
        }
        i20 i202 = new i20(1);
        i202.a = ref.a;
        i202.b = ref.b;
        i202.c = ref.c;
        i202.d = ref.d;
        ref ref2 = new ref(i202);
        l7b l7b = new l7b(13, false);
        l7b.b = ((iy8) obj.a).b;
        l7b.c = ref2;
        lef lef = new lef(l7b);
        wef wef = (wef) this.b.getValue();
        synchronized (wef) {
            hm9.m("wef", "convertVideo: %s", lef);
            r1a = (qy9) wef.i.get(lef);
            if (r1a == null) {
                s28 s28 = new s28(new o28(wef.b.a(), 2, new sef(lef, 1)), new n2f(20), 1);
                n2f n2f = new n2f(18);
                kj6 kj6 = ft.e;
                r66 r66 = ft.d;
                o28 o28 = new o28(new c38(new e38(s28, n2f, kj6, r66), new t28(new u24(wef, 9, lef))), 1, new vef(wef, 0));
                xy9 xy9 = new xy9(new xy9(new oz9(o28 instanceof x66 ? ((x66) o28).d() : new hb3(1, o28), kj6, new ypc(wef, 25, lef), r66), kj6, new vle(wef, 6, lef), 2), new vef(wef, 1), r66, 2);
                hm9.j0(1, "bufferSize");
                o84 o84 = new o84(14);
                AtomicReference atomicReference = new AtomicReference();
                r1a = new y0a(new h1a(new e1a(atomicReference, o84), xy9, atomicReference, o84)).r(wef.f);
                wef.i.put(lef, r1a);
            }
        }
        return new e0a(new oz9(r1a, ob6.b, ft.e, ft.d), new gd1(7, obj), 3);
    }
}
