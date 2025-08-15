package defpackage;

/* renamed from: xg9  reason: default package */
public final class xg9 {
    public final f40 a = ((f40) ((y8a) vl.b()).getAccessor().c(f40.class));
    public final wg9 b;
    public l20 c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g = true;

    public xg9(wg9 wg9) {
        this.b = wg9;
    }

    public final void a() {
        l20 l20;
        if (this.g) {
            long j = this.d;
            if (j != 0 && (l20 = this.c) != null) {
                if (l20.c()) {
                    l20.j.getClass();
                }
                this.c = l20;
                this.d = j;
                boolean z = false;
                this.g = false;
                f40 f40 = this.a;
                if (f40.c.p(j)) {
                    boolean z2 = this.f;
                    uh9 uh9 = f40.c;
                    if (z2 || !uh9.p(0) || !uh9.y) {
                        if (uh9.p(0) && uh9.x) {
                            z = true;
                        }
                        if (z) {
                            this.f = true;
                            if (!this.e) {
                                uh9.o();
                            }
                        } else if ((uh9.p(this.d) && uh9.w) || (uh9.p(0) && uh9.y)) {
                            this.f = true;
                        }
                    } else {
                        this.b.g();
                    }
                }
            }
        }
    }
}
