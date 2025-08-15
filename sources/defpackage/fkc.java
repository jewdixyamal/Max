package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: fkc  reason: default package */
public final class fkc implements ListIterator, qb7 {
    public final /* synthetic */ int a = 0;
    public final ListIterator b;
    public final /* synthetic */ Object c;

    public fkc(r08 r08, int i) {
        this.c = r08;
        this.b = ((List) r08.b).listIterator(x53.b0(i, r08));
    }

    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasPrevious();
            default:
                return this.b.hasPrevious();
        }
    }

    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.previous();
            default:
                return this.b.previous();
        }
    }

    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return y53.L((gkc) this.c) - this.b.previousIndex();
            default:
                return y53.L((r08) this.c) - this.b.previousIndex();
        }
    }

    public final Object previous() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return this.b.next();
        }
    }

    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return y53.L((gkc) this.c) - this.b.nextIndex();
            default:
                return y53.L((r08) this.c) - this.b.nextIndex();
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                this.b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public fkc(gkc gkc, int i) {
        this.c = gkc;
        this.b = gkc.a.listIterator(x53.b0(i, gkc));
    }
}
