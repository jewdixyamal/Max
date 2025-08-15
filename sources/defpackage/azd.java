package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* renamed from: azd  reason: default package */
public final class azd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ StartConversationScreen Y;
    public final /* synthetic */ rd6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azd(StartConversationScreen startConversationScreen, rd6 rd6, Continuation continuation) {
        super(2, continuation);
        this.Y = startConversationScreen;
        this.Z = rd6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((azd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new azd(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        rd6 rd6 = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = StartConversationScreen.I0;
            jzd n0 = this.Y.n0();
            wm3 wm3 = rd6.Y;
            this.X = 1;
            Object t0 = j47.t0(((w9a) ((kke) n0.o.getValue())).b(), new fzd(n0, wm3, (Continuation) null), this);
            if (t0 != tx3) {
                t0 = e5f;
            }
            if (t0 == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        syd syd = syd.c;
        long j = rd6.a;
        syd.getClass();
        syd.P1().b(":profile?id=" + j + "&type=contact", (Bundle) null);
        return e5f;
    }
}
