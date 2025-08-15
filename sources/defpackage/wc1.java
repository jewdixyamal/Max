package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.protocol.HTTP;

/* renamed from: wc1  reason: default package */
public final class wc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallLinkInfoScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wc1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.Y = callLinkInfoScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wc1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wc1 wc1 = new wc1(continuation, this.Y);
        wc1.X = obj;
        return wc1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            z71.c.R1((c64) wm9);
        } else {
            boolean z = wm9 instanceof ga1;
            CallLinkInfoScreen callLinkInfoScreen = this.Y;
            if (z) {
                b46 b46 = CallLinkInfoScreen.B0;
                callLinkInfoScreen.m0().d(2, 1);
                z71 z71 = z71.c;
                String string = callLinkInfoScreen.getContext().getString(t7a.q);
                String obj2 = ((ga1) wm9).b.toString();
                String name = CallLinkInfoScreen.class.getName();
                z71.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", obj2);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                z71.P1().b(":chats/share", dy7.g(new kpa("oneme:share:data", intent), new kpa("oneme:share:title", string), new kpa("tag", name)));
            } else if (wm9 instanceof ha1) {
                b46 b462 = CallLinkInfoScreen.B0;
                callLinkInfoScreen.m0().d(3, 1);
                String str = o37.a;
                o37.d(callLinkInfoScreen.getContext(), ((ha1) wm9).b, (Uri) null);
            } else if (wm9 instanceof fa1) {
                b46 b463 = CallLinkInfoScreen.B0;
                callLinkInfoScreen.m0().d(1, 1);
                tpa.o(callLinkInfoScreen.getContext(), ((fa1) wm9).b.toString());
                if (tpa.s()) {
                    eqe eqe = new eqe(t7a.p);
                    int i = q7a.e;
                    wha wha = new wha((Widget) callLinkInfoScreen);
                    wha.g(eqe);
                    wha.e(new kia(i));
                    wha.i();
                }
            } else if (wm9 instanceof ia1) {
                jqe jqe = ((ia1) wm9).b;
                b46 b464 = CallLinkInfoScreen.B0;
                callLinkInfoScreen.getClass();
                wha wha2 = new wha((Widget) callLinkInfoScreen);
                wha2.g(jqe);
                wha2.e(lia.a);
                wha2.i();
            } else if (wm9 instanceof ja1) {
                callLinkInfoScreen.getRouter().B(callLinkInfoScreen);
                z71.c.P1().b(":call-join-link?link=".concat(((ja1) wm9).b), (Bundle) null);
            }
        }
        return e5f.a;
    }
}
