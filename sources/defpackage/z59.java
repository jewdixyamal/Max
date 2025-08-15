package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: z59  reason: default package */
public final class z59 extends ffe implements a66 {
    public final /* synthetic */ long X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ MotionEvent Z;
    public final /* synthetic */ MessagesListWidget s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ lk7 u0;
    public final /* synthetic */ View v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z59(long j, String str, MotionEvent motionEvent, MessagesListWidget messagesListWidget, int i, lk7 lk7, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = str;
        this.Z = motionEvent;
        this.s0 = messagesListWidget;
        this.t0 = i;
        this.u0 = lk7;
        this.v0 = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z59) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z59(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, (ViewGroup) this.v0, continuation);
    }

    public final Object o(Object obj) {
        List list;
        od2.a0(obj);
        kpa kpa = new kpa("messages:context_menu:message_id", new Long(this.X));
        String str = this.Y;
        Bundle g = dy7.g(kpa, new kpa("messages:context_menu:link_url", str));
        qt3 d0 = dy7.c(1).d0();
        MotionEvent motionEvent = this.Z;
        qt3 U = d0.L(motionEvent.getRawX(), motionEvent.getRawY()).S(g).U(new iqe(str));
        bc7[] bc7Arr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.s0;
        messagesListWidget.x0().getClass();
        int s = au1.s(this.t0);
        if (s == 0) {
            list = y53.M(new tt3(this.u0 == lk7.X ? cpc.h : cpc.f, (jqe) new eqe(dpc.h), Integer.valueOf(woc.D0), (Integer) null, 20), new tt3(cpc.b, (jqe) new eqe(dpc.e), Integer.valueOf(woc.t), (Integer) null, 20));
        } else if (s == 1) {
            list = y53.M(new tt3(cpc.f, (jqe) new eqe(dpc.j), Integer.valueOf(woc.c0), (Integer) null, 20), new tt3(cpc.b, (jqe) new eqe(dpc.g), Integer.valueOf(woc.t), (Integer) null, 20));
        } else if (s == 2) {
            list = y53.M(new tt3(cpc.f, (jqe) new eqe(dpc.i), Integer.valueOf(woc.D0), (Integer) null, 20), new tt3(cpc.b, (jqe) new eqe(dpc.f), Integer.valueOf(woc.t), (Integer) null, 20));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        U.I(list).build().q(messagesListWidget);
        pag.F(this.v0, ni6.LONG_PRESS);
        return e5f.a;
    }
}
