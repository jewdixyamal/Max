package defpackage;

import java.util.Objects;

/* renamed from: g0a  reason: default package */
public final class g0a extends yk0 {
    public volatile boolean X;
    public final f2a a;
    public final Object[] b;
    public int c;
    public boolean o;

    public g0a(f2a f2a, Object[] objArr) {
        this.a = f2a;
        this.b = objArr;
    }

    public final void clear() {
        this.c = this.b.length;
    }

    public final void g() {
        this.X = true;
    }

    public final boolean h() {
        return this.X;
    }

    public final boolean isEmpty() {
        return this.c == this.b.length;
    }

    public final int n(int i) {
        this.o = true;
        return 1;
    }

    public final Object poll() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "The array element is null");
        return obj;
    }
}
