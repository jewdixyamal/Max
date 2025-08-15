package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: pf9  reason: default package */
public final class pf9 extends ol implements lme, hua {
    public final long X;
    public final String o;

    public pf9(long j, String str, long j2) {
        super(j);
        this.o = str;
        this.X = j2;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        t().d(this.a);
        ((k24) p().a).c.d().m(new b6f(this.X, (k8g) null, 0));
    }

    public final void e(gle gle) {
        qf9 qf9 = (qf9) gle;
        long j = this.X;
        if (j != -1) {
            cu8 q = p().q(j);
            boolean isEmpty = qf9.c.isEmpty();
            vx8 vx8 = vx8.ACTIVE;
            pl plVar = null;
            String str = this.o;
            if (isEmpty || q == null) {
                ((k24) p().a).c.d().m(new b6f(j, (k8g) null, 0));
                if (q != null) {
                    String str2 = q.s0;
                    if (!tpa.f(str2, str) && str2 != null && str != null && !w9e.p0(str2, str, false)) {
                        p().z(this.X, rh4.j(str2, "\n", str), (List) null, m(), vx8);
                    }
                }
            } else {
                wz wzVar = qf9.c;
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                p().w(q, iz7.g(wzVar, (vxc) plVar2.F.getValue()));
                if (tpa.f(q.s0, str)) {
                    p().z(this.X, (String) null, (List) null, m(), vx8);
                }
            }
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar = plVar3;
            }
            r9d.y((s8g) plVar.g.getValue());
        } else if (!qf9.c.isEmpty()) {
            l().c(new rp3(this.a, qf9.c));
        }
    }

    public final byte[] f() {
        Tasks.MsgSharePreview msgSharePreview = new Tasks.MsgSharePreview();
        msgSharePreview.requestId = this.a;
        msgSharePreview.text = this.o;
        msgSharePreview.messageId = this.X;
        return qw8.toByteArray(msgSharePreview);
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
        return iua.TYPE_MSG_SHARE_PREVIEW;
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 29);
        tq2.p("text", this.o);
        return tq2;
    }
}
