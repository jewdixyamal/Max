package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ugb  reason: default package */
public final class ugb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ugb(vgb vgb, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ugb) n((xeb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ugb ugb = new ugb(this.Y, continuation);
        ugb.X = obj;
        return ugb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        xeb xeb = (xeb) this.X;
        boolean z = xeb instanceof web;
        vgb vgb = this.Y;
        if (z) {
            web web = (web) xeb;
            Long l = web.a;
            gv4 gv4 = vgb.b;
            long j = gv4.m.get();
            jqe jqe = web.b;
            s35 s35 = vgb.w0;
            if (l != null && l.longValue() == j) {
                j47.T(vgb.a, ((w9a) vgb.q()).b(), (vx3) null, new pgb(vgb, (Continuation) null), 2);
                pnf.o(s35, new sfb(jqe, Integer.valueOf(woc.I)));
            } else {
                long j2 = gv4.l.get();
                if (l != null && l.longValue() == j2) {
                    pnf.o(s35, new sfb(jqe, Integer.valueOf(woc.I)));
                } else if (l == null) {
                    pnf.o(s35, new sfb(jqe, Integer.valueOf(woc.I)));
                }
            }
        } else if (xeb instanceof teb) {
            Long l2 = new Long(((teb) xeb).a);
            if (l2.longValue() == vgb.b.m.get()) {
                pnf.o(vgb.w0, new sfb(new eqe(vea.q), Integer.valueOf(woc.m)));
            }
        } else if (xeb instanceof veb) {
            pnf.o(vgb.w0, new sfb(new eqe(vea.q), new Integer(woc.m)));
        }
        return e5f.a;
    }
}
