package defpackage;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: r6g  reason: default package */
public abstract class r6g extends q6g {
    public r6g(x6g x6g, WindowInsets windowInsets) {
        super(x6g, windowInsets);
    }

    public x6g a() {
        return x6g.f((View) null, this.c.consumeDisplayCutout());
    }

    public tl4 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new tl4(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6g)) {
            return false;
        }
        r6g r6g = (r6g) obj;
        return Objects.equals(this.c, r6g.c) && Objects.equals(this.g, r6g.g);
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
