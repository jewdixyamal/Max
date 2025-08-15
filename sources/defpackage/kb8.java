package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: kb8  reason: default package */
public final class kb8 {
    public final Uri a;
    public final String b = null;
    public final List c;
    public final String d;
    public final zw6 e;
    public final Object f;

    public kb8(Uri uri, br7 br7, List list, ffc ffc) {
        this.a = uri;
        this.c = list;
        this.d = null;
        this.e = ffc;
        ww6 i = zw6.i();
        for (int i2 = 0; i2 < ffc.size(); i2++) {
            i.d(new mb8(((mb8) ffc.get(i2)).a()));
        }
        i.j();
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb8)) {
            return false;
        }
        kb8 kb8 = (kb8) obj;
        if (this.a.equals(kb8.a) && maf.a(this.b, kb8.b)) {
            kb8.getClass();
            if (maf.a((Object) null, (Object) null) && maf.a((Object) null, (Object) null) && this.c.equals(kb8.c) && maf.a(this.d, kb8.d) && this.e.equals(kb8.e) && maf.a(this.f, kb8.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + 0) * 961)) * 31;
        String str2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }
}
