package defpackage;

import java.util.NoSuchElementException;

/* renamed from: p1  reason: default package */
public abstract class p1 extends m5f {
    public int b = 2;
    public Object c;

    public p1() {
        super(0);
    }

    public abstract Object a();

    public final boolean hasNext() {
        int i = this.b;
        if (i != 4) {
            int s = au1.s(i);
            if (s == 0) {
                return true;
            }
            if (s == 2) {
                return false;
            }
            this.b = 4;
            this.c = a();
            if (this.b == 3) {
                return false;
            }
            this.b = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            Object obj = this.c;
            this.c = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
