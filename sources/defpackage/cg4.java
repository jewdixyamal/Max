package defpackage;

/* renamed from: cg4  reason: default package */
public class cg4 extends vk0 {
    public final f2a a;
    public Object b;

    public cg4(f2a f2a) {
        this.a = f2a;
    }

    public void a(Object obj) {
        f(obj);
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void f(Object obj) {
        int i = get();
        if ((i & 54) == 0) {
            f2a f2a = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                f2a.e((Object) null);
            } else {
                lazySet(2);
                f2a.e(obj);
            }
            if (get() != 4) {
                f2a.b();
            }
        }
    }

    public void g() {
        set(4);
        this.b = null;
    }

    public final boolean h() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final int n(int i) {
        lazySet(8);
        return 2;
    }

    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
