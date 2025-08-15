package defpackage;

import org.json.HTTP;

/* renamed from: pq6  reason: default package */
public final class pq6 {
    public final qq6 a;
    public final String b;

    public pq6(String str, String str2, String str3, qq6 qq6) {
        this.a = qq6;
        StringBuilder sb = new StringBuilder();
        sb.append("Content-Disposition: form-data; name=");
        nq6.a(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            nq6.a(sb, str2);
        }
        sb.append(HTTP.CRLF);
        if (str3 != null) {
            sb.append("Content-Type: ");
            sb.append(str3);
            sb.append(HTTP.CRLF);
        }
        this.b = sb.toString();
    }
}
