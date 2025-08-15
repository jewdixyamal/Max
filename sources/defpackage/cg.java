package defpackage;

import android.net.Uri;

/* renamed from: cg  reason: default package */
public final class cg implements ww0 {
    public final boolean a;
    public final String b;

    public cg(int i, boolean z) {
        this.a = z;
        this.b = zr6.h(i, "anim://");
    }

    public final boolean a(Uri uri) {
        return eae.o0(uri.toString(), this.b, false);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!this.a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!cg.class.equals(obj.getClass())) {
            return false;
        }
        return tpa.f(this.b, ((cg) obj).b);
    }

    public final int hashCode() {
        return !this.a ? super.hashCode() : this.b.hashCode();
    }
}
