package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: tic  reason: default package */
public final class tic {
    public final Resources a;
    public final Resources.Theme b;

    public tic(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tic.class != obj.getClass()) {
            return false;
        }
        tic tic = (tic) obj;
        return this.a.equals(tic.a) && Objects.equals(this.b, tic.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
