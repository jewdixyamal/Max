package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a3a  reason: default package */
public abstract class a3a {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public k56 c;

    public a3a(boolean z) {
        this.a = z;
    }

    public void a() {
    }

    public abstract void b();

    public void c(ge0 ge0) {
    }

    public void d() {
    }

    public final void e() {
        for (qy1 cancel : this.b) {
            cancel.cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        k56 k56 = this.c;
        if (k56 != null) {
            k56.invoke();
        }
    }
}
