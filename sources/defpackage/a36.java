package defpackage;

import java.util.UUID;

/* renamed from: a36  reason: default package */
public final class a36 implements pz3 {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(maf.c)) {
            String str = maf.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public a36(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
