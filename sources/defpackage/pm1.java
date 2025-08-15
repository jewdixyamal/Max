package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: pm1  reason: default package */
public final class pm1 extends gle {
    public go9 X;
    public String Y;
    public String c;
    public long o;

    public pm1(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1676095234:
                if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1401988028:
                if (str.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                    c2 = 1;
                    break;
                }
                break;
            case -992105955:
                if (str.equals(ApiProtocol.PARAM_PEER_ID)) {
                    c2 = 2;
                    break;
                }
                break;
            case 86542880:
                if (str.equals("turnServer")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = lz7.P(gy8);
                return;
            case 1:
                this.Y = lz7.P(gy8);
                return;
            case 2:
                this.o = lz7.M(gy8, 0);
                return;
            case 3:
                this.X = go9.h(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        long j = this.o;
        go9 go9 = this.X;
        String str2 = this.Y;
        return "{conversationId='" + str + "', peerId=" + j + ", turnServer=" + go9 + ", joinLink=" + str2 + "}";
    }
}
