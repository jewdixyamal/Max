package defpackage;

import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gjf  reason: default package */
public final class gjf extends ffe implements a66 {
    public LinkedList X;
    public e9d Y;
    public int Z;
    public final /* synthetic */ hjf s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ fif v0;
    public final /* synthetic */ cz5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gjf(hjf hjf, long j, Long l, fif fif, cz5 cz5, Continuation continuation) {
        super(2, continuation);
        this.s0 = hjf;
        this.t0 = j;
        this.u0 = l;
        this.v0 = fif;
        this.w0 = cz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gjf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gjf(this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    public final Object o(Object obj) {
        LinkedList linkedList;
        e9d e9d;
        tx3 tx3 = tx3.a;
        int i = this.Z;
        long j = this.t0;
        hjf hjf = this.s0;
        if (i == 0) {
            od2.a0(obj);
            this.Z = 1;
            obj = ((x19) hjf.c.getValue()).a(j, this.u0, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            e9d = this.Y;
            linkedList = this.X;
            od2.a0(obj);
            linkedList.add(e9d);
            linkedList.addAll((List) obj);
            ((s8g) hjf.b.getValue()).a(new h9d(new h8d(j, linkedList, 2)));
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LinkedList linkedList2 = new LinkedList();
        fif fif = this.v0;
        l9d l9d = new l9d(j, fif);
        l9d.p = fif.Z;
        l9d.b = (bw8) obj;
        e9d b = l9d.b();
        this.X = linkedList2;
        this.Y = b;
        this.Z = 2;
        Object b2 = ((xb6) hjf.d.getValue()).b(this.w0, this);
        if (b2 == tx3) {
            return tx3;
        }
        e9d = b;
        obj = b2;
        linkedList = linkedList2;
        linkedList.add(e9d);
        linkedList.addAll((List) obj);
        ((s8g) hjf.b.getValue()).a(new h9d(new h8d(j, linkedList, 2)));
        return e5f.a;
    }
}
