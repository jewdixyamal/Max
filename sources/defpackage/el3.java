package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: el3  reason: default package */
public final class el3 implements ava {
    public static final EnumSet r;
    public static final Set s;
    public static final xs t;
    public static final Set u;
    public static final Set v;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final Object d = new Object();
    public volatile boolean e = false;
    public final rm4 f;
    public final av0 g;
    public final m7b h;
    public final rm4 i;
    public final rm4 j;
    public final rm4 k;
    public final rm4 l;
    public final ztc m;
    public final iye n;
    public final rm4 o;
    public final CopyOnWriteArraySet p = new CopyOnWriteArraySet();
    public ds3 q = null;

    static {
        ol3 ol3 = ol3.b;
        ol3 ol32 = ol3.a;
        r = EnumSet.of(ol3, ol32);
        s = Collections.singleton(ol32);
        nl3 nl3 = nl3.b;
        nl3 nl32 = nl3.a;
        t = ay7.d(null, nl3, nl32);
        u = Collections.singleton(nl32);
        v = Collections.singleton(nl3);
    }

    public el3(rm4 rm4, av0 av0, m7b m7b, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45, ztc ztc, iye iye, rm4 rm46) {
        this.f = rm4;
        this.g = av0;
        this.h = m7b;
        this.i = rm42;
        this.j = rm43;
        this.k = rm44;
        this.l = rm45;
        this.m = ztc;
        this.n = iye;
        this.o = rm46;
    }

    public final void a(ArrayList arrayList) {
        hm9.m("ContactController", "onPhonebookUpdated", new Object[0]);
        y(arrayList);
    }

    public final void b() {
        if (!this.e) {
            synchronized (this.d) {
                try {
                    if (!this.e) {
                        n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final uj3 c(long j2, qj3 qj3) {
        b();
        boolean z = false;
        uj3 i2 = i(j2, false);
        if (i2 == null) {
            ((cba) ((o45) this.i.get())).c(new Exception("contact is null"), true);
            return null;
        }
        ql3 ql3 = i2.a;
        hl3 c2 = ql3.c.c();
        try {
            qj3.accept(c2);
            pl3 a2 = c2.a();
            if (a2.a == ((p7b) this.h).a.t()) {
                z = true;
            }
            uj3 uj3 = new uj3(new ql3(ql3.b, a2), z, (ida) this.j.get());
            q(j2, uj3, false, true);
            wv7 wv7 = new wv7(1);
            wv7.f(j2, uj3);
            f(wv7);
            return uj3;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final void d(long j2, String str, String str2) {
        p7b p7b = (p7b) this.h;
        p7b.a.m("user.deviceAvatarPath", (String) null);
        long t2 = p7b.a.t();
        c(t2, new x72((Object) str, (Object) str2, j2, 3));
        this.g.c(new ps3(t2));
    }

    public final void e() {
        if (this.e && !this.a.isEmpty()) {
            for (uj3 uj3 : this.a.values()) {
                uj3.b = null;
                uj3.c = null;
                uj3.o = null;
            }
            this.g.c(new ps3((Collection) this.a.keySet()));
        }
    }

    public final void f(wv7 wv7) {
        ds3 ds3 = this.q;
        if (ds3 != null && wv7.h() != 0) {
            int h2 = wv7.h();
            for (int i2 = 0; i2 < h2; i2++) {
                long e2 = wv7.e(i2);
                uj3 uj3 = (uj3) wv7.i(i2);
                if (e2 > 0) {
                    ((ti9) ds3.e.computeIfAbsent(Long.valueOf(e2), new di(8, new nq2(ds3, e2, 1)))).setValue(uj3);
                }
            }
        }
    }

    public final boolean g(long j2) {
        uj3 i2 = i(j2, false);
        return i2 != null && i2.c();
    }

    public final uj3 h(long j2, boolean z) {
        uj3 uj3 = (uj3) this.a.get(Long.valueOf(j2));
        if (uj3 != null || !z) {
            return uj3;
        }
        uj3 b2 = uj3.b(j2, ((p7b) this.h).a.n(), (ida) this.j.get());
        q(j2, b2, true, true);
        return b2;
    }

    public final uj3 i(long j2, boolean z) {
        uj3 uj3;
        if (j2 > 0 && ((uj3 = (uj3) this.a.get(Long.valueOf(j2))) == null || uj3.a.b == 0 || uj3.w())) {
            b();
        }
        return h(j2, z);
    }

    public final List j(Set set, Set set2) {
        uj3 i2 = i(((p7b) this.h).a.t(), false);
        ArrayList arrayList = null;
        for (uj3 uj3 : this.a.values()) {
            if (!(i2 == null || uj3 == i2 || !set.contains(uj3.a.c.k))) {
                if (set2 == null || set2.contains(uj3.a.c.i)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(uj3);
                }
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final List k() {
        return j(s, (Set) null);
    }

    public final void l() {
        b();
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.isEmpty()) {
            for (uj3 uj3 : concurrentHashMap.values()) {
                ida ida = (ida) this.j.get();
                boolean z = true;
                boolean z2 = uj3.b != null;
                boolean z3 = uj3.c != null;
                if (uj3.o == null) {
                    z = false;
                }
                uj3.b = null;
                uj3.c = null;
                uj3.o = null;
                if (z2) {
                    uj3.b = ida.j.b(0, uj3.d());
                }
                if (z3) {
                    uj3.l(ida);
                }
                if (z) {
                    uj3.m();
                }
            }
            this.g.c(new ps3((Collection) concurrentHashMap.keySet()));
        }
    }

    public final boolean m(long j2) {
        b();
        if (j2 <= 0 || j2 == -1) {
            return false;
        }
        m7b m7b = this.h;
        if (j2 == ((p7b) m7b).a.t()) {
            return false;
        }
        uj3 h2 = h(j2, false);
        if (i24.r(h2)) {
            return true;
        }
        if (h2.c()) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        p7b p7b = (p7b) m7b;
        z7d z7d = p7b.b;
        z7d.getClass();
        return p7b.a.n() - timeUnit.toMillis(z7d.q(PmsKey.f99noncontactsynctime, TimeUnit.HOURS.toSeconds(24))) >= h2.a.c.s;
    }

    /* JADX INFO: finally extract failed */
    public final void n() {
        if (!this.e) {
            this.n.getClass();
            iye.a("ContactController.load()");
            hm9.m("ContactController", "contacts loading started", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            this.n.getClass();
            iye.a("ContactController.selectContacts()");
            wv7 wv7 = new wv7(32);
            glc glc = ((k24) ((c34) this.f.get())).d;
            ir3 h2 = glc.h();
            h2.getClass();
            xlc a2 = xlc.a(0, "SELECT * FROM contacts ORDER BY presence ASC");
            ilc ilc = h2.a;
            ilc.b();
            Cursor o2 = ilc.o(a2, (CancellationSignal) null);
            try {
                int n2 = tfg.n(o2, "id");
                int n3 = tfg.n(o2, "server_id");
                int n4 = tfg.n(o2, "presence");
                int n5 = tfg.n(o2, "presence_type");
                int n6 = tfg.n(o2, "data");
                ArrayList arrayList = new ArrayList(o2.getCount());
                while (o2.moveToNext()) {
                    arrayList.add(new km3(o2.getLong(n2), o2.getLong(n3), o2.getInt(n4), o2.getInt(n5), pl3.b(o2.isNull(n6) ? null : o2.getBlob(n6))));
                }
                o2.close();
                a2.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    km3 km3 = (km3) it.next();
                    ConcurrentHashMap concurrentHashMap = ((d56) ((khe) glc.o).getValue()).a;
                    long j2 = km3.a;
                    pl3 pl3 = km3.e;
                    concurrentHashMap.put(Long.valueOf(j2), Integer.valueOf(pl3.f.hashCode()));
                    arrayList2.add(new ql3(km3.a, pl3, new r7b(km3.d, km3.c)));
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    ql3 ql3 = (ql3) it2.next();
                    long j3 = ql3.c.a;
                    if (j3 != ((p7b) this.h).a.t()) {
                        z = false;
                    }
                    uj3 uj3 = new uj3(ql3, z, (ida) this.j.get());
                    wv7.f(j3, uj3);
                    q(uj3.n(), uj3, false, false);
                    w7b w7b = (w7b) this.k.get();
                    w7b.getClass();
                    w7b.d().f(uj3.n(), ql3.o);
                }
                Trace.endSection();
                this.e = true;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    ir6.d(us7, "ContactController", "contacts loaded in " + (System.currentTimeMillis() - currentTimeMillis) + "ms", (Throwable) null);
                }
                this.n.getClass();
                Trace.endSection();
                f(wv7);
            } catch (Throwable th) {
                o2.close();
                a2.n();
                throw th;
            }
        }
    }

    public final void o(long j2) {
        hm9.m("ContactController", "markAsNotFoundContact, id = " + j2, new Object[0]);
        c(j2, new un0(25));
        rp3 rp3 = new rp3(Collections.singletonList(Long.valueOf(j2)));
        av0 av0 = this.g;
        av0.c(rp3);
        av0.c(new ps3(j2));
    }

    public final void p(ArrayList arrayList) {
        hm9.m("ContactController", "onLogin start", new Object[0]);
        u(arrayList);
        hm9.m("ContactController", "onLogin finished", new Object[0]);
    }

    public final void q(long j2, uj3 uj3, boolean z, boolean z2) {
        rm4 rm4 = this.f;
        if (z && j2 != 0) {
            b();
        }
        this.a.put(Long.valueOf(j2), uj3);
        boolean t2 = oag.t(uj3.a.c.p);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (!t2) {
            concurrentHashMap.put(Long.valueOf(j2), uj3);
        } else {
            concurrentHashMap.remove(Long.valueOf(j2));
        }
        if (z2 && !uj3.w()) {
            try {
                ((k24) ((c34) rm4.get())).a();
                x(uj3.a.b, uj3);
                ((k24) ((c34) rm4.get())).c();
            } finally {
                ((k24) ((c34) rm4.get())).b();
            }
        }
        Iterator it = this.p.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public final void r(long j2, boolean z) {
        hm9.m("ContactController", "setShowBlockPanel, id = " + j2 + ", show = " + z, new Object[0]);
        c(j2, new cl3(z ^ true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5 A[Catch:{ all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(java.util.List r17, long[] r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            rm4 r8 = r0.j
            rm4 r9 = r0.f
            r10 = 0
            if (r7 == 0) goto L_0x0046
            int r1 = r7.length
            if (r1 != 0) goto L_0x000f
            goto L_0x0046
        L_0x000f:
            xs r1 = new xs
            int r2 = r7.length
            r1.<init>((int) r2)
            int r2 = r7.length
            r3 = r10
        L_0x0017:
            if (r3 >= r2) goto L_0x0025
            r4 = r7[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0025:
            java.util.Iterator r2 = r17.iterator()
        L_0x0029:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r2.next()
            wm3 r3 = (defpackage.wm3) r3
            long r3 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.remove(r3)
            goto L_0x0029
        L_0x003f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x0044:
            r11 = r2
            goto L_0x004b
        L_0x0046:
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0044
        L_0x004b:
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0123
            m7b r1 = r0.h
            p7b r1 = (defpackage.p7b) r1
            t33 r1 = r1.a
            long r12 = r1.n()
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x009b }
            c34 r1 = (defpackage.c34) r1     // Catch:{ all -> 0x009b }
            k24 r1 = (defpackage.k24) r1     // Catch:{ all -> 0x009b }
            r1.a()     // Catch:{ all -> 0x009b }
            java.util.Iterator r14 = r11.iterator()     // Catch:{ all -> 0x009b }
        L_0x006a:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x009b }
            r15 = r1
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x009b }
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            uj3 r1 = r0.i(r1, r10)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x009e
            ql3 r1 = r1.a     // Catch:{ all -> 0x009b }
            long r1 = r1.b     // Catch:{ all -> 0x009b }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x008c
            goto L_0x009e
        L_0x008c:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            c10 r3 = new c10     // Catch:{ all -> 0x009b }
            r4 = 13
            r3.<init>(r12, r4)     // Catch:{ all -> 0x009b }
            r0.c(r1, r3)     // Catch:{ all -> 0x009b }
            goto L_0x00db
        L_0x009b:
            r0 = move-exception
            goto L_0x0117
        L_0x009e:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r8.get()     // Catch:{ all -> 0x009b }
            ida r3 = (defpackage.ida) r3     // Catch:{ all -> 0x009b }
            uj3 r1 = defpackage.uj3.a(r1, r12, r3)     // Catch:{ all -> 0x009b }
            ql3 r1 = r1.a
            java.lang.Object r2 = r9.get()     // Catch:{ all -> 0x009b }
            c34 r2 = (defpackage.c34) r2     // Catch:{ all -> 0x009b }
            k24 r2 = (defpackage.k24) r2     // Catch:{ all -> 0x009b }
            glc r2 = r2.d     // Catch:{ all -> 0x009b }
            pl3 r3 = r1.c     // Catch:{ all -> 0x009b }
            long r2 = r2.k(r3)     // Catch:{ all -> 0x009b }
            uj3 r4 = new uj3     // Catch:{ all -> 0x009b }
            ql3 r5 = new ql3     // Catch:{ all -> 0x009b }
            pl3 r1 = r1.c     // Catch:{ all -> 0x009b }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r8.get()     // Catch:{ all -> 0x009b }
            ida r1 = (defpackage.ida) r1     // Catch:{ all -> 0x009b }
            r4.<init>(r5, r10, r1)     // Catch:{ all -> 0x009b }
            long r2 = r15.longValue()     // Catch:{ all -> 0x009b }
            r5 = 1
            r6 = 1
            r1 = r16
            r1.q(r2, r4, r5, r6)     // Catch:{ all -> 0x009b }
        L_0x00db:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            uj3 r1 = r0.i(r1, r10)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x006a
            r2 = 0
            r1.b = r2     // Catch:{ all -> 0x009b }
            r1.c = r2     // Catch:{ all -> 0x009b }
            r1.o = r2     // Catch:{ all -> 0x009b }
            goto L_0x006a
        L_0x00ee:
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x009b }
            c34 r1 = (defpackage.c34) r1     // Catch:{ all -> 0x009b }
            k24 r1 = (defpackage.k24) r1     // Catch:{ all -> 0x009b }
            r1.c()     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r9.get()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            r1.b()
            rp3 r1 = new rp3
            r1.<init>(r11)
            av0 r2 = r0.g
            r2.c(r1)
            ps3 r1 = new ps3
            r1.<init>((java.util.Collection) r11)
            r2.c(r1)
            goto L_0x0123
        L_0x0117:
            java.lang.Object r1 = r9.get()
            c34 r1 = (defpackage.c34) r1
            k24 r1 = (defpackage.k24) r1
            r1.b()
            throw r0
        L_0x0123:
            if (r7 == 0) goto L_0x0160
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L_0x012c
            goto L_0x0160
        L_0x012c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x013a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()
            wm3 r4 = (defpackage.wm3) r4
            long r5 = r4.a
            boolean r5 = r0.g(r5)
            if (r5 == 0) goto L_0x0152
            r1.add(r4)
            goto L_0x013a
        L_0x0152:
            r2.add(r4)
            goto L_0x013a
        L_0x0156:
            ol3 r3 = defpackage.ol3.a
            r0.t(r1, r3)
            ol3 r1 = defpackage.ol3.b
            r0.t(r2, r1)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el3.s(java.util.List, long[]):void");
    }

    public final List t(List list, ol3 ol3) {
        uj3 uj3;
        ol3 ol32 = ol3;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        b();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "ContactController", "storeContactsFromServer, size = " + list.size() + ", type = " + ol32, (Throwable) null);
        }
        ((k24) ((c34) this.f.get())).a();
        long n2 = ((p7b) this.h).a.n();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z7d z7d = ((p7b) this.h).b;
            z7d.getClass();
            List list2 = list;
            List<pl3> C = s36.C(list2, new v02(17, this), new v02(17, this), ol3, timeUnit.toMillis(z7d.q(PmsKey.f99noncontactsynctime, TimeUnit.HOURS.toSeconds(24))), n2);
            wv7 wv7 = new wv7(C.size());
            ArrayList arrayList = new ArrayList(C.size());
            for (pl3 pl3 : C) {
                boolean z = false;
                uj3 i2 = i(pl3.a, false);
                if (pl3.a == ((p7b) this.h).a.t()) {
                    z = true;
                }
                if (i2 != null) {
                    long j2 = i2.a.b;
                    if (j2 != 0) {
                        uj3 = new uj3(new ql3(j2, pl3), z, (ida) this.j.get());
                        uj3 uj32 = uj3;
                        q(uj32.n(), uj32, true, true);
                        wv7.f(uj32.n(), uj32);
                        arrayList.add(Long.valueOf(pl3.a));
                    }
                }
                uj3 = new uj3(new ql3(((k24) ((c34) this.f.get())).d.k(pl3), pl3), z, (ida) this.j.get());
                uj3 uj322 = uj3;
                q(uj322.n(), uj322, true, true);
                wv7.f(uj322.n(), uj322);
                arrayList.add(Long.valueOf(pl3.a));
            }
            if (ol32 == ol3.a) {
                w(list);
            }
            ((k24) ((c34) this.f.get())).c();
            f(wv7);
            ((k24) ((c34) this.f.get())).b();
            return arrayList;
        } catch (Throwable th) {
            ((k24) ((c34) this.f.get())).b();
            throw th;
        }
    }

    public final void u(List list) {
        if (!list.isEmpty()) {
            List t2 = t(list, ol3.a);
            rm4 rm4 = this.o;
            if (rm4.get() != null) {
                zb2 zb2 = (zb2) ((ta2) rm4.get());
                vxd vxd = zb2.H0;
                if (vxd != null) {
                    vxd.cancel((CancellationException) null);
                }
                wb2 wb2 = new wb2(zb2, (Continuation) null);
                zb2.H0 = j47.T(zb2.Z, zb2.Y, (vx3) null, wb2, 2);
            }
            this.g.c(new ps3((Collection) t2));
        }
    }

    public final void v(List list) {
        if (!list.isEmpty()) {
            List t2 = t(list, ol3.b);
            rm4 rm4 = this.o;
            if (rm4.get() != null) {
                zb2 zb2 = (zb2) ((ta2) rm4.get());
                vxd vxd = zb2.H0;
                if (vxd != null) {
                    vxd.cancel((CancellationException) null);
                }
                wb2 wb2 = new wb2(zb2, (Continuation) null);
                zb2.H0 = j47.T(zb2.Z, zb2.Y, (vx3) null, wb2, 2);
            }
            this.g.c(new ps3((Collection) t2));
        }
    }

    public final void w(List list) {
        p7b p7b = (p7b) this.h;
        long j2 = p7b.a.g.getLong("user.contactsLastSync", 0);
        int i2 = s36.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 = Math.max(j2, ((wm3) it.next()).b);
        }
        p7b.a.l("user.contactsLastSync", Long.valueOf(j2));
    }

    public final void x(long j2, uj3 uj3) {
        glc glc = ((k24) ((c34) this.f.get())).d;
        pl3 pl3 = uj3.a.c;
        ir3 h2 = glc.h();
        ConcurrentHashMap concurrentHashMap = ((d56) ((khe) glc.o).getValue()).a;
        h2.getClass();
        if (!pl3.a() || pl3.j != 0) {
            ilc ilc = h2.a;
            ilc.b();
            th thVar = h2.c;
            q36 f2 = thVar.f();
            f2.j(1, pl3.a);
            f2.k(2, pl3.d());
            f2.j(3, j2);
            try {
                ilc.c();
                f2.n();
                ilc.r();
                ilc.l();
                thVar.t(f2);
                h2.c(pl3, concurrentHashMap);
            } catch (Throwable th) {
                thVar.t(f2);
                throw th;
            }
        }
    }

    public final Set y(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.emptySet();
        }
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "ContactController", "updateWithPhoneBookData = " + arrayList.size(), (Throwable) null);
        }
        List j2 = j(r, t);
        int i2 = s36.f;
        HashMap hashMap = new HashMap();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wua wua = (wua) it.next();
                Iterator it2 = j2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    uj3 uj3 = (uj3) it2.next();
                    if (uj3.o() > 0 && wua.Y > 0 && uj3.o() == wua.Y) {
                        hashMap.put(Long.valueOf(uj3.n()), wua);
                        break;
                    }
                }
            }
        }
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                c(((Long) entry.getKey()).longValue(), new v02(19, (wua) entry.getValue()));
            }
            this.g.c(new ps3((Collection) hashMap.keySet()));
        }
        return hashMap.keySet();
    }
}
