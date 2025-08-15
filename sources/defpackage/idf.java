package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: idf  reason: default package */
public final class idf {
    public final /* synthetic */ int a = 0;
    public String b;
    public long c;
    public long d;
    public go9 e;
    public String f;
    public int g;

    public /* synthetic */ idf() {
    }

    public static idf a(gy8 gy8) {
        int N = lz7.N(gy8);
        if (N == 0) {
            return null;
        }
        idf idf = new idf();
        for (int i = 0; i < N; i++) {
            String z0 = gy8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -1676095234:
                    if (z0.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1361631597:
                    if (z0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -172115450:
                    if (z0.equals("callerId")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (z0.equals("type")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 86542880:
                    if (z0.equals("turnServer")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 398343517:
                    if (z0.equals("sdpOffer")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    idf.b = gy8.z0();
                    break;
                case 1:
                    idf.d = gy8.w0();
                    break;
                case 2:
                    idf.c = gy8.w0();
                    break;
                case 3:
                    String z02 = gy8.z0();
                    z02.getClass();
                    idf.g = !z02.equals("AUDIO") ? !z02.equals("VIDEO") ? 1 : 3 : 2;
                    break;
                case 4:
                    idf.e = go9.h(gy8);
                    break;
                case 5:
                    idf.f = lz7.P(gy8);
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        return new idf(idf);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "{conversationId='" + this.b + "', callerId=" + this.c + ", chatId=" + this.d + ", turnServer=" + this.e + ", sdpOffer='" + this.f + "', type=" + wg0.q(this.g) + "}";
            default:
                return super.toString();
        }
    }

    public idf(idf idf) {
        this.b = idf.b;
        this.c = idf.c;
        this.d = idf.d;
        this.e = idf.e;
        this.f = idf.f;
        this.g = idf.g;
    }
}
