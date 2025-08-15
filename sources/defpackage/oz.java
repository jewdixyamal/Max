package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: oz  reason: default package */
public final class oz {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final nz b;
    public final rm4 c;

    public oz(rm4 rm4, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45, rm4 rm46, rm4 rm47, rm4 rm48) {
        this.b = new nz(rm42, rm43, rm44, rm45, rm46, rm48, rm47);
        this.c = rm4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, m20] */
    public final die a(l20 l20) {
        Object obj;
        Object qf5;
        ? obj2 = new Object();
        obj2.a(l20);
        k8g c2 = obj2.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < c2.i(); i++) {
            l20 h = c2.h(i);
            String str = h.r;
            lz lzVar = (lz) this.a.get(str);
            if (lzVar == null || lzVar.b) {
                nz nzVar = this.b;
                nzVar.getClass();
                g20 g20 = h.a;
                int i2 = g20 == null ? -1 : mz.$EnumSwitchMapping$0[g20.ordinal()];
                rm4 rm4 = nzVar.b;
                if (i2 != 1) {
                    bc7[] bc7Arr = nz.h;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            bc7 bc7 = bc7Arr[0];
                            bc7 bc72 = bc7Arr[2];
                            bc7 bc73 = bc7Arr[3];
                            qf5 = new qf5(h, (pk) nzVar.c.get(), (rf5) nzVar.e.get(), (av0) nzVar.f.get());
                        } else if (i2 == 4) {
                            bc7 bc74 = bc7Arr[2];
                            bc7 bc75 = bc7Arr[3];
                            qf5 = new w20(h, (rf5) nzVar.e.get(), (av0) nzVar.f.get());
                        } else if (i2 != 5) {
                            obj = null;
                        } else {
                            khe khe = new khe(new es3(4, nzVar.a));
                            khe khe2 = new khe(new es3(4, rm4));
                            bc7 bc76 = bc7Arr[4];
                            qf5 = new h2e(h, khe, khe2, (zi5) nzVar.g.get());
                        }
                        obj = qf5;
                    } else {
                        bc7 bc77 = bc7Arr[0];
                        bc7 bc78 = bc7Arr[1];
                        bc7 bc79 = bc7Arr[2];
                        bc7 bc710 = bc7Arr[3];
                        obj = new ycf(h, (pk) nzVar.c.get(), (q33) nzVar.d.get(), (rf5) nzVar.e.get(), (av0) nzVar.f.get());
                    }
                } else {
                    obj = new xva(h, new khe(new es3(4, rm4)));
                }
                if (obj != null) {
                    this.a.put(str, obj);
                    arrayList2.add(obj);
                    arrayList.add(str);
                }
            } else {
                arrayList2.add(lzVar);
                arrayList.add(str);
            }
        }
        return new die(this.c, arrayList2, arrayList);
    }
}
