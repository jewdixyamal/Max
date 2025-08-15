package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;

/* renamed from: yc1  reason: default package */
public final class yc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dd1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yc1(dd1 dd1, Continuation continuation) {
        super(2, continuation);
        this.Y = dd1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yc1) n((y71) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yc1 yc1 = new yc1(this.Y, continuation);
        yc1.X = obj;
        return yc1;
    }

    public final Object o(Object obj) {
        Object value;
        SpannableStringBuilder spannableStringBuilder;
        Object value2;
        uc0 b;
        eqe eqe;
        String D;
        pc1 pc1;
        od2.a0(obj);
        y71 y71 = (y71) this.X;
        boolean z = y71 instanceof w71;
        e5f e5f = e5f.a;
        if (z) {
            Long l = this.Y.s0;
            w71 w71 = (w71) y71;
            long j = w71.a.b;
            if (l == null || l.longValue() != j) {
                return e5f;
            }
            this.Y.s0 = null;
            dd1 dd1 = this.Y;
            String str = w71.a.X;
            q0e q0e = dd1.t0;
            do {
                value2 = q0e.getValue();
                h7b h7b = dd1.c;
                b = h7b.b((CharSequence) null, Long.MIN_VALUE);
                eqe = new eqe(t7a.k);
                D = c37.D(str);
                pc1 = new pc1(h7b.c(str));
            } while (!q0e.c(value2, rc1.a((rc1) value2, b, D, pc1, eqe, rc1.j, kc1.a, true, (Long) null, 1)));
        } else if (y71 instanceof x71) {
            Long l2 = this.Y.s0;
            long j2 = ((x71) y71).a;
            if (l2 == null || l2.longValue() != j2) {
                return e5f;
            }
            this.Y.s0 = null;
            dd1 dd12 = this.Y;
            q0e q0e2 = dd12.t0;
            do {
                value = q0e2.getValue();
                h7b h7b2 = dd12.c;
                h7b2.getClass();
                int i = t7a.g;
                Context context = (Context) h7b2.b;
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i));
                spannableStringBuilder.setSpan(new mse(qp4.u0.b(context).i(), new ma1(h7b2, 0)), 0, spannableStringBuilder.length(), 17);
            } while (!q0e2.c(value, rc1.a((rc1) value, (uc0) null, (String) null, new nc1(new iqe(spannableStringBuilder)), (jqe) null, nz4.a, lc1.a, false, (Long) null, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f;
    }
}
