package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: do8  reason: default package */
public final class do8 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public do8(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    @uae
    public final void onChatMembersUpdateEvent(tk2 tk2) {
        yn8 yn8;
        int s = au1.s(tk2.X);
        List list = tk2.b;
        ek2 ek2 = tk2.c;
        long j = tk2.o;
        if (s == 0) {
            yn8 = new vn8(j, ek2, list);
        } else if (s == 1) {
            yn8 = new xn8(j, ek2, list);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        j47.T(this.b, (lx3) null, (vx3) null, new ao8(this, yn8, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(ps3 ps3) {
        j47.T(this.b, (lx3) null, (vx3) null, new bo8(this, ps3, (Continuation) null), 3);
    }
}
