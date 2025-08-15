package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: jef  reason: default package */
public final class jef implements Serializable {
    public final List X;
    public final byte Y;
    public final String a;
    public final long b;
    public final String c;
    public final int o;

    public jef(String str, long j, String str2, int i, List list, byte b2) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.o = i;
        this.X = list;
        this.Y = b2;
    }

    public static final jef a(gy8 gy8) {
        int i;
        String str;
        gy8 gy82 = gy8;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            Throwable th2 = th;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th2);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        String str2 = "";
        long j = 0;
        String str3 = null;
        int i2 = 0;
        List list = null;
        byte b2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th3);
                }
                int s2 = au1.s(k7d.a);
                if (s2 != 0) {
                    if (s2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                try {
                    switch (str.hashCode()) {
                        case -2128794476:
                            if (str.equals("startedAt")) {
                                j = lz7.M(gy82, 0);
                                continue;
                            }
                            break;
                        case -1676095234:
                            if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                                str3 = lz7.P(gy8);
                                continue;
                            }
                            break;
                        case -1401988028:
                            if (str.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                                str2 = lz7.P(gy8);
                                continue;
                            }
                            break;
                        case 3575610:
                            if (str.equals("type")) {
                                b2 = lz7.I(gy8);
                                continue;
                            }
                            break;
                        case 265384045:
                            if (!str.equals("previewParticipantIds")) {
                                break;
                            } else {
                                List list2 = nz4.a;
                                ArrayList W = lz7.W(gy82, new mq9(18));
                                if (W != null) {
                                    list2 = W;
                                }
                                list = list2;
                                continue;
                            }
                        case 1268671573:
                            if (str.equals("approxParticipantsCount")) {
                                i2 = lz7.L(gy8);
                                continue;
                            }
                            break;
                    }
                    gy8.z();
                } catch (Throwable th4) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = u7d.a.iterator();
                    while (it3.hasNext()) {
                        ((r4a) it3.next()).getClass();
                        r4a.a(th4);
                    }
                    int s3 = au1.s(k7d.a);
                    if (s3 != 0) {
                        if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        return new jef(str3 == null ? "" : str3, j, str2 == null ? "" : str2, i2, list, b2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{conversationId='");
        sb.append(this.a);
        sb.append("', startedAt=");
        sb.append(this.b);
        sb.append(", joinLink=");
        sb.append(this.c);
        sb.append(", approxParticipantCount=");
        sb.append(this.o);
        sb.append(", previewParticipantIds=");
        sb.append(this.X);
        sb.append(", type=");
        return zr6.j(sb, this.Y, "}");
    }
}
