package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: zbd  reason: default package */
public final class zbd extends ybd implements SortedSet {
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        a7b a7b = this.b;
        a7b.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (a7b.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, ybd] */
    public final SortedSet headSet(Object obj) {
        return new ybd(((SortedSet) this.a).headSet(obj), this.b);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, ybd] */
    public final SortedSet subSet(Object obj, Object obj2) {
        return new ybd(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, ybd] */
    public final SortedSet tailSet(Object obj) {
        return new ybd(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
