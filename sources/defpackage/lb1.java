package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: lb1  reason: default package */
public final class lb1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vb1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb1(vb1 vb1, Continuation continuation) {
        super(2, continuation);
        this.Y = vb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lb1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lb1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        nb1 nb1;
        md0 md0;
        tta tta;
        boolean b;
        m38 m38;
        m38 m382;
        tx3 tx3 = tx3.a;
        int i = this.X;
        vb1 vb1 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            wva wva = vb1.c;
            this.X = 1;
            obj = wva.h(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uj3 uj3 = (uj3) obj;
        q0e q0e = vb1.w0;
        do {
            value = q0e.getValue();
            nb1 = (nb1) value;
            uc0 a = oag.a(uj3.m(), new Long(((Number) vb1.v0.getValue()).longValue()));
            vb1.c.getClass();
            md0 = new md0(a, uj3.p(kk0.c));
            tta = vb1.X;
            b = tta.a().b(eua.l);
            m38 = m38.a;
            m382 = m38.X;
        } while (!q0e.c(value, nb1.a(nb1, md0, !tta.a().b(eua.h) ? m382 : m38, !b ? m382 : m38, false, (jqe) null, (ArrayList) null, (jqe) null, 120)));
        return e5f.a;
    }
}
