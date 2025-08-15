package defpackage;

import android.content.LocusId;
import android.text.TextUtils;

/* renamed from: xr7  reason: default package */
public final class xr7 {
    public final String a;
    public final LocusId b;

    public xr7(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            this.b = new LocusId(str);
            return;
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xr7.class != obj.getClass()) {
            return false;
        }
        String str = ((xr7) obj).a;
        String str2 = this.a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        int length = this.a.length();
        sb.append(length + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
