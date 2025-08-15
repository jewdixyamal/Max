package defpackage;

/* renamed from: rk4  reason: default package */
public final class rk4 {
    public final je7 a;

    public rk4(je7 je7) {
        this.a = je7;
    }

    public final void a(long j, Long l, Long l2) {
        hm9.m("rk4", "execute: chatId=" + l + ", contactId=" + l2 + ", serverTime=" + j, new Object[0]);
        je7 je7 = this.a;
        long j2 = 0;
        e52 F = (l == null || l.longValue() == 0) ? (l2 == null || l2.longValue() == 0) ? null : ((p82) je7.getValue()).F(l2.longValue()) : ((p82) je7.getValue()).z(l.longValue());
        if (F == null) {
            hm9.m0("rk4", "Chat is null. Ignore", new Object[0]);
            return;
        }
        uaa uaa = F.b.f0;
        if (uaa == null) {
            hm9.G("rk4", "draft is null, ignore", (Throwable) null);
            return;
        }
        Long b = uaa.b();
        if (b != null) {
            j2 = b.longValue();
        }
        if (j2 > j) {
            hm9.m0("rk4", "try to rewrite draft by old, ignore it!", new Object[0]);
            return;
        }
        hm9.m("rk4", "Discard server draft", new Object[0]);
        ((p82) je7.getValue()).p(F.a);
    }
}
