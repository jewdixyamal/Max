package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: plf  reason: default package */
public final class plf extends gle {
    public ArrayList c;

    public plf(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        int i;
        int i2 = 1;
        if (tpa.f(str, "info")) {
            this.c = new ArrayList();
            try {
                i = lz7.G(gy8);
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
            int i3 = 0;
            while (i3 < i) {
                try {
                    ArrayList arrayList = this.c;
                    if (arrayList != null) {
                        int x0 = gy8.x0();
                        String str2 = null;
                        String str3 = null;
                        long j = 0;
                        for (int i4 = 0; i4 < x0; i4++) {
                            String z0 = gy8.z0();
                            z0.getClass();
                            char c2 = 65535;
                            switch (z0.hashCode()) {
                                case 116079:
                                    if (z0.equals("url")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case 110541305:
                                    if (z0.equals(ApiProtocol.KEY_TOKEN)) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 452782838:
                                    if (z0.equals("videoId")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    gy8 gy82 = gy8;
                                    str2 = lz7.P(gy8);
                                    break;
                                case 1:
                                    gy8 gy83 = gy8;
                                    str3 = lz7.P(gy8);
                                    break;
                                case 2:
                                    j = lz7.M(gy8, 0);
                                    break;
                                default:
                                    gy8.z();
                                    gy8 gy84 = gy8;
                                    break;
                            }
                        }
                        gy8 gy85 = gy8;
                        arrayList.add(new qlf(j, str2, str3));
                        i2 = 1;
                    } else {
                        gy8 gy86 = gy8;
                    }
                    i3 += i2;
                } catch (Throwable th3) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it2 = u7d.a.iterator();
                    while (it2.hasNext()) {
                        ((r4a) it2.next()).getClass();
                        r4a.a(th3);
                    }
                    int s2 = au1.s(k7d.a);
                    if (s2 == 0) {
                        return;
                    }
                    if (s2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            return;
        }
        gy8 gy87 = gy8;
        try {
            gy8.z();
        } catch (Throwable th4) {
            Throwable th5 = th4;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
            Iterator it3 = u7d.a.iterator();
            while (it3.hasNext()) {
                ((r4a) it3.next()).getClass();
                r4a.a(th5);
            }
            int s3 = au1.s(k7d.a);
            if (s3 == 0) {
                return;
            }
            if (s3 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th5;
        }
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        return zr6.i("{videoUploadInfo=[", x53.n0(arrayList != null ? x53.D0(arrayList) : nz4.a, (String) null, (String) null, (String) null, new w8c(27), 31), "]}");
    }
}
