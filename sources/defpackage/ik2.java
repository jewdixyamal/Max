package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.sdk.arch.Widget;

/* renamed from: ik2  reason: default package */
public final class ik2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersCompactWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ik2(ChatMembersCompactWidget chatMembersCompactWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = chatMembersCompactWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ik2) n((qo8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ik2 ik2 = new ik2(this.Y, continuation);
        ik2.X = obj;
        return ik2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        qo8 qo8 = (qo8) this.X;
        if (qo8 instanceof mo8) {
            ckb.c.e2(((mo8) qo8).a);
        } else {
            boolean z = qo8 instanceof lo8;
            ChatMembersCompactWidget chatMembersCompactWidget = this.Y;
            if (z) {
                lo8 lo8 = (lo8) qo8;
                int i = lo8.a;
                bc7[] bc7Arr = ChatMembersCompactWidget.Z;
                chatMembersCompactWidget.getClass();
                int i2 = wea.t0;
                long j = lo8.b;
                if (i == i2) {
                    ro8 o0 = chatMembersCompactWidget.o0();
                    o0.Z.m((Object) null, Collections.singleton(Long.valueOf(j)));
                } else if (i == wea.s0) {
                    bl2 n0 = chatMembersCompactWidget.n0();
                    pnf.n(n0, ((w9a) ((kke) n0.Y.getValue())).b(), (vx3) null, new xk2(n0, j, (Continuation) null), 2);
                }
            } else if (qo8 instanceof no8) {
                int i3 = ((no8) qo8).a;
                if (i3 == wea.v0) {
                    ckb ckb = ckb.c;
                    bc7[] bc7Arr2 = ChatMembersCompactWidget.Z;
                    ckb.Z1(chatMembersCompactWidget.m0());
                } else if (i3 == wea.E0) {
                    ckb ckb2 = ckb.c;
                    bc7[] bc7Arr3 = ChatMembersCompactWidget.Z;
                    ckb2.c2(chatMembersCompactWidget.m0());
                } else if (i3 == wea.X0) {
                    ckb ckb3 = ckb.c;
                    bc7[] bc7Arr4 = ChatMembersCompactWidget.Z;
                    ckb3.d2(chatMembersCompactWidget.m0(), "MEMBER");
                }
            } else if (qo8 instanceof oo8) {
                ckb.c.e2(((oo8) qo8).a);
            } else if (qo8 instanceof po8) {
                wha wha = new wha((Widget) chatMembersCompactWidget);
                wha.h(z7.B(chatMembersCompactWidget.getContext(), jpc.A2));
                wha.i();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
