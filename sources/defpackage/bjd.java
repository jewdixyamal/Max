package defpackage;

/* renamed from: bjd  reason: default package */
public final class bjd implements Comparable {
    public static final bjd X = new bjd("WARNING", 5000);
    public static final bjd Y = new bjd("NOTICE", 4000);
    public static final bjd Z = new bjd("INFO", 3000);
    public static final bjd c = new bjd("FATAL", 9000);
    public static final bjd o = new bjd("ERROR", 6000);
    public static final bjd s0 = new bjd("DEBUG", 2000);
    public final String a;
    public final int b;

    public bjd(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int compareTo(Object obj) {
        return tpa.m(this.b, ((bjd) obj).b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
