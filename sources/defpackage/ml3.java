package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: ml3  reason: default package */
public final class ml3 {
    public final l20 a;
    public final String b;
    public final List c;

    public ml3(l20 l20, String str, ArrayList arrayList) {
        this.a = l20;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml3)) {
            return false;
        }
        ml3 ml3 = (ml3) obj;
        if (Objects.equals(this.b, ml3.b)) {
            l20 l20 = this.a;
            l20 l202 = ml3.a;
            if (Objects.equals(l20, l202) && Objects.equals(this.c, l202)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.b, this.a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartMessage{media='");
        sb.append(this.a);
        sb.append("'text='");
        sb.append(this.b);
        sb.append("'elements='");
        return au1.i(sb, this.c, "'}");
    }
}
