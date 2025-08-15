package defpackage;

import java.util.UUID;

/* renamed from: b36  reason: default package */
public final class b36 implements qz3 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z;
        if ("Amazon".equals(oaf.c)) {
            String str = oaf.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                c = z;
            }
        }
        z = false;
        c = z;
    }

    public b36(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
