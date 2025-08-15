package defpackage;

import java.util.TreeSet;

/* renamed from: re7  reason: default package */
public final class re7 {
    public final TreeSet a = new TreeSet(new ye4(6));
    public long b;

    public final void a(hw0 hw0, long j) {
        while (this.b + j > 104857600 && !this.a.isEmpty()) {
            dx0 dx0 = (dx0) this.a.first();
            rpd rpd = (rpd) hw0;
            synchronized (rpd) {
                rpd.j(dx0);
            }
        }
    }

    public final void b(hw0 hw0, dx0 dx0) {
        this.a.add(dx0);
        this.b += dx0.c;
        a(hw0, 0);
    }
}
