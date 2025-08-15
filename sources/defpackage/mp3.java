package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: mp3  reason: default package */
public final class mp3 extends gle {
    public final /* synthetic */ int c;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp3(gy8 gy8, int i) {
        super(gy8);
        this.c = i;
    }

    public final void b(gy8 gy8, String str) {
        ArrayList arrayList;
        int i = 0;
        switch (this.c) {
            case 0:
                str.getClass();
                if (!str.equals("contactIds")) {
                    gy8.z();
                    return;
                }
                this.o = new ArrayList();
                int G = lz7.G(gy8);
                while (i < G) {
                    ((List) this.o).add(Long.valueOf(gy8.w0()));
                    i++;
                }
                return;
            case 1:
                str.getClass();
                if (!str.equals("mentions")) {
                    gy8.z();
                    return;
                } else {
                    this.o = wz.e(gy8);
                    return;
                }
            case 2:
                str.getClass();
                if (!str.equals("locations")) {
                    gy8.z();
                    return;
                }
                LinkedHashMap linkedHashMap = null;
                if (gy8.n().a() == 8) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int x0 = gy8.x0();
                    for (int i2 = 0; i2 < x0; i2++) {
                        Long valueOf = Long.valueOf(lz7.M(gy8, 0));
                        if (gy8.n().a() == 7) {
                            arrayList = new ArrayList();
                            int s0 = gy8.s0();
                            for (int i3 = 0; i3 < s0; i3++) {
                                arrayList.add(fr7.a(gy8));
                            }
                        } else {
                            gy8.z();
                            arrayList = null;
                        }
                        linkedHashMap2.put(valueOf, arrayList);
                    }
                    linkedHashMap = linkedHashMap2;
                } else {
                    gy8.z();
                }
                this.o = linkedHashMap;
                return;
            default:
                str.getClass();
                if (!str.equals("stats")) {
                    gy8.z();
                    return;
                }
                this.o = new HashMap();
                int N = lz7.N(gy8);
                while (i < N) {
                    ((Map) this.o).put(Long.valueOf(gy8.w0()), ux8.a(gy8));
                    i++;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return wg0.g(s5c.o((List) this.o), "{contactIds=", "}");
            case 1:
                return wg0.g(s5c.o((wz) this.o), "Response{mentions=", "}");
            case 2:
                return "Response{locations=" + ((LinkedHashMap) this.o) + "}";
            default:
                return wg0.g(s5c.S((Map) this.o), "{stats=", "}");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mp3(gy8 gy8) {
        super(gy8);
        this.c = 3;
        if (((Map) this.o) == null) {
            this.o = Collections.emptyMap();
        }
    }
}
