package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.ok.android.externcalls.sdk.u;

/* renamed from: j77  reason: default package */
public final class j77 implements Iterator {
    public final /* synthetic */ i77 X;
    public final Iterator a;
    public Object b;
    public boolean c = false;
    public boolean o = false;

    public j77(i77 i77, Iterator it) {
        this.X = i77;
        this.a = it;
    }

    public final boolean hasNext() {
        Object next;
        if (this.o) {
            return true;
        }
        if (this.c) {
            return false;
        }
        do {
            Iterator it = this.a;
            if (it.hasNext()) {
                next = it.next();
                ((u) this.X.c).getClass();
            } else {
                this.c = true;
                return false;
            }
        } while (!u.b(next));
        this.o = true;
        this.b = next;
        return true;
    }

    public final Object next() {
        Object next;
        if (this.o) {
            this.o = false;
            return this.b;
        }
        do {
            Iterator it = this.a;
            if (it.hasNext()) {
                next = it.next();
                ((u) this.X.c).getClass();
            } else {
                throw new NoSuchElementException("This FilterIterator has nothing to output");
            }
        } while (!u.b(next));
        this.b = next;
        this.o = false;
        return next;
    }
}
