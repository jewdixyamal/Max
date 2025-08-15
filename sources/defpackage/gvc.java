package defpackage;

/* renamed from: gvc  reason: default package */
public final class gvc implements eu6 {
    public final eu6 a;
    public final Object b = new Object();
    public boolean c;
    public wu1 d;

    public gvc(eu6 eu6) {
        this.a = eu6;
    }

    public final void a(long j, wu1 wu1) {
        e5f e5f;
        synchronized (this.b) {
            this.c = true;
            this.d = wu1;
        }
        eu6 eu6 = this.a;
        if (eu6 != null) {
            eu6.a(j, new wu1(1, this));
            e5f = e5f.a;
        } else {
            e5f = null;
        }
        if (e5f == null) {
            c();
        }
    }

    public final void b() {
        eu6 eu6;
        synchronized (this.b) {
            try {
                if (this.c && (eu6 = this.a) != null) {
                    eu6.clear();
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                wu1 wu1 = this.d;
                if (wu1 != null) {
                    wu1.a();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        b();
    }
}
