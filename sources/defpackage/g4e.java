package defpackage;

import java.util.ArrayList;

/* renamed from: g4e  reason: default package */
public final class g4e extends gle {
    public ArrayList c;
    public long o;

    public g4e(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = gy8.w0();
        } else if (!str.equals("stickers")) {
            gy8.z();
        } else {
            int G = lz7.G(gy8);
            this.c = new ArrayList(G);
            for (int i = 0; i < G; i++) {
                this.c.add(Long.valueOf(gy8.w0()));
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        long j = this.o;
        return "{stickerIds=" + arrayList + ", marker=" + j + "}";
    }
}
