package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;
import one.me.sdk.arch.Widget;

/* renamed from: u17  reason: default package */
public final class u17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u17(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((u17) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u17 u17 = new u17(continuation, this.Y);
        u17.X = obj;
        return u17;
    }

    public final Object o(Object obj) {
        Integer E;
        od2.a0(obj);
        o35 o35 = (o35) this.X;
        bc7[] bc7Arr = InputNameScreen.B0;
        InputNameScreen inputNameScreen = this.Y;
        inputNameScreen.m0().setActiveButtonLoaderState(false);
        boolean z = o35 instanceof m17;
        aka aka = aka.a;
        if (z) {
            m17 m17 = (m17) o35;
            String valueOf = String.valueOf(((jqe) m17.a).b(inputNameScreen.getContext()));
            int s = au1.s(m17.c);
            if (s == 0) {
                inputNameScreen.n0().d(valueOf, aka);
            } else if (s == 1) {
                inputNameScreen.o0().d(valueOf, aka);
            } else if (s != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (o35 instanceof yj6) {
            int s2 = au1.s(((yj6) o35).a);
            if (s2 == 0) {
                inputNameScreen.n0().a();
            } else if (s2 == 1) {
                inputNameScreen.o0().a();
            } else if (s2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (o35 instanceof bfc) {
            tt7 tt7 = (tt7) ((bfc) o35).a;
            if (tt7 instanceof st7) {
                st7 st7 = (st7) tt7;
                ((d80) inputNameScreen.t0.getValue()).a(new c80(st7.e));
                inputNameScreen.a.getClass();
                CharSequence b = st7.c.b(inputNameScreen.getContext());
                if (b != null) {
                    jqe jqe = st7.d;
                    CharSequence b2 = jqe != null ? jqe.b(inputNameScreen.getContext()) : null;
                    wha wha = new wha((Widget) inputNameScreen);
                    wha.h(b);
                    wha.b(b2);
                    View view = inputNameScreen.getView();
                    wha.c(new eia(1, (view == null || (E = br7.E(view)) == null) ? 0 : E.intValue(), 0, 4));
                    wha.i();
                }
            } else if (tt7 instanceof rt7) {
                inputNameScreen.n0().d(String.valueOf(((rt7) tt7).c.b(inputNameScreen.getContext())), aka);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (o35 instanceof mnd) {
            inputNameScreen.o0().setHint(z7.B(inputNameScreen.getContext(), v0c.oneme_login_input_name_hint_surname_short));
            inputNameScreen.o0().d(z7.B(inputNameScreen.getContext(), v0c.oneme_login_input_name_surname_placeholder), aka.b);
        } else if (o35 instanceof zj6) {
            inputNameScreen.o0().setHint(z7.B(inputNameScreen.getContext(), v0c.oneme_login_input_name_hint_surname));
            inputNameScreen.o0().a();
        } else if (o35 instanceof lnd) {
            mr0.V(inputNameScreen.n0().a);
        }
        return e5f.a;
    }
}
