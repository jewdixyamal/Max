package defpackage;

/* renamed from: a9e  reason: default package */
public abstract class a9e {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public final Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public a9e(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.j = new m2a(1);
                this.n = new djb(7);
                return;
            default:
                this.j = new m2a(0);
                this.n = new l7b(8, false);
                return;
        }
    }

    public void a(long j2) {
        switch (this.a) {
            case 0:
                this.d = j2;
                return;
            default:
                this.d = j2;
                return;
        }
    }

    public abstract long b(wpa wpa);

    public abstract long c(yaf yaf);

    public abstract boolean d(wpa wpa, long j2, djb djb);

    public abstract boolean e(yaf yaf, long j2, l7b l7b);

    public void f(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    this.n = new l7b(8, false);
                    this.c = 0;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1;
                this.d = 0;
                return;
            default:
                if (z) {
                    this.n = new djb(7);
                    this.c = 0;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1;
                this.d = 0;
                return;
        }
    }
}
