package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bx3  reason: default package */
public final class bx3 extends AbstractList implements RandomAccess {
    public final dx3 a;
    public final int b;
    public int c;
    public Object[] o;

    public bx3(dx3 dx3, int i, int i2) {
        this.a = dx3;
        this.o = dx3.b;
        this.b = i;
        this.c = i2 - i;
    }

    public final void a() {
        if (this.a.b != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(int i, Object obj) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            a();
            if (i < 0 || i > this.c) {
                throw new IndexOutOfBoundsException();
            }
            this.a.add(i + this.b, obj);
            this.o = this.a.b;
            this.c++;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(rh4.h("Index: ", i, this.c, ",Size: "));
        }
    }

    public final void clear() {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            a();
            dx3 dx3 = this.a;
            int i = this.b;
            dx3.a(dx3, i, this.c + i);
            this.o = this.a.b;
            this.c = 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object get(int i) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            b(i);
            a();
            dx3 dx3 = this.a;
            return dx3.b[i + this.b];
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Iterator iterator() {
        dx3 dx3 = this.a;
        ReentrantLock reentrantLock = dx3.a;
        reentrantLock.lock();
        try {
            a();
            return new cx3(dx3, 0, this.b, this.c);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ListIterator listIterator(int i) {
        int i2;
        dx3 dx3 = this.a;
        ReentrantLock reentrantLock = dx3.a;
        reentrantLock.lock();
        try {
            a();
            if (i >= 0 && i <= (i2 = this.c)) {
                return new cx3(dx3, i, this.b, i2);
            }
            int i3 = this.c;
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object remove(int i) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            b(i);
            a();
            Object remove = this.a.remove(i + this.b);
            this.o = this.a.b;
            this.c--;
            return remove;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object set(int i, Object obj) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            b(i);
            a();
            Object obj2 = this.a.set(i + this.b, obj);
            this.o = this.a.b;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int size() {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            a();
            return this.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final List subList(int i, int i2) {
        dx3 dx3 = this.a;
        ReentrantLock reentrantLock = dx3.a;
        reentrantLock.lock();
        try {
            a();
            if (i < 0 || i2 > this.c) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = this.b;
            return new bx3(dx3, i + i3, i2 + i3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
