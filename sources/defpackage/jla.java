package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.InputStream;
import org.apache.http.HttpHost;

/* renamed from: jla  reason: default package */
public final class jla extends WebViewClient {
    public static final /* synthetic */ int d = 0;
    public final zzf a;
    public final s23 b;
    public final khe c = new khe(new s4a(11));

    public jla(zzf zzf, s23 s23) {
        this.a = zzf;
        this.b = s23;
    }

    public final void onPageCommitVisible(WebView webView, String str) {
        Object obj;
        if (webView != null) {
            j5c j5c = (j5c) this.c.getValue();
            Context context = webView.getContext();
            int i = lla.a;
            ThreadLocal threadLocal = j5c.a;
            byte[] bArr = (byte[]) threadLocal.get();
            if (bArr == null) {
                bArr = new byte[65536];
                threadLocal.set(bArr);
            }
            Object obj2 = null;
            try {
                InputStream openRawResource = context.getResources().openRawResource(i);
                ThreadLocal threadLocal2 = j5c.b;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                    threadLocal2.set(bArr2);
                }
                int i2 = 0;
                while (true) {
                    try {
                        int read = openRawResource.read(bArr2, 0, bArr2.length);
                        if (read < 0) {
                            break;
                        }
                        int i3 = i2 + read;
                        if (bArr.length < i3) {
                            byte[] bArr3 = new byte[(bArr.length * 2)];
                            System.arraycopy(bArr, 0, bArr3, 0, i2);
                            threadLocal.set(bArr3);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i2, read);
                            i2 = i3;
                        }
                    } catch (Throwable th) {
                        v3c.i(openRawResource, th);
                        throw th;
                    }
                }
                v3c.i(openRawResource, (Throwable) null);
                obj = new String(bArr, 0, i2, a52.a);
            } catch (Throwable th2) {
                obj = new njc(th2);
            }
            if (!(obj instanceof njc)) {
                obj2 = obj;
            }
            String str2 = (String) obj2;
            if (str2 != null) {
                webView.evaluateJavascript(str2, new ila(0));
            }
        }
        super.onPageCommitVisible(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        q0e q0e = this.a.E0;
        cpa cpa = cpa.a;
        cpa cpa2 = cpa.b;
        q0e.getClass();
        q0e.m(cpa, cpa2);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a.E0.m((Object) null, cpa.a);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a.E0.m((Object) null, cpa.o);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        zzf zzf = this.a;
        if (((t33) zzf.Z).g.getBoolean("web_app:ssl_check", false)) {
            sslErrorHandler.proceed();
            return;
        }
        zzf.E0.m((Object) null, cpa.o);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        s23 s23 = this.b;
        s23.getClass();
        if (!tpa.f(url.getScheme(), HttpHost.DEFAULT_SCHEME_NAME) && !tpa.f(url.getScheme(), "https")) {
            try {
                s23.a.startActivity(new Intent("android.intent.action.VIEW", url));
                return true;
            } catch (ActivityNotFoundException unused) {
                return true;
            } catch (Exception e) {
                hm9.p("WebAppUrlInterceptor", "Unexpected exception when try to open activity by link", e);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
