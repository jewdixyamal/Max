package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: se9  reason: default package */
public final class se9 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final mg4 Z;
    public final long o;
    public long s0;

    public se9(long j, long j2, long j3, long j4, mg4 mg4) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = mg4;
    }

    public final int c() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        e52 C = plVar.c().C(this.o);
        if (C == null) {
            return 3;
        }
        this.s0 = C.b.a;
        return 1;
    }

    public final void d() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
    }

    public final void e(gle gle) {
        te9 te9 = (te9) gle;
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        plVar.d().b(this.o, this.X, this.Y);
        pl plVar3 = this.c;
        if (plVar3 != null) {
            plVar2 = plVar3;
        }
        plVar2.c().c0(Collections.singletonList(te9.c));
    }

    public final byte[] f() {
        Tasks.MsgDeleteRange msgDeleteRange = new Tasks.MsgDeleteRange();
        msgDeleteRange.requestId = this.a;
        msgDeleteRange.chatId = this.o;
        msgDeleteRange.startTime = this.X;
        msgDeleteRange.endTime = this.Y;
        msgDeleteRange.itemTypeId = this.Z.a;
        return qw8.toByteArray(msgDeleteRange);
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
        return iua.TYPE_MSG_DELETE_RANGE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        long j = this.s0;
        tq2 tq2 = new tq2(sla.MSG_DELETE_RANGE, 19);
        tq2.i(j, ApiProtocol.PARAM_CHAT_ID);
        tq2.i(this.X, "startTime");
        tq2.i(this.Y, "endTime");
        tq2.p("itemType", this.Z.name());
        return tq2;
    }
}
