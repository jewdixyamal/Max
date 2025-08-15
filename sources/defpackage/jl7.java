package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: jl7  reason: default package */
public final class jl7 extends r2 implements RandomAccess, Serializable {
    public final kl7 X;
    public Object[] a;
    public final int b;
    public int c;
    public final jl7 o;

    public jl7(Object[] objArr, int i, int i2, jl7 jl7, kl7 kl7) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.o = jl7;
        this.X = kl7;
        this.modCount = kl7.modCount;
    }

    public final Object a(int i) {
        f();
        e();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return g(this.b + i);
        }
        throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
    }

    public final boolean add(Object obj) {
        f();
        e();
        d(this.b + this.c, obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        f();
        e();
        int size = collection.size();
        c(this.b + this.c, collection, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i2) {
        this.modCount++;
        kl7 kl7 = this.X;
        jl7 jl7 = this.o;
        if (jl7 != null) {
            jl7.c(i, collection, i2);
        } else {
            kl7 kl72 = kl7.o;
            kl7.c(i, collection, i2);
        }
        this.a = kl7.a;
        this.c += i2;
    }

    public final void clear() {
        f();
        e();
        h(this.b, this.c);
    }

    public final void d(int i, Object obj) {
        this.modCount++;
        kl7 kl7 = this.X;
        jl7 jl7 = this.o;
        if (jl7 != null) {
            jl7.d(i, obj);
        } else {
            kl7 kl72 = kl7.o;
            kl7.d(i, obj);
        }
        this.a = kl7.a;
        this.c++;
    }

    public final void e() {
        if (this.X.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        e();
        if (obj != this) {
            if (obj instanceof List) {
                if (j47.b(this.a, this.b, this.c, (List) obj)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        if (this.X.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object g(int i) {
        Object obj;
        this.modCount++;
        jl7 jl7 = this.o;
        if (jl7 != null) {
            obj = jl7.g(i);
        } else {
            kl7 kl7 = kl7.o;
            obj = this.X.g(i);
        }
        this.c--;
        return obj;
    }

    public final Object get(int i) {
        e();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a[this.b + i];
        }
        throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
    }

    public final int getSize() {
        e();
        return this.c;
    }

    public final void h(int i, int i2) {
        if (i2 > 0) {
            this.modCount++;
        }
        jl7 jl7 = this.o;
        if (jl7 != null) {
            jl7.h(i, i2);
        } else {
            kl7 kl7 = kl7.o;
            this.X.h(i, i2);
        }
        this.c -= i2;
    }

    public final int hashCode() {
        e();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.b + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final int i(int i, int i2, Collection collection, boolean z) {
        int i3;
        jl7 jl7 = this.o;
        if (jl7 != null) {
            i3 = jl7.i(i, i2, collection, z);
        } else {
            kl7 kl7 = kl7.o;
            i3 = this.X.i(i, i2, collection, z);
        }
        if (i3 > 0) {
            this.modCount++;
        }
        this.c -= i3;
        return i3;
    }

    public final int indexOf(Object obj) {
        e();
        for (int i = 0; i < this.c; i++) {
            if (tpa.f(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        e();
        return this.c == 0;
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        e();
        for (int i = this.c - 1; i >= 0; i--) {
            if (tpa.f(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final boolean remove(Object obj) {
        f();
        e();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            a(indexOf);
        }
        return indexOf >= 0;
    }

    public final boolean removeAll(Collection collection) {
        f();
        e();
        return i(this.b, this.c, collection, false) > 0;
    }

    public final boolean retainAll(Collection collection) {
        f();
        e();
        return i(this.b, this.c, collection, true) > 0;
    }

    public final Object set(int i, Object obj) {
        f();
        e();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    public final List subList(int i, int i2) {
        wmd.k(i, i2, this.c);
        return new jl7(this.a, this.b + i, i2 - i, this, this.X);
    }

    public final Object[] toArray(Object[] objArr) {
        e();
        int length = objArr.length;
        int i = this.c;
        int i2 = this.b;
        if (length < i) {
            return Arrays.copyOfRange(this.a, i2, i + i2, objArr.getClass());
        }
        ys.W(0, i2, i + i2, this.a, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final String toString() {
        e();
        return j47.c(this.a, this.b, this.c, this);
    }

    public final ListIterator listIterator(int i) {
        e();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            return new il7(this, i);
        }
        throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
    }

    public final void add(int i, Object obj) {
        f();
        e();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        d(this.b + i, obj);
    }

    public final boolean addAll(int i, Collection collection) {
        f();
        e();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        int size = collection.size();
        c(this.b + i, collection, size);
        return size > 0;
    }

    public final Object[] toArray() {
        e();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        int i3 = i + i2;
        dy7.m(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }
}
