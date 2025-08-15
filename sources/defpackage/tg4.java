package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: tg4  reason: default package */
public final class tg4 implements pn9 {
    public final a4c a;
    public volatile pn9 b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public o38 d = new o38(1, (ssa) null, true);
    public final sg4 e = new sg4(this);

    public tg4(a4c a4c) {
        this.a = a4c;
    }

    public final void a(n38 n38) {
        this.c.remove(n38);
    }

    public final void b(n38 n38) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (!copyOnWriteArrayList.contains(n38)) {
            copyOnWriteArrayList.add(n38);
            n38.p(this.d);
        }
    }
}
