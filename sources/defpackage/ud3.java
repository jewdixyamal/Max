package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: ud3  reason: default package */
public final class ud3 implements Iterator, qb7 {
    public final /* synthetic */ vd3 X;
    public final a66 a;
    public int b = -1;
    public Object c;
    public Object o;

    public ud3(vd3 vd3, a66 a66) {
        this.X = vd3;
        this.a = a66;
        a();
    }

    public final void a() {
        Object obj;
        while (true) {
            int i = this.b + 1;
            this.b = i;
            vd3 vd3 = this.X;
            if (i < vd3.a) {
                ui6 ui6 = (ui6) vd3.d.get(i);
                if (!(ui6 == null || (obj = ui6.get()) == null)) {
                    this.c = obj;
                    Object obj2 = vd3.e.get(this.b);
                    if (obj2 instanceof a08) {
                        obj2 = ((a08) obj2).a;
                    }
                    if (obj2 != null) {
                        this.o = obj2;
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.X.a;
    }

    public final Object next() {
        if (this.b < this.X.a) {
            Object obj = this.c;
            Object obj2 = e5f.a;
            if (obj == null) {
                obj = obj2;
            }
            Object obj3 = this.o;
            if (obj3 != null) {
                obj2 = obj3;
            }
            Object invoke = this.a.invoke(obj, obj2);
            a();
            return invoke;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        Symbol symbol = zd3.a;
        throw new UnsupportedOperationException("not implemented");
    }
}
