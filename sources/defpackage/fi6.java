package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fi6  reason: default package */
public final class fi6 {
    public final khe a;
    public final awe b;
    public final u13 c;
    public final List d;

    public fi6(awe awe, u13 u13, List list, k56 k56) {
        this.b = awe;
        this.c = u13;
        this.d = list;
        this.a = new khe(new ei6(0, k56));
    }

    public final List a() {
        return (List) this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fi6) {
            fi6 fi6 = (fi6) obj;
            return fi6.b == this.b && tpa.f(fi6.c, this.c) && tpa.f(fi6.a(), a()) && tpa.f(fi6.d, this.d);
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = a().hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(z53.S(a2, 10));
        for (Certificate certificate : a2) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.b);
        sb.append(" cipherSuite=");
        sb.append(this.c);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.d;
        ArrayList arrayList2 = new ArrayList(z53.S(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
