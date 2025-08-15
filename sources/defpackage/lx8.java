package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: lx8  reason: default package */
public final class lx8 {
    public static final ye4 e = new ye4(8);
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public lx8(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je73;
        this.b = je72;
        this.c = je7;
        this.d = je74;
    }

    public static Set a(ix8 ix8, ix8 ix82) {
        wz4 wz4 = wz4.a;
        if (ix82 == null) {
            return wz4;
        }
        List list = ix82.a;
        if (ix8 != null) {
            List list2 = ix8.a;
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    if (((hx8) next).a.a == d6c.EMOJI) {
                        arrayList.add(next);
                    }
                }
                Iterator it = l6d.Z(l6d.Z(new at(2, list), new g27(20)), new kl6(1, arrayList)).iterator();
                if (!it.hasNext()) {
                    return wz4;
                }
                v5c v5c = ((hx8) it.next()).a.b;
                if (!it.hasNext()) {
                    return Collections.singleton(v5c);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(v5c);
                while (it.hasNext()) {
                    linkedHashSet.add(((hx8) it.next()).a.b);
                }
                return linkedHashSet;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (((hx8) next2).a.a == d6c.EMOJI) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(z53.S(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((hx8) it2.next()).a.b);
        }
        return x53.H0(arrayList3);
    }

    public static void c(ArrayList arrayList, c6c c6c) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (tpa.f(((hx8) it.next()).a, c6c)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            hx8 hx8 = (hx8) arrayList.get(i);
            int i2 = hx8.b;
            if (i2 == 1) {
                arrayList.remove(i);
                return;
            }
            arrayList.set(i, new hx8(hx8.a, i2 - 1));
        }
    }

    public final au8 b() {
        return (au8) this.a.getValue();
    }

    public final void d(Long l, cu8 cu8, Set set, boolean z) {
        hm9.m("lx8", ey8.j("reactions, offline, messageServerId = %d,  reactionsDiff = %s, reactionsChanged = ", z), Long.valueOf(cu8.b), set);
        ((av0) this.c.getValue()).c(new l6f(l.longValue(), cu8.b, set, z));
    }

    public final e5f e(long j, long j2, c6c c6c) {
        cu8 q;
        List list;
        e52 e52 = (e52) ((jz2) ((iy2) this.b.getValue())).m(j).a.getValue();
        e5f e5f = e5f.a;
        if (e52 == null || (q = b().q(j2)) == null || q.v0 == vx8.DELETED) {
            return e5f;
        }
        int i = 0;
        ix8 ix8 = q.S0;
        int i2 = ix8 != null ? ix8.b : 0;
        c6c c6c2 = ix8 != null ? ix8.c : null;
        ArrayList arrayList = (ix8 == null || (list = ix8.a) == null) ? new ArrayList() : new ArrayList(list);
        hm9.m("lx8", "reactions, offline, updateMessageYourReaction, current: totalCount = %d, yourReaction = %s, reactions = %s", new Integer(i2), c6c2, arrayList);
        if (tpa.f(c6c2, c6c)) {
            hm9.m("lx8", "reactions, offline, cancel case", new Object[0]);
            c(arrayList, c6c2);
            int i3 = i2 - 1;
            if (i3 >= 0) {
                i = i3;
            }
            c6c = null;
        } else {
            hm9.m("lx8", "reactions, offline, add case", new Object[0]);
            if (c6c2 != null) {
                c(arrayList, c6c2);
                i2--;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (tpa.f(((hx8) it.next()).a, c6c)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                arrayList.add(new hx8(c6c, 1));
            } else {
                hx8 hx8 = (hx8) arrayList.get(i);
                arrayList.set(i, new hx8(hx8.a, hx8.b + 1));
            }
            i = i2 + 1;
        }
        c63.U(arrayList, e);
        ix8 ix82 = new ix8(arrayList, i, c6c);
        hm9.m("lx8", "reactions, offline, newReactionsData = " + ix82, new Object[0]);
        b().h(Collections.singletonMap(new Long(q.c), ix82));
        d(new Long(e52.a), q, a(ix8, ix82), tpa.f(ix82, ix8) ^ true);
        return e5f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: ix8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: c6c} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(long r13, java.util.Map r15) {
        /*
            r12 = this;
            au8 r0 = r12.b()
            java.util.Set r1 = r15.keySet()
            java.util.ArrayList r0 = r0.k(r13, r1)
            java.util.List r0 = defpackage.x53.e0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            cu8 r3 = (defpackage.cu8) r3
            vx8 r3 = r3.v0
            vx8 r4 = defpackage.vx8.DELETED
            if (r3 == r4) goto L_0x001b
            r1.add(r2)
            goto L_0x001b
        L_0x0032:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x003b:
            boolean r3 = r2.hasNext()
            je7 r4 = r12.d
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r2.next()
            cu8 r3 = (defpackage.cu8) r3
            java.lang.Object r4 = r4.getValue()
            jx8 r4 = (defpackage.jx8) r4
            long r5 = r3.c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            fx8 r5 = (defpackage.fx8) r5
            r4.getClass()
            r6 = 0
            if (r5 == 0) goto L_0x009f
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            java.util.List r9 = r5.a
            int r8 = defpackage.z53.S(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L_0x0072:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r8.next()
            cx8 r9 = (defpackage.cx8) r9
            hx8 r10 = new hx8
            bx8 r11 = r9.a
            c6c r11 = r4.d(r11)
            int r9 = r9.b
            r10.<init>(r11, r9)
            r7.add(r10)
            goto L_0x0072
        L_0x008f:
            bx8 r8 = r5.c
            if (r8 == 0) goto L_0x0097
            c6c r6 = r4.d(r8)
        L_0x0097:
            ix8 r4 = new ix8
            int r5 = r5.b
            r4.<init>(r7, r5, r6)
            r6 = r4
        L_0x009f:
            ix8 r4 = r3.S0
            boolean r5 = defpackage.tpa.f(r4, r6)
            if (r5 != 0) goto L_0x003b
            java.util.Set r4 = a(r4, r6)
            long r5 = r3.b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.put(r3, r4)
            goto L_0x003b
        L_0x00b5:
            java.lang.Object r2 = r4.getValue()
            jx8 r2 = (defpackage.jx8) r2
            java.util.LinkedHashMap r15 = r2.c(r15)
            au8 r2 = r12.b()
            r2.h(r15)
            java.util.Iterator r15 = r1.iterator()
        L_0x00ca:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r1 = r15.next()
            cu8 r1 = (defpackage.cu8) r1
            long r2 = r1.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x00ca
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r4 = 0
            r12.d(r3, r1, r2, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r12.g(r3, r1, r2, r4)
            goto L_0x00ca
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx8.f(long, java.util.Map):void");
    }

    public final void g(Long l, cu8 cu8, Set set, boolean z) {
        hm9.m("lx8", "reactions, offline, messageServerId = %d,  reactionsDiff = %s", Long.valueOf(cu8.b), set);
        ((av0) this.c.getValue()).c(new xp9(l.longValue(), z, cu8.b, cu8.o, set));
    }
}
