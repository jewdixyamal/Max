package defpackage;

import java.util.Objects;

/* renamed from: fp1  reason: default package */
public final class fp1 {
    public final olf a;
    public final bg1 b;
    public final cd9 c;

    public fp1(adb adb) {
        this.a = (olf) adb.b;
        this.b = (bg1) adb.a;
        this.c = (cd9) adb.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fp1.class != obj.getClass()) {
            return false;
        }
        fp1 fp1 = (fp1) obj;
        return this.a == fp1.a && this.b.equals(fp1.b) && Objects.equals(this.c, fp1.c);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "CallVideoTrackParticipantKey{" + this.b + ", type=" + this.a + ", mid=" + this.c + "}";
    }
}
