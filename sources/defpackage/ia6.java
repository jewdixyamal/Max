package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ia6  reason: default package */
public final class ia6 implements Iterator, qb7 {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;
    public final /* synthetic */ c6d o;

    public ia6(rae rae) {
        this.o = rae;
        this.c = rae.a.iterator();
    }

    public void a() {
        int i = this.b;
        km4 km4 = (km4) this.o;
        Object invoke = i == -2 ? ((k56) km4.c).invoke() : ((m56) km4.b).invoke(this.c);
        this.c = invoke;
        this.b = invoke == null ? 0 : 1;
    }

    public final boolean hasNext() {
        rae rae;
        Iterator it;
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
        }
        while (true) {
            int i = this.b;
            rae = (rae) this.o;
            int i2 = rae.b;
            it = (Iterator) this.c;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.b++;
            }
        }
        return this.b < rae.c && it.hasNext();
    }

    public final Object next() {
        rae rae;
        Iterator it;
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b != 0) {
                    Object obj = this.c;
                    this.b = -1;
                    return obj;
                }
                throw new NoSuchElementException();
        }
        while (true) {
            int i = this.b;
            rae = (rae) this.o;
            int i2 = rae.b;
            it = (Iterator) this.c;
            if (i >= i2 || !it.hasNext()) {
                int i3 = this.b;
            } else {
                it.next();
                this.b++;
            }
        }
        int i32 = this.b;
        if (i32 < rae.c) {
            this.b = i32 + 1;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ia6(km4 km4) {
        this.o = km4;
        this.b = -2;
    }
}
