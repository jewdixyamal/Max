package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: j6c  reason: default package */
public final class j6c implements ol7 {
    public final int X = apc.b;
    public final long Y;
    public final long a;
    public final v5c b;
    public final Drawable c;
    public final boolean o;

    public j6c(long j, v5c v5c, Drawable drawable, boolean z) {
        this.a = j;
        this.b = v5c;
        this.c = drawable;
        this.o = z;
        this.Y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6c)) {
            return false;
        }
        j6c j6c = (j6c) obj;
        return this.a == j6c.a && tpa.f(this.b, j6c.b) && tpa.f(this.c, j6c.c) && this.o == j6c.o;
    }

    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Drawable drawable = this.c;
        return Boolean.hashCode(this.o) + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final int l() {
        return this.X;
    }

    public final String toString() {
        return "ReactionModel(animojiId=" + this.a + ", reaction=" + this.b + ", reactionDrawable=" + this.c + ", selected=" + this.o + ")";
    }
}
