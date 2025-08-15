package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: sh3  reason: default package */
public final class sh3 {
    public int a;
    public boolean b;
    public boolean c;
    public final List d;

    public sh3(List list) {
        this.d = list;
    }

    public final rh3 a(SSLSocket sSLSocket) {
        rh3 rh3;
        int i;
        boolean z;
        int i2 = this.a;
        List list = this.d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                rh3 = null;
                break;
            }
            rh3 = (rh3) list.get(i2);
            if (rh3.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (rh3 != null) {
            int i3 = this.a;
            int size2 = list.size();
            while (true) {
                i = 0;
                if (i3 >= size2) {
                    z = false;
                    break;
                } else if (((rh3) list.get(i3)).b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.b = z;
            boolean z2 = this.c;
            String[] strArr = rh3.c;
            String[] o = strArr != null ? naf.o(sSLSocket.getEnabledCipherSuites(), strArr, u13.b) : sSLSocket.getEnabledCipherSuites();
            String[] strArr2 = rh3.d;
            String[] o2 = strArr2 != null ? naf.o(sSLSocket.getEnabledProtocols(), strArr2, rm9.b) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            fs4 fs4 = u13.b;
            byte[] bArr = naf.a;
            int length = supportedCipherSuites.length;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (fs4.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (z2 && i != -1) {
                String str = supportedCipherSuites[i];
                o = (String[]) Arrays.copyOf(o, o.length + 1);
                o[o.length - 1] = str;
            }
            qh3 qh3 = new qh3(rh3);
            qh3.c((String[]) Arrays.copyOf(o, o.length));
            qh3.f((String[]) Arrays.copyOf(o2, o2.length));
            rh3 a2 = qh3.a();
            if (a2.c() != null) {
                sSLSocket.setEnabledProtocols(a2.d);
            }
            if (a2.a() != null) {
                sSLSocket.setEnabledCipherSuites(a2.c);
            }
            return rh3;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.c + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
