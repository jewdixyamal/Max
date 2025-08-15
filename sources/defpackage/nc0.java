package defpackage;

import java.util.List;

/* renamed from: nc0  reason: default package */
public final class nc0 implements f15 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final fa0 e;
    public final ha0 f;

    public nc0(int i, int i2, List list, List list2, fa0 fa0, ha0 ha0) {
        this.a = i;
        this.b = i2;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                this.e = fa0;
                if (ha0 != null) {
                    this.f = ha0;
                    return;
                }
                throw new NullPointerException("Null defaultVideoProfile");
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
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
        if (!(obj instanceof nc0)) {
            return false;
        }
        nc0 nc0 = (nc0) obj;
        if (this.a == nc0.a && this.b == nc0.b && this.c.equals(nc0.c) && this.d.equals(nc0.d)) {
            fa0 fa0 = nc0.e;
            fa0 fa02 = this.e;
            if (fa02 != null ? fa02.equals(fa0) : fa0 == null) {
                if (this.f.equals(nc0.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        fa0 fa0 = this.e;
        return this.f.hashCode() ^ ((hashCode ^ (fa0 == null ? 0 : fa0.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
