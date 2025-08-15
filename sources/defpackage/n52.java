package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: n52  reason: default package */
public final class n52 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatAdminsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n52(ChatAdminsScreen chatAdminsScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = chatAdminsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((n52) n((qo8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        n52 n52 = new n52(this.Y, continuation);
        n52.X = obj;
        return n52;
    }

    public final Object o(Object obj) {
        String str;
        od2.a0(obj);
        qo8 qo8 = (qo8) this.X;
        boolean z = qo8 instanceof mo8;
        ChatAdminsScreen chatAdminsScreen = this.Y;
        if (z) {
            ckb ckb = ckb.c;
            bc7[] bc7Arr = ChatAdminsScreen.w0;
            long n0 = chatAdminsScreen.n0();
            long j = ((mo8) qo8).a;
            ckb.getClass();
            ckb.R1(ckb.b2(n0, j));
        } else if (qo8 instanceof lo8) {
            lo8 lo8 = (lo8) qo8;
            int i = lo8.a;
            bc7[] bc7Arr2 = ChatAdminsScreen.w0;
            chatAdminsScreen.getClass();
            if (i == wea.q0) {
                u52 m0 = chatAdminsScreen.m0();
                long j2 = lo8.b;
                od2.L(od2.F(new mqc(new r52(((ds3) m0.o.getValue()).c(j2), (Continuation) null, m0, j2)), ((w9a) ((kke) m0.X.getValue())).b()), m0.a);
            }
        } else if (qo8 instanceof no8) {
            if (((no8) qo8).a == wea.u0) {
                ckb ckb2 = ckb.c;
                bc7[] bc7Arr3 = ChatAdminsScreen.w0;
                long n02 = chatAdminsScreen.n0();
                f64 P1 = ckb2.P1();
                P1.b(":profile/add-admins?chat_id=" + n02, (Bundle) null);
            }
        } else if (qo8 instanceof po8) {
            if (((Boolean) chatAdminsScreen.Z.getValue()).booleanValue()) {
                ckb ckb3 = ckb.c;
                long n03 = chatAdminsScreen.n0();
                long longValue = ((Number) chatAdminsScreen.s0.getValue()).longValue();
                ckb3.getClass();
                ckb3.R1(ckb.b2(n03, longValue));
            } else {
                wha wha = new wha((Widget) chatAdminsScreen);
                wha.h(z7.B(chatAdminsScreen.getContext(), jpc.A2));
                wha.i();
            }
        } else if (!(qo8 instanceof oo8)) {
            throw new NoWhenBranchMatchedException();
        } else if (((Boolean) chatAdminsScreen.Z.getValue()).booleanValue()) {
            ckb ckb4 = ckb.c;
            long n04 = chatAdminsScreen.n0();
            long j3 = ((oo8) qo8).a;
            ckb4.getClass();
            ckb4.R1(ckb.b2(n04, j3));
        } else {
            wha wha2 = new wha((Widget) chatAdminsScreen);
            e52 q = chatAdminsScreen.m0().q();
            if (q == null || !q.I()) {
                str = z7.B(chatAdminsScreen.getContext(), jpc.C);
            } else {
                str = z7.B(chatAdminsScreen.getContext(), jpc.w);
            }
            wha2.h(str);
            wha2.i();
        }
        return e5f.a;
    }
}
