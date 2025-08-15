package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: pua  reason: default package */
public final class pua {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public String i;

    public pua(int i2, String str, String str2, String str3, List list, List list2, String str4, String str5) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
        this.g = str4;
        this.h = str5;
        this.i = fca.b(str2, str3);
    }

    public final CharSequence a() {
        if (this.i == null) {
            String str = this.c;
            if (!oag.t(str)) {
                Pattern pattern = fca.a;
                this.i = fca.b(str, this.d);
            } else {
                List list = this.e;
                if (list == null || list.isEmpty()) {
                    this.i = "";
                } else {
                    Pattern pattern2 = fca.a;
                    this.i = fca.b((CharSequence) list.get(0), (CharSequence) null);
                }
            }
        }
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pua.class != obj.getClass()) {
            return false;
        }
        pua pua = (pua) obj;
        if (this.a != pua.a) {
            return false;
        }
        String str = pua.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list = pua.e;
        List list2 = this.e;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        List list3 = pua.f;
        List list4 = this.f;
        if (list4 == null ? list3 != null : !list4.equals(list3)) {
            return false;
        }
        String str3 = pua.g;
        String str4 = this.g;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = pua.h;
        String str6 = this.h;
        return str6 != null ? str6.equals(str5) : str5 == null;
    }

    public final int hashCode() {
        int i2 = this.a * 31;
        int i3 = 0;
        String str = this.b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.e;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode4 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phone{contactId=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', phones=");
        sb.append(this.e);
        sb.append(", serverPhones=");
        sb.append(this.f);
        sb.append(", avatarPath='");
        sb.append(this.g);
        sb.append("', email='");
        return zr6.l(sb, this.h, "'}");
    }
}
