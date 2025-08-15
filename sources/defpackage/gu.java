package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: gu  reason: default package */
public final class gu extends gle implements Serializable {
    public List X;
    public long Y;
    public List c;
    public List o;

    public gu(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        gy8 gy82 = gy8;
        String str2 = str;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1081306054:
                if (str2.equals("marker")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1531715286:
                if (str2.equals("stickers")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1596679982:
                if (str2.equals("stickerSets")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1651659013:
                if (str2.equals("backgrounds")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.Y = gy8.w0();
                return;
            case 1:
                this.c = wz.d(gy8);
                return;
            case 2:
                this.o = wz.d(gy8);
                return;
            case 3:
                int G = lz7.G(gy8);
                this.X = new ArrayList(G);
                for (int i = 0; i < G; i++) {
                    List list = this.X;
                    int N = lz7.N(gy8);
                    String str3 = "";
                    String str4 = str3;
                    long j = 0;
                    for (int i2 = 0; i2 < N; i2++) {
                        String z0 = gy8.z0();
                        if (z0 != null) {
                            int hashCode = z0.hashCode();
                            if (hashCode != 3355) {
                                if (hashCode != 116079) {
                                    if (hashCode == 94842723 && z0.equals("color")) {
                                        str4 = lz7.Q(gy82, "");
                                    }
                                } else if (z0.equals("url")) {
                                    str3 = lz7.Q(gy82, "");
                                }
                            } else if (z0.equals("id")) {
                                j = lz7.M(gy82, 0);
                            }
                        }
                        gy8.z();
                    }
                    list.add(new ke0(j, str3, str4));
                }
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        int o2 = s5c.o(this.c);
        int o3 = s5c.o(this.o);
        int o4 = s5c.o(this.X);
        long j = this.Y;
        StringBuilder j2 = wg0.j("{stickers=", o2, "stickerSets=", o3, "backgrounds=");
        j2.append(o4);
        j2.append(", marker=");
        j2.append(j);
        j2.append("}");
        return j2.toString();
    }
}
