package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: eb8  reason: default package */
public final class eb8 {
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public static final String p = Integer.toString(7, 36);
    public final UUID a;
    public final Uri b;
    public final cx6 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final zw6 g;
    public final byte[] h;

    static {
        int i2 = oaf.a;
    }

    public eb8(s74 s74) {
        fm9.k(!s74.c || ((Uri) s74.e) != null);
        UUID uuid = (UUID) s74.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) s74.e;
        this.c = (cx6) s74.f;
        this.d = s74.a;
        this.f = s74.c;
        this.e = s74.b;
        this.g = (zw6) s74.g;
        byte[] bArr = (byte[]) s74.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb8)) {
            return false;
        }
        eb8 eb8 = (eb8) obj;
        return this.a.equals(eb8.a) && oaf.a(this.b, eb8.b) && oaf.a(this.c, eb8.c) && this.d == eb8.d && this.f == eb8.f && this.e == eb8.e && this.g.equals(eb8.g) && Arrays.equals(this.h, eb8.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = uri != null ? uri.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((hashCode3 + ((hashCode + hashCode2) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
