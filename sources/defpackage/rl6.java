package defpackage;

import java.util.List;

/* renamed from: rl6  reason: default package */
public final class rl6 extends aj0 {
    public final List X;
    public final long Y;

    public rl6(long j, List list) {
        super(0, (long) (list.size() - 1), 0);
        this.Y = j;
        this.X = list;
    }

    public final long e() {
        a();
        return this.Y + ((mm6) this.X.get((int) this.o)).X;
    }

    public final long h() {
        a();
        mm6 mm6 = (mm6) this.X.get((int) this.o);
        return this.Y + mm6.X + mm6.c;
    }
}
