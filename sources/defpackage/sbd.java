package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: sbd  reason: default package */
public final class sbd extends gle {
    public String c;

    public sbd(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (!str.equals(ApiProtocol.KEY_TOKEN)) {
            gy8.z();
        } else {
            this.c = gy8.z0();
        }
    }

    public final String toString() {
        return zr6.i("{token='", oag.x(this.c), "'}");
    }
}
