package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: k8d  reason: default package */
public final class k8d extends d8d {
    public final boolean X;
    public final mg4 Y;
    public final String Z = k8d.class.getName();
    public final long b;
    public final List c;
    public final da3 o;

    public k8d(long j, List list, da3 da3, boolean z, mg4 mg4) {
        this.b = j;
        this.c = list;
        this.o = da3;
        this.X = z;
        this.Y = mg4;
    }

    public final void x() {
        String str;
        e52 C = g().C(this.b);
        if (C == null) {
            ((cba) j()).c(new Exception("chat is null"), true);
        } else if (this.c == null) {
            au8 o2 = o();
            long j = this.b;
            t19 d = ((k24) o2.a).c.d();
            ilc ilc = d.a;
            ilc.b();
            p19 p19 = d.t;
            q36 f = p19.f();
            f.j(1, j);
            f.j(2, 0);
            f.j(3, 0);
            try {
                ilc.c();
                f.n();
                ilc.r();
                ilc.l();
                p19.t(f);
                au8 o3 = o();
                long j2 = this.b;
                t19 d2 = ((k24) o3.a).c.d();
                ilc ilc2 = d2.a;
                ilc2.b();
                p19 p192 = d2.m;
                q36 f2 = p192.f();
                d2.a().getClass();
                f2.j(1, (long) 10);
                f2.j(2, j2);
                f2.j(3, 0);
                f2.j(4, 0);
                try {
                    ilc2.c();
                    f2.n();
                    ilc2.r();
                    ilc2.l();
                    p192.t(f2);
                    if (this.Y == mg4.REGULAR) {
                        g().w(this.b);
                    }
                    pk a = a();
                    long j3 = this.b;
                    mg4 mg4 = this.Y;
                    k4a k4a = (k4a) a;
                    if (k4a.o(j3)) {
                        k4a.w(k4a, new se9(((p7b) k4a.y()).a.o(), j3, 0, 0, mg4));
                    }
                    t().c(new re9(this.b, 0, 0, this.Y));
                } catch (Throwable th) {
                    p192.t(f2);
                    throw th;
                }
            } catch (Throwable th2) {
                p19.t(f);
                throw th2;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Number longValue : this.c) {
                cu8 q = o().q(longValue.longValue());
                if (q != null) {
                    if (q.c == 0) {
                        arrayList2.add(q);
                        m().a(q);
                    } else {
                        arrayList.add(q);
                    }
                }
            }
            long j4 = C.b.a;
            boolean isEmpty = arrayList.isEmpty();
            vx8 vx8 = vx8.DELETED;
            if (isEmpty) {
                str = ", messages.size() = ";
            } else {
                int size = arrayList.size();
                StringBuilder sb = new StringBuilder("deleteServerMessages: chatId = ");
                long j5 = this.b;
                sb.append(j5);
                sb.append(", messages.size() = ");
                sb.append(size);
                hm9.m(this.Z, sb.toString(), new Object[0]);
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList3.add(Long.valueOf(((cu8) it.next()).b));
                    } catch (Throwable th3) {
                        throw new RuntimeException(th3);
                    }
                }
                ((k24) o().a).c.d().o(j5, arrayList3, vx8);
                pk a2 = a();
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        arrayList4.add(Long.valueOf(((cu8) it2.next()).c));
                    } catch (Throwable th4) {
                        throw new RuntimeException(th4);
                    }
                }
                str = ", messages.size() = ";
                ((k4a) a2).B(this.b, j4, arrayList3, arrayList4, this.o, this.X, this.Y);
                y(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                hm9.m(this.Z, "deleteLocalMessages: chatId = " + this.b + str + arrayList2.size(), new Object[0]);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    cu8 cu8 = (cu8) it3.next();
                    e8d e8d = this.a;
                    if (e8d == null) {
                        e8d = null;
                    }
                    jy8 jy8 = (jy8) e8d.z.getValue();
                    long j6 = cu8.b;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null) {
                        jy8.getClass();
                        if (ir6.c()) {
                            ir6.d(us7.X, "jy8", ey8.h(j6, "cancel: messageId="), (Throwable) null);
                        }
                    }
                    ((dg5) jy8.c.getValue()).a(j6);
                }
                au8 o4 = o();
                long j7 = this.b;
                ArrayList arrayList5 = new ArrayList(arrayList2.size());
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    try {
                        arrayList5.add(Long.valueOf(((cu8) it4.next()).b));
                    } catch (Throwable th5) {
                        throw new RuntimeException(th5);
                    }
                }
                ((k24) o4.a).c.d().o(j7, arrayList5, vx8);
                y(arrayList2);
            }
            if (this.c.contains(Long.valueOf(C.b.j))) {
                g().w(this.b);
            } else if (this.c.contains(Long.valueOf(C.b.x))) {
                g().v(this.b, (u82) null, 0);
            }
            t().c(new re9(this.b, this.c, (mg4) null));
        }
    }

    public final void y(ArrayList arrayList) {
        e52 C;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cu8 cu8 = (cu8) it.next();
            if (!(cu8 == null || (C = g().C(cu8.t0)) == null)) {
                e8d e8d = this.a;
                if (e8d == null) {
                    e8d = null;
                }
                long j = C.b.a;
                ((sna) e8d.p.getValue()).getClass();
                sna.b(j, cu8.b);
            }
        }
    }
}
