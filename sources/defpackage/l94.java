package defpackage;

import java.io.File;

/* renamed from: l94  reason: default package */
public final class l94 {
    public final String a;
    public final kg5 b;
    public long c = -1;
    public long d = -1;

    public l94(File file, String str) {
        str.getClass();
        this.a = str;
        this.b = new kg5(file);
    }

    public final long a() {
        if (this.d < 0) {
            this.d = this.b.a.lastModified();
        }
        return this.d;
    }
}
