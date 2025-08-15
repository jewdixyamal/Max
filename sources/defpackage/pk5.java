package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: pk5  reason: default package */
public final class pk5 implements Iterator, qb7 {
    public final /* synthetic */ c6d X;
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public int c;
    public Object o;

    public pk5(qk5 qk5) {
        this.X = qk5;
        this.b = qk5.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        qk5 qk5;
        do {
            Iterator it = this.b;
            if (it.hasNext()) {
                next = it.next();
                qk5 = (qk5) this.X;
            } else {
                this.c = 0;
                return;
            }
        } while (((Boolean) qk5.c.invoke(next)).booleanValue() != qk5.b);
        this.o = next;
        this.c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.o;
        if (it2 == null || !it2.hasNext()) {
            do {
                Iterator it3 = this.b;
                if (it3.hasNext()) {
                    Object next = it3.next();
                    um5 um5 = (um5) this.X;
                    it = (Iterator) um5.c.invoke(um5.b.invoke(next));
                } else {
                    this.c = 2;
                    this.o = null;
                    return false;
                }
            } while (!it.hasNext());
            this.o = it;
            this.c = 1;
            return true;
        }
        this.c = 1;
        return true;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            default:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c != 0) {
                    Object obj = this.o;
                    this.o = null;
                    this.c = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                int i = this.c;
                if (i == 2) {
                    throw new NoSuchElementException();
                } else if (i != 0 || b()) {
                    this.c = 0;
                    return ((Iterator) this.o).next();
                } else {
                    throw new NoSuchElementException();
                }
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public pk5(um5 um5) {
        this.X = um5;
        this.b = um5.a.iterator();
    }
}
