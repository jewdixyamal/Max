package defpackage;

/* renamed from: nad  reason: default package */
public final class nad extends gle {
    public int X;
    public wz Y;
    public String c;
    public String o;

    public nad(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1669782576:
                if (str.equals("proxy-domains")) {
                    c2 = 0;
                    break;
                }
                break;
            case 106941038:
                if (str.equals("proxy")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1808396306:
                if (str.equals("app-update-type")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.Y = wz.g(gy8);
                return;
            case 1:
                this.c = lz7.P(gy8);
                return;
            case 2:
                this.X = lz7.L(gy8);
                return;
            case 3:
                this.o = lz7.P(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        int i = this.X;
        wz wzVar = this.Y;
        StringBuilder k = k7d.k("{  proxy='", str, "', locationCountryCode='", str2, "', appUpdateType=");
        k.append(i);
        k.append(", proxyDomains=");
        k.append(wzVar);
        k.append("}");
        return k.toString();
    }
}
