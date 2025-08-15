package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: il7  reason: default package */
public final class il7 implements ListIterator, qb7 {
    public final r2 X;
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int o;

    public il7(kl7 kl7, int i) {
        this.X = kl7;
        this.b = i;
        this.c = -1;
        this.o = kl7.modCount;
    }

    public void a() {
        if (((jl7) this.X).X.modCount != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                this.b = i + 1;
                jl7 jl7 = (jl7) this.X;
                jl7.add(i, obj);
                this.c = -1;
                this.o = jl7.modCount;
                return;
            default:
                b();
                int i2 = this.b;
                this.b = i2 + 1;
                kl7 kl7 = (kl7) this.X;
                kl7.add(i2, obj);
                this.c = -1;
                this.o = kl7.modCount;
                return;
        }
    }

    public void b() {
        if (((kl7) this.X).modCount != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < ((jl7) this.X).c;
            default:
                return this.b < ((kl7) this.X).b;
        }
    }

    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b > 0;
            default:
                return this.b > 0;
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                jl7 jl7 = (jl7) this.X;
                if (i < jl7.c) {
                    this.b = i + 1;
                    this.c = i;
                    return jl7.a[jl7.b + i];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i2 = this.b;
                kl7 kl7 = (kl7) this.X;
                if (i2 < kl7.b) {
                    this.b = i2 + 1;
                    this.c = i2;
                    return kl7.a[i2];
                }
                throw new NoSuchElementException();
        }
    }

    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final Object previous() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                if (i > 0) {
                    int i2 = i - 1;
                    this.b = i2;
                    this.c = i2;
                    jl7 jl7 = (jl7) this.X;
                    return jl7.a[jl7.b + i2];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i3 = this.b;
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    this.b = i4;
                    this.c = i4;
                    return ((kl7) this.X).a[i4];
                }
                throw new NoSuchElementException();
        }
    }

    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return this.b - 1;
            default:
                return this.b - 1;
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i != -1) {
                    jl7 jl7 = (jl7) this.X;
                    jl7.a(i);
                    this.b = this.c;
                    this.c = -1;
                    this.o = jl7.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            default:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    kl7 kl7 = (kl7) this.X;
                    kl7.a(i2);
                    this.b = this.c;
                    this.c = -1;
                    this.o = kl7.modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
    }

    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i != -1) {
                    ((jl7) this.X).set(i, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            default:
                b();
                int i2 = this.c;
                if (i2 != -1) {
                    ((kl7) this.X).set(i2, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public il7(jl7 jl7, int i) {
        this.X = jl7;
        this.b = i;
        this.c = -1;
        this.o = jl7.modCount;
    }
}
