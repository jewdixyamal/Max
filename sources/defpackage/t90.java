package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t90  reason: default package */
public final class t90 {
    public final String a;
    public final Class b;
    public final fad c;
    public final o9f d;
    public final Size e;
    public final vb0 f;
    public final List g;

    public t90(String str, Class cls, fad fad, o9f o9f, Size size, vb0 vb0, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = cls;
            if (fad != null) {
                this.c = fad;
                if (o9f != null) {
                    this.d = o9f;
                    this.e = size;
                    this.f = vb0;
                    this.g = arrayList;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t90)) {
            return false;
        }
        t90 t90 = (t90) obj;
        if (this.a.equals(t90.a) && this.b.equals(t90.b) && this.c.equals(t90.c) && this.d.equals(t90.d)) {
            Size size = t90.e;
            Size size2 = this.e;
            if (size2 != null ? size2.equals(size) : size == null) {
                vb0 vb0 = t90.f;
                vb0 vb02 = this.f;
                if (vb02 != null ? vb02.equals(vb0) : vb0 == null) {
                    List list = t90.g;
                    List list2 = this.g;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = 0;
        Size size = this.e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        vb0 vb0 = this.f;
        int hashCode3 = (hashCode2 ^ (vb0 == null ? 0 : vb0.hashCode())) * 1000003;
        List list = this.g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return au1.i(sb, this.g, "}");
    }
}
