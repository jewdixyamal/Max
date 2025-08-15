package defpackage;

/* renamed from: xy2  reason: default package */
public final /* synthetic */ class xy2 implements k56 {
    public final /* synthetic */ jz2 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ xy2(jz2 jz2, long j, long j2) {
        this.a = jz2;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke() {
        p82 l = this.a.l();
        l.getClass();
        long j = this.b;
        Long valueOf = Long.valueOf(j);
        long j2 = this.c;
        hm9.m("p82", "changeLastNotifMessageId, chatId = %d, lastNotifMessageId = %d", valueOf, Long.valueOf(j2));
        l.h(j, false, new c10(j2, 8));
        return e5f.a;
    }
}
