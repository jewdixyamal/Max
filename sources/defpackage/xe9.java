package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: xe9  reason: default package */
public final class xe9 extends gle {
    public long c;
    public List o;

    public xe9(gy8 gy8) {
        super(gy8);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.c = gy8.w0();
        } else if (!str.equals("messages")) {
            gy8.z();
        } else {
            this.o = wz.e(gy8);
        }
    }

    public final String toString() {
        long j = this.c;
        int o2 = s5c.o(this.o);
        return "{chatId=" + j + ", messages=" + o2 + "}";
    }
}
