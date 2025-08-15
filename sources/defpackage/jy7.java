package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;

/* renamed from: jy7  reason: default package */
public abstract class jy7 {
    public int a;
    public int b;
    public int c;
    public Object o;

    /* JADX WARNING: type inference failed for: r0v2, types: [yb9, java.lang.Object] */
    public jy7() {
        if (yb9.Y == null) {
            yb9.Y = new Object();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.o).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((ky7) this.o).s0 != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public Object e(View view) {
        if (Build.VERSION.SDK_INT >= this.b) {
            return c(view);
        }
        Object tag = view.getTag(this.a);
        if (((Class) this.o).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void f() {
        while (true) {
            int i = this.a;
            ky7 ky7 = (ky7) this.o;
            if (i < ky7.Y && ky7.c[i] < 0) {
                this.a = i + 1;
            } else {
                return;
            }
        }
    }

    public void g(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
        } else if (h(e(view), obj)) {
            WeakHashMap weakHashMap = zmf.a;
            View.AccessibilityDelegate a2 = umf.a(view);
            a4 a4Var = a2 == null ? null : a2 instanceof z3 ? ((z3) a2).a : new a4(a2);
            if (a4Var == null) {
                a4Var = new a4();
            }
            zmf.j(view, a4Var);
            view.setTag(this.a, obj);
            zmf.e(view, this.c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((ky7) this.o).Y;
    }

    public void remove() {
        b();
        if (this.b != -1) {
            ky7 ky7 = (ky7) this.o;
            ky7.c();
            ky7.j(this.b);
            this.b = -1;
            this.c = ky7.s0;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
    }
}
