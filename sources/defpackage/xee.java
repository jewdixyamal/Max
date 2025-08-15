package defpackage;

import java.util.Collection;
import java.util.Collections;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: xee  reason: default package */
public final class xee extends ol implements lme, hua {
    public final long X;
    public final boolean Y;
    public final long o;

    public xee(long j, long j2, boolean z, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = z;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        t().d(this.a);
        p82 m = m();
        m.getClass();
        l01 l01 = new l01(false, 1);
        long j = this.o;
        m.h(j, false, l01);
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), false, false, (mg4) null, (h9b) null, 124));
        l().c(new ps3((Collection) Collections.singletonList(Long.valueOf(this.X))));
    }

    public final void e(gle gle) {
    }

    public final byte[] f() {
        Tasks.SuspendBot suspendBot = new Tasks.SuspendBot();
        suspendBot.requestId = this.a;
        suspendBot.chatId = this.o;
        suspendBot.botId = this.X;
        suspendBot.suspend = this.Y;
        return qw8.toByteArray(suspendBot);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_SUSPEND_BOT;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        gs9 gs9 = new gs9((sla) null, 12);
        gs9.i(this.X, "botId");
        gs9.d("value", this.Y);
        return gs9;
    }
}
