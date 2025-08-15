package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: at9  reason: default package */
public final class at9 extends gle {
    public b10 X;
    public long c;
    public long o;

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
            case 3575610:
                if (str.equals("type")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = gy8.w0();
                return;
            case 1:
                this.o = gy8.w0();
                return;
            case 2:
                String P = lz7.P(gy8);
                if (P != null) {
                    this.X = b10.a(P);
                    return;
                }
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        b10 b10 = this.X;
        StringBuilder k = au1.k(j, "{chatId=", ", userId=");
        k.append(j2);
        k.append(", type=");
        k.append(b10);
        k.append("}");
        return k.toString();
    }
}
