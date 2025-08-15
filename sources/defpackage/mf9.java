package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: mf9  reason: default package */
public final class mf9 extends gle {
    public final f52 X;
    public final long c;
    public final fs8 o;

    public /* synthetic */ mf9() {
        this(0, (fs8) null, (f52) null);
    }

    public static final mf9 c(gy8 gy8) {
        String str;
        if (!gy8.m()) {
            return new mf9();
        }
        int x0 = gy8.x0();
        if (x0 == 0) {
            return new mf9();
        }
        fs8 fs8 = null;
        f52 f52 = null;
        long j = 0;
        for (int i = 0; i < x0; i++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = u7d.a.iterator();
                while (it.hasNext()) {
                    ((r4a) it.next()).getClass();
                    r4a.a(th);
                }
                int s = au1.s(k7d.a);
                if (s == 0) {
                    str = null;
                } else if (s != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1361631597) {
                    if (hashCode != 3052376) {
                        if (hashCode == 954925063 && str.equals("message")) {
                            fs8 = tpa.z(gy8);
                        }
                    } else if (str.equals("chat")) {
                        f52 = f52.a(gy8);
                    }
                } else if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    try {
                        j = lz7.M(gy8, 0);
                    } catch (Throwable th2) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                        Iterator it2 = u7d.a.iterator();
                        while (it2.hasNext()) {
                            ((r4a) it2.next()).getClass();
                            r4a.a(th2);
                        }
                        int s2 = au1.s(k7d.a);
                        if (s2 == 0) {
                            j = 0;
                        } else if (s2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th2;
                        }
                    }
                }
                gy8.z();
            }
        }
        return new mf9(j, fs8, f52);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf9)) {
            return false;
        }
        mf9 mf9 = (mf9) obj;
        return this.c == mf9.c && tpa.f(this.o, mf9.o) && tpa.f(this.X, mf9.X);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        int i = 0;
        fs8 fs8 = this.o;
        int hashCode2 = (hashCode + (fs8 == null ? 0 : fs8.hashCode())) * 31;
        f52 f52 = this.X;
        if (f52 != null) {
            i = f52.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Response(chatId=" + this.c + ", message=" + this.o + ")";
    }

    public mf9(long j, fs8 fs8, f52 f52) {
        this.c = j;
        this.o = fs8;
        this.X = f52;
    }
}
