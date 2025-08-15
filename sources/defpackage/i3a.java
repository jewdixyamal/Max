package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: i3a  reason: default package */
public final class i3a {
    public final Runnable a;
    public final hs b = new hs();
    public a3a c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public i3a(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? f3a.a.a(new b3a(this, 0), new b3a(this, 1), new c3a(this, 0), new c3a(this, 1)) : d3a.a.a(new c3a(this, 2));
        }
    }

    public final void a(eh7 eh7, a3a a3a) {
        gh7 Q = eh7.Q();
        if (Q.d != fg7.a) {
            a3a.b.add(new g3a(this, Q, a3a));
            f();
            a3a.c = new e09(0, this, i3a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        }
    }

    public final h3a b(a3a a3a) {
        this.b.b(a3a);
        h3a h3a = new h3a(this, a3a);
        a3a.b.add(h3a);
        f();
        a3a.c = new e09(0, this, i3a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
        return h3a;
    }

    public final void c() {
        Object obj;
        a3a a3a = this.c;
        if (a3a == null) {
            hs hsVar = this.b;
            ListIterator listIterator = hsVar.listIterator(hsVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((a3a) obj).a) {
                    break;
                }
            }
            a3a = (a3a) obj;
        }
        this.c = null;
        if (a3a != null) {
            a3a.a();
        }
    }

    public final void d() {
        Object obj;
        a3a a3a = this.c;
        if (a3a == null) {
            hs hsVar = this.b;
            ListIterator listIterator = hsVar.listIterator(hsVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((a3a) obj).a) {
                    break;
                }
            }
            a3a = (a3a) obj;
        }
        this.c = null;
        if (a3a != null) {
            a3a.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            d3a d3a = d3a.a;
            if (z && !this.f) {
                d3a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z && this.f) {
                d3a.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void f() {
        boolean z = this.g;
        hs hsVar = this.b;
        boolean z2 = false;
        if (!(hsVar instanceof Collection) || !hsVar.isEmpty()) {
            Iterator it = hsVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a3a) it.next()).a) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            e(z2);
        }
    }
}
