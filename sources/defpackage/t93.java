package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: t93  reason: default package */
public abstract class t93 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ v93 o;

    public t93(v93 v93) {
        this.o = v93;
        this.a = v93.X;
        this.b = v93.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    public abstract Object a(int i);

    public final boolean hasNext() {
        return this.b >= 0;
    }

    public final Object next() {
        v93 v93 = this.o;
        if (v93.X != this.a) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object a2 = a(i);
            int i2 = this.b + 1;
            if (i2 >= v93.Y) {
                i2 = -1;
            }
            this.b = i2;
            return a2;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        v93 v93 = this.o;
        int i = v93.X;
        int i2 = this.a;
        if (i == i2) {
            int i3 = this.c;
            if (i3 >= 0) {
                this.a = i2 + 32;
                v93.remove(v93.i()[i3]);
                this.b--;
                this.c = -1;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
