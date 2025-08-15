package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: ox6  reason: default package */
public abstract class ox6 extends jx6 implements NavigableSet, xud {
    public transient ox6 X;
    public final transient Comparator o;

    public ox6(Comparator comparator) {
        this.o = comparator;
    }

    public static mfc n(Comparator comparator) {
        return sm9.a.equals(comparator) ? mfc.Z : new mfc(ffc.X, comparator);
    }

    public final Comparator comparator() {
        return this.o;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        mfc mfc = (mfc) this;
        return mfc.p(0, mfc.q(obj, z));
    }

    /* renamed from: m */
    public final ox6 descendingSet() {
        ox6 ox6 = this.X;
        if (ox6 == null) {
            mfc mfc = (mfc) this;
            Comparator reverseOrder = Collections.reverseOrder(mfc.o);
            ox6 = mfc.isEmpty() ? n(reverseOrder) : new mfc(mfc.Y.q(), reverseOrder);
            this.X = ox6;
            ox6.X = this;
        }
        return ox6;
    }

    /* renamed from: o */
    public final mfc subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.o.compare(obj, obj2) <= 0) {
            mfc mfc = (mfc) this;
            mfc p = mfc.p(mfc.r(obj, z), mfc.Y.size());
            return p.p(0, p.q(obj2, z2));
        }
        throw new IllegalArgumentException();
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        mfc mfc = (mfc) this;
        return mfc.p(mfc.r(obj, z), mfc.Y.size());
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet headSet(Object obj) {
        obj.getClass();
        mfc mfc = (mfc) this;
        return mfc.p(0, mfc.q(obj, false));
    }

    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        mfc mfc = (mfc) this;
        return mfc.p(mfc.r(obj, true), mfc.Y.size());
    }
}
