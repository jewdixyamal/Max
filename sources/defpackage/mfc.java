package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: mfc  reason: default package */
public final class mfc extends ox6 {
    public static final mfc Z = new mfc(ffc.X, sm9.a);
    public final transient zw6 Y;

    static {
        ls5 ls5 = zw6.b;
    }

    public mfc(zw6 zw6, Comparator comparator) {
        super(comparator);
        this.Y = zw6;
    }

    public final zw6 a() {
        return this.Y;
    }

    public final int b(int i, Object[] objArr) {
        return this.Y.b(i, objArr);
    }

    public final Object[] c() {
        return this.Y.c();
    }

    public final Object ceiling(Object obj) {
        int r = r(obj, true);
        zw6 zw6 = this.Y;
        if (r == zw6.size()) {
            return null;
        }
        return zw6.get(r);
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.Y, obj, this.o) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.o;
        if (!ema.t(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        m5f g = g();
        Iterator it = collection.iterator();
        o1 o1Var = (o1) g;
        if (!o1Var.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = o1Var.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!o1Var.hasNext()) {
                        return false;
                    }
                    next2 = o1Var.next();
                } else if (compare == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (compare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int d() {
        return this.Y.d();
    }

    public final Iterator descendingIterator() {
        return this.Y.q().listIterator(0);
    }

    public final int e() {
        return this.Y.e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ ClassCastException | NoSuchElementException -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            zw6 r1 = r5.Y
            int r1 = r1.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0019
            return r2
        L_0x0019:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0020
            return r0
        L_0x0020:
            java.util.Comparator r1 = r5.o
            boolean r3 = defpackage.ema.t(r6, r1)
            if (r3 == 0) goto L_0x004c
            java.util.Iterator r6 = r6.iterator()
            m5f r5 = r5.g()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
        L_0x0030:
            r3 = r5
            o1 r3 = (defpackage.o1) r3     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            boolean r4 = r3.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            if (r4 == 0) goto L_0x004a
            java.lang.Object r3 = r3.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            if (r4 == 0) goto L_0x0049
            int r3 = r1.compare(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x004b }
            if (r3 == 0) goto L_0x0030
        L_0x0049:
            return r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        L_0x004c:
            boolean r5 = r5.containsAll(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfc.equals(java.lang.Object):boolean");
    }

    public final boolean f() {
        return this.Y.f();
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.Y.get(0);
        }
        throw new NoSuchElementException();
    }

    public final Object floor(Object obj) {
        int q = q(obj, true) - 1;
        if (q == -1) {
            return null;
        }
        return this.Y.get(q);
    }

    public final m5f g() {
        return this.Y.listIterator(0);
    }

    public final Object higher(Object obj) {
        int r = r(obj, false);
        zw6 zw6 = this.Y;
        if (r == zw6.size()) {
            return null;
        }
        return zw6.get(r);
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.Y, obj, this.o);
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public final Object last() {
        if (!isEmpty()) {
            zw6 zw6 = this.Y;
            return zw6.get(zw6.size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final Object lower(Object obj) {
        int q = q(obj, false) - 1;
        if (q == -1) {
            return null;
        }
        return this.Y.get(q);
    }

    public final mfc p(int i, int i2) {
        zw6 zw6 = this.Y;
        if (i == 0 && i2 == zw6.size()) {
            return this;
        }
        Comparator comparator = this.o;
        return i < i2 ? new mfc(zw6.subList(i, i2), comparator) : ox6.n(comparator);
    }

    public final int q(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.Y, obj, this.o);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int r(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.Y, obj, this.o);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final int size() {
        return this.Y.size();
    }
}
