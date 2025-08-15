package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;

/* renamed from: gw5  reason: default package */
public final class gw5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ iw5 Y;
    public final /* synthetic */ at5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gw5(iw5 iw5, at5 at5, Continuation continuation) {
        super(2, continuation);
        this.Y = iw5;
        this.Z = at5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gw5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gw5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        int i;
        tx3 tx3 = tx3.a;
        int i2 = this.X;
        e5f e5f = e5f.a;
        if (i2 == 0) {
            od2.a0(obj);
            iw5 iw5 = this.Y;
            List list = (List) iw5.X.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((w9f) listIterator.previous()).b == v9f.b) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            at5 a = at5.a(this.Z, (String) null, i + 1, (List) null, 262135);
            this.X = 1;
            zb2 zb2 = (zb2) iw5.b;
            zb2.getClass();
            Object t0 = j47.t0(zb2.Y, new hb2(zb2, a, (k56) null, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i2 == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
