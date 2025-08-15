package defpackage;

import android.accounts.Account;
import android.util.Pair;
import android.util.Size;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kad  reason: default package */
public final class kad implements e15 {
    public final Object X;
    public final Object Y;
    public Object Z;
    public final Object a;
    public final Object b;
    public Object c;
    public Object o;

    public kad(int i) {
        switch (i) {
            case 3:
                this.a = new lh4(0);
                this.b = new lh4(0);
                this.c = new lh4(0);
                this.o = new lh4(0);
                this.X = new lh4(0);
                this.Y = new lh4(0);
                this.Z = new sy4(29);
                return;
            default:
                this.a = new AtomicInteger(0);
                this.b = new AtomicInteger(0);
                this.c = new AtomicInteger(0);
                this.o = new AtomicInteger(0);
                this.X = new AtomicInteger(0);
                this.Y = new AtomicInteger(0);
                this.Z = new AtomicInteger(0);
                new ConcurrentHashMap();
                return;
        }
    }

    public static boolean a(lze lze, oy5 oy5) {
        return oag.d(oy5.a, lze.a) && oag.d(oy5.b, lze.b) && oag.d(oy5.c, lze.c) && oy5.B0 == lze.o && oy5.C0 == lze.X && oy5.s0 == lze.Y;
    }

    public mze b() {
        bf4 bf4 = (bf4) this.a;
        ez7 ez7 = bf4.c;
        if (ez7 == null) {
            return mze.c;
        }
        int intValue = ((Integer) d(ez7).first).intValue();
        qe4 a2 = ((ne4) bf4.e.get()).a(intValue, ez7.c[intValue]);
        if (a2 == null) {
            return mze.c;
        }
        for (mze mze : (List) this.o) {
            lze lze = mze.a;
            if (lze.Z == intValue && lze.s0 == a2.a && lze.t0 == a2.b[0]) {
                return mze;
            }
        }
        return mze.c;
    }

    public f15 c(int i) {
        mb0 mb0;
        ga0 ga0;
        Object obj;
        fz1 fz1;
        kad kad = this;
        int i2 = i;
        HashMap hashMap = (HashMap) kad.Y;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (f15) hashMap.get(Integer.valueOf(i));
        }
        e15 e15 = (e15) kad.a;
        f15 n = e15.n(i2);
        HashSet hashSet = (HashSet) kad.b;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                mb0 = null;
                break;
            }
            mb0 = (mb0) it.next();
            if (mb0.a == i2) {
                break;
            }
        }
        if (mb0 != null) {
            HashSet hashSet2 = (HashSet) kad.o;
            if (n != null) {
                Iterator it2 = hashSet2.iterator();
                loop1:
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    eu4 eu4 = (eu4) it2.next();
                    Iterator it3 = n.d().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop1;
                        } else if (hu4.a((ha0) it3.next(), eu4)) {
                        }
                    }
                }
            }
            c54.k(hashSet.contains(mb0));
            f15 n2 = e15.n(mb0.a);
            Iterator it4 = mb0.c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    ga0 = null;
                    break;
                }
                Size size = (Size) it4.next();
                if (((HashSet) kad.c).contains(size)) {
                    TreeMap treeMap = new TreeMap(new x93(false));
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet2.iterator();
                    while (it5.hasNext()) {
                        eu4 eu42 = (eu4) it5.next();
                        if (n2 != null) {
                            Iterator it6 = n2.d().iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (hu4.a((ha0) it6.next(), eu42)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        HashMap hashMap2 = (HashMap) kad.Z;
                        if (hashMap2.containsKey(eu42)) {
                            fz1 = (fz1) hashMap2.get(eu42);
                            Objects.requireNonNull(fz1);
                        } else {
                            fz1 fz12 = new fz1(new pl8(e15, eu42));
                            hashMap2.put(eu42, fz12);
                            fz1 = fz12;
                        }
                        nc0 a2 = fz1.a(size);
                        if (a2 != null) {
                            ha0 ha0 = a2.f;
                            dff dff = (dff) ((l66) kad.X).apply(eef.d(ha0));
                            if (dff != null) {
                                if (!dff.Q0(size.getWidth(), size.getHeight())) {
                                    kad = this;
                                } else {
                                    treeMap.put(new Size(ha0.e, ha0.f), a2);
                                    arrayList.add(a14.p(ha0, size, dff.b1()));
                                }
                            }
                            kad = this;
                            int i3 = i;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Size size2 = msd.a;
                        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
                        if (ceilingEntry != null) {
                            obj = ceilingEntry.getValue();
                        } else {
                            Map.Entry floorEntry = treeMap.floorEntry(size);
                            obj = floorEntry != null ? floorEntry.getValue() : null;
                        }
                        f15 f15 = (f15) obj;
                        Objects.requireNonNull(f15);
                        ga0 = ga0.e(f15.a(), f15.b(), f15.c(), arrayList);
                    } else {
                        kad = this;
                        int i4 = i;
                    }
                }
            }
            if (n == null && ga0 == null) {
                n = null;
            } else {
                int a3 = n != null ? n.a() : ga0.a;
                int b2 = n != null ? n.b() : ga0.b;
                List c2 = n != null ? n.c() : ga0.c;
                ArrayList arrayList2 = new ArrayList();
                if (n != null) {
                    arrayList2.addAll(n.d());
                }
                if (ga0 != null) {
                    arrayList2.addAll(ga0.d);
                }
                n = ga0.e(a3, b2, c2, arrayList2);
            }
        }
        hashMap.put(Integer.valueOf(i), n);
        return n;
    }

    public Pair d(ez7 ez7) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < ez7.a; i3++) {
            if (ez7.c[i3].a != 0) {
                zpd zpd = (zpd) this.b;
                zpd.Z1();
                t75 t75 = zpd.c;
                t75.s2();
                int i4 = t75.s0[i3].a;
                if (i4 == 1) {
                    i2 = i3;
                } else if (i4 == 2) {
                    i = i3;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public boolean e() {
        int i;
        int i2;
        ez7 ez7;
        int intValue;
        List list;
        if (((fef) this.c) == null) {
            return false;
        }
        bf4 bf4 = (bf4) this.a;
        ez7 ez72 = bf4.c;
        ArrayList arrayList = null;
        if (ez72 != null) {
            Pair d = d(ez72);
            int intValue2 = ((Integer) d.first).intValue();
            int intValue3 = ((Integer) d.second).intValue();
            if (intValue2 >= 0) {
                sze[] szeArr = ez72.c;
                ArrayList f = f(intValue2, szeArr[intValue2]);
                ArrayList<lze> f2 = intValue3 > 0 ? f(intValue3, szeArr[intValue3]) : null;
                ArrayList arrayList2 = new ArrayList(f.size());
                for (int i3 = 0; i3 < f.size(); i3++) {
                    lze lze = (lze) f.get(i3);
                    int i4 = lze.t0;
                    if (f2 == null) {
                        list = Collections.emptyList();
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (lze lze2 : f2) {
                            if (lze2.t0 == i4) {
                                arrayList3.add(lze2);
                            }
                        }
                        list = arrayList3;
                    }
                    arrayList2.add(new mze(lze, list));
                    if ((((fef) this.c) instanceof yn6) && lze.X == 0) {
                        ef7 ef7 = (ef7) this.Y;
                        if (ef7.get() != null) {
                            ((ad) ef7.get()).f("HLS_WITHOUT_HEIGHT");
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null) {
            this.o = Collections.emptyList();
            return false;
        }
        this.o = arrayList;
        int i5 = ((t33) this.X).g.getInt("app.video.play.quality", -1);
        if (i5 > 0) {
            h(i5);
        }
        fef fef = (fef) this.c;
        if (fef == null) {
            return true;
        }
        ok0 ok0 = (ok0) fef;
        if (ok0.b <= 0 || (i = ok0.h) == -1 || (i2 = ok0.i) == -1 || (ez7 = bf4.c) == null || (intValue = ((Integer) d(ez7).second).intValue()) < 0) {
            return true;
        }
        qe4 qe4 = new qe4(i2, 0, new int[]{i});
        sze sze = ez7.c[intValue];
        pe4 b2 = bf4.b();
        b2.e(intValue, sze, qe4);
        bf4.h(b2);
        return true;
    }

    public ArrayList f(int i, sze sze) {
        int i2;
        ArrayList arrayList;
        sze sze2 = sze;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < sze2.a; i3++) {
            qze a2 = sze2.a(i3);
            int i4 = 0;
            while (i4 < a2.a) {
                oy5 oy5 = a2.c[i4];
                cle cle = (cle) this.Z;
                cle.getClass();
                if (ha9.g(oy5.w0) == 1) {
                    List list = cle.c;
                    arrayList = new ArrayList();
                    for (Object next : list) {
                        if (next instanceof u78) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    if (ha9.g(oy5.w0) == 2) {
                        List list2 = cle.d;
                        arrayList = new ArrayList();
                        for (Object next2 : list2) {
                            if (next2 instanceof s88) {
                                arrayList.add(next2);
                            }
                        }
                    }
                    lze lze = r4;
                    i2 = i4;
                    lze lze2 = new lze(oy5.a, oy5.b, oy5.c, oy5.B0, oy5.C0, oy5.s0, i, i3, i4);
                    arrayList2.add(lze);
                    i4 = i2 + 1;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            hm9.m("kad", "mapTracks: Skip format %s", oy5);
                            i2 = i4;
                            break;
                        }
                        try {
                            if ((((f88) it.next()).A(oy5) & 7) == 4) {
                                break;
                            }
                        } catch (ExoPlaybackException unused) {
                        }
                    }
                    i4 = i2 + 1;
                }
                lze lze3 = lze2;
                i2 = i4;
                lze lze22 = new lze(oy5.a, oy5.b, oy5.c, oy5.B0, oy5.C0, oy5.s0, i, i3, i4);
                arrayList2.add(lze3);
                i4 = i2 + 1;
            }
        }
        Collections.sort(arrayList2, new ye4(25));
        return arrayList2;
    }

    public void g() {
        ((lh4) this.a).a = -1;
        ((lh4) this.b).a = -1;
        ((lh4) this.c).a = -1;
        ((lh4) this.o).a = -1;
        ((lh4) this.X).a = -1;
        ((lh4) this.Y).a = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        r5 = r9.s0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(int r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            bf4 r0 = (defpackage.bf4) r0
            ez7 r1 = r0.c
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r8 = r8.o
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
        L_0x0012:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r8.next()
            mze r3 = (defpackage.mze) r3
            if (r2 != 0) goto L_0x0022
        L_0x0020:
            r2 = r3
            goto L_0x0012
        L_0x0022:
            lze r4 = r3.a
            int r4 = r4.X
            int r4 = r4 - r9
            int r4 = java.lang.Math.abs(r4)
            lze r5 = r2.a
            int r5 = r5.X
            int r5 = r5 - r9
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto L_0x0012
            goto L_0x0020
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            return
        L_0x003a:
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            java.lang.String r9 = "kad"
            java.lang.String r3 = "selectTrackWithHeight %s"
            defpackage.hm9.m(r9, r3, r8)
            qe4 r8 = new qe4
            lze r9 = r2.a
            int r3 = r9.s0
            int r4 = r9.t0
            int[] r5 = new int[]{r4}
            r6 = 0
            r8.<init>(r3, r6, r5)
            sze[] r1 = r1.c
            int r3 = r9.Z
            r5 = r1[r3]
            pe4 r7 = r0.b()
            r7.e(r3, r5, r8)
            r0.h(r7)
            java.util.List r8 = r2.b
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x00a0
            java.util.Iterator r8 = r8.iterator()
        L_0x0073:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r8.next()
            lze r2 = (defpackage.lze) r2
            int r3 = r2.t0
            if (r3 != r4) goto L_0x0073
            int r5 = r9.s0
            int r7 = r2.s0
            if (r7 != r5) goto L_0x0073
            qe4 r8 = new qe4
            int[] r9 = new int[]{r3}
            r8.<init>(r7, r6, r9)
            int r9 = r2.Z
            r1 = r1[r9]
            pe4 r2 = r0.b()
            r2.e(r9, r1, r8)
            r0.h(r2)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kad.h(int):void");
    }

    public boolean m(int i) {
        return c(i) != null;
    }

    public f15 n(int i) {
        return c(i);
    }

    public kad(Account account, Set set, String str, String str2) {
        jod jod = jod.a;
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.o = str;
        this.X = str2;
        this.Y = jod;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
        } else {
            au1.r(it.next());
            throw null;
        }
    }

    public kad(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, khe khe) {
        this.a = new jad(je7);
        this.b = je72;
        this.c = je73;
        this.o = khe;
        this.X = je75;
        this.Y = je76;
        this.Z = new khe(new z30(27, je74));
    }

    public kad(zpd zpd, bf4 bf4, t33 t33, ef7 ef7, cle cle) {
        this.o = Collections.emptyList();
        this.b = zpd;
        this.a = bf4;
        this.X = t33;
        this.Y = ef7;
        this.Z = cle;
    }

    public kad(djb djb, ArrayList arrayList, Set set, List list) {
        mu1 mu1 = eff.o;
        this.Y = new HashMap();
        this.Z = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            eu4 eu4 = (eu4) it.next();
            if (!eu4.b()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + eu4);
            }
        }
        this.a = djb;
        this.b = new HashSet(arrayList);
        this.o = new HashSet(set);
        this.c = new HashSet(list);
        this.X = mu1;
    }
}
