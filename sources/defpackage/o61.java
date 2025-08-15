package defpackage;

import java.util.Objects;

/* renamed from: o61  reason: default package */
public final class o61 {
    public final String a;
    public final int b;
    public final int c;

    public o61(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o61.class != obj.getClass()) {
            return false;
        }
        o61 o61 = (o61) obj;
        return this.a.equals(o61.a) && this.b == o61.b && this.c == o61.c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.c);
        return Objects.hash(new Object[]{this.a, au1.a(this.b), valueOf});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallExternalId{id='");
        sb.append(this.a);
        sb.append("', type=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ANONYM" : "VK" : "UNKNOWN");
        sb.append(", deviceIndex=");
        return au1.h(sb, this.c, '}');
    }
}
