package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dqb  reason: default package */
public final class dqb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eqb Y;
    public final /* synthetic */ je5 Z;
    public final /* synthetic */ vd5 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dqb(eqb eqb, je5 je5, vd5 vd5, Continuation continuation) {
        super(2, continuation);
        this.Y = eqb;
        this.Z = je5;
        this.s0 = vd5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dqb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dqb(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        ir6 ir6;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ew9 ew9 = (ew9) this.Y.s0.getValue();
            je5 je5 = this.Z;
            this.X = 1;
            ew9.getClass();
            if (ote.j(ew9.a, new uh(ew9, 15, je5), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
            o44 o44 = (o44) this.Y.o.getValue();
            je5 je52 = this.Z;
            boolean z = !((ri4) this.Y.b.getValue()).d();
            o44.getClass();
            String str = o44.k;
            ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "notifyServerChatIdsDebounced", (Throwable) null);
            }
            o44.c(new n44(o44, je52, z, (Continuation) null));
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eqb eqb = this.Y;
        je5 je53 = this.Z;
        vd5 vd5 = this.s0;
        this.X = 2;
        if (eqb.b(eqb, je53, vd5, this) == tx3) {
            return tx3;
        }
        o44 o442 = (o44) this.Y.o.getValue();
        je5 je522 = this.Z;
        boolean z2 = !((ri4) this.Y.b.getValue()).d();
        o442.getClass();
        String str2 = o44.k;
        ir6 = hm9.m;
        ir6.d(us7.X, str2, "notifyServerChatIdsDebounced", (Throwable) null);
        o442.c(new n44(o442, je522, z2, (Continuation) null));
        return e5f.a;
    }
}
