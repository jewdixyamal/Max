package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ry5  reason: default package */
public final class ry5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ sy5 Y;
    public final /* synthetic */ cz5 Z;
    public final /* synthetic */ List s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ry5(sy5 sy5, cz5 cz5, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = sy5;
        this.Z = cz5;
        this.s0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ry5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ry5(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        cz5 cz5 = this.Z;
        sy5 sy5 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((xb6) sy5.b.getValue()).b(cz5, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        boolean isEmpty = list.isEmpty();
        e5f e5f = e5f.a;
        if (isEmpty) {
            return e5f;
        }
        CharSequence charSequence = cz5.d;
        if (charSequence != null && !w9e.C0(charSequence)) {
            list = x53.t0(Collections.singletonList(new k9d(new i9d(0, charSequence.toString(), true, ((dc6) sy5.c.getValue()).a((e52) null, charSequence)))), list);
        }
        for (Number longValue : this.s0) {
            h8d h8d = new h8d(longValue.longValue(), new LinkedList(list), 2);
            h8d.e = true;
            ((s8g) sy5.a.getValue()).a(new h9d(h8d));
        }
        return e5f;
    }
}
