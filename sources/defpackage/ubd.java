package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ubd  reason: default package */
public final class ubd extends gle {
    public List c;

    public ubd(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (!str.equals("sessions")) {
            gy8.z();
            return;
        }
        int G = lz7.G(gy8);
        this.c = new ArrayList(G);
        for (int i = 0; i < G; i++) {
            List list = this.c;
            int N = lz7.N(gy8);
            w9d w9d = null;
            if (N != 0) {
                boolean z = false;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                long j = 0;
                for (int i2 = 0; i2 < N; i2++) {
                    String z0 = gy8.z0();
                    z0.getClass();
                    char c2 = 65535;
                    switch (z0.hashCode()) {
                        case -1357712437:
                            if (z0.equals("client")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 3237038:
                            if (z0.equals("info")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3560141:
                            if (z0.equals("time")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1126940025:
                            if (z0.equals("current")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1901043637:
                            if (z0.equals("location")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            str2 = gy8.z0();
                            break;
                        case 1:
                            str3 = gy8.z0();
                            break;
                        case 2:
                            j = gy8.w0();
                            break;
                        case 3:
                            z = gy8.u0();
                            break;
                        case 4:
                            str4 = gy8.z0();
                            break;
                        default:
                            gy8.z();
                            break;
                    }
                }
                w9d = new w9d(j, str2, str3, str4, z);
            }
            list.add(w9d);
        }
    }

    public final String toString() {
        return wg0.g(s5c.o(this.c), "{sessions=", "}");
    }
}
