package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: wc6  reason: default package */
public final class wc6 extends ok0 {
    public final zi5 j;
    public final l20 k;

    public wc6(zi5 zi5, l20 l20) {
        super(-1, -1, 0, 0, 0, (uy) null, (String) null, false, true);
        this.j = zi5;
        this.k = l20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wc6.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        wc6 wc6 = (wc6) obj;
        return this.j.equals(wc6.j) && this.k.equals(wc6.k);
    }

    public final int getHeight() {
        return this.k.b.o;
    }

    public final int getWidth() {
        return this.k.b.c;
    }

    public final int hashCode() {
        int hashCode = this.j.hashCode();
        int hashCode2 = this.k.hashCode();
        return au1.s(3) + ((hashCode2 + ((hashCode + (super.hashCode() * 31)) * 31)) * 31);
    }

    public final int j() {
        return 3;
    }

    public final Uri l() {
        l20 l20 = this.k;
        if (!oag.t(l20.s)) {
            return Uri.parse(l20.s);
        }
        File k2 = ((kk5) this.j).k(l20.b.s0);
        return k2.exists() ? Uri.fromFile(k2) : Uri.fromFile(new File(l20.s));
    }
}
