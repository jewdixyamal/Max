package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: d83  reason: default package */
public final class d83 {
    public final av0 a;
    public final kke b;
    public final kld c = lld.b(0, 0, 0, 7);
    public final je7 d;
    public final ContextScope e;

    public d83(av0 av0, kke kke, je7 je7) {
        this.a = av0;
        this.b = kke;
        this.d = je7;
        this.e = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    public final void a(y73 y73) {
        j47.T(this.e, (lx3) null, (vx3) null, new z73(this, y73, (Continuation) null), 3);
    }

    @uae
    public final void onAddChatEvent(i9 i9Var) {
        a(new w73(i9Var.b));
    }

    @uae
    public final void onChatMembersUpdateEvent(tk2 tk2) {
        int s = au1.s(tk2.X);
        long j = tk2.o;
        if (s == 0) {
            a(new w73(j));
        } else if (s == 1) {
            a(new x73(j));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @uae
    public final void onIncomingMessageEvent(kz6 kz6) {
        if (kz6.Y) {
            j47.T(this.e, (lx3) null, (vx3) null, new c83(this, kz6, (Continuation) null), 3);
        }
    }

    @uae
    public final void onLeaveChatEvent(ue7 ue7) {
        a(new x73(ue7.b));
    }

    @uae
    public final void onRemoveChatEvent(xfc xfc) {
        a(new x73(xfc.b));
    }
}
