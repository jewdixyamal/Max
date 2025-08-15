package defpackage;

/* renamed from: n9d  reason: default package */
public final class n9d extends d8d {
    public final long b;

    public n9d(long j) {
        this.b = j;
    }

    public final void x() {
        p82 b2 = b();
        b2.getClass();
        StringBuilder sb = new StringBuilder("storeChatFromCache chatId = ");
        long j = this.b;
        sb.append(j);
        hm9.m("p82", sb.toString(), new Object[0]);
        l92 A = b2.A(j);
        if (A == null) {
            hm9.p("p82", "storeChatFromCache, chatId = " + j, (Throwable) null);
            return;
        }
        ((k24) ((c34) b2.l.get())).b.h(j, A.c);
    }
}
