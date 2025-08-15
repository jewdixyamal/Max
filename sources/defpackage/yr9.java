package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: yr9  reason: default package */
public final class yr9 extends gle {
    public long X;
    public n7d Y;
    public long c;
    public long o;

    public yr9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1361631597:
                if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3560141:
                if (str.equals("time")) {
                    c2 = 2;
                    break;
                }
                break;
            case 95844769:
                if (str.equals("draft")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = lz7.M(gy8, 0);
                return;
            case 1:
                this.o = lz7.M(gy8, 0);
                return;
            case 2:
                this.X = lz7.M(gy8, 0);
                return;
            case 3:
                this.Y = tfg.y(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        long j3 = this.X;
        n7d n7d = this.Y;
        StringBuilder k = au1.k(j, "Response{chatId=", "userId=");
        k.append(j2);
        au1.q(j3, ", time=", ", draft=", k);
        k.append(n7d);
        k.append("}");
        return k.toString();
    }
}
