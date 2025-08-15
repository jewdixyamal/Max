package defpackage;

import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: az5  reason: default package */
public final class az5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bz5 Y;
    public final /* synthetic */ cz5 Z;
    public final /* synthetic */ List s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az5(bz5 bz5, cz5 cz5, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = bz5;
        this.Z = cz5;
        this.s0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((az5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new az5(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        cz5 cz5 = this.Z;
        bz5 bz5 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((xb6) bz5.a.getValue()).b(cz5, this);
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
        kl7 l = j1e.l();
        if (charSequence != null && !w9e.C0(charSequence)) {
            l.add(new k9d(new i9d(0, charSequence.toString(), true, ((dc6) bz5.c.getValue()).a((e52) null, charSequence))));
        }
        l.addAll(list);
        kl7 d = j1e.d(l);
        for (Number longValue : this.s0) {
            h8d h8d = new h8d(longValue.longValue(), new LinkedList(d), 2);
            h8d.e = true;
            ((s8g) bz5.b.getValue()).a(new h9d(h8d));
        }
        return e5f;
    }
}
