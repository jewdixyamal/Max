package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: qe9  reason: default package */
public final class qe9 extends gle {
    public final long c;
    public final Set o;

    public qe9(long j, LinkedHashSet linkedHashSet) {
        this.c = j;
        this.o = linkedHashSet;
    }

    public static final qe9 c(gy8 gy8) {
        int N;
        if (!gy8.m() || (N = lz7.N(gy8)) == 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long j = 0;
        for (int i = 0; i < N; i++) {
            String P = lz7.P(gy8);
            if (P != null) {
                if (P.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    j = lz7.M(gy8, 0);
                } else if (P.equals("messageIds")) {
                    int G = lz7.G(gy8);
                    for (int i2 = 0; i2 < G; i2++) {
                        linkedHashSet.add(Long.valueOf(gy8.w0()));
                    }
                } else {
                    gy8.z();
                }
            }
        }
        return new qe9(j, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe9)) {
            return false;
        }
        qe9 qe9 = (qe9) obj;
        return this.c == qe9.c && tpa.f(this.o, qe9.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "Response(chatId=" + this.c + ", messageIds=" + this.o + ")";
    }
}
