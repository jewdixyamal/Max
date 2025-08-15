package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: xyf  reason: default package */
public final class xyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ WebAppRootScreen Z;
    public final /* synthetic */ c1g s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xyf(String str, WebAppRootScreen webAppRootScreen, c1g c1g, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = webAppRootScreen;
        this.s0 = c1g;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xyf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xyf xyf = new xyf(this.Y, this.Z, this.s0, continuation);
        xyf.X = obj;
        return xyf;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        WebAppRootScreen webAppRootScreen = this.Z;
        String str = this.Y;
        if (str == null) {
            Context context = webAppRootScreen.getContext();
            qyc qyc = (qyc) ((y7d) jwf.a.getAccessor().c(y7d.class));
            String string = qyc.g.getString("invite-long", (String) null);
            str = string != null ? string : String.format(context.getString(dpc.C), Arrays.copyOf(new Object[]{qyc.p()}, 1));
        }
        e5f e5f = e5f.a;
        c1g c1g = this.s0;
        if (c1g == null) {
            try {
                String str2 = o37.a;
                o37.d(webAppRootScreen.getContext(), str, (Uri) null);
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
        } else {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            WebAppRootScreen.x0(webAppRootScreen, intent, c1g);
            String str3 = o37.a;
            Intent a = o37.a(webAppRootScreen.getContext(), intent);
            if (a != null) {
                intent = a;
            }
            webAppRootScreen.getContext().startActivity(intent);
        }
        obj2 = e5f;
        if (!(obj2 instanceof njc)) {
            e5f e5f2 = (e5f) obj2;
            bc7[] bc7Arr = WebAppRootScreen.G0;
            webAppRootScreen.A0().evaluateJavascript("window.navigator.__share__receive()", new ila(1));
        }
        Throwable a2 = pjc.a(obj2);
        if (a2 != null) {
            sx3.getClass();
            a2.toString();
            bc7[] bc7Arr2 = WebAppRootScreen.G0;
            webAppRootScreen.A0().evaluateJavascript("window.navigator.__share__receive(abort)", new ila(1));
        }
        return e5f;
    }
}
