package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: if1  reason: default package */
public final class if1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if1(of1 of1, Continuation continuation) {
        super(2, continuation);
        this.Y = of1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((if1) n((y21) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        if1 if1 = new if1(this.Y, continuation);
        if1.X = obj;
        return if1;
    }

    public final Object o(Object obj) {
        Object value;
        wf1 wf1;
        CharSequence charSequence;
        od2.a0(obj);
        y21 y21 = (y21) this.X;
        q0e q0e = this.Y.z0;
        do {
            value = q0e.getValue();
            wf1 = (wf1) value;
            charSequence = y21.c;
            if (charSequence == null) {
                charSequence = "";
            }
        } while (!q0e.c(value, wf1.a(wf1, (List) null, (kl7) null, (List) null, false, charSequence, false, 47)));
        return e5f.a;
    }
}
