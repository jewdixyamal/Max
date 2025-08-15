package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: nx6  reason: default package */
public final class nx6 extends cx6 implements NavigableMap {
    public static final sm9 s0;
    public static final nx6 t0;
    public final transient mfc X;
    public final transient zw6 Y;
    public final transient nx6 Z;

    static {
        sm9 sm9 = sm9.a;
        s0 = sm9;
        mfc n = ox6.n(sm9);
        ls5 ls5 = zw6.b;
        t0 = new nx6(n, ffc.X, (nx6) null);
    }

    public nx6(mfc mfc, zw6 zw6, nx6 nx6) {
        this.X = mfc;
        this.Y = zw6;
        this.Z = nx6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.nx6 k(java.util.TreeMap r11) {
        /*
            java.util.Comparator r0 = r11.comparator()
            r1 = 1
            sm9 r2 = s0
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x000f
        L_0x000b:
            boolean r0 = r2.equals(r0)
        L_0x000f:
            java.util.Set r11 = r11.entrySet()
            java.util.Map$Entry[] r3 = defpackage.cx6.o
            boolean r4 = r11 instanceof java.util.Collection
            if (r4 == 0) goto L_0x001a
            goto L_0x0035
        L_0x001a:
            java.util.Iterator r11 = r11.iterator()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11.getClass()
        L_0x0026:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r11.next()
            r4.add(r5)
            goto L_0x0026
        L_0x0034:
            r11 = r4
        L_0x0035:
            java.lang.Object[] r11 = r11.toArray(r3)
            java.util.Map$Entry[] r11 = (java.util.Map.Entry[]) r11
            int r3 = r11.length
            if (r3 == 0) goto L_0x00fa
            r4 = 0
            r5 = 0
            if (r3 == r1) goto L_0x00d6
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Object[] r7 = new java.lang.Object[r3]
            if (r0 == 0) goto L_0x0061
        L_0x0048:
            if (r4 >= r3) goto L_0x00c3
            r0 = r11[r4]
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            defpackage.wmd.g(r1, r0)
            r6[r4] = r1
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0061:
            ba3 r0 = new ba3
            r8 = 1
            r0.<init>(r2, r8)
            java.util.Arrays.sort(r11, r4, r3, r0)
            r0 = r11[r4]
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r8 = r0.getKey()
            r6[r4] = r8
            java.lang.Object r0 = r0.getValue()
            r7[r4] = r0
            r4 = r6[r4]
            defpackage.wmd.g(r4, r0)
        L_0x0080:
            if (r1 >= r3) goto L_0x00c3
            int r0 = r1 + -1
            r0 = r11[r0]
            java.util.Objects.requireNonNull(r0)
            r4 = r11[r1]
            java.util.Objects.requireNonNull(r4)
            java.lang.Object r9 = r4.getKey()
            java.lang.Object r10 = r4.getValue()
            defpackage.wmd.g(r9, r10)
            r6[r1] = r9
            r7[r1] = r10
            int r8 = r2.compare(r8, r9)
            if (r8 == 0) goto L_0x00a7
            int r1 = r1 + 1
            r8 = r9
            goto L_0x0080
        L_0x00a7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Multiple entries with same key: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
        L_0x00c3:
            nx6 r11 = new nx6
            mfc r0 = new mfc
            ffc r1 = defpackage.zw6.h(r3, r6)
            r0.<init>(r1, r2)
            ffc r1 = defpackage.zw6.h(r3, r7)
            r11.<init>(r0, r1, r5)
            goto L_0x00fe
        L_0x00d6:
            r11 = r11[r4]
            java.util.Objects.requireNonNull(r11)
            java.lang.Object r0 = r11.getKey()
            java.lang.Object r11 = r11.getValue()
            nx6 r1 = new nx6
            mfc r3 = new mfc
            ffc r0 = defpackage.zw6.n(r0)
            r2.getClass()
            r3.<init>(r0, r2)
            ffc r11 = defpackage.zw6.n(r11)
            r1.<init>(r3, r11, r5)
            r11 = r1
            goto L_0x00fe
        L_0x00fa:
            nx6 r11 = l(r2)
        L_0x00fe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx6.k(java.util.TreeMap):nx6");
    }

    public static nx6 l(Comparator comparator) {
        return sm9.a.equals(comparator) ? t0 : new nx6(ox6.n(comparator), ffc.X, (nx6) null);
    }

    public static nx6 o() {
        return t0;
    }

    public final jx6 c() {
        if (!isEmpty()) {
            return new mx6(this);
        }
        int i = jx6.c;
        return lfc.u0;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    public final Comparator comparator() {
        return this.X.o;
    }

    public final jx6 d() {
        throw new AssertionError("should never be called");
    }

    public final NavigableSet descendingKeySet() {
        return this.X.descendingSet();
    }

    public final NavigableMap descendingMap() {
        nx6 nx6 = this.Z;
        if (nx6 != null) {
            return nx6;
        }
        boolean isEmpty = isEmpty();
        mfc mfc = this.X;
        return isEmpty ? l(zma.a(mfc.o).b()) : new nx6((mfc) mfc.descendingSet(), this.Y.q(), this);
    }

    public final qw6 e() {
        throw new AssertionError("should never be called");
    }

    public final Set entrySet() {
        return super.entrySet();
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(0);
    }

    public final Object firstKey() {
        return this.X.first();
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    public final boolean g() {
        return this.X.Y.f() || this.Y.f();
    }

    public final Object get(Object obj) {
        int indexOf = this.X.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.Y.get(indexOf);
    }

    public final jx6 h() {
        return this.X;
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    public final qw6 i() {
        return this.Y;
    }

    public final Set keySet() {
        return this.X;
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(this.Y.size() - 1);
    }

    public final Object lastKey() {
        return this.X.last();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    public final nx6 m(int i, int i2) {
        zw6 zw6 = this.Y;
        if (i == 0 && i2 == zw6.size()) {
            return this;
        }
        mfc mfc = this.X;
        return i == i2 ? l(mfc.o) : new nx6(mfc.p(i, i2), zw6.subList(i, i2), (nx6) null);
    }

    /* renamed from: n */
    public final nx6 headMap(Object obj, boolean z) {
        obj.getClass();
        return m(0, this.X.q(obj, z));
    }

    public final NavigableSet navigableKeySet() {
        return this.X;
    }

    /* renamed from: p */
    public final nx6 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.X.o.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw new IllegalArgumentException(i24.t("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public final nx6 tailMap(Object obj, boolean z) {
        obj.getClass();
        return m(this.X.r(obj, z), this.Y.size());
    }

    public final int size() {
        return this.Y.size();
    }

    public final Collection values() {
        return this.Y;
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
