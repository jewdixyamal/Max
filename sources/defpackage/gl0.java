package defpackage;

/* renamed from: gl0  reason: default package */
public final class gl0 implements xl7 {
    public Object X = null;
    public final xl7 a;
    public int b = 0;
    public int c = -1;
    public int o = -1;

    public gl0(xl7 xl7) {
        this.a = xl7;
    }

    public final void a(int i, int i2) {
        b();
        this.a.a(i, i2);
    }

    public final void b() {
        int i = this.b;
        if (i != 0) {
            xl7 xl7 = this.a;
            if (i == 1) {
                xl7.e(this.c, this.o);
            } else if (i == 2) {
                xl7.m(this.c, this.o);
            } else if (i == 3) {
                xl7.o(this.c, this.o, this.X);
            }
            this.X = null;
            this.b = 0;
        }
    }

    public final void e(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.o;
            if (i <= i3 + i4) {
                this.o = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        b();
        this.c = i;
        this.o = i2;
        this.b = 1;
    }

    public final void m(int i, int i2) {
        int i3;
        if (this.b != 2 || (i3 = this.c) < i || i3 > i + i2) {
            b();
            this.c = i;
            this.o = i2;
            this.b = 2;
            return;
        }
        this.o += i2;
        this.c = i;
    }

    public final void o(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.o;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.X == obj) {
                this.c = Math.min(i, i4);
                this.o = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        b();
        this.c = i;
        this.o = i2;
        this.X = obj;
        this.b = 3;
    }
}
