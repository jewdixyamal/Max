package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: rua  reason: default package */
public final class rua extends gle {
    public Long X;
    public int Y;
    public String c;
    public wm3 o;

    public rua(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -309425751:
                if (str.equals("profile")) {
                    c2 = 0;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c2 = 1;
                    break;
                }
                break;
            case 110541305:
                if (str.equals(ApiProtocol.KEY_TOKEN)) {
                    c2 = 2;
                    break;
                }
                break;
            case 141498579:
                if (str.equals("tokenType")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = wm3.e(gy8);
                return;
            case 1:
                this.X = Long.valueOf(lz7.M(gy8, 0));
                return;
            case 2:
                this.c = lz7.P(gy8);
                return;
            case 3:
                this.Y = ey8.u(lz7.P(gy8));
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        wm3 wm3 = this.o;
        Long l = this.X;
        int i = this.Y;
        return "{token='" + str + "', profile=" + wm3 + ", phone=" + l + ", tokenType=" + ey8.p(i) + "}";
    }
}
