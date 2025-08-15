package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: fla  reason: default package */
public final class fla extends WebViewClient {
    public final /* synthetic */ gla a;
    public final /* synthetic */ hla b;

    public fla(gla gla, hla hla) {
        this.a = gla;
        this.b = hla;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        zzf zzf = this.a.a;
        zzf.getClass();
        pnf.o(zzf.M0, new bzf(uri));
        this.b.destroy();
        return true;
    }
}
