package defpackage;

/* renamed from: fr7  reason: default package */
public final class fr7 {
    public final er7 a;
    public final long b;

    public fr7(er7 er7, long j) {
        this.a = er7;
        this.b = j;
    }

    public static fr7 a(gy8 gy8) {
        gy8 gy82 = gy8;
        int N = lz7.N(gy8);
        Double valueOf = Double.valueOf(1.401298464324817E-45d);
        Float valueOf2 = Float.valueOf(0.0f);
        double d = 1.401298464324817E-45d;
        double d2 = 1.401298464324817E-45d;
        long j = 0;
        double d3 = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i = 0; i < N; i++) {
            String z0 = gy8.z0();
            z0.getClass();
            char c = 65535;
            switch (z0.hashCode()) {
                case 96681:
                    if (z0.equals("alt")) {
                        c = 0;
                        break;
                    }
                    break;
                case 100650:
                    if (z0.equals("epu")) {
                        c = 1;
                        break;
                    }
                    break;
                case 103154:
                    if (z0.equals("hdn")) {
                        c = 2;
                        break;
                    }
                    break;
                case 106911:
                    if (z0.equals("lat")) {
                        c = 3;
                        break;
                    }
                    break;
                case 107301:
                    if (z0.equals("lng")) {
                        c = 4;
                        break;
                    }
                    break;
                case 114087:
                    if (z0.equals("spd")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3560141:
                    if (z0.equals("time")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    d3 = lz7.J(gy82, Double.valueOf(0.0d)).doubleValue();
                    break;
                case 1:
                    f = lz7.K(gy82, valueOf2).floatValue();
                    break;
                case 2:
                    f2 = lz7.K(gy82, valueOf2).floatValue();
                    break;
                case 3:
                    d = lz7.J(gy82, valueOf).doubleValue();
                    break;
                case 4:
                    d2 = lz7.J(gy82, valueOf).doubleValue();
                    break;
                case 5:
                    f3 = lz7.K(gy82, valueOf2).floatValue();
                    break;
                case 6:
                    j = lz7.M(gy82, 0);
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        return new fr7(new er7(d, d2, d3, f, f2, f3), j);
    }

    public final String toString() {
        return "LocationInfo{location=" + this.a + ", time=" + this.b + "}";
    }
}
