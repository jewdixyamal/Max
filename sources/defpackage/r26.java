package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: r26  reason: default package */
public final class r26 extends o26 {
    public final iv6 f;
    public final ti4 g;
    public lp7 h;
    public rfc i;

    public r26(hle hle, o45 o45, iv6 iv6, ti4 ti4) {
        super(hle, o45);
        this.f = iv6;
        this.g = ti4;
    }

    public final void a(fef fef, int i2, int i3) {
        super.a(fef, i2, i3);
        Uri l = ((ok0) fef).l();
        int i4 = maf.a;
        String scheme = l.getScheme();
        boolean z = TextUtils.isEmpty(scheme) || "file".equals(scheme);
        o45 o45 = this.b;
        hle hle = this.a;
        if (z) {
            if (this.h == null) {
                this.h = new lp7(hle, o45, this.g);
            }
            this.h.a(fef, i2, i3);
            return;
        }
        if (this.i == null) {
            this.i = new rfc(hle, o45, this.f);
        }
        this.i.a(fef, i2, i3);
    }

    public final boolean b() {
        fef fef = this.e;
        if (fef == null) {
            hm9.p("r26", "You should call setVideoContent before prepare!", (Throwable) null);
            return false;
        }
        Uri l = ((ok0) fef).l();
        int i2 = maf.a;
        String scheme = l.getScheme();
        return (TextUtils.isEmpty(scheme) || "file".equals(scheme)) ? this.h.b() : this.i.b();
    }
}
