package defpackage;

import java.util.Iterator;

/* renamed from: u6d  reason: default package */
public final class u6d implements Iterator, qb7 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ r6d c;

    public u6d(r6d r6d, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = r6d;
                this.b = r6d.f();
                return;
            default:
                this.c = r6d;
                this.b = r6d.f();
                return;
        }
    }

    public final boolean hasNext() {
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
                r6d r6d = this.c;
                int f = r6d.f();
                int i = this.b;
                this.b = i - 1;
                return r6d.i(f - i);
            default:
                r6d r6d2 = this.c;
                int f2 = r6d2.f();
                int i2 = this.b;
                this.b = i2 - 1;
                return r6d2.g(f2 - i2);
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
}
