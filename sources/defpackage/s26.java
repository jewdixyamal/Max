package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.coroutines.Continuation;

/* renamed from: s26  reason: default package */
public final class s26 implements p26 {
    public m26 a = m26.d;
    public final String b = s26.class.getName();
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final khe f;
    public final int g;
    public final int h;
    public final int[] i;
    public pp7 j;
    public sfc k;

    public s26(je7 je7, je7 je72, je7 je73) {
        this.c = je72;
        this.d = je73;
        this.e = je7;
        this.f = new khe(new es3(20, this));
        this.g = tu0.G(((float) 120) * fk4.d().getDisplayMetrics().density);
        this.h = tu0.G(((float) 146) * fk4.d().getDisplayMetrics().density);
        this.i = new int[2];
    }

    public final m26 c() {
        return this.a;
    }

    public final boolean d() {
        gef gef = this.a.a;
        if (gef == null) {
            hm9.p(this.b, "You should call init before prepare!", (Throwable) null);
            return false;
        }
        Uri l = gef.l();
        int i2 = oaf.a;
        String scheme = l.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            pp7 pp7 = this.j;
            if (pp7 == null || !pp7.d()) {
                return false;
            }
        } else {
            sfc sfc = this.k;
            if (sfc == null || !sfc.d()) {
                return false;
            }
        }
        return true;
    }

    public final Object e(long j2, Continuation continuation) {
        gef gef = this.a.a;
        if (gef == null) {
            hm9.p(this.b, "You should call setVideoContent before extractFrame!", (Throwable) null);
            return null;
        }
        Uri l = gef.l();
        int i2 = oaf.a;
        String scheme = l.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            pp7 pp7 = this.j;
            if (pp7 != null) {
                return pp7.e(j2, continuation);
            }
        } else {
            sfc sfc = this.k;
            if (sfc != null) {
                return sfc.e(j2, continuation);
            }
        }
        return null;
    }

    public final void f(m26 m26) {
        gef gef;
        if (!m26.equals(this.a) && (gef = m26.a) != null) {
            if (m26.b == 0 || m26.c == 0) {
                int width = gef.getWidth();
                int height = gef.getHeight();
                int[] iArr = this.i;
                int i2 = this.g;
                if (width <= 0 || height <= 0) {
                    iArr[0] = i2;
                    iArr[1] = i2;
                } else if (width < height) {
                    hm9.z(i2, i2, width, height, iArr);
                } else {
                    int i3 = this.h;
                    hm9.z(i3, i3, width, height, iArr);
                }
                this.a = new m26(gef, iArr[0], iArr[1]);
            } else {
                this.a = m26;
            }
            Uri l = gef.l();
            int i4 = oaf.a;
            String scheme = l.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                if (this.j == null) {
                    this.j = new pp7((kke) this.d.getValue(), (gta) this.c.getValue());
                }
                pp7 pp7 = this.j;
                if (pp7 != null) {
                    pp7.a = this.a;
                    return;
                }
                return;
            }
            if (this.k == null) {
                this.k = new sfc((iv6) this.f.getValue());
            }
            sfc sfc = this.k;
            if (sfc != null) {
                sfc.c = this.a;
            }
        }
    }

    public final void prepare() {
        gef gef = this.a.a;
        String str = this.b;
        if (gef == null) {
            hm9.p(str, "You should call init before prepare!", (Throwable) null);
        } else if (!d()) {
            hm9.m0(str, "Can't extract video frame", new Object[0]);
        } else {
            Uri l = gef.l();
            int i2 = oaf.a;
            String scheme = l.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                pp7 pp7 = this.j;
                if (pp7 != null) {
                    pp7.prepare();
                    return;
                }
                return;
            }
            sfc sfc = this.k;
            if (sfc != null) {
                sfc.prepare();
            }
        }
    }
}
