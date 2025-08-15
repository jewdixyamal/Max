package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;

/* renamed from: h9  reason: default package */
public final class h9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatAdminsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h9(Continuation continuation, AddChatAdminsScreen addChatAdminsScreen) {
        super(2, continuation);
        this.Y = addChatAdminsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((h9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        h9 h9Var = new h9(continuation, this.Y);
        h9Var.X = obj;
        return h9Var;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        qo8 qo8 = (qo8) this.X;
        boolean z = qo8 instanceof mo8;
        e5f e5f = e5f.a;
        if (z) {
            ckb ckb = ckb.c;
            bc7[] bc7Arr = AddChatAdminsScreen.x0;
            long m0 = this.Y.m0();
            long j = ((mo8) qo8).a;
            ckb.getClass();
            StringBuilder sb = new StringBuilder(":profile/edit/admin_permission?chat_id=");
            sb.append(m0);
            sb.append("&contact_id=");
            ckb.P1().b(zr6.k(sb, j, "&permissions_type=setup_new_admin"), (Bundle) null);
        }
        return e5f;
    }
}
