package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: m65  reason: default package */
public final class m65 {
    public final je7 a;
    public final khe b;
    public final khe c;
    public final khe d;
    public final khe e;
    public final khe f;

    public m65(Context context, je7 je7, je7 je72) {
        this.a = je7;
        this.b = new khe(new hy4(context, 3));
        this.c = new khe(new yf3(context, 5, this));
        this.d = new khe(new l65(je72, this, 0));
        this.e = new khe(new l65(je7, this, 1));
        this.f = new khe(new l65(je72, this, 2));
    }

    public final p24 a(Uri uri, boolean z) {
        tke tke = (tke) this.a.getValue();
        boolean d2 = !tke.c ? false : tke.d(uri.getHost());
        return z ? d2 ? (p24) this.f.getValue() : (p24) this.d.getValue() : d2 ? (p24) this.e.getValue() : (p24) this.c.getValue();
    }
}
