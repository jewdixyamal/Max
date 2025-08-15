package defpackage;

import java.util.Map;

/* renamed from: le3  reason: default package */
public final class le3 {
    public final String a;
    public final a8d b;
    public final Map c;
    public final gaf d;
    public final sa2 e;

    public /* synthetic */ le3(gaf gaf) {
        this((String) null, (a8d) null, (Map) null, gaf, (sa2) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le3)) {
            return false;
        }
        le3 le3 = (le3) obj;
        return tpa.f(this.a, le3.a) && tpa.f(this.b, le3.b) && tpa.f(this.c, le3.c) && tpa.f(this.d, le3.d) && tpa.f(this.e, le3.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a8d a8d = this.b;
        int hashCode2 = (hashCode + (a8d == null ? 0 : a8d.hashCode())) * 31;
        Map map = this.c;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        gaf gaf = this.d;
        int hashCode4 = (hashCode3 + (gaf == null ? 0 : gaf.hashCode())) * 31;
        sa2 sa2 = this.e;
        if (sa2 != null) {
            i = sa2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb;
        Integer num = null;
        Map map = this.c;
        if (map == null || map.isEmpty()) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append('[');
            for (Map.Entry entry : map.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                sb.append('#');
                sb.append(longValue);
                sb.append(':');
                sb.append((xq2) entry.getValue());
            }
            sb.append(']');
        }
        if (map != null) {
            num = Integer.valueOf(map.size());
        }
        return "Configuration: user=" + this.d + ", hash=" + this.a + ", chatsCount=" + num + ", chats=" + sb + ", server=" + this.b;
    }

    public le3(String str, a8d a8d, Map map, gaf gaf, sa2 sa2) {
        this.a = str;
        this.b = a8d;
        this.c = map;
        this.d = gaf;
        this.e = sa2;
    }
}
