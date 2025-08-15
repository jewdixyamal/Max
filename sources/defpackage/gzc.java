package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gzc  reason: default package */
public final class gzc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hzc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gzc(hzc hzc, Continuation continuation) {
        super(2, continuation);
        this.Y = hzc;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((gzc) n((gk6) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gzc gzc = new gzc(this.Y, continuation);
        gzc.X = obj;
        return gzc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        long j = ((gk6) this.X).b;
        hzc hzc = this.Y;
        hzc.getClass();
        jzc jzc = jzc.c;
        boolean z = hzc.c == o92.LOCAL_ID;
        jzc.getClass();
        String str = z ? "local" : "server";
        StringBuilder sb = new StringBuilder(":chats?id=");
        ms2.j(hzc.b, "&type=", str, sb);
        sb.append("&message_id=");
        sb.append(j);
        pnf.o(hzc.s0, new c64(sb.toString()));
        return e5f.a;
    }
}
