package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ga0  reason: default package */
public final class ga0 implements f15 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public ga0(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                return;
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    public static ga0 e(int i, int i2, List list, List list2) {
        return new ga0(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ga0)) {
            return false;
        }
        ga0 ga0 = (ga0) obj;
        return this.a == ga0.a && this.b == ga0.b && this.c.equals(ga0.c) && this.d.equals(ga0.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return au1.i(sb, this.d, "}");
    }
}
