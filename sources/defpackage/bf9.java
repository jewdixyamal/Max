package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: bf9  reason: default package */
public final class bf9 extends ol implements lme {
    public final long X;
    public final List Y;
    public final String Z = bf9.class.getName();
    public final long o;

    public bf9(long j, long j2, long j3, List list) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = list;
    }

    public final void e(gle gle) {
        Map map = ((cf9) gle).c;
        hm9.m(this.Z, zr6.h(map.keySet().size(), "reactions: onSuccess: reactionsCount = "), new Object[0]);
        List list = this.Y;
        int Z2 = mz7.Z(z53.S(list, 10));
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
        for (Object next : list) {
            linkedHashMap.put(next, (fx8) map.get(Long.valueOf(((Number) next).longValue())));
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((lx8) plVar.I.getValue()).f(this.o, linkedHashMap);
    }

    public final void g(pke pke) {
        hm9.r(this.Z, pke.X, "reactions, onFail %s", pke);
        l().c(new oi0(this.a, pke));
    }

    public final dle i() {
        List list = this.Y;
        if (!list.isEmpty()) {
            tq2 tq2 = new tq2(sla.MSG_GET_REACTIONS, 23);
            if (!list.isEmpty()) {
                tq2.i(this.X, ApiProtocol.PARAM_CHAT_ID);
                tq2.g("messageIds", list);
                return tq2;
            }
            throw new IllegalArgumentException("mesageIds can't be empty".toString());
        }
        throw new IllegalArgumentException("messageIds is empty, MsgGetReactions requires at least one messageId".toString());
    }
}
