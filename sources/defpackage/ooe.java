package defpackage;

import java.util.Arrays;

/* renamed from: ooe  reason: default package */
public final class ooe implements nk {
    public static final ooe b = new ooe((String) null);
    public final String a;

    public /* synthetic */ ooe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ooe)) {
            return false;
        }
        return s36.l(this.a, ((ooe) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
