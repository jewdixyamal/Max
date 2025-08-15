package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ly7  reason: default package */
public final class ly7 extends t2 {
    public final /* synthetic */ int a;
    public final ky7 b;

    public /* synthetic */ ly7(int i, ky7 ky7) {
        this.a = i;
        this.b = ky7;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ky7 ky7 = this.b;
                ky7.getClass();
                int g = ky7.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                return tpa.f(ky7.b[g], entry.getValue());
            default:
                return this.b.containsKey(obj);
        }
    }

    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return this.b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    public final int getSize() {
        switch (this.a) {
            case 0:
                return this.b.t0;
            default:
                return this.b.t0;
        }
    }

    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return this.b.isEmpty();
            default:
                return this.b.isEmpty();
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                ky7 ky7 = this.b;
                ky7.getClass();
                return new hy7(0, ky7);
            default:
                ky7 ky72 = this.b;
                ky72.getClass();
                return new hy7(1, ky72);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ky7 ky7 = this.b;
                ky7.c();
                int g = ky7.g(entry.getKey());
                if (g < 0 || !tpa.f(ky7.b[g], entry.getValue())) {
                    return false;
                }
                ky7.j(g);
                return true;
            default:
                ky7 ky72 = this.b;
                ky72.c();
                int g2 = ky72.g(obj);
                if (g2 < 0) {
                    return false;
                }
                ky72.j(g2);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                return super.removeAll(collection);
            default:
                this.b.c();
                return super.removeAll(collection);
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                return super.retainAll(collection);
            default:
                this.b.c();
                return super.retainAll(collection);
        }
    }
}
