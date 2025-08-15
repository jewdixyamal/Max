package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nx8  reason: default package */
public final class nx8 implements Serializable {
    public final long a;
    public final fs8 b;
    public final String c;
    public final List o;

    public nx8(String str, ArrayList arrayList, long j, fs8 fs8) {
        this.c = str;
        this.o = arrayList;
        this.a = j;
        this.b = fs8;
    }

    public final String toString() {
        String x = oag.x(this.c);
        int o2 = s5c.o(this.o);
        return "{, feedback='" + x + "', highlights=" + o2 + ", chatId='" + this.a + "', message=" + this.b + "}";
    }
}
