package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: pr9  reason: default package */
public final class pr9 extends gle {
    public String c;
    public long o;

    public pr9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.o = lz7.M(gy8, 0);
        } else if (!str.equals("text")) {
            gy8.z();
        } else {
            this.c = lz7.P(gy8);
        }
    }

    public final String toString() {
        StringBuilder j = z7b.j("{chatId='", this.o, ", text='", this.c);
        j.append("'}");
        return j.toString();
    }
}
