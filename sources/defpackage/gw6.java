package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gw6  reason: default package */
public final class gw6 implements Iterator {
    public final /* synthetic */ int a;
    public final uaf[] b;
    public int c = 0;

    public /* synthetic */ gw6(uaf[] uafArr, int i) {
        this.a = i;
        this.b = uafArr;
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.c != this.b.length;
            default:
                return this.c < this.b.length;
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.c;
                uaf[] uafArr = this.b;
                if (i < uafArr.length) {
                    this.c = i + 1;
                    return uafArr[i];
                }
                throw new NoSuchElementException();
            default:
                int i2 = this.c;
                uaf[] uafArr2 = this.b;
                if (i2 < uafArr2.length) {
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(uafArr2[i2], uafArr2[i2 + 1]);
                    this.c += 2;
                    return simpleImmutableEntry;
                }
                throw new NoSuchElementException();
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
