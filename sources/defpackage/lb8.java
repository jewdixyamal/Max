package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: lb8  reason: default package */
public final class lb8 {
    public static final lb8 d = new lb8(new nw4(8));
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(2, 36);
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        int i = oaf.a;
    }

    public lb8(nw4 nw4) {
        this.a = (Uri) nw4.b;
        this.b = (String) nw4.c;
        this.c = (Bundle) nw4.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb8)) {
            return false;
        }
        lb8 lb8 = (lb8) obj;
        if (oaf.a(this.a, lb8.a) && oaf.a(this.b, lb8.b)) {
            if ((this.c == null) == (lb8.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        if (this.c != null) {
            i = 1;
        }
        return hashCode2 + i;
    }
}
