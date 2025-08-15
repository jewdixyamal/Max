package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: or9  reason: default package */
public final class or9 extends gle {
    public long X;
    public long Y;
    public go9 Z;
    public String c;
    public String o;
    public String s0;
    public int t0;

    public or9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        int i = 3;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1676095234:
                if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1361631597:
                if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    c2 = 1;
                    break;
                }
                break;
            case -172115450:
                if (str.equals("callerId")) {
                    c2 = 2;
                    break;
                }
                break;
            case 116579:
                if (str.equals("vcp")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c2 = 4;
                    break;
                }
                break;
            case 86542880:
                if (str.equals("turnServer")) {
                    c2 = 5;
                    break;
                }
                break;
            case 398343517:
                if (str.equals("sdpOffer")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = lz7.P(gy8);
                return;
            case 1:
                this.Y = lz7.M(gy8, 0);
                return;
            case 2:
                this.X = lz7.M(gy8, 0);
                return;
            case 3:
                this.o = lz7.P(gy8);
                return;
            case 4:
                String P = lz7.P(gy8);
                P.getClass();
                if (P.equals("AUDIO")) {
                    i = 2;
                } else if (!P.equals("VIDEO")) {
                    i = 1;
                }
                this.t0 = i;
                return;
            case 5:
                this.Z = go9.h(gy8);
                return;
            case 6:
                this.s0 = lz7.P(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        long j = this.X;
        long j2 = this.Y;
        go9 go9 = this.Z;
        String str3 = this.s0;
        int i = this.t0;
        StringBuilder k = k7d.k("{conversationId='", str, "'convParams='", str2, "', callerId=");
        k.append(j);
        au1.q(j2, ", chatId=", ", turnServer=", k);
        k.append(go9);
        k.append(", sdpOffer='");
        k.append(str3);
        k.append("', callType=");
        k.append(wg0.q(i));
        k.append("}");
        return k.toString();
    }
}
