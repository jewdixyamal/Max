package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* renamed from: sb5  reason: default package */
public final class sb5 extends ffe implements a66 {
    public Uri.Builder X;
    public int Y;
    public final /* synthetic */ FaqWebViewWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sb5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Z = faqWebViewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sb5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sb5(this.Z, continuation);
    }

    public final Object o(Object obj) {
        Uri.Builder builder;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        FaqWebViewWidget faqWebViewWidget = this.Z;
        if (i == 0) {
            od2.a0(obj);
            Uri.Builder buildUpon = Uri.parse(z7.B(faqWebViewWidget.getContext(), jpc.K1)).buildUpon();
            this.X = buildUpon;
            this.Y = 1;
            Object awaitInternal = faqWebViewWidget.Y.awaitInternal(this);
            if (awaitInternal == tx3) {
                return tx3;
            }
            Uri.Builder builder2 = buildUpon;
            obj = awaitInternal;
            builder = builder2;
        } else if (i == 1) {
            builder = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            builder.appendQueryParameter("source", "settings");
        } else {
            builder.appendQueryParameter("source", "reg");
        }
        String uri = builder.build().toString();
        bc7[] bc7Arr = FaqWebViewWidget.Z;
        faqWebViewWidget.getClass();
        ((hla) faqWebViewWidget.a.T0(faqWebViewWidget, FaqWebViewWidget.Z[0])).loadUrl(uri);
        return e5f.a;
    }
}
