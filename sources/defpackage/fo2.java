package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: fo2  reason: default package */
public final class fo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fo2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fo2 fo2 = new fo2(continuation, this.Y);
        fo2.X = obj;
        return fo2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        c58 c58 = (c58) this.X;
        String name = this.Y.getClass().getName();
        ir6 ir6 = hm9.m;
        cz5 cz5 = null;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            fg7 fg7 = this.Y.lifecycleOwner.Q().d;
            fg7 fg72 = this.Y.getViewLifecycleOwner().Q().d;
            ir6.d(us7, name, "got mediaBarViewModel.upEvents " + c58 + " " + fg7 + "," + fg72, (Throwable) null);
        }
        if (tpa.f(c58, x48.a)) {
            MessageWriteWidget G0 = this.Y.G0();
            if (G0 != null) {
                G0.q0().setText(G0.X.f.k);
            }
        } else if (tpa.f(c58, w48.a)) {
            MessageWriteWidget G02 = this.Y.G0();
            if (G02 != null) {
                G02.q0().setText(G02.X.f.k);
            }
            this.Y.E0().setVisibility(8);
            ChatScreen chatScreen = this.Y;
            hc8 hc8 = chatScreen.U0;
            if (hc8 != null && !hc8.l) {
                chatScreen.y0();
            }
        } else if (tpa.f(c58, y48.a)) {
            g39 H0 = this.Y.H0();
            pnf.o(H0.s0, z29.a);
        } else if (c58 instanceof b58) {
            rq2 P0 = this.Y.P0();
            b58 b58 = (b58) c58;
            CharSequence charSequence = b58.a;
            List list = b58.b;
            boolean z = b58.c;
            Long w = this.Y.F0().w();
            zy8 v = this.Y.F0().v();
            if (v != null) {
                cz5 = v.a();
            }
            P0.B(charSequence, list, z, w, cz5);
        } else if (c58 instanceof z48) {
            rq2 P02 = this.Y.P0();
            Uri uri = ((z48) c58).a;
            Long w2 = this.Y.F0().w();
            zy8 v2 = this.Y.F0().v();
            if (v2 != null) {
                cz5 = v2.a();
            }
            cz5 cz52 = cz5;
            e52 e52 = (e52) P02.Y0.a.getValue();
            if (e52 != null) {
                P02.C(j47.S(P02.a, ((w9a) P02.u()).b(), vx3.b, new xp2(uri, e52.a, P02, w2, cz52, (Continuation) null)));
            }
        } else if (c58 instanceof a58) {
            rq2 P03 = this.Y.P0();
            a58 a58 = (a58) c58;
            er7 er7 = a58.a;
            float f = a58.b;
            long j = a58.c;
            Long w3 = this.Y.F0().w();
            zy8 v3 = this.Y.F0().v();
            if (v3 != null) {
                cz5 = v3.a();
            }
            P03.A(er7, f, j, w3, cz5);
        } else if (c58 instanceof v48) {
            v48 v48 = (v48) c58;
            this.Y.P0().t(v48.a, this.Y.F0().u(), v48.b, v48.c);
            xz8.C(this.Y.F0(), (Long) null, (CharSequence) null, (Integer) null, 14);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
