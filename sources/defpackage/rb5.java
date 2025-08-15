package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* renamed from: rb5  reason: default package */
public final class rb5 extends WebViewClient {
    public final /* synthetic */ FaqWebViewWidget a;

    public rb5(FaqWebViewWidget faqWebViewWidget) {
        this.a = faqWebViewWidget;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            String scheme = url.getScheme();
            FaqWebViewWidget faqWebViewWidget = this.a;
            if (scheme == null || !w9e.p0(scheme, "mailto", false)) {
                String scheme2 = url.getScheme();
                if (scheme2 != null && w9e.p0(scheme2, ((fl7) ((al) faqWebViewWidget.o.getValue())).b, false)) {
                    bc7[] bc7Arr = FaqWebViewWidget.Z;
                    try {
                        faqWebViewWidget.startActivity(new Intent("android.intent.action.VIEW", url));
                    } catch (ActivityNotFoundException e) {
                        String name = FaqWebViewWidget.class.getName();
                        String message = e.getMessage();
                        hm9.p(name, "error handleUrl - " + url + ": " + message, e);
                    }
                    return true;
                }
            } else {
                bc7[] bc7Arr2 = FaqWebViewWidget.Z;
                vxd T = j47.T(faqWebViewWidget.getViewLifecycleScope(), (lx3) null, vx3.b, new tb5(faqWebViewWidget, (Continuation) null), 1);
                faqWebViewWidget.c.o1(faqWebViewWidget, FaqWebViewWidget.Z[1], T);
                return true;
            }
        }
        return false;
    }
}
