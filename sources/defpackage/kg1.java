package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: kg1  reason: default package */
public final class kg1 {
    public final fg1 a;
    public final id1 b;
    public final va8 c;
    public final a4c d;
    public final xje e;
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final LongSparseArray h = new LongSparseArray();
    public bg1 i;
    public zad j;
    public zad k;

    public kg1(fg1 fg1, id1 id1, va8 va8, a4c a4c) {
        this.a = fg1;
        this.b = id1;
        this.c = va8;
        this.d = a4c;
        xje xje = new xje();
        xje.b = wz4.a;
        this.e = xje;
        xad xad = xad.a;
        this.j = xad;
        this.k = xad;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        r5 = (defpackage.ji9) r5.i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.td a(defpackage.dqa r12, defpackage.zad r13) {
        /*
            r11 = this;
            bg1 r0 = r12.a
            fg1 r0 = r11.j(r0)
            java.util.HashMap r1 = r11.f
            java.util.HashMap r2 = r11.g
            android.util.LongSparseArray r3 = r11.h
            r4 = 1
            rpa r5 = r12.d
            rpa r6 = r12.c
            rpa r7 = r12.b
            bg1 r8 = r12.a
            if (r0 != 0) goto L_0x0062
            fg1 r0 = new fg1
            java.lang.Object r7 = r7.n()
            kpa r7 = (defpackage.kpa) r7
            java.lang.Object r6 = r6.n()
            hi9 r6 = (defpackage.hi9) r6
            java.lang.Object r5 = r5.n()
            ji9 r5 = (defpackage.ji9) r5
            r0.<init>(r8, r7, r6, r5)
            bg1 r5 = r0.a
            if (r5 != 0) goto L_0x0033
            goto L_0x005e
        L_0x0033:
            java.lang.Object r6 = r1.get(r13)
            if (r6 != 0) goto L_0x0041
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r1.put(r13, r6)
        L_0x0041:
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r5, r0)
            r2.put(r5, r13)
            long r1 = r5.a
            java.lang.Object r13 = r3.get(r1)
            java.util.Set r13 = (java.util.Set) r13
            if (r13 != 0) goto L_0x005b
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r3.put(r1, r13)
        L_0x005b:
            r13.add(r5)
        L_0x005e:
            r13 = 0
            r6 = r4
            goto L_0x0123
        L_0x0062:
            boolean r9 = r7.l()
            if (r9 == 0) goto L_0x0071
            java.lang.Object r7 = r7.i()
            kpa r7 = (defpackage.kpa) r7
            r0.e(r7)
        L_0x0071:
            boolean r7 = r6.l()
            if (r7 == 0) goto L_0x008f
            java.lang.Object r6 = r6.i()
            hi9 r6 = (defpackage.hi9) r6
            rd8 r7 = r6.a
            hi9 r9 = r0.b
            r9.a = r7
            rd8 r7 = r6.b
            r9.b = r7
            rd8 r7 = r6.c
            r9.c = r7
            rd8 r6 = r6.d
            r9.d = r6
        L_0x008f:
            boolean r6 = r5.l()
            if (r6 == 0) goto L_0x00da
            java.lang.Object r5 = r5.i()
            ji9 r5 = (defpackage.ji9) r5
            ji9 r6 = r0.c
            boolean r7 = r6.e
            boolean r9 = r5.e
            if (r7 != r9) goto L_0x00c1
            boolean r7 = r6.f
            boolean r10 = r5.f
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.b
            boolean r10 = r5.b
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.g
            boolean r10 = r5.g
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.c
            boolean r10 = r5.c
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.d
            boolean r10 = r5.d
            if (r7 == r10) goto L_0x00da
        L_0x00c1:
            r6.e = r9
            boolean r7 = r5.f
            r6.f = r7
            boolean r7 = r5.b
            r6.b = r7
            boolean r7 = r5.g
            r6.g = r7
            boolean r7 = r5.c
            r6.c = r7
            boolean r5 = r5.d
            r6.d = r5
            r6.a()
        L_0x00da:
            java.lang.Object r5 = r2.get(r8)
            zad r5 = (defpackage.zad) r5
            if (r5 != 0) goto L_0x00e4
            zad r5 = r11.k
        L_0x00e4:
            boolean r6 = defpackage.tpa.f(r5, r13)
            r6 = r6 ^ r4
            boolean r7 = defpackage.tpa.f(r5, r13)
            if (r7 != 0) goto L_0x0122
            r11.b(r8, r5)
            bg1 r7 = r0.a
            if (r7 != 0) goto L_0x00f7
            goto L_0x0122
        L_0x00f7:
            java.lang.Object r9 = r1.get(r13)
            if (r9 != 0) goto L_0x0105
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r1.put(r13, r9)
        L_0x0105:
            java.util.Map r9 = (java.util.Map) r9
            r9.put(r7, r0)
            r2.put(r7, r13)
            long r1 = r7.a
            java.lang.Object r13 = r3.get(r1)
            java.util.Set r13 = (java.util.Set) r13
            if (r13 != 0) goto L_0x011f
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r3.put(r1, r13)
        L_0x011f:
            r13.add(r7)
        L_0x0122:
            r13 = r5
        L_0x0123:
            bg1 r11 = r11.i
            if (r8 != r11) goto L_0x0129
            r0.o = r4
        L_0x0129:
            rpa r11 = r12.e
            boolean r1 = r11.l()
            if (r1 == 0) goto L_0x013f
            java.lang.Object r11 = r11.i()
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r1 = r0.d
            r1.clear()
            r1.addAll(r11)
        L_0x013f:
            rpa r11 = r12.f
            boolean r1 = r11.l()
            if (r1 == 0) goto L_0x014f
            java.lang.Object r11 = r11.i()
            o61 r11 = (defpackage.o61) r11
            r0.p = r11
        L_0x014f:
            rpa r11 = r12.g
            boolean r12 = r11.l()
            if (r12 == 0) goto L_0x015f
            java.lang.Object r11 = r11.i()
            java.util.List r11 = (java.util.List) r11
            r0.q = r11
        L_0x015f:
            td r11 = new td
            r11.<init>((defpackage.fg1) r0, (boolean) r6, (defpackage.zad) r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg1.a(dqa, zad):td");
    }

    public final fg1 b(bg1 bg1, zad zad) {
        HashMap hashMap = this.g;
        zad zad2 = (zad) hashMap.get(bg1);
        if (zad2 == null) {
            return null;
        }
        if (zad2.equals(zad)) {
            long j2 = bg1.a;
            LongSparseArray longSparseArray = this.h;
            Set set = (Set) longSparseArray.get(j2);
            if (set != null) {
                set.remove(bg1);
                if (set.isEmpty()) {
                    longSparseArray.remove(j2);
                }
            }
            hashMap.remove(bg1);
            HashMap hashMap2 = this.f;
            Object obj = hashMap2.get(zad);
            if (obj == null) {
                obj = new LinkedHashMap();
                hashMap2.put(zad, obj);
            }
            return (fg1) ((Map) obj).remove(bg1);
        }
        this.d.log("CallParticipants", "Tried to remove " + bg1 + " from " + zad + " but participant is in " + zad2);
        return null;
    }

    public final zad c(bg1 bg1) {
        zad zad = (zad) this.g.get(bg1);
        return zad == null ? tpa.f(bg1, this.a.a) ? this.k : xad.a : zad;
    }

    public final Map d(zad zad) {
        HashMap hashMap = this.f;
        Object obj = hashMap.get(zad);
        if (obj == null) {
            obj = new LinkedHashMap();
            hashMap.put(zad, obj);
        }
        return (Map) obj;
    }

    public final void e(zad zad, List list) {
        boolean f2 = tpa.f(zad, this.k);
        id1 id1 = this.b;
        if (f2) {
            id1.a.onActiveParticipantsChanged(new vy0(list, d(this.k).values()));
        }
        id1.c.onCallParticipantsChanged(new mg1(list));
    }

    public final fg1 f(dqa dqa, zad zad) {
        return (fg1) x53.g0(g(zad, Collections.singletonList(dqa)));
    }

    public final ArrayList g(zad zad, List list) {
        List list2;
        id1 id1;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dqa dqa = (dqa) it.next();
            zad c2 = zad == null ? c(dqa.a) : zad;
            td a2 = a(dqa, c2);
            fg1 fg1 = (fg1) a2.c;
            arrayList.add(fg1);
            if (a2.b) {
                Object obj = linkedHashMap.get(c2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c2, obj);
                }
                ((List) obj).add(fg1);
            } else {
                Object obj2 = linkedHashMap2.get(c2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(c2, obj2);
                }
                ((List) obj2).add(fg1);
            }
            zad zad2 = (zad) a2.o;
            if (zad2 != null && !zad2.equals(c2)) {
                Object obj3 = linkedHashMap3.get(zad2);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap3.put(zad2, obj3);
                }
                ((List) obj3).add(fg1);
            }
        }
        Iterator it2 = linkedHashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            list2 = nz4.a;
            id1 = this.b;
            if (!hasNext) {
                break;
            }
            zad zad3 = (zad) it2.next();
            List list3 = (List) linkedHashMap3.get(zad3);
            if (list3 != null) {
                list2 = list3;
            }
            if (tpa.f(zad3, this.k)) {
                id1.a.onActiveParticipantsRemoved(new xy0(list2, d(this.k).values()));
            }
            id1.c.onCallParticipantsRemoved(new og1(list2));
        }
        for (zad zad4 : linkedHashMap.keySet()) {
            List list4 = (List) linkedHashMap.get(zad4);
            if (list4 == null) {
                list4 = list2;
            }
            if (tpa.f(zad4, this.k)) {
                id1.a.onActiveParticipantsAdded(new uy0(list4, d(this.k).values()));
            }
            id1.c.onCallParticipantsAdded(new lg1(zad4, list4));
        }
        for (zad zad5 : linkedHashMap2.keySet()) {
            List list5 = (List) linkedHashMap2.get(zad5);
            if (list5 == null) {
                list5 = list2;
            }
            e(zad5, list5);
        }
        return arrayList;
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(d(this.k).values());
        this.e.b = wz4.a;
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.b.a.onActiveParticipantsRemoved(new xy0(arrayList, nz4.a));
        this.c.o();
    }

    public final Collection i() {
        return d(this.k).values();
    }

    public final fg1 j(bg1 bg1) {
        fg1 fg1 = this.a;
        bg1 bg12 = fg1.a;
        if (bg12 != null && bg12.equals(bg1)) {
            return fg1;
        }
        zad zad = (zad) this.g.get(bg1);
        if (zad != null) {
            return (fg1) d(zad).get(bg1);
        }
        return null;
    }

    public final boolean k(fg1 fg1) {
        if (fg1 != null) {
            bg1 bg1 = fg1.a;
            if ((bg1 != null ? j(bg1) : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final void l(bg1 bg1, kpa kpa, String str, String str2) {
        fg1 j2 = j(bg1);
        if (j2 != null && kpa != null) {
            HashMap hashMap = j2.f;
            boolean isEmpty = hashMap.isEmpty();
            hashMap.put(kpa, new kpa(str, str2));
            if (Objects.equals(j2.j, kpa)) {
                j2.l = str;
                j2.k = str2;
            }
            if (isEmpty && j2.j == null) {
                zad zad = (zad) this.g.get(bg1);
                if (zad == null) {
                    zad = this.k;
                }
                e(zad, Collections.singletonList(j2));
            }
        }
    }

    public final ArrayList m(zad zad, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bg1 bg1 = (bg1) it.next();
            zad c2 = zad == null ? c(bg1) : zad;
            fg1 b2 = b(bg1, c2);
            if (b2 != null) {
                Object obj = linkedHashMap.get(c2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c2, obj);
                }
                ((List) obj).add(b2);
            }
        }
        for (zad zad2 : linkedHashMap.keySet()) {
            List list2 = (List) linkedHashMap.get(zad2);
            if (list2 == null) {
                list2 = nz4.a;
            }
            boolean f2 = tpa.f(zad2, this.k);
            id1 id1 = this.b;
            if (f2) {
                id1.a.onActiveParticipantsRemoved(new xy0(list2, d(this.k).values()));
            }
            id1.c.onCallParticipantsRemoved(new og1(list2));
        }
        return z53.T(linkedHashMap.values());
    }

    public final void n(zad zad) {
        zad zad2 = this.k;
        this.k = zad;
        if (!tpa.f(zad2, zad)) {
            this.b.a.onActiveParticipantUpdated(new yy0(d(zad2).values(), d(zad).values(), zad, zad instanceof yad ? this.c.x((yad) zad) : null, this.a));
        }
    }

    public final void o(bg1 bg1) {
        if (bg1 != this.i) {
            ArrayList arrayList = new ArrayList();
            bg1 bg12 = this.i;
            fg1 fg1 = null;
            fg1 j2 = bg12 != null ? j(bg12) : null;
            if (j2 != null) {
                boolean c2 = j2.c();
                j2.o = false;
                if (c2 != j2.c()) {
                    arrayList.add(j2);
                }
            }
            if (bg1 != null) {
                fg1 = j(bg1);
            }
            if (fg1 != null) {
                boolean c3 = fg1.c();
                fg1.o = true;
                if (c3 != fg1.c()) {
                    arrayList.add(fg1);
                }
            }
            e(this.k, arrayList);
            this.i = bg1;
        }
    }

    public final void p(zad zad) {
        zad zad2 = this.j;
        this.j = zad;
        if (!tpa.f(zad2, zad)) {
            this.b.f.onCurrentParticipantInvitedToRoom(new ol1(this.a, zad, zad instanceof yad ? this.c.x((yad) zad) : null));
        }
    }

    public final void q(ArrayList arrayList) {
        Map d2 = d(this.k);
        xje xje = this.e;
        xje.getClass();
        HashSet hashSet = new HashSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            fg1 fg1 = (fg1) d2.get((bg1) it.next());
            if (fg1 != null) {
                boolean d3 = fg1.d();
                fg1.n = true;
                if (d3 != fg1.d()) {
                    arrayList2.add(fg1);
                }
            }
        }
        for (bg1 bg1 : (Set) xje.b) {
            fg1 fg12 = (fg1) d2.get(bg1);
            if (fg12 != null && !hashSet.contains(bg1)) {
                boolean d4 = fg12.d();
                fg12.n = false;
                if (d4 != fg12.d()) {
                    arrayList2.add(fg12);
                }
            }
        }
        xje.b = hashSet;
        e(this.k, arrayList2);
    }

    public final int r() {
        Map map = (Map) this.f.get(this.k);
        if (map != null) {
            return map.size();
        }
        return 0;
    }
}
