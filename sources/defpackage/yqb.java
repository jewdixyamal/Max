package defpackage;

import java.io.File;

/* renamed from: yqb  reason: default package */
public final class yqb implements brb {
    public final File a;

    public yqb(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqb) && tpa.f(this.a, ((yqb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartRecordVideo(file=" + this.a + ")";
    }
}
