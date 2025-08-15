package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;

/* renamed from: cd1  reason: default package */
public final class cd1 extends ffe implements a66 {
    public dd1 X;
    public int Y;
    public final /* synthetic */ dd1 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cd1(dd1 dd1, Continuation continuation) {
        super(2, continuation);
        this.Z = dd1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cd1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cd1(this.Z, continuation);
    }

    public final Object o(Object obj) {
        dd1 dd1;
        Object value;
        uc0 b;
        SpannableStringBuilder spannableStringBuilder;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            dd1 dd12 = this.Z;
            m5d m5d = dd12.o;
            this.X = dd12;
            this.Y = 1;
            Object t0 = j47.t0(((w9a) ((kke) ((je7) m5d.X).getValue())).b(), new ms1(m5d, (Continuation) null), this);
            if (t0 == tx3) {
                return tx3;
            }
            dd1 = dd12;
            obj = t0;
        } else if (i == 1) {
            dd1 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dd1.s0 = (Long) obj;
        dd1 dd13 = this.Z;
        q0e q0e = dd13.t0;
        do {
            value = q0e.getValue();
            h7b h7b = dd13.c;
            b = h7b.b((CharSequence) null, Long.MIN_VALUE);
            spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new yl5((Drawable) (oo7) ((je7) h7b.c).getValue(), (sl5) null, 6), 0, 1, 17);
        } while (!q0e.c(value, rc1.a((rc1) value, b, (String) null, new oc1(new iqe(spannableStringBuilder)), (jqe) null, nz4.a, (mc1) null, false, (Long) null, HttpStatus.SC_METHOD_NOT_ALLOWED)));
        return e5f.a;
    }
}
