package defpackage;

import android.webkit.JavascriptInterface;
import kotlin.coroutines.Continuation;

/* renamed from: u3g  reason: default package */
public final class u3g {
    public final zzf a;

    public u3g(zzf zzf) {
        this.a = zzf;
    }

    @JavascriptInterface
    public final void postEvent(String str, String str2) {
        c8d c8d = this.a.D0;
        j47.T((sx3) c8d.a, ((w9a) ((kke) c8d.b)).a(), (vx3) null, new ca7(str, str2, c8d, (Continuation) null), 2);
    }

    @JavascriptInterface
    public final void resolveShare(String str, byte[] bArr, String str2, String str3) {
        zzf zzf = this.a;
        zzf.getClass();
        pnf.n(zzf, (lx3) null, (vx3) null, new szf(zzf, str, bArr, str2, str3, (Continuation) null), 3);
    }
}
