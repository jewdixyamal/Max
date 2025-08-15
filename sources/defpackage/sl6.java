package defpackage;

import java.util.List;

/* renamed from: sl6  reason: default package */
public final class sl6 extends aj0 {
    public final List X;
    public final long Y;

    public sl6(long j, List list) {
        super(0, (long) (list.size() - 1), 1);
        this.Y = j;
        this.X = list;
    }

    public final long e() {
        a();
        return this.Y + ((nm6) this.X.get((int) this.o)).X;
    }

    public final long h() {
        a();
        nm6 nm6 = (nm6) this.X.get((int) this.o);
        return this.Y + nm6.X + nm6.c;
    }
}
