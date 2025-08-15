package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Predicate;
import kotlin.coroutines.Continuation;

/* renamed from: ky5  reason: default package */
public final class ky5 implements Collection, qb7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public ky5(ly5 ly5) {
        this.b = ly5.a;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof l38)) {
                    return false;
                }
                return ((ConcurrentSkipListSet) this.b).contains((l38) obj);
            default:
                return ((qi9) this.b).c(obj);
        }
    }

    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).containsAll(collection);
            default:
                if (collection.isEmpty()) {
                    return true;
                }
                for (Object c : collection) {
                    if (!((qi9) this.b).c(c)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).isEmpty();
            default:
                return ((qi9) this.b).h();
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).iterator();
            default:
                return m6d.u(new tsc((qi9) this.b, (Continuation) null));
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeIf(Predicate predicate) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).size();
            default:
                return ((qi9) this.b).e;
        }
    }

    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return f46.d0(this);
            default:
                return f46.d0(this);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                return f46.e0(this, objArr);
            default:
                return f46.e0(this, objArr);
        }
    }

    public ky5(qi9 qi9) {
        this.b = qi9;
    }
}
