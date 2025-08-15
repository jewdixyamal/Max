package defpackage;

import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: nt2  reason: default package */
public final class nt2 extends ol implements lme, hua {
    public final int X;
    public final long Y;
    public final long o;

    public nt2(int i, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = j3;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        st2 st2 = (st2) gle;
        ir6 ir6 = hm9.m;
        pl plVar = null;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "ChatsListApiTask", "onSuccess " + st2, (Throwable) null);
        }
        try {
            q().n(st2.c);
        } catch (TamErrorException unused) {
        }
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            ir62.d(us7.X, "ChatsListApiTask", "chats.storeChatsFromServer", (Throwable) null);
        }
        p82 m = m();
        List list = st2.c;
        m.getClass();
        gi9 gi9 = (gi9) m.e0("storeChatsFromServer", new id0((Object) m, (Object) list, (Object) null, 0));
        pl plVar2 = this.c;
        if (plVar2 != null) {
            plVar = plVar2;
        }
        ((hyc) ((q33) plVar.e.getValue())).l("app.last.chat.marker", Long.valueOf(st2.o));
        if (st2.o > 0) {
            pk j = j();
            long j2 = st2.o;
            long j3 = this.Y;
            z7d z7d = ((p7b) r()).b;
            z7d.getClass();
            k4a k4a = (k4a) j;
            ome.d(k4a.z(), new nt2((int) z7d.q(PmsKey.f25chatspagesize, (long) 50), ((p7b) k4a.y()).a.o(), j2, j3), false, 0, 12);
        }
    }

    public final byte[] f() {
        Tasks.ChatsList chatsList = new Tasks.ChatsList();
        chatsList.requestId = this.a;
        chatsList.marker = this.o;
        chatsList.count = this.X;
        chatsList.chatsSync = this.Y;
        return qw8.toByteArray(chatsList);
    }

    public final void g(pke pke) {
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHATS_LIST;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 3);
        tq2.i(this.o, "marker");
        tq2.e(this.X, NewHtcHomeBadger.COUNT);
        return tq2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatsListApiTask(id = ");
        sb.append(this.a);
        sb.append(", marker=");
        sb.append(this.o);
        sb.append(", count=");
        sb.append(this.X);
        sb.append(", chatsSync=");
        return zr6.k(sb, this.Y, ")");
    }
}
