package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: mb0  reason: default package */
public final class mb0 {
    public static final mb0 d;
    public static final mb0 e;
    public static final mb0 f;
    public static final mb0 g;
    public static final mb0 h;
    public static final mb0 i;
    public static final mb0 j = new mb0(-1, "NONE", Collections.emptyList());
    public static final HashSet k;
    public static final List l;
    public final int a;
    public final String b;
    public final List c;

    static {
        mb0 mb0 = new mb0(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size[]{new Size(720, 480), new Size(640, 480)})));
        d = mb0;
        mb0 mb02 = new mb0(5, "HD", Collections.singletonList(new Size(1280, 720)));
        e = mb02;
        mb0 mb03 = new mb0(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f = mb03;
        mb0 mb04 = new mb0(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        g = mb04;
        mb0 mb05 = new mb0(0, "LOWEST", Collections.emptyList());
        h = mb05;
        mb0 mb06 = new mb0(1, "HIGHEST", Collections.emptyList());
        i = mb06;
        k = new HashSet(Arrays.asList(new mb0[]{mb05, mb06, mb0, mb02, mb03, mb04}));
        l = Arrays.asList(new mb0[]{mb04, mb03, mb02, mb0});
    }

    public mb0(int i2, String str, List list) {
        this.a = i2;
        this.b = str;
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null typicalSizes");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0 = (mb0) obj;
        return this.a == mb0.a && this.b.equals(mb0.b) && this.c.equals(mb0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", typicalSizes=");
        return au1.i(sb, this.c, "}");
    }
}
