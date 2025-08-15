package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o31  reason: default package */
public final class o31 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p31 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o31(p31 p31, Continuation continuation) {
        super(2, continuation);
        this.Y = p31;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o31) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o31(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        p31 p31 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String string = ((hyc) p31.a()).g.getString("user.callsToken", (String) null);
            if (string == null || w9e.C0(string)) {
                this.X = 1;
                if (((ft1) ((ct1) p31.c.getValue())).a(this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((hyc) p31.a()).g.getString("user.callsToken", (String) null);
    }
}
