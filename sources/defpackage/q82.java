package defpackage;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: q82  reason: default package */
public final class q82 extends ol implements lme, hua {
    public final int X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String s0;

    public q82(long j, long j2, int i, long j3, String str, long j4) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = j3;
        this.Z = j4;
        this.s0 = str == null ? "" : str;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        t().d(this.a);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        zfc zfc = (zfc) plVar.M.getValue();
        p82 p82 = (p82) zfc.a.getValue();
        p82.getClass();
        long j = this.o;
        cqc.a(new i82(p82, j, 0), p82.z, (f6) null, new un0(19), (ztc) null);
        ConcurrentHashMap concurrentHashMap = ((p7c) zfc.b.getValue()).i;
        cqc.b((zl4) concurrentHashMap.get(0L));
        concurrentHashMap.remove(0L);
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, (mg4) null, (h9b) null, 124));
    }

    public final void e(gle gle) {
        f52 f52 = ((r82) gle).c;
        if (f52 != null) {
            m().c0(Collections.singletonList(f52));
        }
    }

    public final byte[] f() {
        Tasks.ChatCreate chatCreate = new Tasks.ChatCreate();
        chatCreate.requestId = this.a;
        int i = this.X;
        if (i != 0) {
            chatCreate.chatType = ms2.a(i);
        }
        chatCreate.chatId = this.o;
        chatCreate.groupId = this.Y;
        chatCreate.startPayload = this.s0;
        chatCreate.cid = this.Z;
        return qw8.toByteArray(chatCreate);
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
        return iua.TYPE_CHAT_CREATE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        au auVar = new au((sla) null, 17);
        int i = this.X;
        if (!(i == 0 || i == 1)) {
            auVar.p("chatType", ms2.a(i));
        }
        long j = this.Y;
        if (j != 0) {
            auVar.i(j, "groupId");
        }
        String str = this.s0;
        if (!oag.t(str)) {
            auVar.p("startPayload", str);
        }
        long j2 = this.Z;
        if (j2 != 0) {
            auVar.i(j2, "cid");
        }
        return auVar;
    }
}
