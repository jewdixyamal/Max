package defpackage;

/* renamed from: z70  reason: default package */
public final class z70 extends gle {
    public final String X;
    public final nab Y;
    public final String c;
    public final fu7 o;

    public z70(String str, fu7 fu7, String str2, nab nab) {
        this.c = str;
        this.o = fu7;
        this.X = str2;
        this.Y = nab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70 = (z70) obj;
        return tpa.f(this.c, z70.c) && this.o == z70.o && tpa.f(this.X, z70.X) && tpa.f(this.Y, z70.Y);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.X;
        return this.Y.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String x = oag.x(this.c);
        String x2 = oag.x(this.X);
        StringBuilder m = au1.m("{token='", x, ", tokenType=");
        m.append(this.o);
        m.append(", userToken='");
        m.append(x2);
        m.append(", profile=");
        m.append(this.Y);
        m.append("}");
        return m.toString();
    }
}
