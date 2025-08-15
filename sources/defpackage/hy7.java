package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hy7  reason: default package */
public final class hy7 extends jy7 implements Iterator, qb7 {
    public final /* synthetic */ int X;

    public hy7(int i, ky7 ky7) {
        this.X = i;
        this.o = ky7;
        this.b = -1;
        this.c = ky7.s0;
        f();
    }

    public final Object next() {
        switch (this.X) {
            case 0:
                b();
                int i = this.a;
                ky7 ky7 = (ky7) this.o;
                if (i < ky7.Y) {
                    this.a = i + 1;
                    this.b = i;
                    iy7 iy7 = new iy7(i, ky7);
                    f();
                    return iy7;
                }
                throw new NoSuchElementException();
            case 1:
                b();
                int i2 = this.a;
                ky7 ky72 = (ky7) this.o;
                if (i2 < ky72.Y) {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = ky72.a[i2];
                    f();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                b();
                int i3 = this.a;
                ky7 ky73 = (ky7) this.o;
                if (i3 < ky73.Y) {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object obj2 = ky73.b[i3];
                    f();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
