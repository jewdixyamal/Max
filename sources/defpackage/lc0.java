package defpackage;

import android.util.Range;

/* renamed from: lc0  reason: default package */
public final class lc0 {
    public b9b a;
    public Range b;
    public Range c;
    public Integer d;

    public final mc0 a() {
        String str = this.a == null ? " qualitySelector" : "";
        if (this.b == null) {
            str = str.concat(" frameRate");
        }
        if (this.c == null) {
            str = au1.g(str, " bitrate");
        }
        if (this.d == null) {
            str = au1.g(str, " aspectRatio");
        }
        if (str.isEmpty()) {
            return new mc0(this.a, this.b, this.c, this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void b(b9b b9b) {
        if (b9b != null) {
            this.a = b9b;
            return;
        }
        throw new NullPointerException("Null qualitySelector");
    }
}
