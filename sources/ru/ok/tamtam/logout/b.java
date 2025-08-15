package ru.ok.tamtam.logout;

import kotlin.coroutines.Continuation;

public final class b extends ffe implements a66 {
    public int X;
    public final /* synthetic */ LogoutEventsByBus Y;
    public final /* synthetic */ nu7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(LogoutEventsByBus logoutEventsByBus, nu7 nu7, Continuation continuation) {
        super(2, continuation);
        this.Y = logoutEventsByBus;
        this.Z = nu7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kld = this.Y.b;
            this.X = 1;
            if (kld.a(this.Z, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
