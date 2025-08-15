package defpackage;

import android.util.Size;

/* renamed from: vif  reason: default package */
public final class vif {
    public final Size a;
    public final String b;
    public final String c;

    public vif(Size size, String str, String str2) {
        this.a = size;
        this.b = str;
        this.c = str2;
    }

    public static vif a(vif vif, Size size, String str, String str2, int i) {
        if ((i & 1) != 0) {
            size = vif.a;
        }
        if ((i & 2) != 0) {
            str = vif.b;
        }
        if ((i & 4) != 0) {
            str2 = vif.c;
        }
        vif.getClass();
        return new vif(size, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vif)) {
            return false;
        }
        vif vif = (vif) obj;
        return tpa.f(this.a, vif.a) && tpa.f(this.b, vif.b) && tpa.f(this.c, vif.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(previewSize=");
        sb.append(this.a);
        sb.append(", recordPath=");
        sb.append(this.b);
        sb.append(", previewBase64=");
        return zr6.l(sb, this.c, ")");
    }
}
