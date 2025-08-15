package defpackage;

import android.net.Uri;
import android.os.Message;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: gla  reason: default package */
public final class gla extends WebChromeClient {
    public final zzf a;

    public gla(zzf zzf) {
        this.a = zzf;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Object obj = null;
        hla hla = new hla(webView.getContext(), (AttributeSet) null, 0, 14);
        hla.setWebViewClient(new fla(this, hla));
        if (message != null) {
            obj = message.obj;
        }
        ((WebView.WebViewTransport) obj).setWebView(hla);
        message.sendToTarget();
        return true;
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        hla hla = webView instanceof hla ? (hla) webView : null;
        if (hla == null) {
            return false;
        }
        ValueCallback<Uri[]> filePathCallback = hla.getFilePathCallback();
        if (filePathCallback != null) {
            filePathCallback.onReceiveValue((Object) null);
        }
        hla.setFilePathCallback(valueCallback);
        zzf zzf = this.a;
        zzf.getClass();
        pnf.o(zzf.M0, new gzf(fileChooserParams));
        return true;
    }
}
